/**
 * This software is the confidential and proprietary information of
 * CASCADE(Confidential Information). You shall no
 * disclose such Confidential Information and shall use it only in
 * Copyright 2008 CASCADE. All Rights Reserved.
 * Accordance with the terms of the license agreement you entered into 
 * With CASCADE
 * Creation Date 2008/12/3
 * 
 */
package ims.vi.common.service.client.enums;

import java.io.Serializable;

import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
/**
 * Subscription status
 * @author Ben CP Chan ben.cp.chan@pccw.com
 *
 */
@XmlType(name = "SubscriptionStatus", namespace = "http://www.pccw.com/")
@XmlRootElement(name = "SubscriptionStatus", namespace = "http://www.pccw.com/")
public enum SubscriptionStatus implements Serializable{
	
	ACTIVE,
	ACTIVE_FAIL,
	ACTIVE_PENDING,
	ACTIVE_ALL,
	
	CLOSED,
	CLOSED_FAIL,
	CLOSED_PENDING,
	CLOSED_ALL,
	
	INACTIVE,
	INACTIVE_FAIL,
	INACTIVE_PENDING,
	INACTIVE_ALL,
	
	NON_CLOSED,
	ALL;


}
