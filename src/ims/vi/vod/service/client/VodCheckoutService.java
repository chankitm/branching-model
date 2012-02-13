package ims.vi.vod.service.client;

import ims.vi.vodcommon.service.client.message.CheckoutMessage;
import ims.vi.vodcommon.service.client.message.ProductPriceMessage;
import ims.vi.vodcommon.service.client.message.SuccessFailMessage;

public interface VodCheckoutService {
	public SuccessFailMessage isViewableProduct(
			String refId,
			String deviceId,
			String deviceSid,
			String productId,
			String libraryId,
			String scheduleId,
			String deviceType);
	
	public CheckoutMessage getVodUrl(
		String deviceId,
		String deviceSid,
		String deviceIp,
		String productId,
		String libraryId,
		String scheduleId,
		Boolean isLockVerified,
		String productType,
		String deviceType,
		String dailNumber);
	
	public ProductPriceMessage getProductDiscountPrice(
		String deviceId,
		String deviceSid,
		String productId,
		String scheduleId);
	
	public SuccessFailMessage freeBandwidth(
		String deviceId,
		String deviceSid,
		String deviceIp,
		Long bitRate);
}