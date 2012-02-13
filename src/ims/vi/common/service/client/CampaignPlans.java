package ims.vi.common.service.client;

public class CampaignPlans {
	private String campaignCode;
	private String planCode;
	public CampaignPlans() {
		super();
	}
	public String getCampaignCode() {
		return campaignCode;
	}
	public void setCampaignCode(String campaignCode) {
		this.campaignCode = campaignCode;
	}
	public String getPlanCode() {
		return planCode;
	}
	public void setPlanCode(String planCode) {
		this.planCode = planCode;
	}
	@Override
	public String toString() {
		return "CampaignPlan [campaignCode=" + campaignCode + ", planCode="
				+ planCode + "]";
	}
}

