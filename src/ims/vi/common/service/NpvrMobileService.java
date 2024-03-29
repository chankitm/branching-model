package ims.vi.common.service;

import ims.vi.common.service.client.ActionResult;
import ims.vi.common.service.client.MobileResult;
import ims.vi.common.service.client.StandardReturnMessage;
import ims.vi.common.service.client.UniqueKey;

import java.util.List;

public interface NpvrMobileService {
	/**
	 * Register npvr mobile service for a key
	 * 
	 * @param key
	 *            Unique key, includes FSA, BSN or STBINFO
	 * @param mobileNum
	 *            Mobile Number, the valid pccw mobile no.
	 * @param sid
	 * 			  Sid, the subid return from check valid mobile method                       
	 * @param language
	 *            Language, includes "en_us", "zh_tw" or "auto"*            
	 * @param activationCode
	 *            Activation code, the code generated by VIM and sent to user by SMS
	 * @return an action result
	 */
	public StandardReturnMessage<ActionResult> registerMobile(UniqueKey key, String mobileNum, String sid, 
			String activationCode, String language);
	
	/**
	 * Send an SMS to the mobile to be registered and return the sent activation code
	 * 
	 * @param key
	 *            Unique key, includes FSA, BSN or STBINFO
	 * @param mobileNum
	 *            Mobile Number, the valid pccw mobile no.
	 * @param language
	 *            Language, includes "en_us", "zh_tw" or "auto"
	 * @return an mobile result
	 */
	public StandardReturnMessage<MobileResult> getMobileActivationCode (UniqueKey key, String mobileNum, String language);
 
	/**
	 * Get a list of registered mobile numbers for a key
	 * @param key
	 *            Unique key, includes FSA, BSN or STBINFO
	 * @param language
	 *            Language, includes "en_us", "zh_tw" or "auto"
	 * @return a list of registered mobile number
	 */
	public StandardReturnMessage<List<String>> getRegisteredMobile (UniqueKey key, final String language);

	/**
	 * 
	 * @param key
	 *            Unique key, includes FSA, BSN or STBINFO
	 * @param mobileNum
	 *            Mobile Number, the valid pccw mobile no.
	 * @param language
	 *            Language, includes "en_us", "zh_tw" or "auto"
	 * @return
	 */
	public StandardReturnMessage<ActionResult> deleteRegisteredMobile(UniqueKey key, String mobileNum, String language);

	
}