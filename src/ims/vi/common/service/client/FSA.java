/**
 * This software is the confidential and proprietary information of
 * CASCADE(Confidential Information). You shall no
 * disclose such Confidential Information and shall use it only in
 * Copyright 2008 CASCADE. All Rights Reserved.
 * Accordance with the terms of the license agreement you entered into 
 * With CASCADE
 * Creation Date 2008/12/8
 * 
 */
package ims.vi.common.service.client;

import java.io.Serializable;

import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

import ims.vi.common.bean.Profile;
import ims.vi.common.exception.DAOException;
import ims.vi.common.service.CommonProfileService;
import ims.vi.common.service.client.enums.ResponseCode;
import ims.vi.common.utils.ObjectUtils;
/**
 * Unique Key in Mediator
 * @author Ben CP Chan ben.cp.chan@pccw.com
 *
 */
@XmlType(name = "FSA", namespace = "http://www.pccw.com/")
@XmlRootElement(name = "FSA", namespace = "http://www.pccw.com/")
public class FSA extends UniqueKey implements Serializable{
	private static final long serialVersionUID = 1L;

	String fsa = "";
	
	public FSA(){}
	
	public FSA(final String value){
		this.fsa = value;
	}

	@Override
	public String convertToFSA(CommonProfileService profileService) {
		return this.getFsa();
	}
	
	public Profile getProfileObj(CommonProfileService profileService)
			throws DAOException {
		StandardReturnMessage<Profile> profileMsg = profileService.getProfileByFSA(getFsa());
		if(profileMsg.getResponseCode() != ResponseCode.OK) {
			DAOException.throwException(ResponseCode.ACCOUNT_NOT_FOUND);
		}

		return profileMsg.getPayload();
	}
	
	@Override
	public int hashCode() {
		return ObjectUtils.hashCode(this);
	}

	@Override
	public boolean equals(Object obj) {
		return ObjectUtils.isEqual(this, obj);
	}

	public String getFsa() {
		return fsa;
	}

	public void setFsa(String fsa) {
		this.fsa = fsa;
	}
	
	public String getValue() {
		return this.fsa;
	}
}
