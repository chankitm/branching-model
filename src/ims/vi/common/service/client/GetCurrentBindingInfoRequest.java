package ims.vi.common.service.client;

public class GetCurrentBindingInfoRequest extends APIRequest{
	private UniqueKey key;
	private String deviceID;
	
	public GetCurrentBindingInfoRequest(){
	}
	
	public GetCurrentBindingInfoRequest(String callerID, String callerReferenceNo, String version, UniqueKey key, String deviceID){
		super(callerID, callerReferenceNo, version);
		this.key = key;
		this.deviceID = deviceID;
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

	@Override
	public String toString(){
		return String.format("%s, %s: %s, deviceID: %s", 
				super.toString(), 
				getKey()!=null?getKey().getClass().getSimpleName():"Key", 
				getKey()!=null?getKey().getValue():null,
				getDeviceID()==null?"":getDeviceID());
	}
	
	public String toString(String serviceName){
		return String.format("%1$s\n" +
							 "[%2$s-in: %3$s] %4$s: %5$s\n" +
							 "[%2$s-in: %3$s] deviceID: %6$s\n"
							 , super.toString(serviceName)
							 , serviceName
							 , getCallerReferenceNo()
							 , getKey()!=null?getKey().getClass().getSimpleName():"Key"
							 , getKey()!=null?getKey().getValue():null
							 , getDeviceID()==null?"":getDeviceID());
	}
	
	@Override
	public Class getResponseClass() {
		return GetCurrentBindingInfoResponse.class;
	}
}
