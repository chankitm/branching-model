package ims.vi.common.service.client;

import java.util.Date;

public class ChannelPlanInfo {
    private String channelId;
    private String chiChannelName;
    private String engChannelName;
    private String chiPlanName;
    private String engPlanName;
    private Date renewDate;
    private String chuStatusName;
    private String engStatusName;
	public ChannelPlanInfo(String channelId, String chiChannelName,
			String engChannelName, String chiPlanName, String engPlanName,
			Date renewDate, String chuStatusName, String engStatusName) {
		this.channelId = channelId;
		this.chiChannelName = chiChannelName;
		this.engChannelName = engChannelName;
		this.chiPlanName = chiPlanName;
		this.engPlanName = engPlanName;
		this.renewDate = renewDate;
		this.chuStatusName = chuStatusName;
		this.engStatusName = engStatusName;
	}
	public String getChannelId() {
		return channelId;
	}
	public void setChannelId(String channelId) {
		this.channelId = channelId;
	}
	public String getChiChannelName() {
		return chiChannelName;
	}
	public void setChiChannelName(String chiChannelName) {
		this.chiChannelName = chiChannelName;
	}
	public String getEngChannelName() {
		return engChannelName;
	}
	public void setEngChannelName(String engChannelName) {
		this.engChannelName = engChannelName;
	}
	public String getChiPlanName() {
		return chiPlanName;
	}
	public void setChiPlanName(String chiPlanName) {
		this.chiPlanName = chiPlanName;
	}
	public String getEngPlanName() {
		return engPlanName;
	}
	public void setEngPlanName(String engPlanName) {
		this.engPlanName = engPlanName;
	}
	public Date getRenewDate() {
		return renewDate;
	}
	public void setRenewDate(Date renewDate) {
		this.renewDate = renewDate;
	}
	public String getChuStatusName() {
		return chuStatusName;
	}
	public void setChuStatusName(String chuStatusName) {
		this.chuStatusName = chuStatusName;
	}
	public String getEngStatusName() {
		return engStatusName;
	}
	public void setEngStatusName(String engStatusName) {
		this.engStatusName = engStatusName;
	}
	@Override
	public String toString() {
		return "ChannelPlanInfo [channelId=" + channelId + ", chiChannelName="
				+ chiChannelName + ", engChannelName=" + engChannelName
				+ ", chiPlanName=" + chiPlanName + ", engPlanName="
				+ engPlanName + ", renewDate=" + renewDate + ", chuStatusName="
				+ chuStatusName + ", engStatusName=" + engStatusName + "]";
	}
    
    
    
}
