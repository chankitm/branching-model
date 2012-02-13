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

@XmlType(name = "BillingDetailOnDemand", namespace = "http://www.pccw.com/", propOrder={"transactionDate", "description", "amount"})
@XmlRootElement(name = "BillingDetailOnDemand", namespace = "http://www.pccw.com/")
public class BillingDetailOnDemand implements Serializable{
	private static final long serialVersionUID = 1L;
	@ValueEqual
	private Date transactionDate;
	@ValueEqual
	private String description;
	@ValueEqual
	private BigDecimal amount;
	public Date getTransactionDate() {
		return transactionDate;
	}
	public void setTransactionDate(Date transactionDate) {
		this.transactionDate = transactionDate;
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
