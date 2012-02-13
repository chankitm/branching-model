package ims.vi.common.service.client;

import ims.vi.common.service.client.enums.RestServerResponseCode;

public class BuyPlanbyFSAResponse extends APIResponse {
	private String SubscriptionStatusCode;
	public BuyPlanbyFSAResponse() {
		super();
	}
	public BuyPlanbyFSAResponse(RestServerResponseCode responseCode,
			String callerReferenceNo, String serverReferenceNo,
			long elapsedTime, String subscriptionStatusCode,
			String chiErrorMessage, String engErrorMessage) {
		super(responseCode, callerReferenceNo, serverReferenceNo, elapsedTime);
		SubscriptionStatusCode = subscriptionStatusCode;
	}
	public String getSubscriptionStatusCode() {
		return SubscriptionStatusCode;
	}
	public void setSubscriptionStatusCode(String subscriptionStatusCode) {
		SubscriptionStatusCode = subscriptionStatusCode;
	}
	@Override
	public String toString() {
		return "BuyPlanbyFSAResponse [SubscriptionStatusCode="
				+ SubscriptionStatusCode + ", getResponseCode()="
				+ getResponseCode() + ", getCallerReferenceNo()="
				+ getCallerReferenceNo() + ", getServerReferenceNo()="
				+ getServerReferenceNo() + ", getElapsedTime()="
				+ getElapsedTime() + ", toString()=" + super.toString()
				+ ", getClass()=" + getClass() + ", hashCode()=" + hashCode()
				+ "]";
	}
}
