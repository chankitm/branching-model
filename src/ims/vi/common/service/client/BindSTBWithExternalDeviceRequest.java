package ims.vi.common.service.client;

public class BindSTBWithExternalDeviceRequest extends APIRequest{
	private String deviceID;
	private String extInfo; 
	private String fsa;
	private String stbid; 
	
	public BindSTBWithExternalDeviceRequest(){
	}
	
	public BindSTBWithExternalDeviceRequest(String callerID, String callerReferenceNo, String version, String fsa ,String stbid, String deviceID, String extInfo){
		super(callerID, callerReferenceNo, version);
		this.deviceID = deviceID;
		this.extInfo = extInfo;
		this.fsa = fsa;
		this.stbid = stbid;
	}

	public String getDeviceID() {
		return deviceID;
	}
	public void setDeviceID(String deviceID) {
		this.deviceID = deviceID;
	}
	public String getExtInfo() {
		return extInfo;
	}
	public void setExtInfo(String extInfo) {
		this.extInfo = extInfo;
	}
	public String getFsa() {
		return fsa;
	}

	public void setFsa(String fsa) {
		this.fsa = fsa;
	}

	public String getStbid() {
		return stbid;
	}

	public void setStbid(String stbid) {
		this.stbid = stbid;
	}

	@Override
	public String toString(){
		return String.format("%s,fsa=[%s], stbid=[%s], deviceID=[%s], extInfo=[%s]", 
				super.toString(), 
				getFsa()==null?"":getFsa(), 
				getStbid()==null?"":getStbid(), 
				getDeviceID()==null?"":getDeviceID(), 
				getExtInfo()==null?"":getExtInfo());
	}
	


	public String toString(String serviceName){
		return String.format("%1$s\n" +
							 "[%2$s-in: %3$s] deviceID: %4$s\n" +
							 "[%2$s-in: %3$s] extInfo: %5$s\n" +
							 "[%2$s-in: %3$s] fsa: %6$s\n" +
							 "[%2$s-in: %3$s] stbid: %7$s\n"
							 , super.toString(serviceName), serviceName, getCallerReferenceNo()
							 , getDeviceID()==null?"":getDeviceID()
							 , getExtInfo()==null?"":getExtInfo()
							 , getFsa()==null?"":getFsa()
							 , getStbid()==null?"":getStbid());
	}
	
	@Override
	public Class getResponseClass() {
		return BindSTBWithExternalDeviceResponse.class;
	}
}
