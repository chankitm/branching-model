package ims.vi.common.service.client;

import ims.vi.common.service.client.enums.RestServerResponseCode;
import ims.vi.common.service.client.enums.ServerType;

public class BindSTBWithExternalDeviceResponse extends APIResponse{
	public static final String SERVERTYPE = ServerType.STBC_BIND.getType();
	
	public BindSTBWithExternalDeviceResponse(){
	}
	
	public BindSTBWithExternalDeviceResponse(RestServerResponseCode responseCode, String callerReferenceNo, String serverReferenceNo, long elapsedTime){
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
