package ims.vi.common.service.client;

import ims.vi.common.service.client.enums.RestServerResponseCode;
import ims.vi.common.service.client.enums.ServerType;

import java.util.Date;

import org.jboss.mq.il.uil2.msgs.GetIDMsg;

public class GetCurrentSVODClientResponse extends APIResponse{
	private int remainingQuota;
	private Date quotaDate;
	private boolean isFirstTime;

	public static final String SERVERTYPE = ServerType.MOVIEHOUSE.getType(); 
	
	public GetCurrentSVODClientResponse(){
		
	}
	
	public GetCurrentSVODClientResponse(RestServerResponseCode responseCode, String callerReferenceNo, String serverReferenceNo, long elapsedTime, int remainingQuota, Date quotaDate){
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
	
	public boolean getIsFirstTime() {
		return isFirstTime;
	}

	public void setIsFirstTime(boolean isFirstTime) {
		this.isFirstTime = isFirstTime;
	}
	
	@Override
	public String toString(){
		return String.format("%s, RemainingQuota: %s, QuotaDate: %s, isFirstTime: %s", super.toString(), getRemainingQuota(), getQuotaDate(), getIsFirstTime());
	}
	
	public String toString(String serviceName){
		return String.format("%1$s\n" +
							 "[%2$s-out: %3$s, %4$s] RemainingQuota: %5$s\n" +
							 "[%2$s-out: %3$s, %4$s] QuotaDate: %6$s\n" +
							 "[%2$s-out: %3$s, %4$s] isFirstTime: %7$s\n"
							 , super.toString(serviceName), serviceName, getServerReferenceNo(), getCallerReferenceNo(), getRemainingQuota(), getQuotaDate(), getIsFirstTime());
	}
}
