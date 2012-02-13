package ims.vi.common.service.client;

import ims.vi.common.service.client.enums.ResponseCode;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class MspClientCheckResult implements Serializable {
	private static final long serialVersionUID = 1L;
	
	private List<ResponseCode> mobileResponseCode;
	private List<ResponseCode> eyeResponseCode;
	private List<ResponseCode> netvigatorResponseCode;
	private List<ResponseCode> contactNumResponseCode;
	private List<ResponseCode> otherResponseCode;
	
	public MspClientCheckResult() {}
	
	public List<ResponseCode> getMobileResponseCode() {
		return mobileResponseCode;
	}
	
	public void setMobileResponseCode(List<ResponseCode> mobileResponseCode) {
		this.mobileResponseCode = mobileResponseCode;
	}
	
	public List<ResponseCode> getEyeResponseCode() {
		return eyeResponseCode;
	}
	
	public void setEyeResponseCode(List<ResponseCode> eyeResponseCode) {
		this.eyeResponseCode = eyeResponseCode;
	}
	
	public List<ResponseCode> getNetvigatorResponseCode() {
		return netvigatorResponseCode;
	}
	
	public void setNetvigatorResponseCode(List<ResponseCode> netvigatorResponseCode) {
		this.netvigatorResponseCode = netvigatorResponseCode;
	}
	
	public List<ResponseCode> getContactNumResponseCode() {
		return contactNumResponseCode;
	}
	
	public void setContactNumResponseCode(List<ResponseCode> contactNumResponseCode) {
		this.contactNumResponseCode = contactNumResponseCode;
	}
	
	public List<ResponseCode> getOtherResponseCode() {
		return otherResponseCode;
	}
	
	public void setOtherResponseCode(List<ResponseCode> otherResponseCode) {
		this.otherResponseCode = otherResponseCode;
	}
	
	public void addMobileResponseCode(ResponseCode responseCode) {
		if (mobileResponseCode == null) {
			mobileResponseCode = new ArrayList<ResponseCode>();
		}
		
		mobileResponseCode.add(responseCode);
	}
	
	public void addEyeResponseCode(ResponseCode responseCode) {
		if (eyeResponseCode == null) {
			eyeResponseCode = new ArrayList<ResponseCode>();
		}
		
		eyeResponseCode.add(responseCode);
	}
	
	public void addNetvigatorResponseCode(ResponseCode responseCode) {
		if (netvigatorResponseCode == null) {
			netvigatorResponseCode = new ArrayList<ResponseCode>();
		}
		
		netvigatorResponseCode.add(responseCode);
	}
	
	public void addContactNumResponseCode(ResponseCode responseCode) {
		if (contactNumResponseCode == null) {
			contactNumResponseCode = new ArrayList<ResponseCode>();
		}
		
		contactNumResponseCode.add(responseCode);
	}
	
	public void addOtherResponseCode(ResponseCode responseCode) {
		if (otherResponseCode == null) {
			otherResponseCode = new ArrayList<ResponseCode>();
		}
		
		otherResponseCode.add(responseCode);
	}
	
	public boolean isClientCheckFail() {
		if (mobileResponseCode != null ||
			eyeResponseCode != null ||
			netvigatorResponseCode != null ||
			contactNumResponseCode != null ||
			otherResponseCode != null) {
			return true;
		}
		
		return false;
	}
}