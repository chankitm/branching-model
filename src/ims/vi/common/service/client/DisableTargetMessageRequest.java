package ims.vi.common.service.client;

public class DisableTargetMessageRequest extends APIRequest{
	private UniqueKey key;
	
	public DisableTargetMessageRequest(){
	}
	
	public DisableTargetMessageRequest(FSA key, String callerID, String callerReferenceNo, String version){
		super(callerID, callerReferenceNo, version);
		this.key = key;
	}

	public UniqueKey getKey() {
		return key;
	}

	public void setKey(UniqueKey key) {
		this.key = key;
	}
	
	@Override
	public String toString(){
		return String.format("%s, %s: %s",super.toString(), getKey()!=null?getKey().getClass().getSimpleName():"Key", getKey()!=null?getKey().getValue():null);
	}
	
	public String toString(String serviceName){
		return String.format("%s\n" +
							 "[%s-in: %s] %s: %s",super.toString(serviceName), serviceName, getCallerReferenceNo(), getKey()!=null?getKey().getClass().getSimpleName():"Key", getKey()!=null?getKey().getValue():null);
	}

	public Class getResponseClass(){
		return DisableTargetMessageResponse.class;
	}
}
