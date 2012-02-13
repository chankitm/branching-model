package ims.vi.common.service.client;

import ims.vi.common.service.client.enums.RestServerResponseCode;

import java.util.List;

public class GetAvailableChannelPlanByGenreResponse extends APIResponse {
	private String callerID;
	private List<CampaignPlanContent> campaignPlanContent;
	public GetAvailableChannelPlanByGenreResponse() {
		super();
	}
	public GetAvailableChannelPlanByGenreResponse(
			RestServerResponseCode responseCode, String callerReferenceNo,
			String serverReferenceNo, long elapsedTime, String callerID,
			List<CampaignPlanContent> campaignPlanContent) {
		super(responseCode, callerReferenceNo, serverReferenceNo, elapsedTime);
		this.callerID = callerID;
		this.campaignPlanContent = campaignPlanContent;
	}
	public String getCallerID() {
		return callerID;
	}
	public void setCallerID(String callerID) {
		this.callerID = callerID;
	}
	public List<CampaignPlanContent> getCampaignPlanContent() {
		return campaignPlanContent;
	}
	public void setCampaignPlanContent(List<CampaignPlanContent> campaignPlanContent) {
		this.campaignPlanContent = campaignPlanContent;
	}
	@Override
	public String toString() {
		String log = String.format("%s", super.toString());
		if(campaignPlanContent != null){
			for (CampaignPlanContent plan : campaignPlanContent){
				if(plan!=null){
					log += String.format(", %s",
							(plan.toString()));
				}
			}
		}
		return log;
	}
}
