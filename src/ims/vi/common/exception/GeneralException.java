/**
 * This software is the confidential and proprietary information of
 * CASCADE(Confidential Information). You shall no
 * disclose such Confidential Information and shall use it only in
 * Copyright 2008 CASCADE. All Rights Reserved.
 * Accordance with the terms of the license agreement you entered into 
 * With CASCADE
 * Creation Date Oct 15, 2008
 * 
 */
package ims.vi.common.exception;

import ims.vi.common.service.client.enums.ResponseCode;

public class GeneralException extends Exception {
	private static final long serialVersionUID = 1L;
	private ResponseCode responseCode;
	
	public GeneralException(ResponseCode responseCode){
		this.responseCode=responseCode;		
	}
	
	public ResponseCode getResponseCode() {
		return responseCode;
	}
}
