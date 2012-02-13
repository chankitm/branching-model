package ims.vi.common.service.client;

public class CampaignPlanInfo {
    private String campaignName;
    private String planCode;
	public CampaignPlanInfo() {
	}
	public CampaignPlanInfo(String campaignName, String planCode) {
		this.campaignName = campaignName;
		this.planCode = planCode;
	}
	public String getCampaignName() {
		return campaignName;
	}
	public void setCampaignName(String campaignName) {
		this.campaignName = campaignName;
	}
	public String getPlanCode() {
		return planCode;
	}
	public void setPlanCode(String planCode) {
		this.planCode = planCode;
	}
	@Override
	public String toString() {
		return "CampaignPlanInfo [campaignName=" + campaignName + ", planCode="
				+ planCode + "]";
	}
}
