package ims.vi.common.service.client;

import ims.vi.common.service.client.enums.RestServerResponseCode;

import java.math.BigDecimal;
import java.util.Date;
import java.util.List;

public class GetPlanDetailResponse extends APIResponse {
	private List<CampaignPlanDetail> campaignPlanDetail;

	public GetPlanDetailResponse(RestServerResponseCode responseCode,
			String callerReferenceNo, String serverReferenceNo,
			long elapsedTime, List<CampaignPlanDetail> campaignPlanDetail) {
		super(responseCode, callerReferenceNo, serverReferenceNo, elapsedTime);
		this.campaignPlanDetail = campaignPlanDetail;
	}

	public GetPlanDetailResponse() {
		// TODO Auto-generated constructor stub
	}

	public List<CampaignPlanDetail> getCampaignPlanDetail() {
		return campaignPlanDetail;
	}

	public void setCampaignPlanDetail(List<CampaignPlanDetail> campaignPlanDetail) {
		this.campaignPlanDetail = campaignPlanDetail;
	}

	@Override
	public String toString() {
		String log = String.format("%s", super.toString());
		if(campaignPlanDetail != null){
			for (CampaignPlanDetail info : campaignPlanDetail){
				if(info!=null){
					log += String.format(", %s\n", info.toString());
				}
			}
		}
		return log;
	}
	
}
