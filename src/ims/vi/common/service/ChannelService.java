package ims.vi.common.service;

import java.util.List;

import ims.vi.common.service.client.ChannelRenewal;
import ims.vi.common.service.client.StandardReturnMessage;
import ims.vi.common.service.client.UniqueKey;
/**
 * This EJB service provides channel related information to other parties, mainly retrieving channel list according to different selecting criteria.
 * @author Ben CP Chan ben.cp.chan@pccw.com
 * 
 */
public interface ChannelService {

	/**
  	 * Get a list of channels excluding channels for DMX, TVB and ADULT
	 * @param lang
	 *            Language, includes "en_us", "zh_tw" or "auto"
	 * @return a list of channels but not DMX, TVB and ADULT
	 * message response code: ResponseCode.INVALID_LANGUAGE, ResponseCode.OK,
	 * ResponseCode.INTERNAL_ERROR
	 */
	StandardReturnMessage<List<ims.vi.common.service.client.Channel>> getChannelList(final String lang);
	
	/**
	 * Get a list of channels for DMX, TVB and ADULT only
	 * @param lang
	 *            Language, includes "en_us", "zh_tw" or "auto"
	 * @return a list of channel for DMX, TVB and ADULT only
	 * message response code: ResponseCode.INVALID_LANGUAGE, ResponseCode.OK,
	 * ResponseCode.INTERNAL_ERROR
	 */
	StandardReturnMessage<List<ims.vi.common.service.client.Channel>> getGroupChannelList(final String lang);

	/**
	 * Get a list of channels filtering by customer sub-category
	 * @param subCustCat
	 *            Customer sub-category, e.g. RES,RESLAM,BUS... e.t.c, null for all customer sub-categories
	 * @param lang
	 *            Language, includes "en_us", "zh_tw" or "auto"
	 * @return a list of channels
	 * message response code: ResponseCode.INVALID_LANGUAG, ResponseCode.INVALID_INPUT,
	 * ResponseCode.SUB_CUST_CAT_NOT_EXISTS, ResponseCode.OK, ResponseCode.INTERNAL_ERROR
	 */
	StandardReturnMessage<List<ims.vi.common.service.client.Channel>> getChannelListBySubCustCat(final String lang,final String subCustCat);
	
	/**
	 * Get a list of channels for DMX, TVB and ADULT filtering by customer sub-category
	 * @param subCustCat
	 *            Customer sub-category, e.g. RES,RESLAM,BUS... e.t.c, null for all customer sub-categories
	 * @param lang
	 *            Language, includes "en_us", "zh_tw" or "auto"
	 * @return a list of channels
	 * message response code: ResponseCode.INVALID_LANGUAG, ResponseCode.INVALID_INPUT,
	 * ResponseCode.SUB_CUST_CAT_NOT_EXISTS, ResponseCode.OK, ResponseCode.INTERNAL_ERROR
	 */
	StandardReturnMessage<List<ims.vi.common.service.client.Channel>> getGroupChannelListBySubCustCat(final String lang,final String subCustCat);
	
	/**
	 * Get a list of channels filtering by genre
	 * @param genre
	 *            Genre in "G01" to "G09", null for all genres
	 * @param lang
	 *            Language, includes "en_us", "zh_tw" or "auto"
	 * @return a list of channel
	 * message response code: ResponseCode.INVALID_LANGUAGE, ResponseCode.INVALID_INPUT,
	 * ResponseCode.GENRE_NOT_EXISTS, ResponseCode.OK, ResponseCode.INTERNAL_ERROR
	 */
	StandardReturnMessage<List<ims.vi.common.service.client.Channel>> getChannelListByGenre(final String lang,final String genreCode);

	/**
	 * Get the channel renewal information
	 * @param key
	 *            Unique key, includes FSA, BSN or STBINFO
	 * @param language
	 *            Language, includes "en_us", "zh_tw" or "auto"
	 * @return a list of renewal
	 * message response code: ResponseCode.INVALID_INPUT, ResponseCode.INVALID_LANGUAGE,
	 * ResponseCode.OK, ResponseCode.INTERNAL_ERROR
	 */
	StandardReturnMessage<List<ChannelRenewal>> getChannelRenewal(final UniqueKey key,final String language);
	
	
	StandardReturnMessage<List<String>> getNPVRLibraryIDByChannel(Integer channelID);
}