package ims.vi.common.service.client;

import java.io.Serializable;

import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
@XmlType(name = "MobileResult", namespace = "http://www.pccw.com/")
@XmlRootElement(name = "MobileResult", namespace = "http://www.pccw.com/")
public class MobileResult implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1488908131312644650L;
	private String msisdn;
	private String subID;
	private String activateCode;
	public String getMsisdn() {
		return msisdn;
	}
	public void setMsisdn(String msisdn) {
		this.msisdn = msisdn;
	}
	public String getSubID() {
		return subID;
	}
	public void setSubID(String subID) {
		this.subID = subID;
	}
	public String getActivateCode() {
		return activateCode;
	}
	public void setActivateCode(String activateCode) {
		this.activateCode = activateCode;
	}
}
