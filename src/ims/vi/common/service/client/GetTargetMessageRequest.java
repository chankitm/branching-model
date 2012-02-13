package ims.vi.common.service.client;

public class GetTargetMessageRequest extends APIRequest{
	private UniqueKey key;
	private String language;
	
	public GetTargetMessageRequest(){
	}
	
	public GetTargetMessageRequest(UniqueKey key, String language, String callerID, String callerReferenceNo, String version) {
		super(callerID, callerReferenceNo, version);
		this.key = key;
		this.language = language;
	}
	
	public UniqueKey getKey() {
		return key;
	}
	public void setKey(UniqueKey key) {
		this.key = key;
	}
	public String getLanguage() {
		return language;
	}
	public void setLanguage(String language) {
		this.language = language;
	}
	public Class getResponseClass(){
		return GetTargetMessageResponse.class;
	}
	@Override
	public String toString(){
		return String.format("%s, %s: %s, Language: %s", super.toString(), getKey()!=null?getKey().getClass().getSimpleName():"Key", getKey()!=null?getKey().getValue():null, getLanguage());
	}
	
	public String toString(String serviceName){
		return String.format("%1$s\n" +
							 "[%2$s-in: %3$s] %4$s: %5$s\n" +
							 "[%2$s-in: %3$s] Language: %6$s"
							 , super.toString(serviceName), serviceName, getCallerReferenceNo(), getKey()!=null?getKey().getClass().getSimpleName():"Key", getKey()!=null?getKey().getValue():null, getLanguage());
	}
}
