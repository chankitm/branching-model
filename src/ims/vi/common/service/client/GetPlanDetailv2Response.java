package ims.vi.common.service.client;

import ims.vi.common.service.client.enums.RestServerResponseCode;

import java.util.List;

public class GetPlanDetailv2Response extends APIResponse {
	private List<CampaignPlanContent> campaignPlanContent;

	public GetPlanDetailv2Response() {
		super();
	}
	public GetPlanDetailv2Response(RestServerResponseCode responseCode,
			String callerReferenceNo, String serverReferenceNo,
			long elapsedTime, List<CampaignPlanContent> campaignPlanContent) {
		super(responseCode, callerReferenceNo, serverReferenceNo, elapsedTime);
		this.campaignPlanContent = campaignPlanContent;
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
			for (CampaignPlanContent info : campaignPlanContent){
				if(info!=null){
					log += String.format(", %s\n", info.toString());
				}
			}
		}
		return log;
	}
}
