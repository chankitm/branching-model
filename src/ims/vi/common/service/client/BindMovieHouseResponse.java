package ims.vi.common.service.client;


import ims.vi.common.service.client.enums.RestServerResponseCode;
import ims.vi.common.service.client.enums.ServerType;

public class BindMovieHouseResponse extends APIResponse {
	public static final String SERVERTYPE = ServerType.MOVIEHOUSE.getType();

	public BindMovieHouseResponse(){
		
	}
	
	public BindMovieHouseResponse( RestServerResponseCode responseCode, String callerReferenceNo, String serverReferenceNo, long elaspedTime){
		super(responseCode, callerReferenceNo, serverReferenceNo, elaspedTime);
	}

	@Override
	public String toString(){
		return String.format("%s", 
				super.toString());
	}
	
	public String toString(String serviceName){
		return String.format("%s\n" +
							 "[%s-out: %s, %s]"
							 , super.toString(serviceName)
							 , serviceName
							 , getServerReferenceNo()!=null?getServerReferenceNo():""
							 , getCallerReferenceNo()!=null?getCallerReferenceNo():"");
	}
	
}
