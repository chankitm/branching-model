package ims.vi.common.exception;

import ims.vi.common.service.client.enums.ResponseCode;

import org.apache.commons.lang.exception.ExceptionUtils;

public class DAOException extends Exception {
	private static final long serialVersionUID = 1L;
	
	private ResponseCode responseCode = null;
	private String message = null;
	
	public DAOException(ResponseCode responseCode) {
		this.responseCode = responseCode;
		this.message = responseCode.getErrorMessage();
	}
	
	public DAOException(String message) {
		this.message = message;
	}
	
	public ResponseCode getResponseCode() {
		if (responseCode == null) {
			return ResponseCode.INTERNAL_ERROR;
		}
		return responseCode;
	}

	public void setResponseCode(ResponseCode responseCode) {
		this.responseCode = responseCode;
	}
	
	public String getMessage() {
		if (message == null) {
			return ResponseCode.INTERNAL_ERROR.getErrorMessage();
		}
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}
	
	public static void throwException(Throwable t) throws DAOException {
		throw new DAOException(ExceptionUtils.getRootCauseMessage(t));
	}
	
	public static void throwException(ResponseCode responseCode) throws DAOException {
		throw new DAOException(responseCode);
	}
}