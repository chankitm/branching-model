package ims.vi.common.service.client;

public class StoreTransactionRequest extends APIRequest{
	private String hash;
	private String clientid;
	private String fsa;
	private String pid;
	
	public StoreTransactionRequest(){
	}
	
	public StoreTransactionRequest(String callerID, String callerReferenceNo, String version, String hash, String clientid, String fsa, String pid) {
		super(callerID, callerReferenceNo, version);
		this.hash = hash;
		this.clientid = clientid;
		this.fsa = fsa;
		this.pid = pid;
	}

	public String getHash() {
		return hash;
	}

	public void setHash(String hash) {
		this.hash = hash;
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
		return StoreTransactionResponse.class;
	}
	@Override
	public String toString(){
		return String.format("%s, HASH: %s, CLIENTID: %s, FSA: %s, PID: %s", super.toString(), getHash(), getClientid(), getFsa(), getPid());
	}
	
	public String toString(String serviceName){
		return String.format("%1$s\n" +
							 "[%2$s-in: %3$s] HASH: %4$s\n" +
							 "[%2$s-in: %3$s] CLIENTID: %5$s\n" +
							 "[%2$s-in: %3$s] FSA: %6$s\n" +
							 "[%2$s-in: %3$s] PID: %7$s\n"
							 , super.toString(serviceName)
							 , serviceName
							 , getCallerReferenceNo()
							 , getHash()!=null?getHash():""
							 , getClientid()!=null?getClientid():""
							 , getFsa()!=null?getFsa():""
							 , getPid()!=null?getPid():"");
	}
}
