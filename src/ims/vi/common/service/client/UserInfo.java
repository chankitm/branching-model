package ims.vi.common.service.client;

import java.io.Serializable;

public class UserInfo implements Serializable {
	private static final long serialVersionUID = 1L;
	
	public static final int STATUS_NONE = 0;
	public static final int STATUS_NEW = 1;
	public static final int STATUS_PROCESSING = 2;
	public static final int STATUS_CANCELLED = 3;
	public static final int STATUS_REJECTED = 4;
	public static final int STATUS_COMPLETED = 5;
	public static final int STATUS_DEACTIVATIONINPROGRESS = 6;
	public static final int STATUS_UNKNOWN = 7;
	

	public String fsa;
	
	private String workingMobile;
	private String workingEye;
	private String workingWeb;
	private String registeringMobile;
	private String registeringEye;
	private String registeringWeb;
	private int mobileStatus;
	private int eyeStatus;
	private int webStatus;
	private String mobileRejectMessage;
	private String eyeRejectMessage;
	private String webRejectMessage;
	private String contactNumber;
	
	
	public UserInfo() {
		fsa = "";
		workingMobile = "";
		workingEye = "";
		workingWeb = "";
		registeringMobile = "";
		registeringEye = "";
		registeringWeb = "";
		mobileStatus = STATUS_NONE;
		eyeStatus = STATUS_NONE;
		webStatus = STATUS_NONE;
		contactNumber = "";
	}

	public String getContactNumber() {
		return contactNumber;
	}


	public void setContactNumber(String contactNumber) {
		this.contactNumber = contactNumber;
	}


	public String getEyeRejectMessage() {
		return eyeRejectMessage;
	}


	public void setEyeRejectMessage(String eyeRejectMessage) {
		this.eyeRejectMessage = eyeRejectMessage;
	}


	public int getEyeStatus() {
		return eyeStatus;
	}


	public void setEyeStatus(int eyeStatus) {
		this.eyeStatus = eyeStatus;
	}


	public String getFsa() {
		return fsa;
	}


	public void setFsa(String fsa) {
		this.fsa = fsa;
	}


	public String getMobileRejectMessage() {
		return mobileRejectMessage;
	}


	public void setMobileRejectMessage(String mobileRejectMessage) {
		this.mobileRejectMessage = mobileRejectMessage;
	}


	public int getMobileStatus() {
		return mobileStatus;
	}


	public void setMobileStatus(int mobileStatus) {
		this.mobileStatus = mobileStatus;
	}


	public String getRegisteringEye() {
		return registeringEye;
	}


	public void setRegisteringEye(String registeringEye) {
		this.registeringEye = registeringEye;
	}


	public String getRegisteringMobile() {
		return registeringMobile;
	}


	public void setRegisteringMobile(String registeringMobile) {
		this.registeringMobile = registeringMobile;
	}


	public String getRegisteringWeb() {
		return registeringWeb;
	}


	public void setRegisteringWeb(String registeringWeb) {
		this.registeringWeb = registeringWeb;
	}


	public String getWebRejectMessage() {
		return webRejectMessage;
	}


	public void setWebRejectMessage(String webRejectMessage) {
		this.webRejectMessage = webRejectMessage;
	}


	public int getWebStatus() {
		return webStatus;
	}


	public void setWebStatus(int webStatus) {
		this.webStatus = webStatus;
	}


	public String getWorkingEye() {
		return workingEye;
	}


	public void setWorkingEye(String workingEye) {
		this.workingEye = workingEye;
	}


	public String getWorkingMobile() {
		return workingMobile;
	}


	public void setWorkingMobile(String workingMobile) {
		this.workingMobile = workingMobile;
	}


	public String getWorkingWeb() {
		return workingWeb;
	}


	public void setWorkingWeb(String workingWeb) {
		this.workingWeb = workingWeb;
	}
	
	
	
	
}