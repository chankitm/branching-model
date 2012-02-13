package ims.vi.common.service.client;

public class CreatePurchaseTransactionRequest extends APIRequest{
	private String fsa;
	private String productId;
	private String movieFormat;
	private String presentedPrice;
	private String cashPointBalance;
	private String purchaseType;
	
	public CreatePurchaseTransactionRequest(){
	}
	
	public CreatePurchaseTransactionRequest(String callerID, String callerReferenceNo, String version, String fsa, String productId, String movieFormat, String presentedPrice, String cashPointBalance, String purchaseType){
		super(callerID, callerReferenceNo, version);
		this.fsa = fsa;
		this.productId = productId;
		this.movieFormat = movieFormat;
		this.presentedPrice = presentedPrice;
		this.cashPointBalance = cashPointBalance;
		this.purchaseType = purchaseType;
	}
	
	public String getFsa() {
		return fsa;
	}

	public void setFsa(String fsa) {
		this.fsa = fsa;
	}
	
	public String getProductId() {
		return productId;
	}

	public void setProductId(String productId) {
		this.productId = productId;
	}

	public String getMovieFormat() {
		return movieFormat;
	}

	public void setMovieFormat(String movieFormat) {
		this.movieFormat = movieFormat;
	}

	public String getPresentedPrice() {
		return presentedPrice;
	}

	public void setPresentedPrice(String presentedPrice) {
		this.presentedPrice = presentedPrice;
	}

	public String getCashPointBalance() {
		return cashPointBalance;
	}

	public void setCashPointBalance(String cashPointBalance) {
		this.cashPointBalance = cashPointBalance;
	}

	public String getPurchaseType() {
		return purchaseType;
	}

	public void setPurchaseType(String purchaseType) {
		this.purchaseType = purchaseType;
	}

	@Override
	public String toString(){
		return String.format("%s, %s: %s, %s: %s, %s: %s, %s: %s, %s: %s, %s: %s", super.toString(),
							"fsa", getFsa(),
							"productId", getProductId(),
							"movieFormat", getMovieFormat(),
							"presentedPrice", getPresentedPrice(),
							"cashPointBalance", getCashPointBalance(),
							"purchaseType", getPurchaseType()
							);
	}
	
	public String toString(String serviceName){
		return String.format("%1$s\n" +
							 "[%2$s-in: %3$s] %4$s: %5$s\n" +
							 "[%2$s-in: %3$s] %6$s: %7$s\n" +
							 "[%2$s-in: %3$s] %8$s: %9$s\n" +
							 "[%2$s-in: %3$s] %10$s: %11$s\n" +
							 "[%2$s-in: %3$s] %12$s: %13$s\n" +
							 "[%2$s-in: %3$s] %14$s: %15$s\n"
							 , super.toString(serviceName), serviceName, getCallerReferenceNo(),
							 "fsa", getFsa(),
							 "productId", getProductId(),
							 "movieFormat", getMovieFormat(),
							 "presentedPrice", getPresentedPrice(),
							 "cashPointBalance", getCashPointBalance(),
							 "purchaseType", getPurchaseType()
							);
	}
	
	@Override
	public Class getResponseClass() {
		return CreatePurchaseTransactionResponse.class;
	}

}
