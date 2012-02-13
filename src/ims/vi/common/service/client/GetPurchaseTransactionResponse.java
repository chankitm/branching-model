package ims.vi.common.service.client;

import ims.vi.common.service.client.enums.RestServerResponseCode;
import ims.vi.common.service.client.enums.ServerType;

public class GetPurchaseTransactionResponse extends APIResponse {
	public static final String SERVERTYPE = ServerType.MOVIEHOUSE.getType();
	private String clientId;
	private String fsa;
	private String productId;

	public GetPurchaseTransactionResponse(){
		
	}
	
	public GetPurchaseTransactionResponse(RestServerResponseCode responseCode, String callerReferenceNo, String serverReferenceNo, long elaspedTime, String fsa, String clientId, String productId){
		super(responseCode, callerReferenceNo, serverReferenceNo, elaspedTime);
		this.fsa = fsa;
		this.clientId = clientId;
		this.productId = productId;
	}
		
	public String getFsa() {
		return fsa;
	}

	public void setFsa(String fsa) {
		this.fsa = fsa;
	}
	
	public String getClientId() {
		return clientId;
	}

	public void setClientId(String clientId) {
		this.clientId = clientId;
	}
	
	public String getProductId() {
		return productId;
	}

	public void setProductId(String productId) {
		this.productId = productId;
	}

	@Override
	public String toString(){
		return String.format("%s, FSA: %s, ClientId: %s, ProductId: %s", 
				super.toString(), 
				getFsa(), getClientId(), getProductId());
	}
	
	public String toString(String serviceName){
		return String.format("%1$s\n" +
							 "[%2$s-out: %3$s, %4$s] FSA: %5$s\n" +
							 "[%2$s-out: %3$s, %4$s] ClientId: %6$s\n" +
							 "[%2$s-out: %3$s, %4$s] ProductId: %7$s"
							 , super.toString(serviceName)
							 , serviceName
							 , getServerReferenceNo()!=null?getServerReferenceNo():""
							 , getCallerReferenceNo()!=null?getCallerReferenceNo():""
							 , getFsa()
							 , getClientId()
							 , getProductId());
	}
	
}
