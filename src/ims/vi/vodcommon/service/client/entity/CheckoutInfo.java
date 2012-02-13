package ims.vi.vodcommon.service.client.entity;

import java.io.Serializable;

import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

@XmlType(name="CheckoutInfo")
@XmlRootElement(name="CheckoutInfo")
public class CheckoutInfo implements Serializable {
	private static final long serialVersionUID = 1L;
	
	private String rtspLink;
	private String txnId;
	private long bitRate;
	private String licenseKey;
	private boolean functionKeyAvailable;
	
	public CheckoutInfo() {
		this.rtspLink = "";
		this.txnId = "";
		this.bitRate = 0;
		this.licenseKey = "";
		this.functionKeyAvailable = true;
	}
	
	public CheckoutInfo(String rtspLink, String txnId, long bitRate, String licenseKey, boolean functionKeyAvailable) {
		this.rtspLink = rtspLink;
		this.txnId = txnId;
		this.bitRate = bitRate;
		this.licenseKey = licenseKey;
		this.functionKeyAvailable = functionKeyAvailable;
	}

	public void setRtspLink(String rtspLink) {
		this.rtspLink = rtspLink;
	}

	public String getRtspLink() {
		return rtspLink;
	}
	
	public void setTxnId(String txnId) {
		this.txnId = txnId;
	}
	
	public String getTxnId() {
		return txnId;
	}
	
	public void setBitRate(long bitRate) {
		this.bitRate = bitRate;
	}

	public long getBitRate() {
		return bitRate;
	}
	
	public void setLicenseKey(String licenseKey) {
		this.licenseKey = licenseKey;
	}
	
	public String getLicenseKey() {
		return licenseKey;
	}
	
	public void setFunctionKeyAvailable(boolean functionKeyAvailable) {
		this.functionKeyAvailable = functionKeyAvailable;
	}
	
	public boolean isFunctionKeyAvailable() {
		return functionKeyAvailable;
	}
}