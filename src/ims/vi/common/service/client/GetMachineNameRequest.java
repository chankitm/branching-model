package ims.vi.common.service.client;

public class GetMachineNameRequest extends APIRequest{
	private String fsa;
	private String clientId; 
	
	public GetMachineNameRequest(){
	}
	
	public GetMachineNameRequest(String callerID, String callerReferenceNo, String version, String fsa, String clientId){
		super(callerID, callerReferenceNo, version);
		this.fsa = fsa;
		this.clientId = clientId;
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
		return String.format("%s, %s: %s, %s: %s", super.toString(),
							"fsa", getFsa(),
							"clientId", getClientId()
							);
	}
	
	public String toString(String serviceName){
		return String.format("%1$s\n" +
							 "[%2$s-in: %3$s] %4$s: %5$s\n" +
							 "[%2$s-in: %3$s] %6$s: %7$s\n"
							 , super.toString(serviceName), serviceName, getCallerReferenceNo(),
							 "fsa", getFsa(),
							 "clientId", getClientId()
							);
	}
	
	@Override
	public Class getResponseClass() {
		return GetMachineNameResponse.class;
	}

}
