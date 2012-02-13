package ims.vi.common.service.client;

public class GetProfileByNetpassIDRequest extends APIRequest{
	private String npid;
	
	public GetProfileByNetpassIDRequest(){
	}
	
	public GetProfileByNetpassIDRequest(String callerID, String callerReferenceNo, String version, String npid) {
		super(callerID, callerReferenceNo, version);
		this.npid = npid;
	}

	public String getNpid() {
		return npid;
	}

	public void setNpid(String npid) {
		this.npid = npid;
	}


	public Class getResponseClass(){
		return GetProfileByNetpassIDResponse.class;
	}
	@Override
	public String toString(){
		return String.format("%s, NetpassID: %s", super.toString(), getNpid());
	}
	
	public String toString(String serviceName){
		return String.format("%1$s\n" +
							 "[%2$s-in: %3$s] NetpassID: %4$s\n"
							 , super.toString(serviceName)
							 , serviceName
							 , getCallerReferenceNo()
							 , getNpid()!=null?getNpid():"");
	}
}

