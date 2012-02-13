package ims.vi.common.service.client;

public class CashPointTopUpPlan {
	private String offerCode;
	private String cashPoint;
	private String price;
	private String expiryMonth;
	
	public CashPointTopUpPlan(){
		
	}
	
	public CashPointTopUpPlan(String offerCode, String cashPoint, String price, String expiryMonth){
		this.offerCode = offerCode;
		this.cashPoint = cashPoint;
		this.price = price;
		this.expiryMonth = expiryMonth;
	}
	
	public String getOfferCode() {
		return offerCode;
	}
	public void setOfferCode(String offerCode) {
		this.offerCode = offerCode;
	}
	public String getCashPoint() {
		return cashPoint;
	}
	public void setCashPoint(String cashPoint) {
		this.cashPoint = cashPoint;
	}
	public String getPrice() {
		return price;
	}
	public void setPrice(String price) {
		this.price = price;
	}
	public String getExpiryMonth() {
		return expiryMonth;
	}
	public void setExpiryMonth(String expiryMonth) {
		this.expiryMonth = expiryMonth;
	}
}
