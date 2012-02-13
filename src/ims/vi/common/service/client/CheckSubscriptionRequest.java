package ims.vi.common.service.client;

public class CheckSubscriptionRequest extends APIRequest{
	private String clientid;
	private String fsa;
	private String pid;
	
	public CheckSubscriptionRequest(){
	}
	
	public CheckSubscriptionRequest(String callerID, String callerReferenceNo, String version, String clientid, String fsa, String pid) {
		super(callerID, callerReferenceNo, version);
		this.clientid = clientid;
		this.fsa = fsa;
		this.pid = pid;
	}
	
	
	
	public String getClientid() {
		return clientid;
	}

	public void setClientid(String clientid) {
		this.clientid = clientid;
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
		return CheckSubscriptionResponse.class;
	}
	@Override
	public String toString(){
		return String.format("%s, ClientID: %s, FSA: %s, PID: %s", super.toString(), getClientid(), getFsa(), getPid());
	}
	
	public String toString(String serviceName){
		return String.format("%1$s\n" +
							 "[%2$s-in: %3$s] ClientId: %4$s\n"+
							 "[%2$s-in: %3$s] FSA: %5$s\n"+
							 "[%2$s-in: %3$s] PID: %6$s\n"
							 , super.toString(serviceName)
							 , serviceName
							 , getCallerReferenceNo()
							 , getClientid()!=null?getClientid():""
							 , getFsa()!=null?getFsa():""
							 , getPid()!=null?getPid():"");
	}
}
