package ims.vi.common.service.client;

import ims.vi.common.service.client.enums.RestServerResponseCode;
import ims.vi.common.service.client.enums.ServerType;

import java.util.Date;

public class GetCashPointBalanceResponse extends APIResponse{
	private String cashPointBalance;
	private Date expiryDate;
	public static final String SERVERTYPE = ServerType.CPBALANCE.getType(); 
	
	public GetCashPointBalanceResponse(){
		
	}
	
	public GetCashPointBalanceResponse(RestServerResponseCode responseCode, String callerReferenceNo, String serverReferenceNo, long elapsedTime, String cashPointBalance, Date expiryDate){
		super(responseCode, callerReferenceNo, serverReferenceNo, elapsedTime);
		this.cashPointBalance = cashPointBalance;
		this.expiryDate = expiryDate;
	}
	
	public String getCashPointBalance() {
		return cashPointBalance;
	}

	public void setCashPointBalance(String cashPointBalance) {
		this.cashPointBalance = cashPointBalance;
	}

	public Date getExpiryDate() {
		return expiryDate;
	}

	public void setExpiryDate(Date expiryDate) {
		this.expiryDate = expiryDate;
	}
	
	@Override
	public String toString(){
		return String.format("%s, CashPointBalance: %s, ExpiryDate: %s", super.toString(), getCashPointBalance(), getExpiryDate());
	}
	
	public String toString(String serviceName){
		return String.format("%1$s\n" +
							 "[%2$s-out: %3$s, %4$s] CashPointBalance: %5$s\n" +
							 "[%2$s-out: %3$s, %4$s] ExpiryDate: %6$s\n"
							 , super.toString(serviceName), serviceName, getServerReferenceNo(), getCallerReferenceNo(), getCashPointBalance(), getExpiryDate());
	}
}
