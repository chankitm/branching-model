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

@XmlType(name="MovieCheckoutMessage")
@XmlRootElement(name="MovieCheckoutMessage")
@XmlSeeAlso(value={CheckoutInfo.class})
public class MovieCheckoutMessage extends BaseMessage implements Serializable {
	private static final long serialVersionUID = 1L;
	public static final String SERVERTYPE = ServerType.MOVIEHOUSE.getType();
	
	private List<CheckoutInfo> entity;
	private MovieHouseResponseCode responseCode;
	
	public MovieCheckoutMessage() {
		this.responseCode = MovieHouseResponseCode.SUCCESS;
	}
	
	public MovieCheckoutMessage(String refId) {
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