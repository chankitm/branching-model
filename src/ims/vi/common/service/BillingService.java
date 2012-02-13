package ims.vi.common.service;

import ims.vi.common.service.client.AccountSummary;
import ims.vi.common.service.client.BillingDetailOnDemand;
import ims.vi.common.service.client.BillingDetailOnDemandWithCashPoint;
import ims.vi.common.service.client.BillingDetailOther;
import ims.vi.common.service.client.BillingDetailChannel;
import ims.vi.common.service.client.StandardReturnMessage;
import ims.vi.common.service.client.UniqueKey;

import java.util.Date;
import java.util.List;
/**
 * This EJB service provides billing related information to other parties. Billing information includes a summary record and other billing detail categories.
 * Billing categories -
 * Channel and Other subscription: Billing record for channel plans, VOD plans and service plans (e.g. RTSQ, now Game...)
 * On Demand: Billing record for per-paid VOD, mainly AVOD
 * Other service: Other now TV related service charge
 * 
 * @author Ben CP Chan ben.cp.chan@pccw.com
 * 
 */
public interface BillingService {
	/**
	 * Get the billing information for a key
	 * 
	 * @param key
	 *            Unique key, includes FSA, BSN or STBINFO
	 * @param language
	 *            Language, includes "en_us", "zh_tw" or "auto"
	 * @return an account summary
	 * message response code: ResponseCode.INVALID_INPUT, ResponseCode.INVALID_LANGUAGE,
	 * ResponseCode.BILLING_DETAIL_NOT_FOUND, ResponseCode.OK, ResponseCode.INTERNAL_ERROR
	 */
	StandardReturnMessage<AccountSummary> getBillingInformation(final UniqueKey key,
			final String language);
	/**
	 * Get the billing detail of other service for a key
	 * @param key
	 *            Unique key, includes FSA, BSN or STBINFO
	 * @param language
	 *            Language, includes "en_us", "zh_tw" or "auto"
	 * @param billDate
	 *            Bill date returned from the getBillingInformtion function, null means current bill date 
	 * @return a list of billing detail of other service
	 * message response code: ResponseCode.INVALID_INPUT, ResponseCode.INVALID_LANGUAGE,
	 * ResponseCode.OK, ResponseCode.INTERNAL_ERROR
	 */
	StandardReturnMessage<List<BillingDetailOther>> getBillingDetailOfOtherService(
			final UniqueKey key, final String language, final Date billDate);
	/**
	 * Get the billing detail of on demand service for a key
	 * @param key
	 *            Unique key, includes FSA, BSN or STBINFO
	 * @param language
	 *            Language, includes "en_us", "zh_tw" or "auto"
	 * @param billDate
	 *            Bill date returned from the getBillingInformtion function, null means current bill date 
	 * @return a list of billing detail of on demand service
	 * message response code: ResponseCode.INVALID_INPUT, ResponseCode.INVALID_LANGUAGE,
	 * ResponseCode.OK, ResponseCode.INTERNAL_ERROR
	 */
	StandardReturnMessage<List<BillingDetailOnDemand>> getBillingDetailOfOnDemand(
			final UniqueKey key, final String language, final Date billDate);
	
	/**
	 * Get the billing detail of on demand service for a key
	 * @param key
	 *            Unique key, includes FSA, BSN or STBINFO
	 * @param language
	 *            Language, includes "en_us", "zh_tw" or "auto"
	 * @param billDate
	 *            Bill date returned from the getBillingInformtion function, null means current bill date 
	 * @return a list of billing detail of on demand service
	 * message response code: ResponseCode.INVALID_INPUT, ResponseCode.INVALID_LANGUAGE,
	 * ResponseCode.OK, ResponseCode.INTERNAL_ERROR
	 */
	StandardReturnMessage<List<BillingDetailOnDemandWithCashPoint>> getBillingDetailOfOnDemandWithCashPoint(
			final UniqueKey key, final String language, final Date billDate);
	/**
	 * Get the billing detail of channels and other subscription for a key
	 * @param key
	 *            Unique key, includes FSA, BSN or STBINFO
	 * @param language
	 *            Language, includes "en_us", "zh_tw" or "auto"
	 * @param billDate
	 *            Bill date returned from the getBillingInformtion function, null means current bill date
	 * @return a list of billing detail of on channel
	 * message response code:ResponseCode.INVALID_INPUT, ResponseCode.INVALID_LANGUAGE,
	 * ResponseCode.OK, ResponseCode.INTERNAL_ERROR
	 */	
	StandardReturnMessage<List<BillingDetailChannel>> getBillingDetailOfChannelAndOtherSubscription(
			final UniqueKey key, final String language, final Date billDate);
}