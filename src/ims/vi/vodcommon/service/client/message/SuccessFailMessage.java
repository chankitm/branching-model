package ims.vi.vodcommon.service.client.message;

import ims.vi.vodcommon.service.client.enums.ResponseCode;

import java.io.Serializable;

import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

@XmlType(name="SuccessFailMessage")
@XmlRootElement(name="SuccessFailMessage")
public class SuccessFailMessage implements Serializable {
	private static final long serialVersionUID = 1L;
	
	private boolean successValue;
	private ResponseCode responseCode;
	
	public void setSuccess(boolean successValue) {
		this.successValue = successValue;
	}
	
	public boolean isSuccess() {
		return successValue;
	}
	
	public Boolean getEntityData() {
		return new Boolean(successValue);
	}
	
	public void setResponseCode(ResponseCode responseCode) {
		this.responseCode = responseCode;
	}
	
	public ResponseCode getResponseCode() {
		return responseCode;
	}
}