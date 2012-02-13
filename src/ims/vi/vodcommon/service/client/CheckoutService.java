package ims.vi.vodcommon.service.client;

import ims.vi.vodcommon.service.client.message.CheckoutMessage;
import ims.vi.vodcommon.service.client.message.SuccessFailMessage;

public interface CheckoutService {
	public CheckoutMessage checkOut(
			String fsa,
			String deviceId,
			String deviceSid,
			String deviceIp,
			String productId,
			String serviceType,
			String cpId,
			Double realPrice,
			Double discountPrice,
			String vodType,
			String cpType,
			String deviceType,
			String dialNumber);
	
	public SuccessFailMessage admitBandwidth(
			String deviceId,
			String deviceSid,
			String deviceIp,
			Long bitRate);
	
	public SuccessFailMessage freeBandwidth(
			String deviceId,
			String deviceSid,
			String deviceIp,
			Long bitRate);
}