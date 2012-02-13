package ims.vi.common.service.client;

import java.io.Serializable;

public class SubmitInfo implements Serializable {
	private static final long serialVersionUID = 1L;
	
	public static final int ACTION_NONE = 0;
	public static final int ACTION_REGISTER = 1;
	public static final int ACTION_CHANGE = 2;
	public static final int ACTION_REMOVE = 3;
	public static final int ACTION_UNKNOWN = 4;
	
//	private String fsa;
	private String mobileID;
	private String eyeID;
	private String webID;
	private int mobileAction;
	private int eyeAction;
	private int webAction;
	private String contactNumber;
	
	public SubmitInfo() {
//		fsa = "";
		mobileID = "";
		eyeID = "";
		webID = "";
		mobileAction = ACTION_NONE;
		eyeAction = ACTION_NONE;
		webAction = ACTION_NONE;
		contactNumber = "";
	}

	public String getContactNumber() {
		return contactNumber;
	}

	public void setContactNumber(String contactNumber) {
		this.contactNumber = contactNumber;
	}

	public int getEyeAction() {
		return eyeAction;
	}

	public void setEyeAction(int eyeAction) {
		this.eyeAction = eyeAction;
	}

	public String getEyeID() {
		return eyeID;
	}

	public void setEyeID(String eyeID) {
		this.eyeID = eyeID;
	}

//	public String getFsa() {
//		return fsa;
//	}
//
//	public void setFsa(String fsa) {
//		this.fsa = fsa;
//	}

	public int getMobileAction() {
		return mobileAction;
	}

	public void setMobileAction(int mobileAction) {
		this.mobileAction = mobileAction;
	}

	public String getMobileID() {
		return mobileID;
	}

	public void setMobileID(String mobileID) {
		this.mobileID = mobileID;
	}

	public int getWebAction() {
		return webAction;
	}

	public void setWebAction(int webAction) {
		this.webAction = webAction;
	}

	public String getWebID() {
		return webID;
	}

	public void setWebID(String webID) {
		this.webID = webID;
	}
	
}