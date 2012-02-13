package ims.vi.common.service.client.message;

import ims.vi.common.service.client.MovieHousePrice;
import ims.vi.common.service.client.enums.MovieHouseResponseCode;
import ims.vi.common.service.client.enums.ServerType;
import ims.vi.common.service.client.message.BaseMessage;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;

@XmlType(name="MovieHousePriceMessage")
@XmlRootElement(name="MovieHousePriceMessage")
@XmlSeeAlso(value={MovieHousePrice.class})
public class MovieHousePriceMessage extends BaseMessage implements Serializable {
	private static final long serialVersionUID = 1L;
	public static final String SERVERTYPE = ServerType.MOVIEHOUSE.getType();
	
	private List<MovieHousePrice> entity;
	private MovieHouseResponseCode responseCode;
	
	public MovieHousePriceMessage() {
		this.responseCode = MovieHouseResponseCode.SUCCESS;
	}
	
	public MovieHousePriceMessage(String refId) {
		super(refId);
		this.responseCode = MovieHouseResponseCode.SUCCESS;
	}
	
	public void setEntity(List<MovieHousePrice> entity) {
		this.entity = entity;
	}
	
	public void addEntity(MovieHousePrice item) {
		if (entity == null) {
			entity = new ArrayList<MovieHousePrice>();
		}
		entity.add(item);
	}
	
	public List<MovieHousePrice> getEntity() {
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
			for (MovieHousePrice item : entity) {
				rtnString += "(Item " + (count++) + "- serviceType: " + item.getServiceType() + ", price: " + item.getPrice() + ") ";
			}
		}
		rtnString += " responseCode: " + responseCode.name() + "]";
		return rtnString;
	}
}