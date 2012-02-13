/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package ims.vi.common.bean;

import java.io.Serializable;
import java.math.BigInteger;
import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 *
 * @author Alex
 */
@Entity
@Table(name = "VI_PROFILE_T")
public class Profile implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Column(name = "FSA", nullable = false)
    private String fsa;
    
    @Column(name = "NAME_CHI")
    private String nameChi;
    
    @Column(name = "NAME_ENG")
    private String nameEng;
    
    @Column(name = "BSN")
    private String bsn;
    
    @Column(name = "HKID")
    private String hkid;
    
    @Column(name = "STB_ID")
    private String stbId;
    
    @Column(name = "ERX_PORT")
    private String erxPort;
    
    @Column(name = "STB_IP")
    private String stbIp;
    
    @Column(name = "SESSION_ID")
    private String sessionId;
    
    @Column(name = "TYPE", nullable = false)
    private String type;
    
    @Column(name = "CAT_III_FLAG", nullable = false)
    private String catIiiFlag;
    
    @Column(name = "ACTIVATION_KEY")
    private String activationKey;
    
    @Column(name = "SERVICE_STARTED_DATE")
    @Temporal(TemporalType.TIMESTAMP)
    private Date serviceStartedDate;
    
    @Column(name = "SERVICE_STARTED_BY")
    private String serviceStartedBy;
    
    @Column(name = "ACTIVATED_DATE")
    @Temporal(TemporalType.TIMESTAMP)
    private Date activatedDate;
    
    @Column(name = "ACTIVATED_BY")
    private String activatedBy;
    
    @Column(name = "FIRST_TC_DATE")
    @Temporal(TemporalType.TIMESTAMP)
    private Date firstTcDate;
    
    @Column(name = "FIRST_TC_BY")
    private String firstTcBy;
    
    @Column(name = "TC_DATE")
    @Temporal(TemporalType.TIMESTAMP)
    private Date tcDate;
    
    @Column(name = "TC_BY")
    private String tcBy;
    
    @Column(name = "BILL_DAY")
    private Short billDay;
    
    @Column(name = "SUSPENDED_DATE")
    @Temporal(TemporalType.TIMESTAMP)
    private Date suspendedDate;
    
    @Column(name = "SUSPENDED_BY")
    private String suspendedBy;
    
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
    
    @Column(name = "TERMINATED_REASON")
    private String terminatedReason;
    
    @Column(name = "STB_LANGUAGE")
    private String stbLanguage;
    
    @Column(name = "DSLAM_UPDATE_FLAG")
    private Character dslamUpdateFlag;
    
    @Column(name = "REMARKS")
    private String remarks;
    
    @Column(name = "CURRENT_LOGIN_TIME")
    @Temporal(TemporalType.TIMESTAMP)
    private Date currentLoginTime;
    
    @Column(name = "LAST_LOGIN_TIME")
    @Temporal(TemporalType.TIMESTAMP)
    private Date lastLoginTime;
    
    @Column(name = "LAST_LOGOUT_TIME")
    @Temporal(TemporalType.TIMESTAMP)
    private Date lastLogoutTime;
    
    @Column(name = "LAST_LOGIN_DURATION")
    private Long lastLoginDuration;
    
    @Column(name = "LAST_STB_ID")
    private String lastStbId;
    
    @Column(name = "LAST_STB_IP")
    private String lastStbIp;
    
    @Column(name = "LAST_SESSION_ID")
    private String lastSessionId;
    
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
    
    @Column(name = "ONHOLD")
    private String onhold;
    
    @Column(name = "ONHOLD_DATE")
    @Temporal(TemporalType.TIMESTAMP)
    private Date onholdDate;
    
    @Column(name = "ENID")
    private String enid;
    
    @Column(name = "NID")
    private String nid;
    
    @Column(name = "ERX_IP")
    private String erxIp;
    
    @Column(name = "MASK_VERSION", nullable = false)
    private BigInteger maskVersion;
    
    @Column(name = "PASSWORD_RESET")
    private Character passwordReset;
    
    @Column(name = "ID_VERIFIED", nullable = false)
    private char idVerified;
    
    @Column(name = "DOB")
    @Temporal(TemporalType.TIMESTAMP)
    private Date dob;
    
    @Column(name = "STB_SID")
    private String stbSid;
    
    @Column(name = "IDTYPE")
    private String idtype;
    
    @Column(name = "FORCE_CHANNEL_MASK_UPDATE")
    private Character forceChannelMaskUpdate;
    
    @Column(name = "FACTORY_RESET")
    private Character factoryReset;
    
    @Column(name = "ACTIVATION_RESET")
    private Character activationReset;
    
    @Column(name = "FIRST_ACTIVATED_DATE")
    @Temporal(TemporalType.TIMESTAMP)
    private Date firstActivatedDate;
    
    @Column(name = "CURRENT_LOGOUT_TIME")
    @Temporal(TemporalType.TIMESTAMP)
    private Date currentLogoutTime;
    
    @Column(name = "CUST_CAT")
    private String custCat;
    
    @Column(name = "STAFF_ID")
    private String staffId;
    
    @Column(name = "SUB_CUST_CAT")
    private String subCustCat;
    
    @Column(name = "SA_TYPE")
    private String saType;
    
    @Column(name = "LINE_RATE")
    private String lineRate;
    
    /*@Column(name = "STB_TYPE")
    private String stbType;*/
    
    @Column(name = "STB_SKIN")
    private String stbSkin;
    
    @Column(name = "TV_TYPE")
    private String tvType;
    
    @Column(name = "SRD")
    @Temporal(TemporalType.TIMESTAMP)
    private Date srd;
    
    @Column(name = "SERVICE_TYPE")
    private String serviceType;
    
    @Column(name = "NEXT_LINE_RATE")
    private String nextLineRate;
    
    @Column(name = "NEXT_TV_TYPE")
    private String nextTvType;
    
    @Column(name = "NEXT_SRD")
    @Temporal(TemporalType.TIMESTAMP)
    private Date nextSrd;
    
    @Column(name = "NEXT_SERVICE_TYPE")
    private String nextServiceType;
    
    @Column(name = "HD_SERVICE_START_DATE")
    @Temporal(TemporalType.TIMESTAMP)
    private Date hdServiceStartDate;
    
    @Column(name = "SERVICE_MODIFIED_DATE")
    @Temporal(TemporalType.TIMESTAMP)
    private Date serviceModifiedDate;
    
    @Column(name = "SERVICE_MODIFIED_BY")
    private String serviceModifiedBy;
    
    @Column(name = "SD_SERVICE_START_DATE")
    @Temporal(TemporalType.TIMESTAMP)
    private Date sdServiceStartDate;
    
    @Column(name="NETWORK_STATUS")
    private String networkStatus;
    
    @Column(name="STATUS")
    private String status;
    
    @Column(name="NUM_STB")
    private BigInteger numStb;
    
    @Column(name="NEXT_NUM_STB")
    private BigInteger nextNumStb;
    
    @Column(name="PENDING_ACTIVATION")
    private String pendingActivation;
    
    @Column(name="NUM_EYE2")
    private BigInteger numEye2;
    
    @Column(name="NEXT_NUM_EYE2")
    private BigInteger nextNumEye2;
    
    @Column(name="NUM_VSTB")
    private BigInteger numVstb;
    
    @Column(name="NEXT_NUM_VSTB")
    private BigInteger nextNumVstb;
    
    @Column(name="EYE2_DEFAULT_MODE")
    private String eye2DefaultMode;
    
    @Column(name="EYE2_MODE")
    private String eye2Mode;
    
    @Column(name="VSTB_TYPE")
    private String vstbType;
    
    @Column(name="NEXT_VSTB_TYPE")
    private String nextVstbType;
    
    @Column(name="SERVICE_STATUS")
    private String serviceStatus;
    
    @Column(name="NOSS_LINE_TYPE")
    private String nossLineType;
    
    @Column(name="NOSS_LINE_RATE")
    private String nossLineRate;
    
    @Column(name="NOSS_LINE_RATE_RESET")
    private String nossLineRateReset;
    
    @Column(name="CUSTOMER_TYPE")
    private String customerType;
    
    public BigInteger getNumStb() {
		return numStb;
	}

	public void setNumStb(BigInteger numStb) {
		this.numStb = numStb;
	}

	public BigInteger getNextNumStb() {
		return nextNumStb;
	}

	public void setNextNumStb(BigInteger nextNumStb) {
		this.nextNumStb = nextNumStb;
	}

	public String getPendingActivation() {
		return pendingActivation;
	}

	public void setPendingActivation(String pendingActivation) {
		this.pendingActivation = pendingActivation;
	}

	public BigInteger getNumEye2() {
		return numEye2;
	}

	public void setNumEye2(BigInteger numEye2) {
		this.numEye2 = numEye2;
	}

	public BigInteger getNextNumEye2() {
		return nextNumEye2;
	}

	public void setNextNumEye2(BigInteger nextNumEye2) {
		this.nextNumEye2 = nextNumEye2;
	}

	public Profile() {
    }

    public Profile(String fsa) {
        this.fsa = fsa;
    }

    public Profile(String fsa, String type, String catIiiFlag, Date createdDate, String createdBy, BigInteger maskVersion, char idVerified, String status, String networkStatus) {
        this.fsa = fsa;
        this.type = type;
        this.catIiiFlag = catIiiFlag;
        this.createdDate = createdDate;
        this.createdBy = createdBy;
        this.maskVersion = maskVersion;
        this.idVerified = idVerified;
        this.catIiiFlag = catIiiFlag;
        this.status = status;
        this.networkStatus = networkStatus;
    }

    public String getFsa() {
        return fsa;
    }

    public void setFsa(String fsa) {
        this.fsa = fsa;
    }

    public String getNameChi() {
        return nameChi;
    }

    public void setNameChi(String nameChi) {
        this.nameChi = nameChi;
    }

    public String getNameEng() {
        return nameEng;
    }

    public void setNameEng(String nameEng) {
        this.nameEng = nameEng;
    }

    public String getBsn() {
        return bsn;
    }

    public void setBsn(String bsn) {
        this.bsn = bsn;
    }

    public String getHkid() {
        return hkid;
    }

    public void setHkid(String hkid) {
        this.hkid = hkid;
    }

    public String getStbId() {
        return stbId;
    }

    public void setStbId(String stbId) {
        this.stbId = stbId;
    }

    public String getErxPort() {
        return erxPort;
    }

    public void setErxPort(String erxPort) {
        this.erxPort = erxPort;
    }

    public String getStbIp() {
        return stbIp;
    }

    public void setStbIp(String stbIp) {
        this.stbIp = stbIp;
    }

    public String getSessionId() {
        return sessionId;
    }

    public void setSessionId(String sessionId) {
        this.sessionId = sessionId;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getCatIiiFlag() {
        return catIiiFlag;
    }

    public void setCatIiiFlag(String catIiiFlag) {
        this.catIiiFlag = catIiiFlag;
    }

    public String getActivationKey() {
        return activationKey;
    }

    public void setActivationKey(String activationKey) {
        this.activationKey = activationKey;
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

    public Date getActivatedDate() {
        return activatedDate;
    }

    public void setActivatedDate(Date activatedDate) {
        this.activatedDate = activatedDate;
    }

    public String getActivatedBy() {
        return activatedBy;
    }

    public void setActivatedBy(String activatedBy) {
        this.activatedBy = activatedBy;
    }

    public Date getFirstTcDate() {
        return firstTcDate;
    }

    public void setFirstTcDate(Date firstTcDate) {
        this.firstTcDate = firstTcDate;
    }

    public String getFirstTcBy() {
        return firstTcBy;
    }

    public void setFirstTcBy(String firstTcBy) {
        this.firstTcBy = firstTcBy;
    }

    public Date getTcDate() {
        return tcDate;
    }

    public void setTcDate(Date tcDate) {
        this.tcDate = tcDate;
    }

    public String getTcBy() {
        return tcBy;
    }

    public void setTcBy(String tcBy) {
        this.tcBy = tcBy;
    }

    public Short getBillDay() {
        return billDay;
    }

    public void setBillDay(Short billDay) {
        this.billDay = billDay;
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

    public String getTerminatedReason() {
        return terminatedReason;
    }

    public void setTerminatedReason(String terminatedReason) {
        this.terminatedReason = terminatedReason;
    }

    public String getStbLanguage() {
        return stbLanguage;
    }

    public void setStbLanguage(String stbLanguage) {
        this.stbLanguage = stbLanguage;
    }

    public Character getDslamUpdateFlag() {
        return dslamUpdateFlag;
    }

    public void setDslamUpdateFlag(Character dslamUpdateFlag) {
        this.dslamUpdateFlag = dslamUpdateFlag;
    }

    public String getRemarks() {
        return remarks;
    }

    public void setRemarks(String remarks) {
        this.remarks = remarks;
    }

    public Date getCurrentLoginTime() {
        return currentLoginTime;
    }

    public void setCurrentLoginTime(Date currentLoginTime) {
        this.currentLoginTime = currentLoginTime;
    }

    public Date getLastLoginTime() {
        return lastLoginTime;
    }

    public void setLastLoginTime(Date lastLoginTime) {
        this.lastLoginTime = lastLoginTime;
    }

    public Date getLastLogoutTime() {
        return lastLogoutTime;
    }

    public void setLastLogoutTime(Date lastLogoutTime) {
        this.lastLogoutTime = lastLogoutTime;
    }

    public Long getLastLoginDuration() {
        return lastLoginDuration;
    }

    public void setLastLoginDuration(Long lastLoginDuration) {
        this.lastLoginDuration = lastLoginDuration;
    }

    public String getLastStbId() {
        return lastStbId;
    }

    public void setLastStbId(String lastStbId) {
        this.lastStbId = lastStbId;
    }

    public String getLastStbIp() {
        return lastStbIp;
    }

    public void setLastStbIp(String lastStbIp) {
        this.lastStbIp = lastStbIp;
    }

    public String getLastSessionId() {
        return lastSessionId;
    }

    public void setLastSessionId(String lastSessionId) {
        this.lastSessionId = lastSessionId;
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

    public String getOnhold() {
        return onhold;
    }

    public void setOnhold(String onhold) {
        this.onhold = onhold;
    }

    public Date getOnholdDate() {
        return onholdDate;
    }

    public void setOnholdDate(Date onholdDate) {
        this.onholdDate = onholdDate;
    }

    public String getEnid() {
        return enid;
    }

    public void setEnid(String enid) {
        this.enid = enid;
    }

    public String getNid() {
        return nid;
    }

    public void setNid(String nid) {
        this.nid = nid;
    }

    public String getErxIp() {
        return erxIp;
    }

    public void setErxIp(String erxIp) {
        this.erxIp = erxIp;
    }

    public BigInteger getMaskVersion() {
        return maskVersion;
    }

    public void setMaskVersion(BigInteger maskVersion) {
        this.maskVersion = maskVersion;
    }

    public Character getPasswordReset() {
        return passwordReset;
    }

    public void setPasswordReset(Character passwordReset) {
        this.passwordReset = passwordReset;
    }

    public char getIdVerified() {
        return idVerified;
    }

    public void setIdVerified(char idVerified) {
        this.idVerified = idVerified;
    }

    public Date getDob() {
        return dob;
    }

    public void setDob(Date dob) {
        this.dob = dob;
    }

    public String getStbSid() {
        return stbSid;
    }

    public void setStbSid(String stbSid) {
        this.stbSid = stbSid;
    }

    public String getIdtype() {
        return idtype;
    }

    public void setIdtype(String idtype) {
        this.idtype = idtype;
    }

    public Character getForceChannelMaskUpdate() {
        return forceChannelMaskUpdate;
    }

    public void setForceChannelMaskUpdate(Character forceChannelMaskUpdate) {
        this.forceChannelMaskUpdate = forceChannelMaskUpdate;
    }

    public Character getFactoryReset() {
        return factoryReset;
    }

    public void setFactoryReset(Character factoryReset) {
        this.factoryReset = factoryReset;
    }

    public Character getActivationReset() {
        return activationReset;
    }

    public void setActivationReset(Character activationReset) {
        this.activationReset = activationReset;
    }

    public Date getFirstActivatedDate() {
        return firstActivatedDate;
    }

    public void setFirstActivatedDate(Date firstActivatedDate) {
        this.firstActivatedDate = firstActivatedDate;
    }

    public Date getCurrentLogoutTime() {
        return currentLogoutTime;
    }

    public void setCurrentLogoutTime(Date currentLogoutTime) {
        this.currentLogoutTime = currentLogoutTime;
    }

    public String getCustCat() {
        return custCat;
    }

    public void setCustCat(String custCat) {
        this.custCat = custCat;
    }

    public String getStaffId() {
        return staffId;
    }

    public void setStaffId(String staffId) {
        this.staffId = staffId;
    }

    public String getSubCustCat() {
        return subCustCat;
    }

    public void setSubCustCat(String subCustCat) {
        this.subCustCat = subCustCat;
    }

    public String getSaType() {
        return saType;
    }

    public void setSaType(String saType) {
        this.saType = saType;
    }

    public String getLineRate() {
        return lineRate;
    }

    public void setLineRate(String lineRate) {
        this.lineRate = lineRate;
    }

    /*
    public String getStbType() {
        return stbType;
    }

    public void setStbType(String stbType) {
        this.stbType = stbType;
    }*/

    public String getStbSkin() {
        return stbSkin;
    }

    public void setStbSkin(String stbSkin) {
        this.stbSkin = stbSkin;
    }

    public String getTvType() {
        return tvType;
    }

    public void setTvType(String tvType) {
        this.tvType = tvType;
    }

    public Date getSrd() {
        return srd;
    }

    public void setSrd(Date srd) {
        this.srd = srd;
    }

    public String getServiceType() {
        return serviceType;
    }

    public void setServiceType(String serviceType) {
        this.serviceType = serviceType;
    }

    public String getNextLineRate() {
        return nextLineRate;
    }

    public void setNextLineRate(String nextLineRate) {
        this.nextLineRate = nextLineRate;
    }

    public String getNextTvType() {
        return nextTvType;
    }

    public void setNextTvType(String nextTvType) {
        this.nextTvType = nextTvType;
    }

    public Date getNextSrd() {
        return nextSrd;
    }

    public void setNextSrd(Date nextSrd) {
        this.nextSrd = nextSrd;
    }

    public String getNextServiceType() {
        return nextServiceType;
    }

    public void setNextServiceType(String nextServiceType) {
        this.nextServiceType = nextServiceType;
    }

    public Date getHdServiceStartDate() {
        return hdServiceStartDate;
    }

    public void setHdServiceStartDate(Date hdServiceStartDate) {
        this.hdServiceStartDate = hdServiceStartDate;
    }

    public Date getServiceModifiedDate() {
        return serviceModifiedDate;
    }

    public void setServiceModifiedDate(Date serviceModifiedDate) {
        this.serviceModifiedDate = serviceModifiedDate;
    }

    public String getServiceModifiedBy() {
        return serviceModifiedBy;
    }

    public void setServiceModifiedBy(String serviceModifiedBy) {
        this.serviceModifiedBy = serviceModifiedBy;
    }

    public Date getSdServiceStartDate() {
        return sdServiceStartDate;
    }

    public void setSdServiceStartDate(Date sdServiceStartDate) {
        this.sdServiceStartDate = sdServiceStartDate;
    }
    
    /*
    public Collection<ViChannelLogExportT> getViChannelLogExportTCollection() {
        return viChannelLogExportTCollection;
    }

    public void setViChannelLogExportTCollection(Collection<ViChannelLogExportT> viChannelLogExportTCollection) {
        this.viChannelLogExportTCollection = viChannelLogExportTCollection;
    }*/

    /*
    public ViDvdBuynT getCustomerType() {
        return customerType;
    }

    public void setCustomerType(ViDvdBuynT customerType) {
        this.customerType = customerType;
    }

    public Status getStatus() {
        return status;
    }

    public void setStatus(Status status) {
        this.status = status;
    }

    public Status getNetworkStatus() {
        return networkStatus;
    }

    public void setNetworkStatus(Status networkStatus) {
        this.networkStatus = networkStatus;
    }
    */
    /*
    public Collection<ViBakPostdatedOrderT> getViBakPostdatedOrderTCollection() {
        return viBakPostdatedOrderTCollection;
    }

    public void setViBakPostdatedOrderTCollection(Collection<ViBakPostdatedOrderT> viBakPostdatedOrderTCollection) {
        this.viBakPostdatedOrderTCollection = viBakPostdatedOrderTCollection;
    }

    public Collection<SubscribedPlan> getViSubPlanTCollection() {
        return viSubPlanTCollection;
    }

    public void setViSubPlanTCollection(Collection<SubscribedPlan> viSubPlanTCollection) {
        this.viSubPlanTCollection = viSubPlanTCollection;
    }

    public Collection<ViPtosT> getViPtosTCollection() {
        return viPtosTCollection;
    }

    public void setViPtosTCollection(Collection<ViPtosT> viPtosTCollection) {
        this.viPtosTCollection = viPtosTCollection;
    }

    public Collection<ViSubTxnT> getViSubTxnTCollection() {
        return viSubTxnTCollection;
    }

    public void setViSubTxnTCollection(Collection<ViSubTxnT> viSubTxnTCollection) {
        this.viSubTxnTCollection = viSubTxnTCollection;
    }

    public Collection<ViPostdatedOrderT> getViPostdatedOrderTCollection() {
        return viPostdatedOrderTCollection;
    }

    public void setViPostdatedOrderTCollection(Collection<ViPostdatedOrderT> viPostdatedOrderTCollection) {
        this.viPostdatedOrderTCollection = viPostdatedOrderTCollection;
    }

    public Collection<ViVodLogExportT> getViVodLogExportTCollection() {
        return viVodLogExportTCollection;
    }

    public void setViVodLogExportTCollection(Collection<ViVodLogExportT> viVodLogExportTCollection) {
        this.viVodLogExportTCollection = viVodLogExportTCollection;
    }

    public Collection<ViRentalTxnT> getViRentalTxnTCollection() {
        return viRentalTxnTCollection;
    }

    public void setViRentalTxnTCollection(Collection<ViRentalTxnT> viRentalTxnTCollection) {
        this.viRentalTxnTCollection = viRentalTxnTCollection;
    }

    public Collection<ViAdjustmentT> getViAdjustmentTCollection() {
        return viAdjustmentTCollection;
    }

    public void setViAdjustmentTCollection(Collection<ViAdjustmentT> viAdjustmentTCollection) {
        this.viAdjustmentTCollection = viAdjustmentTCollection;
    }*/

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}
    
	public BigInteger getNumVstb() {
		return numVstb;
	}

	public void setNumVstb(BigInteger numVstb) {
		this.numVstb = numVstb;
	}

	public BigInteger getNextNumVstb() {
		return nextNumVstb;
	}

	public void setNextNumVstb(BigInteger nextNumVstb) {
		this.nextNumVstb = nextNumVstb;
	}

	public String getEye2DefaultMode() {
		return eye2DefaultMode;
	}

	public void setEye2DefaultMode(String eye2DefaultMode) {
		this.eye2DefaultMode = eye2DefaultMode;
	}

	public String getEye2Mode() {
		return eye2Mode;
	}

	public void setEye2Mode(String eye2Mode) {
		this.eye2Mode = eye2Mode;
	}

	public String getVstbType() {
		return vstbType;
	}

	public void setVstbType(String vstbType) {
		this.vstbType = vstbType;
	}

	public String getNextVstbType() {
		return nextVstbType;
	}

	public void setNextVstbType(String nextVstbType) {
		this.nextVstbType = nextVstbType;
	}

	public String getServiceStatus() {
		return serviceStatus;
	}

	public void setServiceStatus(String serviceStatus) {
		this.serviceStatus = serviceStatus;
	}

	public String getNossLineType() {
		return nossLineType;
	}

	public void setNossLineType(String nossLineType) {
		this.nossLineType = nossLineType;
	}

	public String getNossLineRate() {
		return nossLineRate;
	}

	public void setNossLineRate(String nossLineRate) {
		this.nossLineRate = nossLineRate;
	}

	public String getNossLineRateReset() {
		return nossLineRateReset;
	}

	public void setNossLineRateReset(String nossLineRateReset) {
		this.nossLineRateReset = nossLineRateReset;
	}
	
	public String getCustomerType() {
		return customerType;
	}
	
	public void setCustomerType(String customerType) {
		this.customerType = customerType;
	}
	
	@Override
    public int hashCode() {
        int hash = 0;
        hash += (fsa != null ? fsa.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Profile)) {
            return false;
        }
        Profile other = (Profile) object;
        if ((this.fsa == null && other.fsa != null) || (this.fsa != null && !this.fsa.equals(other.fsa))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "javaapplication1.ViProfileT[fsa=" + fsa + "]";
    }

	public String getNetworkStatus() {
		return networkStatus;
	}

	public void setNetworkStatus(String networkStatus) {
		this.networkStatus = networkStatus;
	}



}
