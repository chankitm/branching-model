package ims.vi.common.service.ppv;

import ims.vi.common.service.client.UniqueKey;
import ims.vi.common.service.client.message.EchoMessage;
import ims.vi.common.service.client.message.MovieCheckoutMessage;
import ims.vi.common.service.client.message.MovieCheckoutMessageWithLockingFlags;
import ims.vi.common.service.client.message.MovieHousePlayListMessage;
import ims.vi.common.service.client.message.MovieHousePriceMessage;
import ims.vi.common.service.client.message.MovieHousePriceMessageWithCashPoint;
import ims.vi.common.service.client.message.MovieHouseSdxMessage;

public interface MovieHouseCheckoutService {
	public MovieCheckoutMessage getVodUrl(String refId, UniqueKey key, String deviceId, String deviceSid,
			String deviceIp, String productId, String serviceType, String presentedPrice, Boolean isLockVerified,
			Boolean isPlayOnly, Boolean purchaseOtherFormat, String deviceType);
	public MovieCheckoutMessage getVodUrlWithCashPoint(String refId, UniqueKey key, String deviceId, String deviceSid,
			String deviceIp, String productId, String serviceType, String presentedPrice, Boolean isLockVerified,
			Boolean isPlayOnly, Boolean purchaseOtherFormat, String deviceType, String cashPointBalance, String purchaseType);
	public MovieCheckoutMessageWithLockingFlags getVodUrlWithCashPointAndLockingFlags(String refId, UniqueKey key, String deviceId, String deviceSid,
			String deviceIp, String productId, String serviceType, String purchaseType, String presentedPrice, String cashPointBalance,
			Boolean isPlayOnly, Boolean purchaseOtherFormat, String deviceType, Boolean isLock, Boolean isAdult, Boolean isRestricted);
	public MovieHousePriceMessage getMovieHouseProductPrice(String refId, UniqueKey key, String productId);
	public MovieHousePriceMessageWithCashPoint getMovieHouseProductPriceWithCashPoint(String refId, UniqueKey key, String productId);
	public MovieHousePlayListMessage getMyCurrentPlayList(String refId, UniqueKey key, String language);
	public MovieHousePlayListMessage getMyCurrentPlayListWithAdultFlag(String refId, UniqueKey key, String language, Boolean isAdult);
	public MovieHousePlayListMessage existInMyCurrentPlayList(String refId, UniqueKey key, String productId);
	public MovieHouseSdxMessage freeBandwidth(String refId, String deviceId, String deviceSid, String deviceIp, Long bitRate);
	public EchoMessage echo(String refId, String echoMessage);
}