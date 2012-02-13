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
import java.util.Date;
import java.util.List;

import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
/**
 * Entire account summary for a fsa
 * @author Ben CP Chan ben.cp.chan@pccw.com
 *
 */
@XmlType(name = "AccountSummary", namespace = "http://www.pccw.com/")
@XmlRootElement(name = "AccountSummary", namespace = "http://www.pccw.com/")
public class AccountSummary implements Serializable {
	public static final long serialVersionUID = 1L;
	@ValueEqual
	private String accountNo;
	@ValueEqual
	private Date updateDate;
	@ValueEqual
	private String accountName;
	@ValueEqual
	private List<BillingSummary> billingSummaryList;
	/**
	 * Get the account number
	 * @return
	 */
	public String getAccountNo() {
		return accountNo;
	}

	public void setAccountNo(String accountNo) {
		this.accountNo = accountNo;
	}
	/**
	 * Get the account update date
	 * @return
	 */
	public Date getUpdateDate() {
		return updateDate;
	}

	public void setUpdateDate(Date updateDate) {
		this.updateDate = updateDate;
	}
	
	public String getAccountName() {
		return accountName;
	}

	public void setAccountName(String accountName) {
		this.accountName = accountName;
	}
	
	/**
	 * Get a list of billing summary, each billing summary represents
	 * a billing information of a particular period
	 * @return
	 */
	public List<BillingSummary> getBillingSummaryList() {
		return this.billingSummaryList;
	}

	public void setBillingSummaryList(List<BillingSummary> billingSummaryList) {
		this.billingSummaryList = billingSummaryList;
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
