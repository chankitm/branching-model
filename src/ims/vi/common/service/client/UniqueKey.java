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

import ims.vi.common.bean.Profile;
import ims.vi.common.service.CommonProfileService;

import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;
/**
 * Unique Key to represents a user record
 * @author Ben CP Chan ben.cp.chan@pccw.com
 *
 */

@XmlRootElement(name = "UniqueKey", namespace = "http://www.pccw.com/")
@XmlType(name = "UniqueKey", namespace = "http://www.pccw.com/")
@XmlSeeAlso(value={FSA.class,BSN.class,STBINFO.class})
public abstract class UniqueKey  {
	/*
	@ValueEqual
	protected String value;

	public UniqueKey() {}
	
	public UniqueKey(final String value) {
		this.value = value;
	}

	public String getValue() {
		return value;
	}
	
	public void setValue(String value) {
		this.value = value;
	}*/

	/**
	 * Convert the key to FSA value
	 * @param subscriptionServiceBean
	 * @return
	 * @throws Exception
	 */
	/*
	public String convertToFSA(CommonProfileService profileService) throws Exception {
		return null;
	}
	
	public Profile getProfileObj(CommonProfileService profileService) throws Exception{
		return null;
	}*/

	
	public abstract String convertToFSA(CommonProfileService profileService) throws Exception;
	public abstract Profile getProfileObj(CommonProfileService profileService) throws Exception;
	public abstract String getValue();
	/*
	@Override
	public int hashCode() {
		return ObjectUtils.hashCode(this);
	}

	@Override
	public boolean equals(Object obj) {
		return ObjectUtils.isEqual(this, obj);
	}*/
}