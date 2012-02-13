package ims.vi.common.service.client;

import ims.vi.common.service.client.enums.RestServerResponseCode;
import ims.vi.common.service.client.enums.ServerType;

public class UnbindMovieHouseResponse extends APIResponse {
	public static final String SERVERTYPE = ServerType.MOVIEHOUSE.getType();

	public UnbindMovieHouseResponse(){
		
	}
	
	public UnbindMovieHouseResponse( RestServerResponseCode responseCode, String callerReferenceNo, String serverReferenceNo, long elaspedTime){
		super(responseCode, callerReferenceNo, serverReferenceNo, elaspedTime);
	}

	@Override
	public String toString(){
		return String.format("%s", super.toString());
	}
	
	public String toString(String serviceName){
		return super.toString(serviceName);
	}
	
}
