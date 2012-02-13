package ims.vi.common.service.client;

import java.util.Date;
import java.util.List;

public class CampaignPlanDetail {
    private String campaignCode;
    private String campaignName;
    private List<ChannelIdName> channelIdName;
    private float discountPrice;
    private Date endTime;
    private Date startTime;
    private String planCode;
    private float price;
    private int SubscriptionStatusCode;
	public CampaignPlanDetail() {
		super();
	}
	
	public CampaignPlanDetail(String campaignCode, String campaignName,
			List<ChannelIdName> channelIdName, float discountPrice, Date endTime,
			Date startTime, String planCode, float price,
			int subscriptionStatusCode) {
		super();
		this.campaignCode = campaignCode;
		this.campaignName = campaignName;
		this.channelIdName = channelIdName;
		this.discountPrice = discountPrice;
		this.endTime = endTime;
		this.startTime = startTime;
		this.planCode = planCode;
		this.price = price;
		SubscriptionStatusCode = subscriptionStatusCode;
	}

	public String getCampaignCode() {
		return campaignCode;
	}
	public void setCampaignCode(String campaignCode) {
		this.campaignCode = campaignCode;
	}
	public String getCampaignName() {
		return campaignName;
	}
	public void setCampaignName(String campaignName) {
		this.campaignName = campaignName;
	}
	public List<ChannelIdName> getChannelIdName() {
		return channelIdName;
	}
	public void setChannelIdName(List<ChannelIdName> channelIdName) {
		this.channelIdName = channelIdName;
	}
	public float getDiscountPrice() {
		return discountPrice;
	}
	public void setDiscountPrice(float discountPrice) {
		this.discountPrice = discountPrice;
	}
	public Date getEndTime() {
		return endTime;
	}
	public void setEndTime(Date endTime) {
		this.endTime = endTime;
	}
	public Date getStartTime() {
		return startTime;
	}
	public void setStartTime(Date startTime) {
		this.startTime = startTime;
	}
	public String getPlanCode() {
		return planCode;
	}
	public void setPlanCode(String planCode) {
		this.planCode = planCode;
	}
	public float getPrice() {
		return price;
	}
	public void setPrice(float price) {
		this.price = price;
	}
	public int getSubscriptionStatusCode() {
		return SubscriptionStatusCode;
	}
	public void setSubscriptionStatusCode(int subscriptionStatusCode) {
		SubscriptionStatusCode = subscriptionStatusCode;
	}

	@Override
	public String toString() {
		String log = "CampaignPlanDetail [campaignCode=" + campaignCode
		+ ", campaignName=" + campaignName + ", discountPrice="
		+ discountPrice + ", endTime=" + endTime + ", startTime="
		+ startTime + ", planCode=" + planCode + ", price=" + price
		+ ", SubscriptionStatusCode=" + SubscriptionStatusCode + "]";
		
		if(channelIdName != null){
			for (ChannelIdName info : channelIdName){
				if(info!=null){
					log += String.format(", %s",
							(info.toString()));
				}
			}
		}
		return log;
	}
    
}
