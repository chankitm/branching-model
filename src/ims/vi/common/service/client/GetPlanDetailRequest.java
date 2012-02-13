package ims.vi.common.service.client;

import java.util.List;

public class GetPlanDetailRequest extends APIRequest{

	List<CampaignPlanInfo> campaignPlanInfo;
	
	public GetPlanDetailRequest(String callerID, String callerReferenceNo,
			String version, List<CampaignPlanInfo> campaignPlanInfo) {
		super(callerID, callerReferenceNo, version);
		this.campaignPlanInfo = campaignPlanInfo;
	}

	public List<CampaignPlanInfo> getCampaignPlanInfo() {
		return campaignPlanInfo;
	}

	public void setCampaignPlanInfo(List<CampaignPlanInfo> campaignPlanInfo) {
		this.campaignPlanInfo = campaignPlanInfo;
	}

	@Override
	public String toString() {
		String log = String.format("%s", super.toString());
		if(campaignPlanInfo != null){
			for (CampaignPlanInfo info : campaignPlanInfo){
				if(info!=null){
					log += String.format(", campaignPlanInfo: %s",
							(info.toString()));
				}
			}
		}
		return log;
	}

	@Override
	public Class getResponseClass() {
		// TODO Auto-generated method stub
//		return GetPlanDetailResponse.class;
		if(getVersion().contentEquals("1.0")){
			return GetPlanDetailResponse.class;
		}else if(getVersion().contentEquals("2.0")){
			return GetPlanDetailv2Response.class;
		}else return null;
	}


}
