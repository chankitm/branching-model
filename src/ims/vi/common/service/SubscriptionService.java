package ims.vi.common.service;

import java.util.List;

import ims.vi.common.bean.SubscribedPlan;
import ims.vi.common.exception.DAOException;
import ims.vi.common.persistence.ResultCount;
import ims.vi.common.service.client.ActionResult;
import ims.vi.common.service.client.ChannelAvailablePlans;
import ims.vi.common.service.client.StandardReturnMessage;
import ims.vi.common.service.client.UniqueKey;
import ims.vi.common.service.client.VodCheckLibSubResult;
import ims.vi.common.service.client.VodLibraryServiceType;
import ims.vi.common.service.client.enums.SubscriptionStatus;
/**
 * This EJB service provides subscription related service.
 * @author Ben CP Chan ben.cp.chan@pccw.com
 *
 */
public interface SubscriptionService {
	/**
	 * Get all the available plans that related to a particular channel for subscription
	 * @param key
	 * @param lang
	 * @param channelId the channel ID 
	 * @param platform not used in the current version
	 * @return
	 * message response code: ResponseCode.INVALID_INPUT, ResponseCode.INVALID_LANGUAGE,
	 * ResponseCode.PLAN_ALREADY_SUBSCRIBED, ResponseCode.OK
	 */
	public StandardReturnMessage<ChannelAvailablePlans> getChannelAvailablePlans(final UniqueKey key,final String lang,	final int channelId,final String platform);

	/**
	 * Get a list of subscribed channels for a key
	 * @param key
	 * @param status subscription status  @see classname ims.vi.common.service.client.enums.SubscriptionStatus
	 * @param language
	 * @return
	 * message response code:  ResponseCode.INVALID_INPUT, ResponseCode.INVALID_LANGUAGE
	 * ResponseCode.OK, ResponseCode.INTERNAL_ERROR
	 */
	StandardReturnMessage<List<ims.vi.common.service.client.Channel>> getSubscribedChannelList(final UniqueKey key,final SubscriptionStatus status,final String language);	
	
	/**
	 * Get a list of subscribed channels for a key
	 * @param key
	 * @param language
	 * @return
	 * message response code:  ResponseCode.INVALID_INPUT, ResponseCode.INVALID_LANGUAGE
	 * ResponseCode.OK, ResponseCode.INTERNAL_ERROR
	 */
	StandardReturnMessage<List<ims.vi.common.service.client.Channel>> getSubscribedChannelList(final UniqueKey key,final String language);
	
	/**
	 * Get a list of subscribed channels with all columns for a key
	 * @param key
	 * @param status subscription status  @see classname ims.vi.common.service.client.enums.SubscriptionStatus
	 * @param language
	 * @return
	 * message response code:  ResponseCode.INVALID_INPUT, ResponseCode.INVALID_LANGUAGE
	 * ResponseCode.OK, ResponseCode.INTERNAL_ERROR
	 */
	StandardReturnMessage<List<ims.vi.common.bean.Channel>> getSubscribedChannelListFull(final UniqueKey key, final SubscriptionStatus status, final String language);
	
	/**
	 * Plan subscription
	 * @param planCode the plan code to subscribe
	 * @param fsa
	 * @param campaignName the campaign name of the plan code
	 * @return
	 * message response code: ResponseCode.INVALID_INPUT, ResponseCode.OK,
	 * ResponseCode.INTERNAL_ERROR
	 */
	public StandardReturnMessage<ActionResult> subscribePlan(String planCode,UniqueKey key,String campaignName);
	
	/**
	 * Plan termination
	 * @param planCode
	 * @param key
	 * @param campaignName
	 * @return
	 * message response code: ResponseCode.INVALID_INPUT, ResponseCode.OK,
	 * ResponseCode.INTERNAL_ERROR
	 */
	public StandardReturnMessage<ActionResult> terminatePlan(String planCode,UniqueKey key,String campaignName);

	/**
	 * Get a list of subscribed plans using a unique key and a status name
	 * @param resultCount contains the first result and result count,pass null if
	 * want to return all results.
	 * @param fsa the business key of nowTV application
	 * @param status status of subscribed plan @see classname ims.vi.common.service.client.enums.SubscriptionStatus
	 * @return
	 * @throws DAOException
	 * message response code: ResponseCode.INVALID_INPUT, ResponseCode.OK,
	 * ResponseCode.INTERNAL_ERROR
	 */
	StandardReturnMessage<List<SubscribedPlan>> getSubscribedPlanList(final ResultCount resultCount,final UniqueKey key,final SubscriptionStatus status);	

	/**
	 * Get a list of subscribed plans using a unique key,status name and service indicator
	 * @param resultCount contains the first result and result count,pass null if
	 * want to return all results.
	 * @param key 
	 * @param status status of subscribed plan @see classname ims.vi.common.service.client.enums.SubscriptionStatus
	 * @param serviceIndicator "SQ" for stock, "SA" for stock analytic,"G1" for now games
	 * @return
	 * message response code: ResponseCode.INVALID_INPUT, ResponseCode.OK
	 */
	StandardReturnMessage<List<SubscribedPlan>> getSubscribedPlanListByServiceIndicator(final ResultCount resultCount,final UniqueKey key,final SubscriptionStatus status,final String serviceIndicator);
	
	/**
	 * Check to see if the service is subscribed
	 * @param key
	 * @param serviceIndicator
	 * @return
	 * message response code: ResponseCode.INVALID_INPUT, ResponseCode.OK
	 */
	StandardReturnMessage<Boolean> isSubscribedService(final UniqueKey key,final String serviceIndicator);
	
	/**
	 * Check to see if the plan is subscribed
	 * @param key
	 * @param planCode
	 * @return
	 */
	StandardReturnMessage<Boolean> isSubscribedPlanByCode(final UniqueKey key,final String planCode);
	
	/**
	 * get a list of available plans of a given library id for subscription
	 * @param key
	 * @param libraryID
	 * @param language
	 * @return
	 */
	public StandardReturnMessage<ChannelAvailablePlans> getPlanList(final UniqueKey key, final String libraryID, final String language);
	
	/**
	 * check if the library is subscribed
	 * @param key
	 * @param libId
	 * @return
	 */
	public StandardReturnMessage<VodCheckLibSubResult> isLibrarySubscribed(final UniqueKey key, final String libraryId, final boolean hdFilter);
	
	/**
	 * check if the library is subscribed
	 * @param key
	 * @param libId
	 * @return
	 */
	public StandardReturnMessage<VodCheckLibSubResult> isLibrarySubscribed(final UniqueKey key, final String libraryId);
	
	/**
	 * check if the library is subscribed with HD
	 * @param key
	 * @param libId
	 * @return 
	 */
	public StandardReturnMessage<VodCheckLibSubResult> isLibrarySubscribedwithHD(final UniqueKey key, final String libraryId, final boolean hdFilter);
	
	/**
	 * check if the library is subscribed with HD
	 * @param key
	 * @param libId
	 * @return 
	 */
	public StandardReturnMessage<VodCheckLibSubResult> isLibrarySubscribedwithHD(final UniqueKey key, final String libraryId);
	
	/**
	 * check attached libraries with relationship
	 * @param libId
	 * @return 
	 */
	public StandardReturnMessage<List<VodLibraryServiceType>> getAttachedLibraryAndServiceType(final String libraryId);
}