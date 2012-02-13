package ims.vi.common.service.client;

public class PurchaseTransactionRequest extends APIRequest{
	private String clientId;
	private String fsa;
	private String pid;
	
	public PurchaseTransactionRequest(){
	}
	
	public PurchaseTransactionRequest(String callerID, String callerReferenceNo, String version, String clientId, String fsa, String pid) {
		super(callerID, callerReferenceNo, version);
		this.clientId = clientId;
		this.fsa = fsa;
		this.pid = pid;
	}
		
	public String getClientId() {
		return clientId;
	}

	public void setClientid(String clientId) {
		this.clientId = clientId;
	}

	public String getFsa() {
		return fsa;
	}

	public void setFsa(String fsa) {
		this.fsa = fsa;
	}

	public String getPid() {
		return pid;
	}

	public void setPid(String pid) {
		this.pid = pid;
	}

	public Class getResponseClass(){
		return PurchaseTransactionResponse.class;
	}
	@Override
	public String toString(){
		return String.format("%s, ClientID: %s, FSA: %s, PID: %s", super.toString(), getClientId(), getFsa(), getPid());
	}
	
	public String toString(String serviceName){
		return String.format("%1$s\n" +
							 "[%2$s-in: %3$s] ClientId: %4$s\n"+
							 "[%2$s-in: %3$s] FSA: %5$s\n"+
							 "[%2$s-in: %3$s] Product_ID: %6$s\n"
							 , super.toString(serviceName)
							 , serviceName
							 , getCallerReferenceNo()
							 , getClientId()!=null?getClientId():""
							 , getFsa()!=null?getFsa():""
							 , getPid()!=null?getPid():"");
	}
}
