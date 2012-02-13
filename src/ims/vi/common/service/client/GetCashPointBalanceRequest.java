package ims.vi.common.service.client;

public class GetCashPointBalanceRequest extends APIRequest{
	private UniqueKey key;
	private String source;
	
	public GetCashPointBalanceRequest(){
	}
	
	public GetCashPointBalanceRequest(String callerID, String callerReferenceNo, String version, UniqueKey key, String source){
		super(callerID, callerReferenceNo, version);
		this.key = key;
		this.source = source;
	}
	
	public UniqueKey getKey() {
		return key;
	}

	public void setKey(UniqueKey key) {
		this.key = key;
	}
	
	public String getSource() {
		return source;
	}

	public void setSource(String source) {
		this.source = source;
	}

	@Override
	public String toString(){
		return String.format("%s, %s: %s, %s: %s", super.toString(), getKey()!=null?getKey().getClass().getSimpleName():"Key", getKey()!=null?getKey().getValue():null, "source", getSource());
	}
	
	public String toString(String serviceName){
		return String.format("%1$s\n" +
							 "[%2$s-in: %3$s] %4$s: %5$s\n" +
							 "[%2$s-in: %3$s] %6$s: %7$s\n"
							 , super.toString(serviceName), serviceName, getCallerReferenceNo(), getKey()!=null?getKey().getClass().getSimpleName():"Key", getKey()!=null?getKey().getValue():null, "source", getSource());
	}
	
	@Override
	public Class getResponseClass() {
		return GetCashPointBalanceResponse.class;
	}

}
