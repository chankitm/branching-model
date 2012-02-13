package ims.vi.common.service.client.message;

import ims.vi.common.service.client.MovieHousePlayItem;
import ims.vi.common.service.client.enums.MovieHouseResponseCode;
import ims.vi.common.service.client.enums.ServerType;
import ims.vi.common.service.client.message.BaseMessage;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;

@XmlType(name="MovieHousePlayListMessage")
@XmlRootElement(name="MovieHousePlayListMessage")
@XmlSeeAlso(value={MovieHousePlayItem.class})
public class MovieHousePlayListMessage extends BaseMessage implements Serializable {
	private static final long serialVersionUID = 1L;
	public static final String SERVERTYPE = ServerType.MOVIEHOUSE.getType();
	
	private List<MovieHousePlayItem> entity;
	private MovieHouseResponseCode responseCode;
	
	public MovieHousePlayListMessage() {
		this.responseCode = MovieHouseResponseCode.SUCCESS;
	}
	
	public MovieHousePlayListMessage(String refId) {
		super(refId);
		responseCode = MovieHouseResponseCode.SUCCESS;
	}
	
	public void setEntity(List<MovieHousePlayItem> entity) {
		this.entity = entity;
	}
	
	public void addEntity(MovieHousePlayItem item) {
		if (entity == null) {
			entity = new ArrayList<MovieHousePlayItem>();
		}
		entity.add(item);
	}
	
	public List<MovieHousePlayItem> getEntity() {
		return this.entity;
	}
	
	public void setResponseCode(MovieHouseResponseCode responseCode) {
		this.responseCode = responseCode;
	}
	
	public MovieHouseResponseCode getResponseCode() {
		return responseCode;
	}
	
	public String toString() {
		String rtnString = "[MovieHousePlayListItem: ";
		if (entity != null) {
			int count = 1;
			for (MovieHousePlayItem item : entity) {
				rtnString += "(Item " + (count++) + "- id: " + item.getId() + ", productId: " + item.getProductId() +
					", title: " + item.getTitle() + ", actors: " + item.getActors() + ", duration: " + item.getDuration() +
					", language: " + item.getLanguage() + ", classification: " + item.getClassification() +
					", serviceType: " + item.getServiceType() + ", isLock: " + item.isLock() + ", isRestricted: " + item.isRestricted() +
					", isAdult: " + item.isAdult() + ", expireTime: " + ((item.getExpireTime()!=null)?String.valueOf(item.getExpireTime().getTime()):"null") + ") "; 
			}
		}
		rtnString += " responseCode: " + responseCode.name() + "]";
		return rtnString;
	}
}