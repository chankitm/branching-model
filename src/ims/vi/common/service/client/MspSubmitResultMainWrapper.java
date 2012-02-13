package ims.vi.common.service.client;

import ims.vi.common.service.client.MspClientCheckResult;

import java.io.Serializable;
import java.util.List;

public class MspSubmitResultMainWrapper implements Serializable {
	private static final long serialVersionUID = 1L;
	
	private MspClientCheckResult mspClientResult;
	private List<MspSubmitResult> mspSubmitResult;
	
	public MspClientCheckResult getMspClientResult() {
		return mspClientResult;
	}
	
	public void setMspClientResult(MspClientCheckResult mspClientResult) {
		this.mspClientResult = mspClientResult;
	}
	
	public List<MspSubmitResult> getMspSubmitResult() {
		return mspSubmitResult;
	}
	
	public void setMspSubmitResult(List<MspSubmitResult> mspSubmitResult) {
		this.mspSubmitResult = mspSubmitResult;
	}
}