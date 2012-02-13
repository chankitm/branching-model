package ims.vi.common.service.client;

public class DeductQuotaRequest extends APIRequest{
	private String hash;
	
	public DeductQuotaRequest(){
	}
	
	public DeductQuotaRequest(String callerID, String callerReferenceNo, String version, String hash){
		super(callerID, callerReferenceNo, version);
		this.hash = hash;
	}
	
	public String getHash() {
		return hash;
	}

	public void setHash(String hash) {
		this.hash = hash;
	}

	@Override
	public String toString(){
		return String.format("%s, Hash: %s", super.toString(), getHash());
	}
	
	public String toString(String serviceName){
		return String.format("%1$s\n" +
							 "[%2$s-in: %3$s] Hash: %4$s\n"
							 , super.toString(serviceName), serviceName, getCallerReferenceNo(), getHash());
	}
	
	@Override
	public Class getResponseClass() {
		return DeductQuotaResponse.class;
	}
}
