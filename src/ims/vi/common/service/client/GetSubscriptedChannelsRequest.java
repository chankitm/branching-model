package ims.vi.common.service.client;

public class GetSubscriptedChannelsRequest extends APIRequest  {
	private String fsa;

	public GetSubscriptedChannelsRequest(String callerID, String callerReferenceNo,
			String version, String fsa) {
		super(callerID, callerReferenceNo, version);
		this.fsa = fsa;
	}

	public GetSubscriptedChannelsRequest() {
		// TODO Auto-generated constructor stub
	}

	public String getFsa() {
		return fsa;
	}

	public void setFsa(String fsa) {
		this.fsa = fsa;
	}

	@Override
	public String toString() {
		String log = String.format("%s", super.toString());
		log += String.format(", fsa: %s",fsa);
		return log;
	}

	@Override
	public Class getResponseClass() {
		// TODO Auto-generated method stub
		return GetSubscriptedChannelsResponse.class;
	}
	
}
