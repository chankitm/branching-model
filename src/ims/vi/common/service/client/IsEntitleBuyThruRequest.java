package ims.vi.common.service.client;

public class IsEntitleBuyThruRequest extends APIRequest{
	private UniqueKey key;
	private String serviceName;
	private String serviceType;
	
	public String getServiceName() {
		return serviceName;
	}

	public void setServiceName(String serviceName) {
		this.serviceName = serviceName;
	}

	public String getServiceType() {
		return serviceType;
	}

	public void setServiceType(String serviceType) {
		this.serviceType = serviceType;
	}

	public IsEntitleBuyThruRequest(){
	}
	
	public IsEntitleBuyThruRequest(UniqueKey key, String callerID, String callerReferenceNo, String version) {
		super(callerID, callerReferenceNo, version);
		this.key = key;
	}
	
	public UniqueKey getKey() {
		return key;
	}
	public void setKey(UniqueKey key) {
		this.key = key;
	}	
	
	public Class getResponseClass(){
		return IsEntitleBuyThruResponse.class;
	}
	@Override
	public String toString(){
		return String.format("%s, %s: %s", super.toString(), getKey()!=null?getKey().getClass().getSimpleName():"Key", getKey()!=null?getKey().getValue():null);
	}
	
	public String toString(String serviceName){
		return String.format("%1$s\n" +
							 "[%2$s-in: %3$s] %4$s: %5$s\n" +
							 "[%2$s-in: %3$s]"
							 , super.toString(serviceName), serviceName, getCallerReferenceNo(), getKey()!=null?getKey().getClass().getSimpleName():"Key", getKey()!=null?getKey().getValue():null);
	}
}
