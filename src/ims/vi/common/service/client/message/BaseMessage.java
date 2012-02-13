package ims.vi.common.service.client.message;

import java.io.Serializable;

public class BaseMessage implements Serializable {
	private static final long serialVersionUID = 1L;
	
	private String refId;
	private long elapsedTime;
	
	public BaseMessage() {}
	
	public BaseMessage(String refId) {
		this.refId = refId;
	}
	
	public void setRefId(String refId) {
		this.refId = refId;
	}
	
	public String getRefId() {
		return refId;
	}
	
	public void setElapsedTime(long startTime, long endTime) {
		this.elapsedTime = endTime - startTime;
	}
	
	public void setElapsedTime(long elapsedTime) {
		this.elapsedTime = elapsedTime;
	}
	
	public long getElapsedTime() {
		return elapsedTime;
	}
}