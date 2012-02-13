package ims.vi.common.service.client.message;

import ims.vi.common.service.client.MovieHousePriceWithCashPoint;
import ims.vi.common.service.client.enums.MovieHouseResponseCode;
import ims.vi.common.service.client.enums.ServerType;
import ims.vi.common.service.client.message.BaseMessage;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;

@XmlType(name="MovieHousePriceMessageWithCashPoint")
@XmlRootElement(name="MovieHousePriceMessageWithCashPoint")
@XmlSeeAlso(value={MovieHousePriceWithCashPoint.class})
public class MovieHousePriceMessageWithCashPoint extends BaseMessage implements Serializable {
	private static final long serialVersionUID = 1L;
	public static final String SERVERTYPE = ServerType.MOVIEHOUSE.getType();
	
	private List<MovieHousePriceWithCashPoint> entity;
	private MovieHouseResponseCode responseCode;
	
	public MovieHousePriceMessageWithCashPoint() {
		this.responseCode = MovieHouseResponseCode.SUCCESS;
	}
	
	public MovieHousePriceMessageWithCashPoint(String refId) {
		super(refId);
		this.responseCode = MovieHouseResponseCode.SUCCESS;
	}
	
	public void setEntity(List<MovieHousePriceWithCashPoint> entity) {
		this.entity = entity;
	}
	
	public void addEntity(MovieHousePriceWithCashPoint item) {
		if (entity == null) {
			entity = new ArrayList<MovieHousePriceWithCashPoint>();
		}
		entity.add(item);
	}
	
	public List<MovieHousePriceWithCashPoint> getEntity() {
		return this.entity;
	}
	
	public void setResponseCode(MovieHouseResponseCode responseCode) {
		this.responseCode = responseCode;
	}
	
	public MovieHouseResponseCode getResponseCode() {
		return responseCode;
	}
	
	public String toString() {
		String rtnString = "[MovieHousePriceMessage: ";
		if (entity != null) {
			int count = 1;
			for (MovieHousePriceWithCashPoint item : entity) {
				rtnString += "(Item " + (count++) + "- serviceType: " + item.getServiceType() + ", price: " + item.getPrice() + ") ";
			}
		}
		rtnString += " responseCode: " + responseCode.name() + "]";
		return rtnString;
	}
}