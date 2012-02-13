/**
 * This software is the confidential and proprietary information of
 * CASCADE(Confidential Information). You shall no
 * disclose such Confidential Information and shall use it only in
 * Copyright 2008 CASCADE. All Rights Reserved.
 * Accordance with the terms of the license agreement you entered into 
 * With CASCADE
 * Creation Date 2008/11/13
 * 
 */
package ims.vi.common.service.client;

import ims.vi.common.annotation.ValueEqual;
import ims.vi.common.utils.ObjectUtils;

import java.io.Serializable;
import java.util.Date;

import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

@XmlType(name = "ChannelRenewal", namespace = "http://www.pccw.com/", propOrder={"channelId","renewalDate","status","planName"})
@XmlRootElement(name = "ChannelRenewal", namespace = "http://www.pccw.com/")
public class ChannelRenewal implements Serializable{
	private static final long serialVersionUID = 1L;

	//public static enum Status{Seasonal,Free,InProgress,Suspended,TemporarilyUnavailable};
	public static enum Status{Seasonal,Free,InProgress,Suspended,TemporarilyUnavailable};
	@ValueEqual
	private Integer channelId;
	@ValueEqual
	private Date renewalDate;
	@ValueEqual
	private Status status;
	@ValueEqual
	private String planName;
	
	public Integer getChannelId() {
		return channelId;
	}
	public void setChannelId(Integer channelId) {
		this.channelId = channelId;
	}
	/**
	 * Channel renewalDate if this value is set, status value is set to null
	 */	
	public Date getRenewalDate() {
		return renewalDate;
	}
	public void setRenewalDate(Date renewalDate) {
		this.renewalDate = renewalDate;
	}
	/**
	 * If status is set, renewalDate value is null
	 * @return
	 */
	public Status getStatus() {
		return status;
	}
	public void setStatus(Status status) {
		this.status = status;
	}
	public String getPlanName() {
		return planName;
	}
	public void setPlanName(String planName) {
		this.planName = planName;
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
