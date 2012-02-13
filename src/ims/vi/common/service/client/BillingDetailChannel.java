/**
 * This software is the confidential and proprietary information of
 * CASCADE(Confidential Information). You shall no
 * disclose such Confidential Information and shall use it only in
 * Copyright 2008 CASCADE. All Rights Reserved.
 * Accordance with the terms of the license agreement you entered into 
 * With CASCADE
 * Creation Date 2008/11/3
 * 
 */
package ims.vi.common.service.client;

import ims.vi.common.annotation.ValueEqual;
import ims.vi.common.utils.ObjectUtils;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;
import java.util.List;

import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

@XmlType(name = "BillingDetailChannel", namespace = "http://www.pccw.com/")
@XmlRootElement(name = "BillingDetailChannel", namespace = "http://www.pccw.com/")
public class BillingDetailChannel implements Serializable{
	private static final long serialVersionUID = 1L;
	@ValueEqual
	private Date chargeStartDate;
	@ValueEqual
	private Date chargeEndDate;
	@ValueEqual
	private String item;
	@ValueEqual
	private BigDecimal amount;
	@ValueEqual
	private List<ims.vi.common.bean.Channel> channelList;

	public Date getChargeStartDate() {
		return this.chargeStartDate;
	}

	public void setChargeStartDate(Date chargeStartDate) {
		this.chargeStartDate = chargeStartDate;
	}

	public Date getChargeEndDate() {
		return this.chargeEndDate;
	}

	public void setChargeEndDate(Date chargeEndDate) {
		this.chargeEndDate = chargeEndDate;
	}
	/**
	 * Get the description of the channel, it can be a plan name or package name
	 * @return
	 */
	public String getItem() {
		return this.item;
	}

	public void setItem(String item) {
		this.item = item;
	}

	public BigDecimal getAmount() {
		return this.amount;
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

	public List<ims.vi.common.bean.Channel> getChannelList() {
		return this.channelList;
	}

	public void setChannelList(List<ims.vi.common.bean.Channel> channelList) {
		this.channelList = channelList;
	}
}
