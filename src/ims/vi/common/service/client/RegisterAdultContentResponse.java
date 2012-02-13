package ims.vi.common.service.client;

import ims.vi.common.service.client.enums.RestServerResponseCode;

public class RegisterAdultContentResponse extends APIResponse {
	private Boolean success;

	public RegisterAdultContentResponse(){
	}
	
	public RegisterAdultContentResponse(Boolean success, RestServerResponseCode responseCode, String callerReferenceNo, String serverReferenceNo, long elaspedTime){
		super(responseCode, callerReferenceNo, serverReferenceNo, elaspedTime);
		this.success = success;
	}
	
	public Boolean getSuccess() {
		return success;
	}

	public void setSuccess(Boolean success) {
		this.success = success;
	}
	
	@Override
	public String toString(){
		return String.format("%s, Success: %s", super.toString(), success.toString());
	}
	
	public String toString(String serviceName){
		return String.format("%s\n" +
							 "[%s-out: %s, %s] Success: %s"
							 , super.toString(serviceName), serviceName, getServerReferenceNo(), getCallerReferenceNo(), success.toString());
	}
	
}
