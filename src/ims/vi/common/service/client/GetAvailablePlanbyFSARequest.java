package ims.vi.common.service.client;

import java.util.List;

public class GetAvailablePlanbyFSARequest extends APIRequest {

	private String fsa;
	private List<CampaignPlanInfo> campaignPlanInfo;
	
	public GetAvailablePlanbyFSARequest() {
		super();
	}

	public GetAvailablePlanbyFSARequest(String callerID,
			String callerReferenceNo, String version, String fsa,
			List<CampaignPlanInfo> campaignPlanInfo) {
		super(callerID, callerReferenceNo, version);
		this.fsa = fsa;
		this.campaignPlanInfo = campaignPlanInfo;
	}
	
	public String getFsa() {
		return fsa;
	}
	public void setFsa(String fsa) {
		this.fsa = fsa;
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
		log += String.format(", fsa: %s",fsa);
		if(campaignPlanInfo != null){
			for (CampaignPlanInfo info : campaignPlanInfo){
				if(info!=null){
					log += String.format(", campaignPlanInfo: %s\n",(info.toString()));
				}
			}
		}
		return log;
	}

	@Override
	public Class getResponseClass() {
		// TODO Auto-generated method stub
		return GetAvailablePlanbyFSAResponse.class;
	}
}
