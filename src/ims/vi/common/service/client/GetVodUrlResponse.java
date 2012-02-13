package ims.vi.common.service.client;

import ims.vi.common.service.client.enums.RestServerResponseCode;

public class GetVodUrlResponse extends APIResponse{
	public GetVodUrlResponse(){

	}
	
	public GetVodUrlResponse(RestServerResponseCode responseCode, String callerReferenceNo, String serverReferenceNo, long elapsedTime){
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
