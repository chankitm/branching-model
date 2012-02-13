package ims.vi.common.service.client;

public class GetCashPointBalanceRequest extends APIRequest{
	private UniqueKey key;
	
	public GetCashPointBalanceRequest(){
	}
	
	public GetCashPointBalanceRequest(String callerID, String callerReferenceNo, String version, UniqueKey key){
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
		return String.format("%s, %s: %s", super.toString(), getKey()!=null?getKey().getClass().getSimpleName():"Key", getKey()!=null?getKey().getValue():null);
	}
	
	public String toString(String serviceName){
		return String.format("%1$s\n" +
							 "[%2$s-in: %3$s] %4$s: %5$s\n"
							 , super.toString(serviceName), serviceName, getCallerReferenceNo(), getKey()!=null?getKey().getClass().getSimpleName():"Key", getKey()!=null?getKey().getValue():null);
	}
	
	@Override
	public Class getResponseClass() {
		return GetCashPointBalanceResponse.class;
	}

}
