package ims.vi.common.service.client;

import java.util.Date;

import ims.vi.common.service.client.enums.RestServerResponseCode;
import ims.vi.common.service.client.enums.ServerType;

public class UpdateProfileClientResponse extends APIResponse{
	public static final String SERVERTYPE = ServerType.MOVIEHOUSE.getType();
	
	private int remainingChangeQuota;
	private Date quotaDate;
	
	public UpdateProfileClientResponse(){

	}
	
	public UpdateProfileClientResponse(RestServerResponseCode responseCode, String callerReferenceNo, String serverReferenceNo, long elapsedTime, int remainingChangeQuota, Date quotaDate){
		super(responseCode, callerReferenceNo, serverReferenceNo, elapsedTime);
		this.remainingChangeQuota = remainingChangeQuota;
		this.quotaDate = quotaDate;
	}
	
	public int getRemainingChangeQuota() {
		return remainingChangeQuota;
	}

	public void setRemainingChangeQuota(int remainingChangeQuota) {
		this.remainingChangeQuota = remainingChangeQuota;
	}

	public Date getQuotaDate() {
		return quotaDate;
	}

	public void setQuotaDate(Date quotaDate) {
		this.quotaDate = quotaDate;
	}
	
	public UpdateProfileClientResponse(RestServerResponseCode responseCode, String callerReferenceNo, String serverReferenceNo, long elapsedTime){
		super(responseCode, callerReferenceNo, serverReferenceNo, elapsedTime);
	}
	
	
	@Override
	public String toString(){
		return String.format("%s, RemainingChangeQuota: %s, QuotaDate: %s", super.toString(), getRemainingChangeQuota(), getQuotaDate());
	}
	
	public String toString(String serviceName){
		return String.format("%1$s\n" +
							 "[%2$s-out: %3$s, %4$s] RemainingChangeQuota: %5$s\n" +
							 "[%2$s-out: %3$s, %4$s] QuotaDate: %6$s\n"
							 , super.toString(serviceName), serviceName, getServerReferenceNo(), getCallerReferenceNo(), getRemainingChangeQuota(), getQuotaDate());
	}
}
