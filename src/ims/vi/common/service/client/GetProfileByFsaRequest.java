package ims.vi.common.service.client;

public class GetProfileByFsaRequest extends APIRequest{
	private String fsa;
	
	public GetProfileByFsaRequest(){
	}
	
	public GetProfileByFsaRequest(String callerID, String callerReferenceNo, String version, String fsa) {
		super(callerID, callerReferenceNo, version);
		this.fsa = fsa;
	}

	public String getFsa() {
		return fsa;
	}

	public void setFsa(String fsa) {
		this.fsa = fsa;
	}


	public Class getResponseClass(){
		return GetProfileByFsaResponse.class;
	}
	@Override
	public String toString(){
		return String.format("%s, NetpassID: %s", super.toString(), getFsa());
	}
	
	public String toString(String serviceName){
		return String.format("%1$s\n" +
							 "[%2$s-in: %3$s] NetpassID: %s\n"
							 , super.toString(serviceName)
							 , serviceName
							 , getCallerReferenceNo()
							 , getFsa()!=null?getFsa():"");
	}
}

