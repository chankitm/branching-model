package ims.vi.common.service.client;

import java.util.List;

public class SubscribePlanListRequest extends APIRequest {
	private String fsa;
	private String inputBy;
	private List<CampaignPlans> campaignPlans;
	
	public SubscribePlanListRequest() {
		super();
	}

	public SubscribePlanListRequest(String callerID, String callerReferenceNo,
			String version, String fsa, String inputBy,
			List<CampaignPlans> campaignPlans) {
		super(callerID, callerReferenceNo, version);
		this.fsa = fsa;
		this.inputBy = inputBy;
		this.campaignPlans = campaignPlans;
	}

	public String getFsa() {
		return fsa;
	}

	public void setFsa(String fsa) {
		this.fsa = fsa;
	}

	public String getInputBy() {
		return inputBy;
	}

	public void setInputBy(String inputBy) {
		this.inputBy = inputBy;
	}

	public List<CampaignPlans> getCampaignPlans() {
		return campaignPlans;
	}

	public void setCampaignPlans(List<CampaignPlans> campaignPlans) {
		this.campaignPlans = campaignPlans;
	}
	@Override
	public String toString() {
		String log = String.format("%s", super.toString());
		log += String.format(", fsa:%s", this.fsa);
		log += String.format(", inputBy:%s", this.inputBy);
		if(campaignPlans != null){
			for (CampaignPlans plan : campaignPlans){
				if(plan!=null){
					log += String.format(", %s",
							(plan.toString()));
				}
			}
		}
		return log;
	}
	@Override
	public Class getResponseClass() {
		// TODO Auto-generated method stub
		return SubscribePlanListResponse.class;
	}

}
