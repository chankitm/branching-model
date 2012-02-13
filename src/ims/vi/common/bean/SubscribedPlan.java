/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package ims.vi.common.bean;

import java.io.Serializable;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
/**
 *
 * @author Alex
 */
@Entity
@Table(name = "VI_SUB_PLAN_T")
@XmlType(name = "SubscribedPlan", namespace = "http://www.pccw.com/")
@XmlRootElement(name = "SubscribedPlan", namespace = "http://www.pccw.com/")
public class SubscribedPlan implements Serializable {
	private static final long serialVersionUID = 1L;
    public static final String ALLFIELDS = " sp.SUB_PLAN_ID AS SP_SUB_PLAN_ID," +
    		"sp.LAST_REQUEST_ID AS SP_LAST_REQUEST_ID," +
    		"sp.REGISTERED_DATE AS SP_REGISTERED_DATE," +
    		"sp.REGISTERED_BY AS SP_REGISTERED_BY," +
    		"sp.SERVICE_STARTED_DATE AS SP_SERVICE_STARTED_DATE," +
    		"sp.SERVICE_STARTED_BY AS SP_SERVICE_STARTED_BY," +
    		"sp.SUSPENDED_DATE AS SP_SUSPENDED_DATE," +
    		"sp.SUSPENDED_BY AS SP_SUSPENDED_BY," +
    		"sp.SUSPEND_LEVEL AS SP_SUSPEND_LEVEL," +
    		"sp.RESUMED_DATE AS SP_RESUMED_DATE," +
    		"sp.RESUMED_BY AS SP_RESUMED_BY," +
    		"sp.TERMINATED_DATE AS SP_TERMINATED_DATE," +
    		"sp.TERMINATED_BY AS SP_TERMINATED_BY," +
    		"sp.LAST_BILL_DATE AS SP_LAST_BILL_DATE," +
    		"sp.NEXT_BILL_DATE AS SP_NEXT_BILL_DATE," +
    		"sp.SCH_TERMINATION_DATE AS SP_SCH_TERMINATION_DATE," +
    		"sp.EXPIRATION_DATE AS SP_EXPIRATION_DATE," +
    		"sp.LAST_FAIL_DATE AS SP_LAST_FAIL_DATE," +
    		"sp.SMS_ENTITLE_ID AS SP_SMS_ENTITLE_ID," +
    		"sp.SMS_ENTITLE_START_TIME AS SP_SMS_ENTITLE_START_TIME," +
    		"sp.SMS_ENTITLE_END_TIME AS SP_SMS_ENTITLE_END_TIME," +
    		"sp.FAILURE_REASON AS SP_FAILURE_REASON," +
    		"sp.MODIFIED_DATE AS SP_MODIFIED_DATE," +
    		"sp.MODIFIED_BY AS SP_MODIFIED_BY," +
    		"sp.CREATED_DATE AS SP_CREATED_DATE," +
    		"sp.CREATED_BY AS SP_CREATED_BY," +
    		"sp.LAST_RENTAL_START_DATE AS SP_LAST_RENTAL_START_DATE," +
    		"sp.LAST_RENTAL_END_DATE AS SP_LAST_RENTAL_END_DATE," +
    		"sp.CANNOT_UNSUB AS SP_CANNOT_UNSUB," +
    		"sp.CANNOT_CHANGE_FROM AS SP_CANNOT_CHANGE_FROM," +
    		"sp.INPUT_DATE AS SP_INPUT_DATE," +
    		"sp.INPUT_BY AS SP_INPUT_BY," +
    		"sp.REFERRER_ID AS SP_REFERRER_ID," +
    		"sp.STAFF_ID AS SP_STAFF_ID," +
    		"sp.LOCK_CHANNEL AS SP_LOCK_CHANNEL," +
    		"sp.UNLOCK_CHANNEL AS SP_UNLOCK_CHANNEL," +
    		"sp.FSA AS SP_FSA," +
    		"sp.STATUS AS SP_STATUS," +
    		"sp.PLAN_CODE AS SP_PLAN_CODE ";
    
	@Id
	@Column(name = "SUB_PLAN_ID", nullable = false)
	private BigDecimal subPlanId;
	
	@Column(name = "LAST_REQUEST_ID")
	private String lastRequestId;
	
	@Column(name = "REGISTERED_DATE", nullable = false)
	@Temporal(TemporalType.TIMESTAMP)
	private Date registeredDate;
	
	@Column(name = "REGISTERED_BY", nullable = false)
	private String registeredBy;
	
	@Column(name = "SERVICE_STARTED_DATE")
	@Temporal(TemporalType.TIMESTAMP)
	private Date serviceStartedDate;
	
	@Column(name = "SERVICE_STARTED_BY")
	private String serviceStartedBy;
	
	@Column(name = "SUSPENDED_DATE")
	@Temporal(TemporalType.TIMESTAMP)
	private Date suspendedDate;
	
	@Column(name = "SUSPENDED_BY")
	private String suspendedBy;
	
	@Column(name = "SUSPEND_LEVEL")
	private String suspendLevel;
	
	@Column(name = "RESUMED_DATE")
	@Temporal(TemporalType.TIMESTAMP)
	private Date resumedDate;
	
	@Column(name = "RESUMED_BY")
	private String resumedBy;
	
	@Column(name = "TERMINATED_DATE")
	@Temporal(TemporalType.TIMESTAMP)
	private Date terminatedDate;
	
	@Column(name = "TERMINATED_BY")
	private String terminatedBy;
	
	@Column(name = "LAST_BILL_DATE")
	@Temporal(TemporalType.TIMESTAMP)
	private Date lastBillDate;
	
	@Column(name = "NEXT_BILL_DATE")
	@Temporal(TemporalType.TIMESTAMP)
	private Date nextBillDate;
	
	@Column(name = "SCH_TERMINATION_DATE")
	@Temporal(TemporalType.TIMESTAMP)
	private Date schTerminationDate;
	
	@Column(name = "EXPIRATION_DATE")
	@Temporal(TemporalType.TIMESTAMP)
	private Date expirationDate;
	
	@Column(name = "LAST_FAIL_DATE")
	@Temporal(TemporalType.TIMESTAMP)
	private Date lastFailDate;
	
	@Column(name = "SMS_ENTITLE_ID")
	private String smsEntitleId;
	
	@Column(name = "SMS_ENTITLE_START_TIME")
	private BigInteger smsEntitleStartTime;
	
	@Column(name = "SMS_ENTITLE_END_TIME")
	private BigInteger smsEntitleEndTime;
	
	@Column(name = "FAILURE_REASON")
	private String failureReason;
	
	@Column(name = "MODIFIED_DATE")
	@Temporal(TemporalType.TIMESTAMP)
	private Date modifiedDate;
	
	@Column(name = "MODIFIED_BY")
	private String modifiedBy;
	
	@Column(name = "CREATED_DATE", nullable = false)
	@Temporal(TemporalType.TIMESTAMP)
	private Date createdDate;
	
	@Column(name = "CREATED_BY", nullable = false)
	private String createdBy;
	
	@Column(name = "LAST_RENTAL_START_DATE")
	@Temporal(TemporalType.TIMESTAMP)
	private Date lastRentalStartDate;
	
	@Column(name = "LAST_RENTAL_END_DATE")
	@Temporal(TemporalType.TIMESTAMP)
	private Date lastRentalEndDate;
	
	@Column(name = "CANNOT_UNSUB")
	private String cannotUnsub;
	
	@Column(name = "CANNOT_CHANGE_FROM")
	private String cannotChangeFrom;
	
	@Column(name = "INPUT_DATE")
	@Temporal(TemporalType.TIMESTAMP)
	private Date inputDate;
	
	@Column(name = "INPUT_BY")
	private String inputBy;
	
	@Column(name = "REFERRER_ID")
	private String referrerId;
	@Column(name = "STAFF_ID")
	private String staffId;
	
	@Column(name = "LOCK_CHANNEL")
	private String lockChannel;
	
	@Column(name = "UNLOCK_CHANNEL")
	private String unlockChannel;
	
	//@Column(name = "PLAN_CODE")
	//private String planCode;
	
	@Column(name = "FSA")
	private String fsa;
	
	@Column(name = "STATUS")
	private String status;
	
	@JoinColumn(name = "PLAN_CODE", referencedColumnName = "PLAN_CODE")
	@ManyToOne
	//@Transient
	private Plan plan;

	public SubscribedPlan() {
	}

	public SubscribedPlan(BigDecimal subPlanId) {
		this.subPlanId = subPlanId;
	}

	public SubscribedPlan(BigDecimal subPlanId, Date registeredDate,
			String registeredBy, Date createdDate, String createdBy) {
		this.subPlanId = subPlanId;
		this.registeredDate = registeredDate;
		this.registeredBy = registeredBy;
		this.createdDate = createdDate;
		this.createdBy = createdBy;
	}

	public BigDecimal getSubPlanId() {
		return subPlanId;
	}

	public void setSubPlanId(BigDecimal subPlanId) {
		this.subPlanId = subPlanId;
	}

	public String getLastRequestId() {
		return lastRequestId;
	}

	public void setLastRequestId(String lastRequestId) {
		this.lastRequestId = lastRequestId;
	}

	public Date getRegisteredDate() {
		return registeredDate;
	}

	public void setRegisteredDate(Date registeredDate) {
		this.registeredDate = registeredDate;
	}

	public String getRegisteredBy() {
		return registeredBy;
	}

	public void setRegisteredBy(String registeredBy) {
		this.registeredBy = registeredBy;
	}

	public Date getServiceStartedDate() {
		return serviceStartedDate;
	}

	public void setServiceStartedDate(Date serviceStartedDate) {
		this.serviceStartedDate = serviceStartedDate;
	}

	public String getServiceStartedBy() {
		return serviceStartedBy;
	}

	public void setServiceStartedBy(String serviceStartedBy) {
		this.serviceStartedBy = serviceStartedBy;
	}

	public Date getSuspendedDate() {
		return suspendedDate;
	}

	public void setSuspendedDate(Date suspendedDate) {
		this.suspendedDate = suspendedDate;
	}

	public String getSuspendedBy() {
		return suspendedBy;
	}

	public void setSuspendedBy(String suspendedBy) {
		this.suspendedBy = suspendedBy;
	}

	public String getSuspendLevel() {
		return suspendLevel;
	}

	public void setSuspendLevel(String suspendLevel) {
		this.suspendLevel = suspendLevel;
	}

	public Date getResumedDate() {
		return resumedDate;
	}

	public void setResumedDate(Date resumedDate) {
		this.resumedDate = resumedDate;
	}

	public String getResumedBy() {
		return resumedBy;
	}

	public void setResumedBy(String resumedBy) {
		this.resumedBy = resumedBy;
	}

	public Date getTerminatedDate() {
		return terminatedDate;
	}

	public void setTerminatedDate(Date terminatedDate) {
		this.terminatedDate = terminatedDate;
	}

	public String getTerminatedBy() {
		return terminatedBy;
	}

	public void setTerminatedBy(String terminatedBy) {
		this.terminatedBy = terminatedBy;
	}

	public Date getLastBillDate() {
		return lastBillDate;
	}

	public void setLastBillDate(Date lastBillDate) {
		this.lastBillDate = lastBillDate;
	}

	public Date getNextBillDate() {
		return nextBillDate;
	}

	public void setNextBillDate(Date nextBillDate) {
		this.nextBillDate = nextBillDate;
	}

	public Date getSchTerminationDate() {
		return schTerminationDate;
	}

	public void setSchTerminationDate(Date schTerminationDate) {
		this.schTerminationDate = schTerminationDate;
	}

	public Date getExpirationDate() {
		return expirationDate;
	}

	public void setExpirationDate(Date expirationDate) {
		this.expirationDate = expirationDate;
	}

	public Date getLastFailDate() {
		return lastFailDate;
	}

	public void setLastFailDate(Date lastFailDate) {
		this.lastFailDate = lastFailDate;
	}

	public String getSmsEntitleId() {
		return smsEntitleId;
	}

	public void setSmsEntitleId(String smsEntitleId) {
		this.smsEntitleId = smsEntitleId;
	}

	public BigInteger getSmsEntitleStartTime() {
		return smsEntitleStartTime;
	}

	public void setSmsEntitleStartTime(BigInteger smsEntitleStartTime) {
		this.smsEntitleStartTime = smsEntitleStartTime;
	}

	public BigInteger getSmsEntitleEndTime() {
		return smsEntitleEndTime;
	}

	public void setSmsEntitleEndTime(BigInteger smsEntitleEndTime) {
		this.smsEntitleEndTime = smsEntitleEndTime;
	}

	public String getFailureReason() {
		return failureReason;
	}

	public void setFailureReason(String failureReason) {
		this.failureReason = failureReason;
	}

	public Date getModifiedDate() {
		return modifiedDate;
	}

	public void setModifiedDate(Date modifiedDate) {
		this.modifiedDate = modifiedDate;
	}

	public String getModifiedBy() {
		return modifiedBy;
	}

	public void setModifiedBy(String modifiedBy) {
		this.modifiedBy = modifiedBy;
	}

	public Date getCreatedDate() {
		return createdDate;
	}

	public void setCreatedDate(Date createdDate) {
		this.createdDate = createdDate;
	}

	public String getCreatedBy() {
		return createdBy;
	}

	public void setCreatedBy(String createdBy) {
		this.createdBy = createdBy;
	}

	public Date getLastRentalStartDate() {
		return lastRentalStartDate;
	}

	public void setLastRentalStartDate(Date lastRentalStartDate) {
		this.lastRentalStartDate = lastRentalStartDate;
	}

	public Date getLastRentalEndDate() {
		return lastRentalEndDate;
	}

	public void setLastRentalEndDate(Date lastRentalEndDate) {
		this.lastRentalEndDate = lastRentalEndDate;
	}

	public String getCannotUnsub() {
		return cannotUnsub;
	}

	public void setCannotUnsub(String cannotUnsub) {
		this.cannotUnsub = cannotUnsub;
	}

	public String getCannotChangeFrom() {
		return cannotChangeFrom;
	}

	public void setCannotChangeFrom(String cannotChangeFrom) {
		this.cannotChangeFrom = cannotChangeFrom;
	}

	public Date getInputDate() {
		return inputDate;
	}

	public void setInputDate(Date inputDate) {
		this.inputDate = inputDate;
	}

	public String getInputBy() {
		return inputBy;
	}

	public void setInputBy(String inputBy) {
		this.inputBy = inputBy;
	}

	public String getReferrerId() {
		return referrerId;
	}

	public void setReferrerId(String referrerId) {
		this.referrerId = referrerId;
	}

	public String getStaffId() {
		return staffId;
	}

	public void setStaffId(String staffId) {
		this.staffId = staffId;
	}

	public String getLockChannel() {
		return lockChannel;
	}

	public void setLockChannel(String lockChannel) {
		this.lockChannel = lockChannel;
	}

	public String getUnlockChannel() {
		return unlockChannel;
	}

	public void setUnlockChannel(String unlockChannel) {
		this.unlockChannel = unlockChannel;
	}
	
	/*public String getPlanCode() {
		//return plan.getPlanCode();
		return planCode;
	}
	
	public void setPlanCode(String planCode) {
		if (this.plan == null) this.plan = new Plan();
		this.planCode = planCode;
		this.plan.setPlanCode(planCode);
	}*/

	public Plan getPlan() {
		return plan;
	}

	public void setPlan(Plan plan) {
		this.plan = plan;
	}

	
	public String getFsa() {
		return fsa;
	}

	public void setFsa(String fsa) {
		this.fsa = fsa;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	/*
	public Profile getProfile() {
		return profile;
	}

	public void setProfile(Profile profile) {
		this.profile = profile;
	}

	public Status getStatus() {
		return status;
	}

	public void setStatus(Status status) {
		this.status = status;
	}*/

	/*
	public Collection<ViSubTxnT> getViSubTxnTCollection() {
	    return viSubTxnTCollection;
	}

	public void setViSubTxnTCollection(Collection<ViSubTxnT> viSubTxnTCollection) {
	    this.viSubTxnTCollection = viSubTxnTCollection;
	}

	public Collection<ViRentalTxnT> getViRentalTxnTCollection() {
	    return viRentalTxnTCollection;
	}

	public void setViRentalTxnTCollection(Collection<ViRentalTxnT> viRentalTxnTCollection) {
	    this.viRentalTxnTCollection = viRentalTxnTCollection;
	}
	 */
	/*
	public SchemeProp getSchemeProp() {
		return schemeProp;
	}

	public void setSchemeProp(SchemeProp schemeProp) {
		this.schemeProp = schemeProp;
	}*/

	@Override
	public int hashCode() {
		int hash = 0;
		hash += (subPlanId != null ? subPlanId.hashCode() : 0);
		return hash;
	}

	@Override
	public boolean equals(Object object) {
		// TODO: Warning - this method won't work in the case the id fields are not set
		if (!(object instanceof SubscribedPlan)) {
			return false;
		}
		SubscribedPlan other = (SubscribedPlan) object;
		if ((this.subPlanId == null && other.subPlanId != null)
				|| (this.subPlanId != null && !this.subPlanId
						.equals(other.subPlanId))) {
			return false;
		}
		return true;
	}

	@Override
	public String toString() {
		return "javaapplication1.ViSubPlanT[subPlanId=" + subPlanId + "]";
	}
}
