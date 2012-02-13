package ims.vi.common.service.client;

import ims.vi.common.service.client.enums.RestServerResponseCode;

public class GetTargetMessageResponse extends APIResponse {
	private String message;

	public GetTargetMessageResponse(){
		
	}
	
	public GetTargetMessageResponse(String message, RestServerResponseCode responseCode, String callerReferenceNo, String serverReferenceNo, long elaspedTime){
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
