package ims.vi.common.service;

import ims.vi.common.service.client.StockQuota;
import ims.vi.common.service.client.StandardReturnMessage;
import ims.vi.common.service.client.UniqueKey;

import java.util.ArrayList;
/**
 * This EJB service provides stock quote related service
 * @author Ben CP Chan ben.cp.chan@pccw.com
 *
 */
public interface StockQuoteService {
	/**
	 * Get the stock quota for a key
	 * @param key
	 * @param language 
	 * @return stock quota list (only if expire date is after current date and amount is larger or equal to 0) 
	 * message response code: ResponseCode.OK, ResponseCode.SERVICE_NOT_SUBSCRIBED,
	 * ResponseCode.SYSTEM_BUSY, ResponseCode.INVALID_LANGUAGE
	 */
	StandardReturnMessage<ArrayList<StockQuota>> getStockQuota(final UniqueKey key,final String language);
	/**
	 * Check has unlimited quoate for a key
	 * @param key
	 * @return 
	 * message response code: ResponseCode.OK, ResponseCode.INTERNAL_ERROR
	 */
	StandardReturnMessage<Boolean> isUnlimitQuota(final UniqueKey key);
}
