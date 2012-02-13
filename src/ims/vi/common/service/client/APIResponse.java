package ims.vi.common.service.client;

import ims.vi.common.service.client.enums.RestServerResponseCode;

public class APIResponse {
	private RestServerResponseCode responseCode;
	private String callerReferenceNo;
	private String serverReferenceNo;
	private long elapsedTime;
	
	public APIResponse(){
		
	}

	public APIResponse(RestServerResponseCode responseCode, String callerReferenceNo, String serverReferenceNo, long elapsedTime){
		this.responseCode = responseCode;
		this.callerReferenceNo = callerReferenceNo;
		this.serverReferenceNo = serverReferenceNo;
		this.elapsedTime = elapsedTime;
	}
	
	public RestServerResponseCode getResponseCode() {
		return responseCode;
	}
	public void setResponseCode(RestServerResponseCode responseCode) {
		this.responseCode = responseCode;
	}
	public String getCallerReferenceNo() {
		return callerReferenceNo;
	}
	public void setCallerReferenceNo(String callerReferenceNo) {
		this.callerReferenceNo = callerReferenceNo;
	}
	public String getServerReferenceNo() {
		return serverReferenceNo;
	}
	public void setServerReferenceNo(String serverReferenceNo) {
		this.serverReferenceNo = serverReferenceNo;
	}
	public long getElapsedTime() {
		return elapsedTime;
	}
	public void setElapsedTime(long elapsedTime) {
		this.elapsedTime = elapsedTime;
	}
	
	@Override
	public String toString(){
		return String.format("ResponseCode: %s, CallerReferenceNo: %s, ServerReferenceNo: %s, ElaspedTime: %s"
							, getResponseCode(), getCallerReferenceNo(), getServerReferenceNo(), String.valueOf(getElapsedTime()));
	}
	
	public String toString(String serviceName){
		return String.format("[%1$s-out: %2$s, %3$s] ResponseCode: %4$s\n" +
							 "[%1$s-out: %2$s, %3$s] CallerReferenceNo: %3$s\n" +
							 "[%1$s-out: %2$s, %3$s] ServerReferenceNo: %2$s\n" +
							 "[%1$s-out: %2$s, %3$s] ElaspedTime: %5$s",
							 serviceName, getServerReferenceNo(), getCallerReferenceNo(), getResponseCode(), String.valueOf(getElapsedTime()));
	}
}
