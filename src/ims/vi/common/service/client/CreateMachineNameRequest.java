package ims.vi.common.service.client;

public class CreateMachineNameRequest extends APIRequest{
	private String hash;
	private String machineName;
	private String subPlanId;

	public CreateMachineNameRequest(){
	}
	
	public CreateMachineNameRequest(String callerID, String callerReferenceNo, String version, String hash, String machineName, String subPlanId){
		super(callerID, callerReferenceNo, version);
		this.hash = hash;
		this.machineName = machineName;
		this.subPlanId = subPlanId;
	}
	
	public String getHash() {
		return hash;
	}

	public void setHash(String hash) {
		this.hash = hash;
	}
	
	public String getMachineName() {
		return machineName;
	}

	public void setMachineName(String machineName) {
		this.machineName = machineName;
	}
	
	public String getSubPlanId() {
		return subPlanId;
	}

	public void setSubPlanId(String subPlanId) {
		this.subPlanId = subPlanId;
	}

	
	@Override
	public String toString(){
		return String.format("%s, Hash: %s, MachineName: %s, subPlanId: %s", super.toString(),
							getHash(), getMachineName(), getSubPlanId());
	}
	
	public String toString(String serviceName){
		return String.format("%1$s\n" +
							 "[%2$s-in: %3$s] Hash: %4$s\n" +
							 "[%2$s-in: %3$s] MachineName: %5$s\n" +
							 "[%2$s-in: %3$s] SubPlanId: %6$s\n"
							 , super.toString(serviceName), serviceName, getCallerReferenceNo(),
							 getHash(), getMachineName(), getSubPlanId()
							);
	}
	
	@Override
	public Class getResponseClass() {
		return CreateMachineNameResponse.class;
	}

}
