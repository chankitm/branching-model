package ims.vi.common.service.client;

public class BindMovieHouseRequest extends APIRequest{
	private String npid;
	private String fsa;
	
	public BindMovieHouseRequest(){
	}
	
	public BindMovieHouseRequest(String callerID, String callerReferenceNo, String version, String npid, String fsa) {
		super(callerID, callerReferenceNo, version);
		this.npid = npid;
		this.fsa = fsa;
	}

	public String getNpid() {
		return npid;
	}

	public void setNpid(String npid) {
		this.npid = npid;
	}

	public String getFsa() {
		return fsa;
	}

	public void setFsa(String fsa) {
		this.fsa = fsa;
	}

	public Class getResponseClass(){
		return BindMovieHouseResponse.class;
	}
	@Override
	public String toString(){
		return String.format("%s, NetpassID: %s, Fsa: %s", super.toString(), getNpid(), getFsa());
	}
	
	public String toString(String serviceName){
		return String.format("%1$s\n" +
							 "[%2$s-in: %3$s] NetpassID: %4$s\n"+
							 "[%2$s-in: %3$s] Fsa: %5$s\n"
							 , super.toString(serviceName)
							 , serviceName
							 , getCallerReferenceNo()
							 , getNpid()!=null?getNpid():""
							 , getFsa() !=null?getFsa():"");
	}
}

