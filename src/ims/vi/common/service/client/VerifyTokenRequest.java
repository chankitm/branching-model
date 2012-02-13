package ims.vi.common.service.client;

public class VerifyTokenRequest extends APIRequest{
	private String token;
	private String service;
	
	public VerifyTokenRequest(){
	}

	public VerifyTokenRequest(String callerID, String callerReferenceNo,
			String version, String token, String service) {
		super(callerID, callerReferenceNo, version);
		this.token = token;
		this.service = service;
	}

	public String getToken(){
		return token;
	}
	public void setToken(String token){
		this.token = token;
	}
	public String getService() {
		return service;
	}
	public void setService(String service) {
		this.service = service;
	}

	public Class getResponseClass(){
		return VerifyTokenResponse.class;
	}
	@Override
	public String toString(){
		return String.format("%s, token: %s, service: %s", 
				super.toString(), 
				getToken()!=null?getToken():"",
				service==null?"":service);
	}
	
	public String toString(String serviceName){
		return String.format("%1$s\n" +
							 "[%2$s-in: %3$s] token: %4$s\n"+
							 "[%2$s-in: %3$s] service: %5$s\n"
							 , super.toString(serviceName)
							 , serviceName
							 , getCallerReferenceNo()
							 , getToken()!=null?getToken():""
							 , getService()!=null?getService():"");
	}
}
