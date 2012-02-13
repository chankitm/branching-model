package ims.vi.common.service.client;

public class UpdateProfileClientRequest extends APIRequest{
	private String hash;
	private String subPlanId;

	public UpdateProfileClientRequest(){
	}
	
	public UpdateProfileClientRequest(String callerID, String callerReferenceNo, String version, String hash, String subPlanId){
		super(callerID, callerReferenceNo, version);
		this.hash = hash;
		this.subPlanId = subPlanId;
	}
	
	public String getHash() {
		return hash;
	}

	public void setHash(String hash) {
		this.hash = hash;
	}
	
	public String getSubPlanId() {
		return subPlanId;
	}

	public void setSubPlanId(String subPlanId) {
		this.subPlanId = subPlanId;
	}

	
	@Override
	public String toString(){
		return String.format("%s, Hash: %s, subPlanId: %s", super.toString(),
							getHash(), getSubPlanId());
	}
	
	public String toString(String serviceName){
		return String.format("%1$s\n" +
							 "[%2$s-in: %3$s] Hash: %4$s\n" +
							 "[%2$s-in: %3$s] SubPlanId: %5$s\n"
							 , super.toString(serviceName), serviceName, getCallerReferenceNo(),
							 getHash(), getSubPlanId()
							);
	}
	
	@Override
	public Class getResponseClass() {
		return UpdateProfileClientResponse.class;
	}

}
