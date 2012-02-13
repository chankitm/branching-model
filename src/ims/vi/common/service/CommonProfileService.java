package ims.vi.common.service;

import ims.vi.common.bean.Profile;
import ims.vi.common.service.client.ProfileVodStatistic;
import ims.vi.common.service.client.StandardReturnMessage;
import ims.vi.common.service.client.UniqueKey;

import java.util.List;
/**
 * This EJB service provides profile related service, getting profile by FSA/BSN/STBINFO.
 * @author Ben CP Chan ben.cp.chan@pccw.com
 *
 */
public interface CommonProfileService {
	/**
	 * Create a new profile
	 * @param profile
	 *            Profile object to be created
	 * @return boolean
	 *            True means success 
	 * message response code: ResponseCode.OK, ResponseCode.INTERNAL_ERROR
	 * ResponseCode.INVALID_INPUT
	 * 
	 */
	StandardReturnMessage<Boolean> createProfile(
			final Profile profile);	
	/**
	 * Search for a customer profile object by using a fsa
	 * @param fsa
	 *            FSA of the profile
	 * @return profile
	 *            Profile object, null means no this profile
	 * message response code: ResponseCode.OK, ResponseCode.INTERNAL_ERROR
	 * ResponseCode.INVALID_INPUT
	 */
	StandardReturnMessage<Profile> getProfileByFSA(
			final String fsa);
	/**
	 * Search for a customer profile object by using a bsn
	 * @param bsn
	 *            BSN of the profile
	 * @return profile 
	 *            Profile object, null means no this profile
	 * message response code: ResponseCode.OK, ResponseCode.INTERNAL_ERROR
	 * ResponseCode.INVALID_INPUT
	 */
	StandardReturnMessage<Profile> getProfileByBSN(
			final String bsn);
	
	/**
	 * Search for a customer profile object by using set top box
	 * information
	 * @param stbid
	 *            STB ID of the STB
	 * @param stbsid
	 *            STB Session ID of the STB
	 * @return profile
	 *            Profile object, null means no this profile
	 * message response code: ResponseCode.OK, ResponseCode.INTERNAL_ERROR, 
	 * ResponseCode.INVALID_INPUT 
	 */
	StandardReturnMessage<Profile> getProfileByStbInfo(
			final String stbid, 
			final String stbsid);
	
	/**
	 * Search all STBIDs of a profile
	 * @param key
	 *            Unique Key, includes FSA, BSN or STBINFO
	 * @return List<String>
	 *            List of STBIDs
	 * message response code: ResponseCode.OK, ResponseCode.ACCOUNT_NOT_FOUND, ResponseCode.INTERNAL_ERROR
	 */
	StandardReturnMessage<List<String>> getAllocatedStbId(
			final UniqueKey key);
	
	/**
	 * Search VOD Statistics related port information
	 * @param key
	 *            Unique Key, includes FSA, BSN or STBINFO
	 * @return List<ProfileVodStatistc>
	 *            Information for VOD statistic purpose
	 * message response code: ResponseCode.OK, ResponseCode.ACCOUNT_NOT_FOUND, ResponseCode.INTERNAL_ERROR
	 */
	StandardReturnMessage<List<ProfileVodStatistic>> getProfileVodStatisticRecord(
			final UniqueKey key);
	
	/**
	 * Check the profile is able to get adult content or not
	 * @param key
	 *            Unique Key, includes FSA, BSN or STBINFO
	 * @return Boolean
	 *            True means it can receive adult content and vice versa
	 * message response code: ResponseCode.OK, ResponseCode.ACCOUNT_NOT_FOUND, ResponseCode.INTERNAL_ERROR
	 */
	StandardReturnMessage<Boolean> isAdultAdmissionAllowed(
			final UniqueKey key);
	
	/**
	 * Check the profile is still valid or not
	 * @param key
	 *            Unique Key, includes FSA, BSN or STBINFO
	 * @return boolean
	 *            True means it is a valid profile, false means the profile is missing or status is inactive
	 * please check the response code.
	 * message response code: ResponseCode.ACCOUNT_NOT_FOUND, ResponseCode.INTERNAL_ERROR
	 * ResponseCode.INVALID_INPUT
	 * 
	 */
	StandardReturnMessage<Boolean> isValidProfile(
			final UniqueKey key);
	
	StandardReturnMessage<Boolean> updateProfile(
			final Profile profile);
	
	StandardReturnMessage<Boolean> setAdultContentReceivable(
			final Profile profile,
			final String modifiedBy,
			final boolean receiveAdultContent);
}