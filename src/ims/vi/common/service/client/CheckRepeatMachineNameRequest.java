package ims.vi.common.service.client;

public class CheckRepeatMachineNameRequest extends APIRequest{
	private String fsa;
	private String machineName;

	public CheckRepeatMachineNameRequest(){
	}
	
	public CheckRepeatMachineNameRequest(String callerID, String callerReferenceNo, String version, String fsa, String machineName){
		super(callerID, callerReferenceNo, version);
		this.fsa = fsa;
		this.machineName = machineName;
	}
	
	public String getFsa() {
		return fsa;
	}

	public void setFsa(String fsa) {
		this.fsa = fsa;
	}
	
	public String getMachineName() {
		return machineName;
	}

	public void setMachineName(String machineName) {
		this.machineName = machineName;
	}
	
	@Override
	public String toString(){
		return String.format("%s, fsa: %s, MachineName: %s", super.toString(),
							getFsa(), getMachineName());
	}
	
	public String toString(String serviceName){
		return String.format("%1$s\n" +
							 "[%2$s-in: %3$s] fsa: %4$s\n" +
							 "[%2$s-in: %3$s] MachineName: %5$s\n"
							 , super.toString(serviceName), serviceName, getCallerReferenceNo(),
							 getFsa(), getMachineName()
							);
	}
	
	@Override
	public Class getResponseClass() {
		return CheckRepeatMachineNameResponse.class;
	}

}
