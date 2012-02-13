package ims.vi.common.service;
import java.io.InputStream;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Properties;

import javax.ws.rs.core.MediaType;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import net.sf.ezmorph.object.DateMorpher;
import net.sf.json.JSONArray;
import net.sf.json.JSONObject;
import net.sf.json.JSONSerializer;
import net.sf.json.JsonConfig;
import net.sf.json.util.EnumMorpher;
import net.sf.json.util.JSONUtils;
import net.sf.json.util.PropertyFilter;

import com.sun.jersey.api.client.Client;
import com.sun.jersey.api.client.ClientResponse;
import com.sun.jersey.api.client.WebResource;
import com.sun.jersey.api.client.config.ClientConfig;

import ims.vi.common.service.client.APIRequest;
import ims.vi.common.service.client.APIResponse;
import ims.vi.common.service.client.BSN;
import ims.vi.common.service.client.BindingInfo;
import ims.vi.common.service.client.CashPointTopUpPlan;
import ims.vi.common.service.client.FSA;
import ims.vi.common.service.client.NowIDBindingInfo;
import ims.vi.common.service.client.STBINFO;
import ims.vi.common.service.client.GetCurrentBindingInfoResponse;
import ims.vi.common.service.client.enums.MovieHouseResponseCode;
import ims.vi.common.service.client.enums.RestServerResponseCode;


public class RestService {
	private static Logger logger = LoggerFactory.getLogger(RestService.class.getName());
	public final static int default_connection_timeout = 300000;
	public final static int default_read_timeout = 300000;
	public final static String default_url = "http://quadplayapi:8080/RestServer/rs/RestService/";
	public static int connection_timeout = default_connection_timeout;
	public static int read_timeout = default_read_timeout;
	public static String url = default_url;
	private static Properties config = null;
	private static JsonConfig jsonConfig;
	
	static {
		jsonConfig = new JsonConfig();
		jsonConfig.setJsonPropertyFilter(new PropertyFilter(){
			public boolean apply(Object obj, String s, Object obj1) {
				// TODO Auto-generated method stub
				if (s.equals("responseClass") || s.equals("key"))
					return true;
				return false;
			}
		});
		JSONUtils.getMorpherRegistry().registerMorpher(new EnumMorpher(RestServerResponseCode.class));
		JSONUtils.getMorpherRegistry().registerMorpher(new EnumMorpher(MovieHouseResponseCode.class));
		JSONUtils.getMorpherRegistry().registerMorpher(new DateMorpher(new String[]{"EEE MMM dd HH:mm:ss zzz yyyy"}));
	}
	
	public static Object sendRequest(APIRequest request){
		String serviceName = request.getClass().getSimpleName();
		if (config == null) {
			try {
				config = new Properties();
		        InputStream inputStream = RestService.class.getClassLoader().getResourceAsStream("restServiceConfig.properties");
		        config.load(inputStream);
				logger.info(String.format("[%s: %s] In restServiceConfig.properties, %s", serviceName, request.getCallerReferenceNo(), config.toString()));
				if (config.getProperty("url") != null && !config.getProperty("url").equals("")) {
					url = config.getProperty("url");
				}
				if (config.getProperty("connection_timeout") != null && !config.getProperty("connection_timeout").equals("")) {
					connection_timeout = Integer.parseInt(config.getProperty("connection_timeout"));
				}
				if (config.getProperty("read_timeout") != null && !config.getProperty("read_timeout").equals("")) {
					read_timeout = Integer.parseInt(config.getProperty("read_timeout"));
				}
			} catch (Exception e1) {
				logger.error(String.format("[%s: %s] Error found in reading restServiceConfig.properties", serviceName, request.getCallerReferenceNo()), e1);
			}
		}
		
		logger.info(String.format("[%s-in: %s] Start:\n%s", serviceName, request.getCallerReferenceNo(), request.toString(serviceName)));
		
		JSONObject jsonRequestObj = JSONObject.fromObject(request, jsonConfig);
		try {
			Method method = request.getClass().getMethod("getKey");
			if (method.invoke(request) instanceof FSA) {
				jsonRequestObj.element("fsa", ((FSA)method.invoke(request)).getFsa());
			}
			else if (method.invoke(request) instanceof BSN) {
				jsonRequestObj.element("bsn", ((BSN)method.invoke(request)).getBsn());
			}
			else if (method.invoke(request) instanceof STBINFO) {
				jsonRequestObj.element("stbid",((STBINFO)method.invoke(request)).getStbid())
							.element("stbsid", ((STBINFO)method.invoke(request)).getStbsid());
			}
		} catch (NoSuchMethodException e) {

		} catch (Exception e) {
			logger.error(String.format("[%s: %s] Error found in converting key to FSA/BSN/STBINFO" , serviceName, request.getCallerReferenceNo()), e);
		}
		
		Client client = Client.create();
		client.getProperties().put(ClientConfig.PROPERTY_CONNECT_TIMEOUT, connection_timeout);
		client.getProperties().put(ClientConfig.PROPERTY_READ_TIMEOUT, read_timeout);
		WebResource webResource = client.resource(url + serviceName);
		logger.info(String.format("[%s: %s] Sent to server, JSON Request: %s", serviceName, request.getCallerReferenceNo(), jsonRequestObj.toString()));
		ClientResponse clientResponse = webResource
				.accept(MediaType.APPLICATION_JSON)
				.type(MediaType.APPLICATION_JSON)
				.post(ClientResponse.class, jsonRequestObj.toString());
		
		String jsonResponse = clientResponse.getEntity(String.class);
		logger.info(String.format("[%s: %s] Server response, JSON Response: %s", serviceName, request.getCallerReferenceNo(), jsonResponse));
		
		Map<String, Class> classMap = new HashMap<String, Class>();
		classMap.put("topUpPlans", CashPointTopUpPlan.class);
		classMap.put("bindingInfo", BindingInfo.class);
		
		APIResponse jsonResponseObj = null;
		if("class ims.vi.common.service.client.GetCurrentBindingInfoRequest".contentEquals(request.getClass().toString())){
			jsonResponseObj = constructBindingResponse(jsonResponse);
		}else{
			jsonResponseObj = (APIResponse) JSONObject.toBean(JSONObject.fromObject(jsonResponse), request.getResponseClass(), classMap);
		}
		
		logger.info(String.format("[%s: %s] End:\n%s", serviceName, request.getCallerReferenceNo(), jsonResponseObj.toString(serviceName)));
		return jsonResponseObj;
	}
	
	/**
	 * JSON parser intended for the APIRequest: GetCurrentBindingInfoRequest.<br>
	 * An alternate APIResponse creation method apart from JSONObject.toBean
	 * @param jsontxt
	 * @return GetCurrentBindingInfoResponse object
	 */
    private static GetCurrentBindingInfoResponse constructBindingResponse(String jsontxt){
    	if(jsontxt == null || jsontxt.length() <= 0) return null;

    	JSONObject json = (JSONObject) JSONSerializer.toJSON( jsontxt ); 
        if(json == null || json.isEmpty() || json.isNullObject()) return null;
        
        String callerReferenceNo = json.getString("callerReferenceNo");
        long elapsedTime = json.getLong("elapsedTime");
        RestServerResponseCode responseCode = RestServerResponseCode.valueOf(json.getString("responseCode")==null?"INTERNAL_ERROR":json.getString("responseCode"));
        String serverReferenceNo = json.getString("serverReferenceNo");
        
        //FSA
        String FSA = (json.has("fsa")?json.getString("fsa"):null);
        
        //binding info
        List<BindingInfo> lbi = null;
        if(json.has("bindingInfo")){
	        JSONArray bindingInfoArray = json.getJSONArray("bindingInfo");
	        if(bindingInfoArray!=null && !bindingInfoArray.isEmpty()){
	        	lbi = new ArrayList<BindingInfo>();
				for (int i = 0; i < bindingInfoArray.size(); i++) {
					JSONObject bindingInfoJSONObject = bindingInfoArray.getJSONObject(i);
					BindingInfo bi = null;
					if(bindingInfoJSONObject!=null && !bindingInfoJSONObject.isEmpty()){
						bi = new BindingInfo();
						String bindingType = bindingInfoJSONObject.getString("bindingType");
						String stbid = bindingInfoJSONObject.getString("stbid");
						String stbip = bindingInfoJSONObject.getString("stbip");
						String deviceID = bindingInfoJSONObject.getString("deviceID");
						String extInfo = bindingInfoJSONObject.getString("extInfo");
						String fsa = bindingInfoJSONObject.getString("fsa");
						String lastBindDate = bindingInfoJSONObject.getString("lastBindDate");
			   
				        bi.setBindingType(bindingType==null?"":bindingType);
				        bi.setDeviceID(deviceID==null?"":deviceID);
				        bi.setExtInfo(extInfo==null?"":extInfo);
				        bi.setFsa(fsa==null?"":fsa);
				        bi.setLastBindDate(lastBindDate==null?"":lastBindDate);
				        bi.setStbid(stbid==null?"":stbid);
				        bi.setStbip(stbip==null?"":stbip);
				        
				        lbi.add(bi);  
					}
				}
	        }
        }
        
		//nowid binding
		NowIDBindingInfo nbi = null;
		if(json.has("nowIdBindingInfo")){
			JSONObject nowidJSONObject = json.getJSONObject("nowIdBindingInfo");
			if(nowidJSONObject!=null && !nowidJSONObject.isEmpty()){
				nbi = new NowIDBindingInfo();
				String bindingType = nowidJSONObject.getString("bindingType");
				String npid = nowidJSONObject.getString("npid");
				String bind_date = nowidJSONObject.getString("bind_date");
				String nowid_verified = nowidJSONObject.getString("nowid_verified");
				String mem_status = nowidJSONObject.getString("mem_status");
				String nowid = nowidJSONObject.getString("nowid");
				String start_date = nowidJSONObject.getString("start_date");
		 
		        nbi.setBind_date(bind_date==null?"":bind_date);
		        nbi.setBindingType(bindingType==null?"":bindingType);
		        nbi.setMem_status(mem_status==null?"":mem_status);
		        nbi.setNowid(nowid==null?"":nowid);
		        nbi.setNowid_verified(nowid_verified==null?"":nowid_verified);
		        nbi.setNpid(npid==null?"":npid);
		        nbi.setStart_date(start_date==null?"":start_date);
			}
		}
		GetCurrentBindingInfoResponse res = new GetCurrentBindingInfoResponse(
											responseCode,
											callerReferenceNo==null?"":callerReferenceNo,
											serverReferenceNo==null?"":serverReferenceNo,
											elapsedTime,
											lbi,
											nbi,
											FSA
											);
        return res;
    }
}
