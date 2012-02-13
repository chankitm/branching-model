package ims.vi.common.service.client;

import ims.vi.common.service.client.enums.RestServerResponseCode;

public class DisableTargetMessageResponse extends APIResponse{

	public DisableTargetMessageResponse(){

	}
	
	public DisableTargetMessageResponse(RestServerResponseCode responseCode, String callerReferenceNo, String serverReferenceNo, long elapsedTime){
		super(responseCode, callerReferenceNo, serverReferenceNo, elapsedTime);
	}
	
	@Override
	public String toString(){
		return super.toString();
	}
	
	public String toString(String serviceName){
		return super.toString(serviceName);
	}
}
