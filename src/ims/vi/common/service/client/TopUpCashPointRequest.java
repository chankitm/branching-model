package ims.vi.common.service.client;

public class TopUpCashPointRequest extends APIRequest {
	private UniqueKey key;
	private String cashPointBalance;
	private String remarks;
	private CashPointTopUpPlan cashPointTopUpPlan;
	
	/*private String presentedPrice;
	private String topUpCashPoint;
	private String validityPeriod;
	private String offerCode;
	*/
	
	public TopUpCashPointRequest(){
		
	}
	
	public TopUpCashPointRequest(String callerID, String callerReferenceNo, String version, UniqueKey key, String remarks, CashPointTopUpPlan cashPointTopPlan){
		super(callerID, callerReferenceNo, version);
		this.key = key;
		this.cashPointBalance = cashPointBalance;
		this.cashPointTopUpPlan = cashPointTopUpPlan;
		this.remarks = remarks;
		/*this.presentedPrice = presentedPrice;
		this.topUpCashPoint = topUpCashPoint;
		this.validityPeriod = validityPeriod;
		this.offerCode = offerCode;*/
	}
	
	public UniqueKey getKey() {
		return key;
	}

	public void setKey(UniqueKey key) {
		this.key = key;
	}

	/*public String getPresentedPrice() {
		return presentedPrice;
	}

	public void setPresentedPrice(String presentedPrice) {
		this.presentedPrice = presentedPrice;
	}*/

	public String getCashPointBalance() {
		return cashPointBalance;
	}

	public void setCashPointBalance(String cashPointBalance) {
		this.cashPointBalance = cashPointBalance;
	}

	/*public String getTopUpCashPoint() {
		return topUpCashPoint;
	}

	public void setTopUpCashPoint(String topUpCashPoint) {
		this.topUpCashPoint = topUpCashPoint;
	}

	public String getValidityPeriod() {
		return validityPeriod;
	}

	public void setValidityPeriod(String validityPeriod) {
		this.validityPeriod = validityPeriod;
	}

	public String getOfferCode() {
		return offerCode;
	}

	public void setOfferCode(String offerCode) {
		this.offerCode = offerCode;
	}*/

	public String getRemarks() {
		return remarks;
	}

	public void setRemarks(String remarks) {
		this.remarks = remarks;
	}
	
	public CashPointTopUpPlan getCashPointTopUpPlan() {
		return cashPointTopUpPlan;
	}

	public void setCashPointTopUpPlan(CashPointTopUpPlan cashPointTopUpPlan) {
		this.cashPointTopUpPlan = cashPointTopUpPlan;
	}

	@Override
	public String toString(){
		return String.format("%s, %s: %s, Price: %s, CashPointBalance: %s, CashPoint: %s, ExpiryMonth: %s, OfferCode: %s, Remarks: %s"
				, super.toString(), getKey()!=null?getKey().getClass().getSimpleName():"Key", getKey()!=null?getKey().getValue():null, getCashPointTopUpPlan().getPrice()
				, getCashPointBalance(), getCashPointTopUpPlan().getCashPoint(), getCashPointTopUpPlan().getExpiryMonth(), getCashPointTopUpPlan().getOfferCode(), getRemarks());
	}
	
	public String toString(String serviceName){
		return String.format("%1$s\n" +
							 "[%2$s-in: %3$s] %4$s: %5$s\n" +
							 "[%2$s-in: %3$s] Price: %6$s\n" +
							 "[%2$s-in: %3$s] CashPointBalance: %7$s\n" +
							 "[%2$s-in: %3$s] CashPoint: %8$s\n" +
							 "[%2$s-in: %3$s] ExpiryMonth: %9$s\n" +
							 "[%2$s-in: %3$s] OfferCode: %10$s\n" +
							 "[%2$s-in: %3$s] Remarks: %11$s\n"
							 , super.toString(serviceName), serviceName, getCallerReferenceNo(), getKey()!=null?getKey().getClass().getSimpleName():"Key", getKey()!=null?getKey().getValue():null
							 , getCashPointTopUpPlan().getPrice(), getCashPointBalance(), getCashPointTopUpPlan().getCashPoint(), getCashPointTopUpPlan().getExpiryMonth(), getCashPointTopUpPlan().getOfferCode(), getRemarks());
	}
	
	@Override
	public Class getResponseClass() {
		return TopUpCashPointResponse.class;
	}
	
}
