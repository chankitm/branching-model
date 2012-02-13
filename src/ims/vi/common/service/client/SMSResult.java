package ims.vi.common.service.client;

public class SMSResult {

	private String result;
	private String requestID;
	private String errorCode;
	private String errorDesc;
	private String status;
	private String isSunday;
	private String opID;
	private String sundayRNo;
	private String oftaRNo;

	public SMSResult() {}

	/**
	 * @param resultString: Return result string from SMS Gateway.
	 */
	public SMSResult(String resultString) {
		String[] results = resultString.split("\n");
		for(int i=0; i<results.length; i++) {
			if(results[i] != null && results[i].indexOf("=") != -1) {
				String[] r = results[i].split("=");
				if (r[0].equals("result")) {
					setResult(r[1]);
				} else if (r[0].equals("requestID")) {
					setRequestID(r[1]);
				} else if (r[0].equals("error_code")) {
					setErrorCode(r[1]);
				} else if (r[0].equals("error_desc")) {
					setErrorDesc(r[1]);
				} else if (r[0].equals("status")) {
					setStatus(r[1]);
				} else if (r[0].equals("is_sunday")) {
					setIsSunday(r[1]);
				} else if (r[0].equals("op_id")) {
					setOpID(r[1]);
				} else if (r[0].equals("sunday_rno")) {
					setSundayRNo(r[1]);
				} else if (r[0].equals("ofta_rno")) {
					setOftaRNo(r[1]);
				}
			}
		}
	}

	/**
	 * @return the errorCode
	 */
	public String getErrorCode() {
		return errorCode;
	}
	/**
	 * @param errorCode the errorCode to set
	 */
	public void setErrorCode(String errorCode) {
		this.errorCode = errorCode;
	}
	/**
	 * @return the errorDesc
	 */
	public String getErrorDesc() {
		return errorDesc;
	}
	/**
	 * @param errorDesc the errorDesc to set
	 */
	public void setErrorDesc(String errorDesc) {
		this.errorDesc = errorDesc;
	}
	/**
	 * @return the requestID
	 */
	public String getRequestID() {
		return requestID;
	}
	/**
	 * @param requestID the requestID to set
	 */
	public void setRequestID(String requestID) {
		this.requestID = requestID;
	}
	/**
	 * @return the result
	 */
	public String getResult() {
		return result;
	}
	/**
	 * @param result the result to set
	 */
	public void setResult(String result) {
		this.result = result;
	}
	/**
	 * @return the status
	 */
	public String getStatus() {
		return status;
	}
	/**
	 * @param status the status to set
	 */
	public void setStatus(String status) {
		this.status = status;
	}

	/**
	 * @return the isSunday
	 */
	public String getIsSunday() {
		return isSunday;
	}

	/**
	 * @param isSunday the isSunday to set
	 */
	public void setIsSunday(String isSunday) {
		this.isSunday = isSunday;
	}

	/**
	 * @return the oftaRNo
	 */
	public String getOftaRNo() {
		return oftaRNo;
	}

	/**
	 * @param oftaRNo the oftaRNo to set
	 */
	public void setOftaRNo(String oftaRNo) {
		this.oftaRNo = oftaRNo;
	}

	/**
	 * @return the opID
	 */
	public String getOpID() {
		return opID;
	}

	/**
	 * @param opID the opID to set
	 */
	public void setOpID(String opID) {
		this.opID = opID;
	}

	/**
	 * @return the sundayRNo
	 */
	public String getSundayRNo() {
		return sundayRNo;
	}

	/**
	 * @param sundayRNo the sundayRNo to set
	 */
	public void setSundayRNo(String sundayRNo) {
		this.sundayRNo = sundayRNo;
	}
}
