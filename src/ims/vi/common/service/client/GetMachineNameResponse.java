package ims.vi.common.service.client;

import ims.vi.common.service.client.enums.RestServerResponseCode;
import ims.vi.common.service.client.enums.ServerType;

public class GetMachineNameResponse extends APIResponse{
	private String machineName;
	private String subPlanId;
	
	public static final String SERVERTYPE = ServerType.MOVIEHOUSE.getType();
	
	public GetMachineNameResponse(){

	}
	
	public GetMachineNameResponse(RestServerResponseCode responseCode, String callerReferenceNo, String serverReferenceNo, long elapsedTime, String machineName){
		super(responseCode, callerReferenceNo, serverReferenceNo, elapsedTime);
		this.machineName = machineName;
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
		return String.format("%s, MachineName: %s, SubPlanId: %s", super.toString(), getMachineName(), getSubPlanId());
	}
	
	public String toString(String serviceName){
		return String.format("%1$s\n" +
				 "[%2$s-out: %3$s, %4$s] MachineName: %5$s\n" +
				 "[%2$s-out: %3$s, %4$s] SubPlanId: %6$s\n"
				 , super.toString(serviceName), serviceName, getServerReferenceNo(), getCallerReferenceNo(), getMachineName(), getSubPlanId());
	}
}