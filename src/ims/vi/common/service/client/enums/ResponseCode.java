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

import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
/**
 * Response code of the API
 * @author Ben CP Chan ben.cp.chan@pccw.com
 *
 */
@XmlType(name = "ResponseCode", namespace = "http://www.pccw.com/")
@XmlRootElement(name = "ResponseCode", namespace = "http://www.pccw.com/")
public enum ResponseCode implements Serializable{
	/**
	 * Response OK
	 */
	OK("Response OK"),	
	/**
	 * Invalid input
	 */	
	INVALID_INPUT("Invalid input"),
	INVALID_BILL_DATE("Invalid bill date"),
	/**
	 * Account was not found
	 */
	ACCOUNT_NOT_FOUND("Account was not found"),
	/**
	 * Channel was not found
	 */
	CHANNEL_NOT_FOUND("Channel was not found"),
	/**
	 * Billing detail was not found
	 */
	BILLING_DETAIL_NOT_FOUND("Billing detail was not found"),
	/**
	 * Transaction Fail
	 */
	TRANSACTION_FAIL("Transaction Fail"), 
	PLAN_ALREADY_SUBSCRIBED("Plan already subscribed"),
	/**
	 * Plan already subscribed
	 */
	SERVICE_ALREADY_SUBSCRIBED("Service already subscribed"),
	/**
	 * Plan not available for subscription
	 */
	SERVICE_NOT_AVAILABLE_FOR_SUBSCRIPTION("Plan not available for subscription"), 
	/**
	 * Service not subscribed
	 */
	SERVICE_NOT_SUBSCRIBED("Service not subscribed"),
	/**
	 * Invalid language
	 */
	INVALID_LANGUAGE("Invalid language"),
	
	INTERNAL_ERROR("Internal error"),

	/**
	 * System busy
	 */
	SYSTEM_BUSY("System is now busy, please try again later"),
	INACTIVE_STATUS("Status in inactive"),

	SUB_CUST_CAT_NOT_EXISTS("Sub cust cat not exists"),
	GENRE_NOT_EXISTS("Genre not exists"),
	
	PLAN_NOT_SUBSCRIBED("Plan not subscribed"),
	//PLAN_NOT_SUBSCRIBED("Plan not subscribed"),
	SUBCUSTCAT_PLAN_SUBSCRIBE_FAIL("Subcustcat cannot buy plan"),
	SD_PROFILE_SUBSCRIBE_HD_FAIL("SD profile cannot subscribe HD channel"),
	EMPTY_PLAN("No plan can be selected for subscription"),
	
	ERROR_BUYTHRU("Buy Thru checking fail"),
	ERROR_BUYTHRU_POST_TERM("Buy Thru checking on post term fail"),
	ERROR_BUYTHRU_FREE("Buy Thru checking for free fail"),
	
	ERROR_DUPLICATE_MOBILE("Duplicate mobile number"),
	ERROR_INVALID_MOBILE("Invalid mobile number"),
	ERROR_MSP_SUBMIT_RESPONSE("Error in MSP submit response"),
	
	/**
	 * Dependency codes
	 */
	DEPENDENCY_FAIL("Dependency failure"),
	/**
	 * MSP submit
	 */
	MSP_MOBILE_8_DIGITS("8 digits mobile"),
	MSP_EYE_8_DIGITS("8 digits eye number"),
	MSP_NETVIGATOR_2_TO_15("Netvigator login in 2-15 characters"),
	MSP_CONTACT_8_DIGITS("8 digits contact number"),
	MSP_EMPTY_CONTACT("Empty contact number"),
	MSP_EMPTY_FORM("Empty account info"),
	MSP_INVALID_EYE_NUMBER("Invalid eye number"),
	MSP_NETVIGAOT_WRONG_INITIAL("Netvigator wrong initial"),
	MSP_INVALID_MOBILE("Invalid mobile"),
	MSP_INVALID_CONTACT_NUMBER("Invalid contact number")
	;
	
	private String errorCode;

	ResponseCode(String errorCode) {
		this.errorCode=errorCode;
	}
	
	public String getErrorMessage(){
		return this.errorCode;
	}
}