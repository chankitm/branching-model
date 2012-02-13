/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package ims.vi.common.bean;

import ims.vi.common.utils.ObjectUtils;

import java.io.Serializable;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.persistence.Transient;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

import org.apache.commons.lang.StringUtils;

/**
 *
 * @author Alex
 */
@Entity
@Table(name = "VI_PLAN_T")
@XmlType(name = "Plan", namespace = "http://www.pccw.com/")
@XmlRootElement(name = "Plan", namespace = "http://www.pccw.com/")
public class Plan implements Serializable {
    private static final long serialVersionUID = 1L;
    public static final String ALLFIELDS = " p.PLAN_CODE AS P_PLAN_CODE,p.NAME_CHI AS P_NAME_CHI,p.NAME_ENG AS P_NAME_ENG," +
    		"p.DESC_CHI AS P_DESC_CHI,p.DESC_ENG AS P_DESC_ENG,p.STATUS AS P_STATUS," +
    		"p.PLAN_TYPE AS P_PLAN_TYPE,p.PLAN_CLASS AS P_PLAN_CLASS,p.PLAN_LEVEL AS P_PLAN_LEVEL," +
    		"p.CYCLE_TYPE_ID AS P_CYCLE_TYPE_ID,p.CYCLE_PERIOD AS P_CYCLE_PERIOD,p.EFFECTIVE_DATE AS P_EFFECTIVE_DATE," +
    		"p.EXPIRATION_DATE AS P_EXPIRATION_DATE,p.BASIC_PRICE AS P_BASIC_PRICE,p.BASIC_PRICE_EFFECTIVE_DATE " +
    		"AS P_BASIC_PRICE_EFFECTIVE_DATE,p.FINANCIAL_CODE AS P_FINANCIAL_CODE,p.SMS_PRODUCT_ID " +
    		"AS P_SMS_PRODUCT_ID,p.TEXT AS P_TEXT,p.CP_ID AS P_CP_ID,p.TERM_PLAN AS P_TERM_PLAN,p.TERM_PERIOD " +
    		"AS P_TERM_PERIOD,p.CHI_SYNOPSIS AS P_CHI_SYNOPSIS,p.ENG_SYNOPSIS AS P_ENG_SYNOPSIS,p.CHI_SHORT_NAME " +
    		"AS P_CHI_SHORT_NAME,p.ENG_SHORT_NAME AS P_ENG_SHORT_NAME,p.BILL_PLAN_NAME_CHI AS P_BILL_PLAN_NAME_CHI," +
    		"p.BILL_PLAN_NAME_ENG AS P_BILL_PLAN_NAME_ENG,p.MODIFIED_DATE AS P_MODIFIED_DATE,p.MODIFIED_BY AS P_MODIFIED_BY," +
    		"p.CREATED_DATE AS P_CREATED_DATE,p.CREATED_BY AS P_CREATED_BY,p.PACKAGE_NAME_ENG AS P_PACKAGE_NAME_ENG," +
    		"p.PACKAGE_NAME_CHI AS P_PACKAGE_NAME_CHI,p.MULTI_CHANNEL AS P_MULTI_CHANNEL,p.SPECIAL_FLAG AS P_SPECIAL_FLAG," +
    		"p.CHARGE_START_DATE AS P_CHARGE_START_DATE,p.SEASON_END_DATE AS P_SEASON_END_DATE,p.SEASONAL AS P_SEASONAL," +
    		"p.CHANGE_PENALTY_WAIVED AS P_CHANGE_PENALTY_WAIVED,p.UNSUB_PENALTY_WAIVED AS P_UNSUB_PENALTY_WAIVED,p.TERM_ALIAS " +
    		"AS P_TERM_ALIAS,p.MKT_SCHEME AS P_MKT_SCHEME,p.NOT_VIEW_AS_FREE AS P_NOT_VIEW_AS_FREE,p.CANNOT_SUB AS P_CANNOT_SUB," +
    		"p.IS_FREE_X AS P_IS_FREE_X,p.CALL_NOSS AS P_CALL_NOSS,p.SEND_BOSS AS P_SEND_BOSS,p.PLAN_GROUP AS P_PLAN_GROUP," +
    		"p.REG_START_DATE AS P_REG_START_DATE,p.REG_END_DATE AS P_REG_END_DATE,p.DEPENDENCY AS P_DEPENDENCY,p.IS_COMMERCIAL AS " +
    		"P_IS_COMMERCIAL,p.VOD_FLAG AS P_VOD_FLAG,p.VOD_LIBRARY_ID AS P_VOD_LIBRARY_ID,p.VOD_BUYTHRU_CHANNELS AS P_VOD_BUYTHRU_CHANNELS," +
    		"p.SERVICE_IND AS P_SERVICE_IND,p.IS_FREE AS P_IS_FREE,p.QUOTA AS P_QUOTA,p.SERVICE_TYPE AS P_SERVICE_TYPE,p.DEPEND_GROUP " +
    		"AS P_DEPEND_GROUP,p.IS_DTT AS P_IS_DTT,p.IS_2NDBOX_SUB_FILTER AS P_IS_2NDBOX_SUB_FILTER, p.FILTER_TYPE AS P_FILTER_TYPE ";
    @Id
    @Column(name = "PLAN_CODE", nullable = false)
    private String planCode;
    
    @Column(name = "NAME_CHI", nullable = false)
    private String nameChi;
    
    @Column(name = "NAME_ENG", nullable = false)
    private String nameEng;
    
    @Column(name = "DESC_CHI")
    private String descChi;
    
    @Column(name = "DESC_ENG")
    private String descEng;
    
    @Column(name = "CYCLE_TYPE_ID")
    private Integer cycleTypeId;
    
    @Column(name = "CYCLE_PERIOD")
    private Long cyclePeriod;
    
    @Column(name = "EFFECTIVE_DATE", nullable = false)
    @Temporal(TemporalType.TIMESTAMP)
    private Date effectiveDate;
    
    @Column(name = "EXPIRATION_DATE")
    @Temporal(TemporalType.TIMESTAMP)
    private Date expirationDate;
    
    @Column(name = "BASIC_PRICE", nullable = false)
    private BigDecimal basicPrice;
    
    @Column(name = "BASIC_PRICE_EFFECTIVE_DATE", nullable = false)
    @Temporal(TemporalType.TIMESTAMP)
    private Date basicPriceEffectiveDate;
    
    @Column(name = "SMS_PRODUCT_ID")
    private String smsProductId;
    
    @Column(name = "TEXT")
    private String text;
    
    @Column(name = "TERM_PLAN")
    private Character termPlan;
    
    @Column(name = "TERM_PERIOD")
    private Short termPeriod;
    
    @Column(name = "CHI_SYNOPSIS")
    private String chiSynopsis;
    
    @Column(name = "ENG_SYNOPSIS")
    private String engSynopsis;
    
    @Column(name = "CHI_SHORT_NAME")
    private String chiShortName;
    
    @Column(name = "ENG_SHORT_NAME")
    private String engShortName;
    
    @Column(name = "BILL_PLAN_NAME_CHI", nullable = false)
    private String billPlanNameChi;
    
    @Column(name = "BILL_PLAN_NAME_ENG", nullable = false)
    private String billPlanNameEng;
    
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
    
    @Column(name = "PACKAGE_NAME_ENG")
    private String packageNameEng;
    
    @Column(name = "PACKAGE_NAME_CHI")
    private String packageNameChi;
    
    @Column(name = "MULTI_CHANNEL", nullable = false)
    private char multiChannel;
    
    @Column(name = "SPECIAL_FLAG")
    private Character specialFlag;
    
    @Column(name = "CHARGE_START_DATE")
    @Temporal(TemporalType.TIMESTAMP)
    private Date chargeStartDate;
    
    @Column(name = "SEASON_END_DATE")
    @Temporal(TemporalType.TIMESTAMP)
    private Date seasonEndDate;
    
    @Column(name = "SEASONAL")
    private Character seasonal;
    
    @Column(name = "CHANGE_PENALTY_WAIVED")
    private Character changePenaltyWaived;
    
    @Column(name = "UNSUB_PENALTY_WAIVED")
    private Character unsubPenaltyWaived;
    
    @Column(name = "TERM_ALIAS")
    private String termAlias;
    
    @Column(name = "MKT_SCHEME")
    private String mktScheme;
    
    @Column(name = "NOT_VIEW_AS_FREE")
    private Character notViewAsFree;
    
    @Column(name = "CANNOT_SUB")
    private Character cannotSub;
    
    @Column(name = "IS_FREE_X")
    private Character isFreeX;
    
    @Column(name = "CALL_NOSS")
    private Character callNoss;
    
    @Column(name = "SEND_BOSS")
    private Character sendBoss;
    
    @Column(name = "PLAN_GROUP")
    private String planGroup;
    
    @Column(name = "REG_START_DATE")
    @Temporal(TemporalType.TIMESTAMP)
    private Date regStartDate;
    
    @Column(name = "REG_END_DATE")
    @Temporal(TemporalType.TIMESTAMP)
    private Date regEndDate;
    
    @Column(name = "DEPENDENCY")
    private Character dependency;
    
    @Column(name = "IS_COMMERCIAL")
    private Character isCommercial;
    
    @Column(name = "VOD_FLAG")
    private Character vodFlag;
    
    @Column(name = "VOD_LIBRARY_ID")
    private String vodLibraryId;
    
    @Column(name = "VOD_BUYTHRU_CHANNELS")
    private String vodBuythruChannels;
    
    @Column(name = "SERVICE_IND")
    private String serviceInd;
    
    @Column(name = "IS_FREE")
    private String isFree;
    
    @Column(name = "QUOTA")
    private BigInteger quota;
    
    @Column(name = "SERVICE_TYPE")
    private String serviceType;
    
    @Column(name = "DEPEND_GROUP")
    private String dependGroup;
    
    @Column(name = "IS_DTT", nullable = false)
    private Character isDtt;
    
    @Transient
    private Package planPackage;
        
    @Column(name = "CP_ID")
    private String cpId;
    
    @Column(name = "FINANCIAL_CODE")
    private String financialCode;
    
    @Column(name = "PLAN_CLASS")
    private String planClass;
    
    @Column(name = "PLAN_LEVEL")
    private String planLevel;
    
    @Column(name = "PLAN_TYPE")
    private String planType;
    
	@Column(name = "STATUS")
    private String status;

	@Column(name = "IS_2NDBOX_SUB_FILTER")
    private String is2ndboxSubFilter;
    
	@Column(name = "FILTER_TYPE")
    private String filterType;
	
    public String getIs2ndboxSubFilter() {
		return is2ndboxSubFilter;
	}

	public void setIs2ndboxSubFilter(String is2ndboxSubFilter) {
		this.is2ndboxSubFilter = is2ndboxSubFilter;
	}

	public String getFilterType() {
		return filterType;
	}

	public void setFilterType(String filterType) {
		this.filterType = filterType;
	}

	public Plan() {
    }

    public Plan(String planCode) {
        this.planCode = planCode;
    }

    public Plan(String planCode, String nameChi, String nameEng, Date effectiveDate, BigDecimal basicPrice, Date basicPriceEffectiveDate, String billPlanNameChi, String billPlanNameEng, Date createdDate, String createdBy, char multiChannel) {
        this.planCode = planCode;
        this.nameChi = nameChi;
        this.nameEng = nameEng;
        this.effectiveDate = effectiveDate;
        this.basicPrice = basicPrice;
        this.basicPriceEffectiveDate = basicPriceEffectiveDate;
        this.billPlanNameChi = billPlanNameChi;
        this.billPlanNameEng = billPlanNameEng;
        this.createdDate = createdDate;
        this.createdBy = createdBy;
        this.multiChannel = multiChannel;
    }

    public String getPlanCode() {
        return planCode;
    }

    public void setPlanCode(String planCode) {
        this.planCode = planCode;
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

    public String getDescChi() {
        return descChi;
    }

    public void setDescChi(String descChi) {
        this.descChi = descChi;
    }

    public String getDescEng() {
        return descEng;
    }

    public void setDescEng(String descEng) {
        this.descEng = descEng;
    }

    public Integer getCycleTypeId() {
        return cycleTypeId;
    }

    public void setCycleTypeId(Integer cycleTypeId) {
        this.cycleTypeId = cycleTypeId;
    }

    public Long getCyclePeriod() {
        return cyclePeriod;
    }

    public void setCyclePeriod(Long cyclePeriod) {
        this.cyclePeriod = cyclePeriod;
    }

    public Date getEffectiveDate() {
        return effectiveDate;
    }

    public void setEffectiveDate(Date effectiveDate) {
        this.effectiveDate = effectiveDate;
    }

    public Date getExpirationDate() {
        return expirationDate;
    }

    public void setExpirationDate(Date expirationDate) {
        this.expirationDate = expirationDate;
    }

    public BigDecimal getBasicPrice() {
        return basicPrice;
    }

    public void setBasicPrice(BigDecimal basicPrice) {
        this.basicPrice = basicPrice;
    }

    public Date getBasicPriceEffectiveDate() {
        return basicPriceEffectiveDate;
    }

    public void setBasicPriceEffectiveDate(Date basicPriceEffectiveDate) {
        this.basicPriceEffectiveDate = basicPriceEffectiveDate;
    }

    public String getSmsProductId() {
        return smsProductId;
    }

    public void setSmsProductId(String smsProductId) {
        this.smsProductId = smsProductId;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public Character getTermPlan() {
        return termPlan;
    }

    public void setTermPlan(Character termPlan) {
        this.termPlan = termPlan;
    }

    public Short getTermPeriod() {
        return termPeriod;
    }

    public void setTermPeriod(Short termPeriod) {
        this.termPeriod = termPeriod;
    }

    public String getChiSynopsis() {
        return chiSynopsis;
    }

    public void setChiSynopsis(String chiSynopsis) {
        this.chiSynopsis = chiSynopsis;
    }

    public String getEngSynopsis() {
        return engSynopsis;
    }

    public void setEngSynopsis(String engSynopsis) {
        this.engSynopsis = engSynopsis;
    }

    public String getChiShortName() {
        return chiShortName;
    }

    public void setChiShortName(String chiShortName) {
        this.chiShortName = chiShortName;
    }

    public String getEngShortName() {
        return engShortName;
    }

    public void setEngShortName(String engShortName) {
        this.engShortName = engShortName;
    }

    public String getBillPlanNameChi() {
        return billPlanNameChi;
    }

    public void setBillPlanNameChi(String billPlanNameChi) {
        this.billPlanNameChi = billPlanNameChi;
    }

    public String getBillPlanNameEng() {
        return billPlanNameEng;
    }

    public void setBillPlanNameEng(String billPlanNameEng) {
        this.billPlanNameEng = billPlanNameEng;
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

    public String getPackageNameEng() {
        return packageNameEng;
    }

    public void setPackageNameEng(String packageNameEng) {
        this.packageNameEng = packageNameEng;
    }

    public String getPackageNameChi() {
        return packageNameChi;
    }

    public void setPackageNameChi(String packageNameChi) {
        this.packageNameChi = packageNameChi;
    }

    public char getMultiChannel() {
        return multiChannel;
    }

    public void setMultiChannel(char multiChannel) {
        this.multiChannel = multiChannel;
    }

    public Character getSpecialFlag() {
        return specialFlag;
    }

    public void setSpecialFlag(Character specialFlag) {
        this.specialFlag = specialFlag;
    }

    public Date getChargeStartDate() {
        return chargeStartDate;
    }

    public void setChargeStartDate(Date chargeStartDate) {
        this.chargeStartDate = chargeStartDate;
    }

    public Date getSeasonEndDate() {
        return seasonEndDate;
    }

    public void setSeasonEndDate(Date seasonEndDate) {
        this.seasonEndDate = seasonEndDate;
    }

    public Character getSeasonal() {
        return seasonal;
    }

    public void setSeasonal(Character seasonal) {
        this.seasonal = seasonal;
    }

    public Character getChangePenaltyWaived() {
        return changePenaltyWaived;
    }

    public void setChangePenaltyWaived(Character changePenaltyWaived) {
        this.changePenaltyWaived = changePenaltyWaived;
    }

    public Character getUnsubPenaltyWaived() {
        return unsubPenaltyWaived;
    }

    public void setUnsubPenaltyWaived(Character unsubPenaltyWaived) {
        this.unsubPenaltyWaived = unsubPenaltyWaived;
    }

    public String getTermAlias() {
        return termAlias;
    }

    public void setTermAlias(String termAlias) {
        this.termAlias = termAlias;
    }

    public String getMktScheme() {
        return mktScheme;
    }

    public void setMktScheme(String mktScheme) {
        this.mktScheme = mktScheme;
    }

    public Character getNotViewAsFree() {
        return notViewAsFree;
    }

    public void setNotViewAsFree(Character notViewAsFree) {
        this.notViewAsFree = notViewAsFree;
    }

    public Character getCannotSub() {
        return cannotSub;
    }

    public void setCannotSub(Character cannotSub) {
        this.cannotSub = cannotSub;
    }

    public Character getIsFreeX() {
        return isFreeX;
    }

    public void setIsFreeX(Character isFreeX) {
        this.isFreeX = isFreeX;
    }

    public Character getCallNoss() {
        return callNoss;
    }

    public void setCallNoss(Character callNoss) {
        this.callNoss = callNoss;
    }

    public Character getSendBoss() {
        return sendBoss;
    }

    public void setSendBoss(Character sendBoss) {
        this.sendBoss = sendBoss;
    }

    public String getPlanGroup() {
        return planGroup;
    }

    public void setPlanGroup(String planGroup) {
        this.planGroup = planGroup;
    }

    public Date getRegStartDate() {
        return regStartDate;
    }

    public void setRegStartDate(Date regStartDate) {
        this.regStartDate = regStartDate;
    }

    public Date getRegEndDate() {
        return regEndDate;
    }

    public void setRegEndDate(Date regEndDate) {
        this.regEndDate = regEndDate;
    }

    public Character getDependency() {
        return dependency;
    }

    public void setDependency(Character dependency) {
        this.dependency = dependency;
    }

    public Character getIsCommercial() {
        return isCommercial;
    }

    public void setIsCommercial(Character isCommercial) {
        this.isCommercial = isCommercial;
    }

    public Character getVodFlag() {
        return vodFlag;
    }

    public void setVodFlag(Character vodFlag) {
        this.vodFlag = vodFlag;
    }

    public String getVodLibraryId() {
        return vodLibraryId;
    }

    public void setVodLibraryId(String vodLibraryId) {
        this.vodLibraryId = vodLibraryId;
    }

    public String getVodBuythruChannels() {
        return vodBuythruChannels;
    }

    public void setVodBuythruChannels(String vodBuythruChannels) {
        this.vodBuythruChannels = vodBuythruChannels;
    }

    public String getServiceInd() {
        return serviceInd;
    }

    public void setServiceInd(String serviceInd) {
        this.serviceInd = serviceInd;
    }

    public String getIsFree() {
        return isFree;
    }

    public void setIsFree(String isFree) {
        this.isFree = isFree;
    }

    public BigInteger getQuota() {
        return quota;
    }

    public void setQuota(BigInteger quota) {
        this.quota = quota;
    }

    public String getServiceType() {
        return serviceType;
    }

    public void setServiceType(String serviceType) {
        this.serviceType = serviceType;
    }

    public String getDependGroup() {
        return dependGroup;
    }

    public void setDependGroup(String dependGroup) {
        this.dependGroup = dependGroup;
    }
   
    
    public String getCpId() {
        return cpId;
    }

    public void setCpId(String cpId) {
        this.cpId = cpId;
    }

    public String getFinancialCode() {
        return financialCode;
    }

    public void setFinancialCode(String financialCode) {
        this.financialCode = financialCode;
    }

    public String getPlanClass() {
        return planClass;
    }

    public void setPlanClass(String planClass) {
        this.planClass = planClass;
    }

    public String getPlanLevel() {
        return planLevel;
    }

    public void setPlanLevel(String planLevel) {
        this.planLevel = planLevel;
    }

    public String getPlanType() {
        return planType;
    }

    public void setPlanType(String planType) {
        this.planType = planType;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (planCode != null ? planCode.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Plan)) {
            return false;
        }
        Plan other = (Plan) object;
        if ((this.planCode == null && other.planCode != null) || (this.planCode != null && !this.planCode.equals(other.planCode))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "javaapplication1.ViPlanT[planCode=" + planCode + "]";
    }

    @Transient
	public Package getPackage() {
		return planPackage;
	}

    @Transient
	public void setPackage(Package planPackage) {
		this.planPackage = planPackage;
	}
    
    @Transient
    public <T extends Package> T getPackage(Class<T> packageClass){
    	return ObjectUtils.safeCast(packageClass, this.planPackage);
    }
    
    @Transient
    public boolean isServicePlan(){
    	return !StringUtils.isEmpty(this.getServiceInd());    	
    }
    
    @Transient
    public boolean isVodPlan(){
    	if (this.getVodFlag()==null){
    		return false;
    	}
    	return "Y".equalsIgnoreCase(this.getVodFlag().toString().trim());
    }
    
    @Transient
    public boolean isMultiChannel(){
    	return !StringUtils.isEmpty(this.getPackageNameEng());
    }
    
    /*@Transient
    public boolean isDTT(){
    	return "N".equalsIgnoreCase(this.callNoss.toString()) &&
    		StringUtils.isEmpty(this.smsProductId);
    }    
    */
    @Transient
    public boolean isCallNoss(){
    	return "Y".equalsIgnoreCase(this.callNoss.toString()) &&
    		this.smsProductId != null;
    }

	public Character getIsDtt() {
		return isDtt;
	}

	public void setIsDtt(Character isDtt) {
		this.isDtt = isDtt;
	}

}
