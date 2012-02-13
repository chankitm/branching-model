package ims.vi.common.service;

import java.util.Date;

import ims.vi.common.service.client.ActionResult;
import ims.vi.common.service.client.StandardReturnMessage;
import ims.vi.common.service.client.VodPrice;

public interface VodPlayTimeService {
	public StandardReturnMessage<String> createVodTransaction(
			String fsa,
			String stbId,
			String stbIp,
			String productId,
			String assetId,
			double basicPrice,
			double discountPrice,
			String cpId,
			String vodType,
			String system);
	
	public StandardReturnMessage<String> createVodTransaction(
			String fsa,
			String stbId,
			String stbIp,
			String productId,
			String assetId,
			double basicPrice,
			double discountPrice,
			String cpId,
			String vodType,
			Date txnDate,
			String system);
	
	public StandardReturnMessage<String> createVodTransaction(
			String fsa,
			String stbId,
			String stbIp,
			String productId,
			String assetId,
			double basicPrice,
			double discountPrice,
			String cpId,
			String vodType,
			Date txnDate,
			String system,
			String remarks);
	
	public StandardReturnMessage<String> createVodExtTransaction(
			String txnId,
			String clientId,
			String system);
	
	public StandardReturnMessage<ActionResult> createVodStatistic(
			String stbId,
			String stbsId,
			String stbIp,
			String type,
			String code,
			String message);
	
	public StandardReturnMessage<VodPrice> getAVodDiscountPrice(
			String stbId,
			String stbsId,
			double basePrice,
			String serviceType);
	
	public StandardReturnMessage<Boolean> isLibraryAttachedChannelsSubscribed(
			String fsa,
			String libraryId);
	
	public StandardReturnMessage<String> getLibraryServiceTypeSubscribed(
			String fsa,
			String libraryId);
}