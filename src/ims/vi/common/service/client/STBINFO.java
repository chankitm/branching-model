package ims.vi.common.service.client;

import ims.vi.common.bean.Profile;
import ims.vi.common.exception.DAOException;
import ims.vi.common.service.CommonProfileService;
import ims.vi.common.service.client.enums.ResponseCode;

import java.io.Serializable;

import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

/**
 * Unique Key in Level 1 system
 * @author luke
 *
 */
@XmlType(name = "STBINFO", namespace = "http://www.pccw.com/")
@XmlRootElement(name = "STBINFO", namespace = "http://www.pccw.com/")
public class STBINFO extends UniqueKey implements Serializable {

	private static final long serialVersionUID = 1L;
	
	private String stbid;
	private String stbsid;
	
	public STBINFO(){}
	
	public STBINFO(final String stbid, final String stbsid) {
		this.stbid = stbid;
		this.stbsid = stbsid;
	}
	
	public String getStbid() {
		return stbid;
	}

	public void setStbid(String stbid) {
		this.stbid = stbid;
	}

	public String getStbsid() {
		return stbsid;
	}

	public void setStbsid(String stbsid) {
		this.stbsid = stbsid;
	}

	public Profile getProfileObj(CommonProfileService profileService)
			throws DAOException {
		StandardReturnMessage<Profile> profileMsg = profileService.getProfileByStbInfo(stbid, stbsid);
		if(profileMsg.getResponseCode() != ResponseCode.OK) {
			DAOException.throwException(ResponseCode.ACCOUNT_NOT_FOUND);
		}
		
		return profileMsg.getPayload();
	}

	@Override
	public String convertToFSA(CommonProfileService profileService) throws DAOException {
		Profile profile = getProfileObj(profileService);
		return profile.getFsa();
		//return profileService.getProfileByStbInfo(stbid, stbsid).getPayload().getFsa();
	}
	
	public String getValue() {
		return this.stbid + "_" + this.stbsid;
	}
}
