/**
 * This software is the confidential and proprietary information of
 * CASCADE(Confidential Information). You shall no
 * disclose such Confidential Information and shall use it only in
 * Copyright 2008 CASCADE. All Rights Reserved.
 * Accordance with the terms of the license agreement you entered into 
 * With CASCADE
 * Creation Date Oct 31, 2008
 * 
 */
package ims.vi.common.service.client;

import ims.vi.common.annotation.ValueEqual;
import ims.vi.common.utils.ObjectUtils;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

@XmlType(name = "BillingDetailOther", namespace = "http://www.pccw.com/", propOrder={"chargeStartDate", "chargeEndDate", "description", "amount"})
@XmlRootElement(name = "BillingDetailOther", namespace = "http://www.pccw.com/")
public class BillingDetailOther implements Serializable{
	private static final long serialVersionUID = 1L;
	@ValueEqual
	private Date chargeStartDate;
	@ValueEqual
	private Date chargeEndDate;
	@ValueEqual
	private String description;
	@ValueEqual
	private BigDecimal amount;
	public Date getChargeStartDate() {
		return chargeStartDate;
	}
	public void setChargeStartDate(Date chargeStartDate) {
		this.chargeStartDate = chargeStartDate;
	}
	public Date getChargeEndDate() {
		return chargeEndDate;
	}
	public void setChargeEndDate(Date chargeEndDate) {
		this.chargeEndDate = chargeEndDate;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public BigDecimal getAmount() {
		return amount;
	}
	public void setAmount(BigDecimal amount) {
		this.amount = amount;
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
