package ims.vi.common.service.client;

import ims.vi.common.service.client.enums.RestServerResponseCode;
import ims.vi.common.service.client.enums.ServerType;

public class PurchaseTransactionResponse extends APIResponse {
	public static final String SERVERTYPE = ServerType.MOVIEHOUSE.getType();
	private String hash;
	private String machineName;

	public PurchaseTransactionResponse(){
		
	}
	
	public PurchaseTransactionResponse(String hash, String machineName, RestServerResponseCode responseCode, String callerReferenceNo, String serverReferenceNo, long elaspedTime){
		super(responseCode, callerReferenceNo, serverReferenceNo, elaspedTime);
		this.hash = hash;
		this.machineName = machineName;
	}
		
	public String getHash() {
		return hash;
	}

	public void setHash(String hash) {
		this.hash = hash;
	}
	
	public String getMachineName() {
		return machineName;
	}

	public void setMachineName(String machineName) {
		this.machineName = machineName;
	}

	@Override
	public String toString(){
		return String.format("%s, Hash: %s, MachineName: %s", 
				super.toString(), 
				getHash(),
				getMachineName());
	}
	
	public String toString(String serviceName){
		return String.format("%1$s\n" +
							 "[%2$s-out: %3$s, %4$s] Hash: %5$s\n" +
							 "[%2$s-out: %3$s, %4$s] MachineName: %6$s"
							 , super.toString(serviceName)
							 , serviceName
							 , getServerReferenceNo()
							 , getCallerReferenceNo()
							 , getHash()
							 , getMachineName());
	}
	
}
