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
 * Billing detail for a particular billing period
 * @author Ben CP Chan ben.cp.chan@pccw.com
 *
 */
@XmlType(name = "BillingDetail", namespace = "http://www.pccw.com/", propOrder={"month", "previousChargesHK", "paymentReceiveDate", "previousPaymentHK", "adjustmentsToPreviousBillHK", "channelAndOtherSubscriptionsHK", "onDemandServicesHK", "otherServicesHK", "adjustmentsToCurrentBillHK", "totalCurrentChargesHK", "bonusUsed", "oddCentsCarriedForward", "totalBillAmount", "settleType"})
@XmlRootElement(name = "BillingDetail", namespace = "http://www.pccw.com/")
public class BillingDetail implements Serializable {
	public static final long serialVersionUID = 1L;
	@ValueEqual
	private Date month;
	@ValueEqual
	private BigDecimal previousChargesHK;
	@ValueEqual
	private Date paymentReceiveDate;
	@ValueEqual
	private BigDecimal previousPaymentHK;
	@ValueEqual
	private BigDecimal adjustmentsToPreviousBillHK;
	@ValueEqual
	private BigDecimal channelAndOtherSubscriptionsHK;
	@ValueEqual
	private BigDecimal onDemandServicesHK;
	@ValueEqual
	private BigDecimal otherServicesHK;
	@ValueEqual
	private BigDecimal adjustmentsToCurrentBillHK;
	@ValueEqual
	private BigDecimal totalCurrentChargesHK;
	@ValueEqual
	private BigDecimal bonusUsed;
	@ValueEqual
	private BigDecimal oddCentsCarriedForward;
	@ValueEqual
	private BigDecimal totalBillAmount;
	@ValueEqual
	private String settleType;

	public Date getMonth() {
		return month;
	}

	public void setMonth(Date month) {
		this.month = month;
	}

	public BigDecimal getPreviousChargesHK() {
		return previousChargesHK;
	}

	public void setPreviousChargesHK(BigDecimal previousChargesHK) {
		this.previousChargesHK = previousChargesHK;
	}

	public BigDecimal getAdjustmentsToPreviousBillHK() {
		return adjustmentsToPreviousBillHK;
	}

	public void setAdjustmentsToPreviousBillHK(
			BigDecimal adjustmentsToPreviousBillHK) {
		this.adjustmentsToPreviousBillHK = adjustmentsToPreviousBillHK;
	}

	public BigDecimal getChannelAndOtherSubscriptionsHK() {
		return channelAndOtherSubscriptionsHK;
	}

	public void setChannelAndOtherSubscriptionsHK(
			BigDecimal channelAndOtherSubscriptionsHK) {
		this.channelAndOtherSubscriptionsHK = channelAndOtherSubscriptionsHK;
	}

	public BigDecimal getOnDemandServicesHK() {
		return onDemandServicesHK;
	}

	public void setOnDemandServicesHK(BigDecimal onDemandServicesHK) {
		this.onDemandServicesHK = onDemandServicesHK;
	}

	public BigDecimal getOtherServicesHK() {
		return otherServicesHK;
	}

	public void setOtherServicesHK(BigDecimal otherServicesHK) {
		this.otherServicesHK = otherServicesHK;
	}

	public BigDecimal getAdjustmentsToCurrentBillHK() {
		return adjustmentsToCurrentBillHK;
	}

	public void setAdjustmentsToCurrentBillHK(
			BigDecimal adjustmentsToCurrentBillHK) {
		this.adjustmentsToCurrentBillHK = adjustmentsToCurrentBillHK;
	}

	public BigDecimal getTotalCurrentChargesHK() {
		return totalCurrentChargesHK;
	}

	public void setTotalCurrentChargesHK(BigDecimal totalCurrentChargesHK) {
		this.totalCurrentChargesHK = totalCurrentChargesHK;
	}
	
	public void setPaymentReceiveDate(Date paymentReceiveDate) {
		this.paymentReceiveDate = paymentReceiveDate;
	}

	public Date getPaymentReceiveDate() {
		return paymentReceiveDate;
	}

	public void setPreviousPaymentHK(BigDecimal previousPaymentHK) {
		this.previousPaymentHK = previousPaymentHK;
	}

	public BigDecimal getPreviousPaymentHK() {
		return previousPaymentHK;
	}

	public void setBonusUsed(BigDecimal bonusUsed) {
		this.bonusUsed = bonusUsed;
	}

	public BigDecimal getBonusUsed() {
		return bonusUsed;
	}

	public void setOddCentsCarriedForward(BigDecimal oddCentsCarriedForward) {
		this.oddCentsCarriedForward = oddCentsCarriedForward;
	}

	public BigDecimal getOddCentsCarriedForward() {
		return oddCentsCarriedForward;
	}

	public void setTotalBillAmount(BigDecimal totalBillAmount) {
		this.totalBillAmount = totalBillAmount;
	}

	public BigDecimal getTotalBillAmount() {
		return totalBillAmount;
	}

	public void setSettleType(String settleType) {
		this.settleType = settleType;
	}

	public String getSettleType() {
		return settleType;
	}
	
	@Override
	public int hashCode() {
		return ObjectUtils.hashCode(this);
	}

	@Override
	public boolean equals(Object obj) {
		return ObjectUtils.isEqual(this, obj);
	}
	
	@Override 
	public String toString(){
		return ReflectionToStringBuilder.toString(this);
	}
}