package ims.vi.common.service.client;

import ims.vi.common.service.client.enums.RestServerResponseCode;
//import ims.vi.common.service.client.enums.ServerType;

public class CreatePurchaseTransactionResponse extends APIResponse{
	//public static final String SERVERTYPE = ServerType.QPA.getType(); 

	private String hash;
	
	public String getHash() {
		return hash;
	}

	public void setHash(String hash) {
		this.hash = hash;
	}

	public CreatePurchaseTransactionResponse(){

	}
	
	public CreatePurchaseTransactionResponse(RestServerResponseCode responseCode, String callerReferenceNo, String serverReferenceNo, long elapsedTime, String hash){
		super(responseCode, callerReferenceNo, serverReferenceNo, elapsedTime);
		this.hash = hash;
	}
	
	@Override
	public String toString(){
		return String.format("%s, %s: %s", super.toString(), "Hash", getHash());
	}
	
	public String toString(String serviceName){
		return String.format("%1$s\n" +
				 			 "[%2$s-out: %3$s, %4$s] %5$s: %6$s\n"
							 ,super.toString(serviceName), serviceName, getServerReferenceNo(), getCallerReferenceNo(),
							 "Hash", getHash()
							);
	}
}
