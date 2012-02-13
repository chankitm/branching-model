package ims.vi.common.service.client;

public class StoreSubscriptionRequest extends APIRequest{
	private String hash;
	private String fsa;
	private String pid;
	
	public StoreSubscriptionRequest(){
	}
	
	public StoreSubscriptionRequest(String callerID, String callerReferenceNo, String version, String hash, String fsa, String pid) {
		super(callerID, callerReferenceNo, version);
		this.hash = hash;
		this.fsa = fsa;
		this.pid = pid;
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

	public String getPid() {
		return pid;
	}

	public void setPid(String pid) {
		this.pid = pid;
	}

	public Class getResponseClass(){
		return StoreSubscriptionResponse.class;
	}
	@Override
	public String toString(){
		return String.format("%s, HASH: %s, FSA: %s, PID: %s", super.toString(), getHash(), getFsa(), getPid());
	}
	
	public String toString(String serviceName){
		return String.format("%1$s\n" +
							 "[%2$s-in: %3$s] HASH: %4$s\n" +
							 "[%2$s-in: %3$s] FSA:  %5$s\n" +
							 "[%2$s-in: %3$s] PID:  %6$s\n"
							 , super.toString(serviceName)
							 , serviceName
							 , getCallerReferenceNo()
							 , getHash()!=null?getHash():""
							 , getFsa()!=null?getFsa():""
							 , getPid()!=null?getPid():"");
	}
}
