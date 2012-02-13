package ims.vi.common.service.client;

public class VerifyTokenRequest extends APIRequest{
	private String token;

	
	public VerifyTokenRequest(){
	}
	
	public VerifyTokenRequest(String callerID, String callerReferenceNo, String version, String token) {
		super(callerID, callerReferenceNo, version);
		this.token = token;
	}
	

	public String getToken(){
		return token;
	}
	public void setToken(String token){
		this.token = token;
	}


	public Class getResponseClass(){
		return VerifyTokenResponse.class;
	}
	@Override
	public String toString(){
		return String.format("%s, token: %s", 
				super.toString(), 
				getToken()!=null?getToken():"");
	}
	
	public String toString(String serviceName){
		return String.format("%1$s\n" +
							 "[%2$s-in: %3$s] token: %4$s\n"
							 , super.toString(serviceName)
							 , serviceName
							 , getCallerReferenceNo()
							 , getToken()!=null?getToken():"");
	}
}
