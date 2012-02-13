package ims.vi.common.service.client;

public class GetTokenServiceRequest extends APIRequest{
	private UniqueKey key;
	private int expiry;
	private String service;
	
	public GetTokenServiceRequest(){
	}
	public GetTokenServiceRequest(String callerID, String callerReferenceNo,
			String version, UniqueKey key, int expiry, String service) {
		super(callerID, callerReferenceNo, version);
		this.key = key;
		this.expiry = expiry;
		this.service = service;
	}
	
	public UniqueKey getKey() {
		return key;
	}
	public void setKey(UniqueKey key) {
		this.key = key;
	}
	public int getExpiry() {
		return expiry;
	}
	public void setExpiry(int expiry) {
		this.expiry = expiry;
	}
	public String getService() {
		return service;
	}
	public void setService(String service) {
		this.service = service;
	}
	public Class getResponseClass(){
		return GetTokenServiceResponse.class;
	}
	@Override
	public String toString(){
		return String.format("%s, %s: %s, expiry: %s, service: %s", 
				super.toString(), 
				getKey()!=null?getKey().getClass().getSimpleName():"Key", 
				getKey()!=null?getKey().getValue():null,
				Integer.toString(getExpiry())==null?"":Integer.toString(getExpiry()),
				service==null?"":service);
	}
	
	public String toString(String serviceName){
		return String.format("%1$s\n" +
							 "[%2$s-in: %3$s] %4$s: %5$s\n" +
							 "[%2$s-in: %3$s] expiry: %6$s" +
							 "[%2$s-in: %3$s] service: %7$s"
							 , super.toString(serviceName), 
							 serviceName, 
							 getCallerReferenceNo(), 
							 getKey()!=null?getKey().getClass().getSimpleName():"Key", 
							 getKey()!=null?getKey().getValue():null,
							 Integer.toString(getExpiry())==null?"":Integer.toString(getExpiry()),
							 service==null?"":service);
	}
}
