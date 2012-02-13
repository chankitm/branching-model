package ims.vi.common.service.client;

import ims.vi.common.service.client.enums.RestServerResponseCode;
import ims.vi.common.service.client.enums.ServerType;

public class VerifyTokenResponse extends APIResponse {
	public static final String SERVERTYPE = ServerType.STBC_VERIFYT.getType();
	private String fsa;
	private String stbid;

	public VerifyTokenResponse(){
		
	}
	
	public VerifyTokenResponse(String fsa, String stbid, RestServerResponseCode responseCode, String callerReferenceNo, String serverReferenceNo, long elaspedTime){
		super(responseCode, callerReferenceNo, serverReferenceNo, elaspedTime);
		this.fsa = fsa;
		this.stbid = stbid;
	}
	
	public String getFsa() {
		return fsa;
	}

	public void setFsa(String fsa) {
		this.fsa = fsa;
	}
	
	public String getStbid() {
		return stbid;
	}

	public void setStbid(String stbid) {
		this.stbid = stbid;
	}
	
	@Override
	public String toString(){
		return String.format("%s, FSA: %s, STBID: %s", 
				super.toString(), 
				getFsa()!=null?getFsa():"", 
				getStbid()!=null?getStbid():"");
	}
	
	public String toString(String serviceName){
		return String.format("%s\n" +
							 "[%s-out: %s, %s] FSA: %s STBID: %s"
							 , super.toString(serviceName)
							 , serviceName
							 , getServerReferenceNo()!=null?getServerReferenceNo():""
							 , getCallerReferenceNo()!=null?getCallerReferenceNo():""
							 , getFsa()!=null?getFsa():""
							 , getStbid()!=null?getStbid():"");
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
