package ims.vi.common.service.client;

import ims.vi.common.service.client.enums.RestServerResponseCode;

import java.util.List;

public class SubscribePlanListResponse extends APIResponse {
	private boolean isSuccess;
	private String fsa;
	private String callerID;
	private List<CampaignPlanResults> campaignPlanResults;
	public SubscribePlanListResponse() {
		super();
	}
	
	public SubscribePlanListResponse(RestServerResponseCode responseCode,
			String callerReferenceNo, String serverReferenceNo,
			long elapsedTime, boolean isSuccess, String fsa, String callerID,
			List<CampaignPlanResults> campaignPlanResults) {
		super(responseCode, callerReferenceNo, serverReferenceNo, elapsedTime);
		this.isSuccess = isSuccess;
		this.fsa = fsa;
		this.callerID = callerID;
		this.campaignPlanResults = campaignPlanResults;
	}

	public boolean isSuccess() {
		return isSuccess;
	}
	public void setSuccess(boolean isSuccess) {
		this.isSuccess = isSuccess;
	}
	public String getFsa() {
		return fsa;
	}
	public void setFsa(String fsa) {
		this.fsa = fsa;
	}
	public String getCallerID() {
		return callerID;
	}
	public void setCallerID(String callerID) {
		this.callerID = callerID;
	}
	public List<CampaignPlanResults> getCampaignPlanResults() {
		return campaignPlanResults;
	}
	public void setCampaignPlanResults(List<CampaignPlanResults> campaignPlanResults) {
		this.campaignPlanResults = campaignPlanResults;
	}
	@Override
	public String toString() {
		String log = String.format("%s", super.toString());
		log += ", fsa:%s"+ fsa;
		log += ", isSuccess:%s"+ isSuccess;
		log += ", callerID:%s"+ callerID;
		if(campaignPlanResults != null){
			for (CampaignPlanResults plan : campaignPlanResults){
				if(plan!=null){
					log += String.format(", %s",
							(plan.toString()));
				}
			}
		}
		return log;
	}
}
