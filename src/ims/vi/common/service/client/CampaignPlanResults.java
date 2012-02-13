package ims.vi.common.service.client;

import ims.vi.common.service.client.enums.RestServerResponseCode;

public class CampaignPlanResults {
	private String campaignCode;
	private String planCode;
	private RestServerResponseCode responseCode;
	public CampaignPlanResults() {
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
	public RestServerResponseCode getResponseCode() {
		return responseCode;
	}
	public void setResponseCode(RestServerResponseCode responseCode) {
		this.responseCode = responseCode;
	}
	@Override
	public String toString() {
		return "CampaignPlanResults [campaignCode=" + campaignCode
				+ ", planCode=" + planCode + ", responseCode=" + responseCode
				+ "]";
	}
}

