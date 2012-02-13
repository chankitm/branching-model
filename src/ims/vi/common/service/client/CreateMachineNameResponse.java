package ims.vi.common.service.client;

import java.util.Date;

import ims.vi.common.service.client.enums.RestServerResponseCode;
import ims.vi.common.service.client.enums.ServerType;

public class CreateMachineNameResponse extends APIResponse{
	public static final String SERVERTYPE = ServerType.MOVIEHOUSE.getType();
	
	private int remainingChangeQuota;
	private Date quotaDate;
	
	public CreateMachineNameResponse(){

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
	
	public CreateMachineNameResponse(RestServerResponseCode responseCode, String callerReferenceNo, String serverReferenceNo, long elapsedTime, Date quotaDate, int remainingChangeQuota){
		super(responseCode, callerReferenceNo, serverReferenceNo, elapsedTime);
		this.quotaDate = quotaDate;
		this.remainingChangeQuota = remainingChangeQuota;
	}
	
	@Override
	public String toString(){
		return super.toString();
	}
	
	public String toString(String serviceName){
		return super.toString(serviceName);
	}
}
