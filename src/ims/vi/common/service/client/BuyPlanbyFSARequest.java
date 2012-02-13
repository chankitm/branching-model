package ims.vi.common.service.client;

public class BuyPlanbyFSARequest extends APIRequest {
	
	private String fsa;
	private String campaignCode;
	private String planCode;
	
	public BuyPlanbyFSARequest() {
		super();
	}
	public BuyPlanbyFSARequest(String callerID, String callerReferenceNo,
			String version, String fsa, String campaignCode, String planCode) {
		super(callerID, callerReferenceNo, version);
		this.fsa = fsa;
		this.campaignCode = campaignCode;
		this.planCode = planCode;
	}
	public String getFsa() {
		return fsa;
	}
	public void setFsa(String fsa) {
		this.fsa = fsa;
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
		return "BuyPlanbyFSARequest [fsa=" + fsa + ", campaignCode="
				+ campaignCode + ", planCode=" + planCode + ", getCallerID()="
				+ getCallerID() + ", getCallerReferenceNo()="
				+ getCallerReferenceNo() + ", getVersion()=" + getVersion()
				+ ", toString()=" + super.toString() + ", getClass()="
				+ getClass() + ", hashCode()=" + hashCode() + "]";
	}
	@Override
	public Class getResponseClass() {
		// TODO Auto-generated method stub
		return BuyPlanbyFSAResponse.class;
	}

}
