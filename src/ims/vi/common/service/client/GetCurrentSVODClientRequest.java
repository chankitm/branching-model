package ims.vi.common.service.client;

public class GetCurrentSVODClientRequest extends APIRequest{
	private String hash;
	private String fsa;
	private String clientId;

	public GetCurrentSVODClientRequest(){
	}
	
	public GetCurrentSVODClientRequest(String callerID, String callerReferenceNo, String version, String hash){
		super(callerID, callerReferenceNo, version);
		this.hash = hash;
	}
	
	public String getHash() {
		return hash;
	}

	public void setHash(String hash) {
		this.hash = hash;
	}
	
	public String getFsa() {
		return fsa;
	}

	public void setFsa(String fsa) {
		this.fsa = fsa;
	}

	public String getClientId() {
		return clientId;
	}

	public void setClientId(String clientId) {
		this.clientId = clientId;
	}

	@Override
	public String toString(){
		return String.format("%s, Hash: %s, FSA: %s, clientId: %s", super.toString(), getHash(), getFsa(), getClientId());
	}
	
	public String toString(String serviceName){
		return String.format("%1$s\n" +
							 "[%2$s-in: %3$s] Hash: %4$s\n" +
							 "[%2$s-in: %3$s] FSA: %5$s\n" +
							 "[%2$s-in: %3$s] clientId: %6$s\n"
							 , super.toString(serviceName), serviceName, getCallerReferenceNo(), getHash(), getFsa(), getClientId());
	}
	
	@Override
	public Class getResponseClass() {
		return GetCurrentSVODClientResponse.class;
	}
}
