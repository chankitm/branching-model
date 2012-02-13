package ims.vi.common.service.client;

import java.io.Serializable;

public class MspSubmitResult implements Serializable {
	private static final long serialVersionUID = 1L;
	
	private String fsa;
	private String regId;
	private String wkgRegId;
	private String regDate;
	private String regTypeSrv;
	private String requestActv;
	private String contactNum;
	private String regNo;
	private String status;
	private String statusDate;
	private String rejMessage;
	private int rtnCd;
	private String rtnMessage;
	private String rejMsgEngDisplay;
	private String rejMsgChiDisplay;
	private String rejMsgDisplay;
	
	public MspSubmitResult() {}
	
	public String getFsa() {
		return fsa;
	}
	
	public void setFsa(String fsa) {
		this.fsa = fsa;
	}
	
	public String getRegId() {
		return regId;
	}
	
	public void setRegId(String regId) {
		this.regId = regId;
	}
	
	public String getWkgRegId() {
		return wkgRegId;
	}
	
	public void setWkgRegId(String wkgRegId) {
		this.wkgRegId = wkgRegId;
	}
	
	public String getRegDate() {
		return regDate;
	}
	
	public void setRegDate(String regDate) {
		this.regDate = regDate;
	}
	
	public String getRegTypeSrv() {
		return regTypeSrv;
	}
	
	public void setRegTypeSrv(String regTypeSrv) {
		this.regTypeSrv = regTypeSrv;
	}
	
	public String getRequestActv() {
		return requestActv;
	}
	
	public void setRequestActv(String requestActv) {
		this.requestActv = requestActv;
	}
	
	public String getContactNum() {
		return contactNum;
	}
	
	public void setContactNum(String contactNum) {
		this.contactNum = contactNum;
	}
	
	public String getRegNo() {
		return regNo;
	}
	
	public void setRegNo(String regNo) {
		this.regNo = regNo;
	}
	
	public String getStatus() {
		return status;
	}
	
	public void setStatus(String status) {
		this.status = status;
	}
	
	public String getStatusDate() {
		return statusDate;
	}
	
	public void setStatusDate(String statusDate) {
		this.statusDate = statusDate;
	}
	
	public String getRejMessage() {
		return rejMessage;
	}
	
	public void setRejMessage(String rejMessage) {
		this.rejMessage = rejMessage;
	}
	
	public int getRtnCd() {
		return rtnCd;
	}
	
	public void setRtnCd(int rtnCd) {
		this.rtnCd = rtnCd;
	}
	
	public String getRtnMessage() {
		return rtnMessage;
	}
	
	public void setRtnMessage(String rtnMessage) {
		this.rtnMessage = rtnMessage;
	}
	
	public String getRejMsgEngDisplay() {
		return rejMsgEngDisplay;
	}
	
	public void setRejMsgEngDisplay(String rejMsgEngDisplay) {
		this.rejMsgEngDisplay = rejMsgEngDisplay;
	}
	
	public String getRejMsgChiDisplay() {
		return rejMsgChiDisplay;
	}
	
	public void setRejMsgChiDisplay(String rejMsgChiDisplay) {
		this.rejMsgChiDisplay = rejMsgChiDisplay;
	}
	
	public String getRejMsgDisplay() {
		return rejMsgDisplay;
	}
	
	public void setRejMsgDisplay(String rejMsgDisplay) {
		this.rejMsgDisplay = rejMsgDisplay;
	}
}