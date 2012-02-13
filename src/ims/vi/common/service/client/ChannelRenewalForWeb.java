package ims.vi.common.service.client;

import java.io.Serializable;
import java.util.Date;

public class ChannelRenewalForWeb implements Serializable{
	private static final long serialVersionUID = 1L;

	//public static enum Status{Seasonal,Free,InProgress,Suspended,TemporarilyUnavailable};
	public static enum Status{Seasonal,Free,InProgress,Suspended,TemporarilyUnavailable};
	
	private String channelId;
	private String engChannelName;
	private String chiChannelName;
	private String engPlanName;
	private String chiPlanName;
	private Date renewalDate;
	private Status status;
	public String getChannelId() {
		return channelId;
	}
	public void setChannelId(String channelId) {
		this.channelId = channelId;
	}
	public String getEngChannelName() {
		return engChannelName;
	}
	public void setEngChannelName(String engChannelName) {
		this.engChannelName = engChannelName;
	}
	public String getChiChannelName() {
		return chiChannelName;
	}
	public void setChiChannelName(String chiChannelName) {
		this.chiChannelName = chiChannelName;
	}
	public String getEngPlanName() {
		return engPlanName;
	}
	public void setEngPlanName(String engPlanName) {
		this.engPlanName = engPlanName;
	}
	public String getChiPlanName() {
		return chiPlanName;
	}
	public void setChiPlanName(String chiPlanName) {
		this.chiPlanName = chiPlanName;
	}
	public Date getRenewalDate() {
		return renewalDate;
	}
	public void setRenewalDate(Date renewalDate) {
		this.renewalDate = renewalDate;
	}
	public Status getStatus() {
		return status;
	}
	public void setStatus(Status status) {
		this.status = status;
	}
}
