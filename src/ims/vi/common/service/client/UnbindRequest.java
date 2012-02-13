package ims.vi.common.service.client;

public class UnbindRequest extends APIRequest{
	private UniqueKey key;
	private String deviceID;
	private String npid;
	private String fsa;
	private String bindingType;
	
	public UnbindRequest(){
	}
	
	public UnbindRequest(String callerID, String callerReferenceNo, String version, UniqueKey key, String deviceID, String npid, String fsa, String bindingType){
		super(callerID, callerReferenceNo, version);
		this.key = key;
		this.deviceID = deviceID;
		this.npid = npid;
		this.fsa = fsa;
		this.bindingType = bindingType;
	}

	public UniqueKey getKey() {
		return key;
	}
	public void setKey(UniqueKey key) {
		this.key = key;
	}

	public String getDeviceID() {
		return deviceID;
	}
	public void setDeviceID(String deviceID) {
		this.deviceID = deviceID;
	}
	
	public String getNpid() {
		return npid;
	}

	public void setNpid(String npid) {
		this.npid = npid;
	}

	public String getFsa() {
		return fsa;
	}

	public void setFsa(String fsa) {
		this.fsa = fsa;
	}
	
	public String getBindingType() {
		return bindingType;
	}

	public void setBindingType(String bindingType) {
		this.bindingType = bindingType;
	}

	@Override
	public String toString(){
		return String.format("%s, %s: %s, deviceID: %s, NetpassID: %s, Fsa: %s, Type: %s", 
				super.toString(), 
				getKey()!=null?getKey().getClass().getSimpleName():"Key", 
				getKey()!=null?getKey().getValue():null,
				getDeviceID()==null?"":getDeviceID(),
				getNpid()!=null?getNpid():"",
				getFsa() !=null?getFsa():"",
				getBindingType() != null?getBindingType():"");
	}
	
	public String toString(String serviceName){
		return String.format("%1$s\n" +
							 "[%2$s-in: %3$s] %4$s: %5$s\n" +
							 "[%2$s-in: %3$s] deviceID: %6$s\n"+
							 "[%2$s-in: %3$s] NetpassID: %7$s\n"+
							 "[%2$s-in: %3$s] Fsa: %8$s\n" +
							 "[%2$s-in: %3$s] Type: %9$s\n"
							 , super.toString(serviceName)
							 , serviceName
							 , getCallerReferenceNo()
							 , getKey()!=null?getKey().getClass().getSimpleName():"Key"
							 , getKey()!=null?getKey().getValue():null
							 , getDeviceID()==null?"":getDeviceID()
							 , getNpid()!=null?getNpid():""
							 , getFsa() !=null?getFsa():""
							 , getBindingType() != null?getBindingType():"");
	}
	
	@Override
	public Class getResponseClass() {
		return UnbindResponse.class;
	}
}
