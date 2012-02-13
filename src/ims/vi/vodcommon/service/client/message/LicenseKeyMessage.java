package ims.vi.vodcommon.service.client.message;

import ims.vi.vodcommon.service.client.enums.ResponseCode;

import java.io.Serializable;

public class LicenseKeyMessage implements Serializable {
	private static final long serialVersionUID = 1L;
	
	private String entity;
	private ResponseCode responseCode;
	
	public void setEntity(String entity) {
		this.entity = entity;
	}
	
	public String getEntity() {
		return entity;
	}
	
	public void setResponseCode(ResponseCode responseCode) {
		this.responseCode = responseCode;
	}
	
	public ResponseCode getResponseCode() {
		return responseCode;
	}
}