package ims.vi.common.service.client;

import ims.vi.common.service.client.enums.RestServerResponseCode;
import ims.vi.common.service.client.enums.ServerType;

import java.util.Date;

public class DeductQuotaResponse extends APIResponse{
	private int remainingQuota;
	private Date quotaDate;
	public static final String SERVERTYPE = ServerType.MOVIEHOUSE.getType(); 
	
	public DeductQuotaResponse(){
		
	}
	
	public DeductQuotaResponse(RestServerResponseCode responseCode, String callerReferenceNo, String serverReferenceNo, long elapsedTime, int remainingQuota, Date quotaDate){
		super(responseCode, callerReferenceNo, serverReferenceNo, elapsedTime);
		this.remainingQuota = remainingQuota;
		this.quotaDate = quotaDate;
	}
	
	public int getRemainingQuota() {
		return remainingQuota;
	}

	public void setRemainingQuota(int remainingQuota) {
		this.remainingQuota = remainingQuota;
	}

	public Date getQuotaDate() {
		return quotaDate;
	}

	public void setQuotaDate(Date quotaDate) {
		this.quotaDate = quotaDate;
	}
	
	@Override
	public String toString(){
		return String.format("%s, RemainingQuota: %s, QuotaDate: %s", super.toString(), getRemainingQuota(), getQuotaDate());
	}
	
	public String toString(String serviceName){
		return String.format("%1$s\n" +
							 "[%2$s-out: %3$s, %4$s] RemainingQuota: %5$s\n" +
							 "[%2$s-out: %3$s, %4$s] QuotaDate: %6$s\n"
							 , super.toString(serviceName), serviceName, getServerReferenceNo(), getCallerReferenceNo(), getRemainingQuota(), getQuotaDate());
	}
}
