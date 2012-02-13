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
package ims.vi.common.service.client.interfaces;

import ims.vi.common.service.client.enums.ResponseCode;

import java.io.Serializable;
/**
 * The parent interface of the return object in each API
 * @author Ben CP Chan ben.cp.chan@pccw.com
 *
 * @param <PayloadType> type of the payload
 */
public interface ReturnMessage<PayloadType> extends Serializable {
	ResponseCode getResponseCode();
	PayloadType getPayload();	
}
