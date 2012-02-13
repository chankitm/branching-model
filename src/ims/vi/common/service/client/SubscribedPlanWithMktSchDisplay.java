package ims.vi.common.service.client;

import ims.vi.common.bean.SubscribedPlan;

public class SubscribedPlanWithMktSchDisplay {
	SubscribedPlan subscribedPlan;
	String campaignDisplay;
	
	public SubscribedPlanWithMktSchDisplay(SubscribedPlan subscribedPlan,
			String campaignDisplay) {
		super();
		this.subscribedPlan = subscribedPlan;
		this.campaignDisplay = campaignDisplay;
	}
	public SubscribedPlanWithMktSchDisplay() {
		super();
	}
	
	public SubscribedPlan getSubscribedPlan() {
		return subscribedPlan;
	}
	public void setSubscribedPlan(SubscribedPlan subscribedPlan) {
		this.subscribedPlan = subscribedPlan;
	}
	public String getCampaignDisplay() {
		return campaignDisplay;
	}
	public void setCampaignDisplay(String campaignDisplay) {
		this.campaignDisplay = campaignDisplay;
	}
}
