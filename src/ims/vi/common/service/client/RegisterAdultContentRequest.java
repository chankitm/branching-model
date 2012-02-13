package ims.vi.common.service.client;

public class RegisterAdultContentRequest extends APIRequest{
	private UniqueKey key;
	private String passportNo;
	private Boolean agreeTerm;
	
	public RegisterAdultContentRequest(){
	}
	
	public RegisterAdultContentRequest(UniqueKey key, String passportNo, Boolean agreeTerm, String callerID, String callerReferenceNo, String version) {
		super(callerID, callerReferenceNo, version);
		this.key = key;
		this.passportNo = passportNo;
	}
	
	public UniqueKey getKey() {
		return key;
	}
	public void setKey(UniqueKey key) {
		this.key = key;
	}
	public String getPassportNo() {
		return passportNo;
	}
	public void setPassportNo(String passportNo) {
		this.passportNo = passportNo;
	}
	public Boolean getAgreeTerm() {
		return agreeTerm;
	}
	public void setAgreeTerm(Boolean agreeTerm) {
		this.agreeTerm = agreeTerm;
	}
	public Class<RegisterAdultContentResponse> getResponseClass(){
		return RegisterAdultContentResponse.class;
	}
	@Override
	public String toString(){
		return String.format("%s, %s: %s, PassportNo: %s, AgreeTerm: %s", super.toString(), getKey()!=null?getKey().getClass().getSimpleName():"Key", getKey()!=null?getKey().getValue():null, getPassportNo(), getAgreeTerm().toString());
	}
	
	public String toString(String serviceName){
		return String.format("%1$s\n" +
							 "[%2$s-in: %3$s] %4$s: %5$s\n" +
							 "[%2$s-in: %3$s] PassportNo: %6$s\n" +
							 "[%2$s-in: %3$s] AgreeTerm: %7$s"
							 , super.toString(serviceName), serviceName, getCallerReferenceNo(), getKey()!=null?getKey().getClass().getSimpleName():"Key", getKey()!=null?getKey().getValue():null, getPassportNo(), getAgreeTerm().toString());
	}
}
