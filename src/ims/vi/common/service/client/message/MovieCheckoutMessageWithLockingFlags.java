package ims.vi.common.service.client.message;

import ims.vi.common.service.client.CheckoutInfo;
import ims.vi.common.service.client.enums.MovieHouseResponseCode;
import ims.vi.common.service.client.enums.ServerType;
import ims.vi.common.service.client.message.BaseMessage;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;

@XmlType(name="MovieCheckoutMessageWithLockingFlags")
@XmlRootElement(name="MovieCheckoutMessageWithLockingFlags")
@XmlSeeAlso(value={CheckoutInfo.class})
public class MovieCheckoutMessageWithLockingFlags extends BaseMessage implements Serializable {
	private static final long serialVersionUID = 1L;
	public static final String SERVERTYPE = ServerType.MOVIEHOUSE.getType();
	
	private List<CheckoutInfo> entity;
	private MovieHouseResponseCode responseCode;
	private Boolean isLock;
	private Boolean isRestricted;
	private Boolean isAdult;
	
	public MovieCheckoutMessageWithLockingFlags() {
		this.responseCode = MovieHouseResponseCode.SUCCESS;
	}
	
	public MovieCheckoutMessageWithLockingFlags(String refId) {
		super(refId);
		responseCode = MovieHouseResponseCode.SUCCESS;
	}
	
	public void setEntity(List<CheckoutInfo> entity) {
		this.entity = entity;
	}
	
	public void addEntity(CheckoutInfo item) {
		if (entity == null) {
			entity = new ArrayList<CheckoutInfo>();
		}
		entity.add(item);
	}
	
	public List<CheckoutInfo> getEntity() {
		return this.entity;
	}
	
	public void setResponseCode(MovieHouseResponseCode responseCode) {
		this.responseCode = responseCode;
	}
	
	public MovieHouseResponseCode getResponseCode() {
		return responseCode;
	}
	
	public Boolean getIsLock() {
		return isLock;
	}

	public void setIsLock(Boolean isLock) {
		this.isLock = isLock;
	}

	public Boolean getIsRestricted() {
		return isRestricted;
	}

	public void setIsRestricted(Boolean isRestricted) {
		this.isRestricted = isRestricted;
	}

	public Boolean getIsAdult() {
		return isAdult;
	}

	public void setIsAdult(Boolean isAdult) {
		this.isAdult = isAdult;
	}

	public String toString() {
		String rtnString = "[MovieCheckoutMessage: ";
		if (entity != null) {
			int count = 1;
			for (CheckoutInfo item : entity) {
				rtnString += "(Item " + (count++) + "- rtsp: " + item.getRtspLink() +
					", txnId: " + item.getTxnId() + ", bitRate: " + item.getBitRate() +
					", licenseKey: " + item.getLicenseKey() + ", functionKeyAvailable: " + item.isFunctionKeyAvailable() + ") "; 
			}
		}
		rtnString += " responseCode: " + responseCode.name() + "]";
		return rtnString;
	}
}