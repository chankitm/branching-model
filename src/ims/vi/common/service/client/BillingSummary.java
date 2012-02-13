/**
 * This software is the confidential and proprietary information of
 * CASCADE(Confidential Information). You shall no
 * disclose such Confidential Information and shall use it only in
 * Copyright 2008 CASCADE. All Rights Reserved.
 * Accordance with the terms of the license agreement you entered into 
 * With CASCADE
 * Creation Date Oct 2, 2008
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

import org.apache.commons.lang.builder.ReflectionToStringBuilder;
/**
 * Billing summary for a particular billing period
 * @author Ben CP Chan ben.cp.chan@pccw.com
 *
 */
@XmlType(name = "BillingSummary", namespace = "http://www.pccw.com/")
@XmlRootElement(name = "BillingSummary", namespace = "http://www.pccw.com/")
public class BillingSummary implements Serializable {
	public static final long serialVersionUID = 1L;

	@ValueEqual
	private Date billDate;
	@ValueEqual
	private BigDecimal monthlyChargeHK;
	@ValueEqual
	private BillingDetail billingDetail;
	/**
	 * Get the bill date, null value means current billing period
	 * @return
	 */
	public Date getBillDate() {
		return billDate;
	}

	public void setBillDate(Date billDate) {
		this.billDate = billDate;
	}
	/**
	 * Get the monthly charge
	 * @return
	 */
	public BigDecimal getMonthlyChargeHK() {
		return monthlyChargeHK;
	}

	public void setMonthlyChargeHK(BigDecimal monthlyChargeHK) {
		this.monthlyChargeHK = monthlyChargeHK;
	}
	/**
	 * Get the billing detail
	 * @return
	 */
	public BillingDetail getBillingDetail() {
		return billingDetail;
	}

	public void setBillingDetail(BillingDetail billingDetail) {
		this.billingDetail = billingDetail;
	}

	@Override
	public String toString() {
		return ReflectionToStringBuilder.toString(this);
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
