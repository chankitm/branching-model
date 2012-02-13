package ims.vi.common.service.client;

import java.util.Date;

import ims.vi.common.service.client.enums.RestServerResponseCode;
import ims.vi.common.service.client.enums.ServerType;

public class CheckRepeatMachineNameResponse extends APIResponse{
	public static final String SERVERTYPE = ServerType.MOVIEHOUSE.getType();
	
	private boolean isRepeat;
	
	public CheckRepeatMachineNameResponse(){

	}

	public CheckRepeatMachineNameResponse(RestServerResponseCode responseCode, String callerReferenceNo, String serverReferenceNo, long elapsedTime, boolean isRepeat){
		super(responseCode, callerReferenceNo, serverReferenceNo, elapsedTime);
		this.isRepeat = isRepeat;
	}
	
	public boolean getIsRepeat() {
		return isRepeat;
	}

	public void setIsRepeat(boolean isRepeat) {
		this.isRepeat = isRepeat;
	}
	
	@Override
	public String toString(){
		return String.format("%s, isRepeat: %s", super.toString(), getIsRepeat());
	}
	
	public String toString(String serviceName){
		return String.format("%1$s\n" +
				 			 "[%2$s-out: %3$s, %4$s] isRepeat: %5$s\n"
							 ,super.toString(serviceName), serviceName, getServerReferenceNo(), getCallerReferenceNo(),
							  getIsRepeat());
	}
}
