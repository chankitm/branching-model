package ims.vi.common.service.client;

public abstract class APIRequest {
	private String callerID;
	private String callerReferenceNo;
	private String version;
	
	public APIRequest(){
	}
	
	public APIRequest(String callerID, String callerReferenceNo, String version) {
		this.version = version;
		this.callerReferenceNo = callerReferenceNo;
		this.callerID = callerID;
	}

	public String getCallerID() {
		return callerID;
	}

	public void setCallerID(String callerID) {
		this.callerID = callerID;
	}

	public String getCallerReferenceNo() {
		return callerReferenceNo;
	}

	public void setCallerReferenceNo(String callerReferenceNo) {
		this.callerReferenceNo = callerReferenceNo;
	}

	public String getVersion() {
		return version;
	}

	public void setVersion(String version) {
		this.version = version;
	}
	
	@Override
	public String toString(){
		return String.format("CallerID: %s, CallerReferenceNo: %s, Version: %s",getCallerID(),getCallerReferenceNo(),getVersion());
	}
	
	public String toString(String serviceName){
		return String.format("[%1$s-in: %2$s] CallerID: %3$s\n" +
							 "[%1$s-in: %2$s] CallerReferenceNo: %2$s\n" +
							 "[%1$s-in: %2$s] Version: %4$s",
							 serviceName, getCallerReferenceNo(), getCallerID(), getVersion());
	}
	
	public abstract Class getResponseClass();
}
