/**
 * This software is the confidential and proprietary information of
 * CASCADE("Confidential Information"). You shall no
 * disclose such Confidential Information and shall use it only in
 * Copyright 2008 CASCADE. All Rights Reserved.
 * Accordance with the terms of the license agreement you entered into 
 * With CASCADE
 * Creation Date Oct 2, 2008
 * 
 */
package ims.vi.common.service.client.enums;

import java.io.Serializable;

public enum ServerType implements Serializable{
	/**
	 * Response OK
	 */
	QPA("QPA"),	
	VODCHECKOUT("VODCHECKOUT"),
	MOVIEHOUSE("MOVIEHOUSE"),
	CPBALANCE("CPBALANCE"),
	TOPUPCP("TOPUPCP"),
	TOPUPPLAN("TOPUPPLAN"),
	STBC_BIND("STBC_BIND"),
	STBC_BINFO("STBC_BINFO"),
	STBC_GETT("STBC_GETT"),
	STBC_VERIFYT("STBC_VERIFYT"),
	STBC_UNBIND("STBC_UNBIND")
	;
	
	private String type;

	ServerType(String type) {
		this.type = type;
	}
	
	public String getType(){
		return this.type;
	}
}