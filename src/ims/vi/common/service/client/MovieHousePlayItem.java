package ims.vi.common.service.client;

import java.io.Serializable;
import java.util.Date;

import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

@XmlType(name="MovieHousePlayItem")
@XmlRootElement(name="MovieHousePlayItem")
public class MovieHousePlayItem implements Serializable {
	private static final long serialVersionUID = 1L;
	
	private String id;
	private String productId;
	private String title;
	private String actors;
	private String duration;
	private String language;
	private String classification;
	private String serviceType;
	private String machineName;
	private boolean isLock;
	private boolean isRestricted;
	private boolean isAdult;
	
	private Date systemTime;
	private Date expireTime;
	
	public MovieHousePlayItem() {}
	
	public MovieHousePlayItem(String id, String productId, String title, String actors,
			String duration, String language, String classification, String serviceType, String machineName,
			boolean isLock, boolean isRestricted, boolean isAdult, Date systemTime,
			Date expireTime) {
		this.id = id;
		this.productId = productId;
		this.title = title;
		this.actors = actors;
		this.duration = duration;
		this.language = language;
		this.serviceType = serviceType;
		this.machineName = machineName;
		this.classification = classification;
		this.isLock = isLock;
		this.isRestricted = isRestricted;
		this.isAdult = isAdult;
		this.systemTime = systemTime;
		this.expireTime = expireTime;
	}
	
	public String getMachineName() {
		return machineName;
	}

	public void setMachineName(String machineName) {
		this.machineName = machineName;
	}

	public String getId() {
		return id;
	}
	
	public void setId(String id) {
		this.id = id;
	}
	
	public String getProductId() {
		return productId;
	}
	
	public void setProductId(String productId) {
		this.productId = productId;
	}
	
	public String getTitle() {
		return title;
	}
	
	public void setTitle(String title) {
		this.title = title;
	}
	
	public String getActors() {
		return actors;
	}
	
	public void setActors(String actors) {
		this.actors = actors;
	}
	
	public String getDuration() {
		return duration;
	}
	
	public void setDuration(String duration) {
		this.duration = duration;
	}
	
	public String getLanguage() {
		return language;
	}
	
	public void setLanguage(String language) {
		this.language = language;
	}
	
	public String getServiceType() {
		return serviceType;
	}
	
	public void setServiceType(String serviceType) {
		this.serviceType = serviceType;
	}
	
	public String getClassification() {
		return classification;
	}
	
	public void setClassification(String classification) {
		this.classification = classification;
	}
	
	public boolean isLock() {
		return isLock;
	}
	
	public void setLock(boolean isLock) {
		this.isLock = isLock;
	}
	
	public boolean isRestricted() {
		return isRestricted;
	}
	
	public void setRestricted(boolean isRestricted) {
		this.isRestricted = isRestricted;
	}
	
	public boolean isAdult() {
		return isAdult;
	}
	
	public void setAdult(boolean isAdult) {
		this.isAdult = isAdult;
	}
	
	public Date getSystemTime() {
		return systemTime;
	}
	
	public void setSystemTime(Date systemTime) {
		this.systemTime = systemTime;
	}
	
	public Date getExpireTime() {
		return expireTime;
	}
	
	public void setExpireTime(Date expireTime) {
		this.expireTime = expireTime;
	}
}