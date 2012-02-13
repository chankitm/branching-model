package ims.vi.common.service.client;

import ims.vi.common.service.client.enums.RestServerResponseCode;
import ims.vi.common.service.client.enums.ServerType;

public class GetTokenServiceResponse extends APIResponse {
	public static final String SERVERTYPE = ServerType.STBC_GETT.getType();
	private String token;

	public GetTokenServiceResponse(){
		
	}
	
	public GetTokenServiceResponse(String token, RestServerResponseCode responseCode, String callerReferenceNo, String serverReferenceNo, long elaspedTime){
		super(responseCode, callerReferenceNo, serverReferenceNo, elaspedTime);
		this.token = token;
	}
	
	public String getToken() {
		return token;
	}

	public void setToken(String token) {
		this.token = token;
	}
	
	@Override
	public String toString(){
		return String.format("%s, Token: %s", super.toString(), getToken());
	}
	
	public String toString(String serviceName){
		return String.format("%s\n" +
							 "[%s-out: %s, %s] Token: %s"
							 , super.toString(serviceName), serviceName, getServerReferenceNo(), getCallerReferenceNo(), getToken());
	}
	
}

/*package ims.vi.common.service.client;

import ims.vi.common.service.client.enums.RestServerResponseCode;

public class GetTestServiceResponse extends APIResponse {
	private String message;

	public GetTestServiceResponse(){
		
	}
	
	public GetTestServiceResponse(String message, RestServerResponseCode responseCode, String callerReferenceNo, String serverReferenceNo, long elaspedTime){
		super(responseCode, callerReferenceNo, serverReferenceNo, elaspedTime);
		this.message = message;
	}
	
	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}
	
	@Override
	public String toString(){
		return String.format("%s, Message: %s", super.toString(), getMessage());
	}
	
	public String toString(String serviceName){
		return String.format("%s\n" +
							 "[%s-out: %s, %s] Message: %s"
							 , super.toString(serviceName), serviceName, getServerReferenceNo(), getCallerReferenceNo(), getMessage());
	}
	
}
*/
