package ims.vi.common.service.client;

import ims.vi.common.service.client.enums.RestServerResponseCode;
import ims.vi.common.service.client.enums.ServerType;

public class UnbindResponse extends APIResponse{
	public static final String SERVERTYPE = ServerType.STBC_UNBIND.getType();
	
	public UnbindResponse(){
	}
	
	public UnbindResponse(RestServerResponseCode responseCode, String callerReferenceNo, String serverReferenceNo, long elapsedTime){
		super(responseCode, callerReferenceNo, serverReferenceNo, elapsedTime);
	}
	
	@Override
	public String toString(){
		return String.format("%s", super.toString());
	}
	
	public String toString(String serviceName){
		return super.toString(serviceName);
	}
}
