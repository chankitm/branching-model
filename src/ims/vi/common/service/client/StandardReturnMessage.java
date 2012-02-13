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
package ims.vi.common.service.client;

import java.io.Serializable;

import org.apache.commons.lang.builder.ReflectionToStringBuilder;

import ims.vi.common.annotation.ValueEqual;
import ims.vi.common.service.client.enums.ResponseCode;
import ims.vi.common.service.client.interfaces.ReturnMessage;
import ims.vi.common.utils.ObjectUtils;

/**
 * A base implementation class for return message, contains a ResponseCode and
 * a payload object for common use
 * 
 * @author Ben CP Chan ben.cp.chan@pccw.com
 * 
 * @param <PayloadType>
 */
public class StandardReturnMessage<PayloadType> implements
		ReturnMessage<PayloadType>, Serializable{
	private static final long serialVersionUID = 1L;
	@ValueEqual
	private ResponseCode responseCode;
	@ValueEqual
	private PayloadType payload;
	
	public StandardReturnMessage(final ResponseCode responseCode){
		this.responseCode=responseCode;
	}
	
	public StandardReturnMessage(){
		this(ResponseCode.OK);
	}

	public ResponseCode getResponseCode() {
		return responseCode;
	}

	public void setResponseCode(ResponseCode responseCode) {
		this.responseCode = responseCode;
	}

	@Override
	public String toString() {
		// Mainly for debug purpose
		final String objState = String.format("[ResponseCode=%s][Payload=%s]",
				ReflectionToStringBuilder.toString(this.responseCode),
				ReflectionToStringBuilder.toString(this.getPayload()));

		return objState;
	}
	/**
	 * The payload object of the API
	 */
	public PayloadType getPayload() {
		return payload;
	}

	public void setPayload(PayloadType payload) {
		this.payload = payload;
	}
	

	@Override
	public int hashCode() {
		return ObjectUtils.hashCode(this);
	}

	@Override
	public boolean equals(Object obj) {
		return ObjectUtils.isEqual(this, obj);
	}

}
