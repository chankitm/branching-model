package ims.vi.common.bean;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EntityResult;
import javax.persistence.FieldResult;
import javax.persistence.Id;
import javax.persistence.SqlResultSetMapping;
import javax.persistence.SqlResultSetMappings;
import javax.persistence.Table;
import javax.persistence.ColumnResult;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

@Entity
@Table(name="VI_CHANNEL_T")
@SqlResultSetMappings({
@SqlResultSetMapping(name="ChannelGenreAndSubCustCat",
		entities={ 
		@EntityResult(entityClass=Channel.class,
				fields={
			@FieldResult(name="channelKey", column="C_CHANNEL_KEY"),
			@FieldResult(name="channelId", column="C_CHANNEL_ID"),
			@FieldResult(name="type", column="C_TYPE"),
			@FieldResult(name="status", column="C_STATUS"),
			@FieldResult(name="nameChi", column="C_NAME_CHI"),
			@FieldResult(name="nameEng", column="C_NAME_ENG"),
			@FieldResult(name="descChi", column="C_DESC_CHI"),
			@FieldResult(name="descEng", column="C_DESC_ENG"),
			@FieldResult(name="multiCastAddress", column="C_MULTI_CAST_ADDRESS"),
			@FieldResult(name="portNumber", column="C_PORT_NUMBER"),
			@FieldResult(name="effectiveDate", column="C_EFFECTIVE_DATE"),
			@FieldResult(name="expirationDate", column="C_EXPIRATION_DATE"),
			@FieldResult(name="modifiedDate", column="C_MODIFIED_DATE"),
			@FieldResult(name="modifiedBy", column="C_MODIFIED_BY"),
			@FieldResult(name="createdDate", column="C_CREATED_DATE"),
			@FieldResult(name="createdBy", column="C_CREATED_BY"),
			@FieldResult(name="classification", column="C_CLASSIFICATION"),
			@FieldResult(name="promoPreviewMc", column="C_PROMO_PREVIEW_MC"),
			@FieldResult(name="displayChannelNameChi", column="C_DISPLAY_CHANNEL_NAME_CHI"),
			@FieldResult(name="displayChannelNameEng", column="C_DISPLAY_CHANNEL_NAME_ENG"),
			@FieldResult(name="billChannelNameChi", column="C_BILL_CHANNEL_NAME_CHI"),
			@FieldResult(name="billChannelNameEng", column="C_BILL_CHANNEL_NAME_ENG"),
			@FieldResult(name="zoneType", column="C_ZONE_TYPE"),
			@FieldResult(name="custCat", column="C_CUST_CAT"),
			@FieldResult(name="language", column="C_LANGUAGE"),
			@FieldResult(name="withSubPreview", column="C_WITH_SUB_PREVIEW"),
			@FieldResult(name="parentChannelKey", column="C_PARENT_CHANNEL_KEY"),
			@FieldResult(name="tvType", column="C_TV_TYPE"),
			@FieldResult(name="hdPromoPreviewMc", column="C_HD_PROMO_PREVIEW_MC"), 
			@FieldResult(name="mpeg4sdPromoPreviewMc", column="C_MPEG4SD_PROMO_PREVIEW_MC" ), 
			@FieldResult(name="sentRecordable", column="C_SENT_RECORDABLE"), 
			@FieldResult(name="hdMulticastAddress", column="C_HD_MULTICAST_ADDRESS"), 
			@FieldResult(name="hdPort", column="C_HD_PORT"), 
			@FieldResult(name="mpeg4sdMulticastAddress", column="C_MPEG4SD_MULTICAST_ADDRESS"), 
			@FieldResult(name="mpeg4sdPort", column="C_MPEG4SD_PORT"), 
			@FieldResult(name="assetCluster", column="C_ASSET_CLUSTER"), 
			@FieldResult(name="recordEffectiveDay", column="C_RECORD_EFFECTIVE_DAY"), 
			@FieldResult(name="recordExpirationDay", column="C_RECORD_EXPIRATION_DAY"), 
			@FieldResult(name="npvrBuythruRequired", column="C_NPVR_BUYTHRU_REQUIRED"), 
			@FieldResult(name="iadType", column="C_IAD_TYPE") 
        }), 
       /* @EntityResult(entityClass=CustCatZone.class,
				fields={
        	@FieldResult(name="custCat", column="S_CUST_CAT"),
        	@FieldResult(name="subCustCat", column="S_SUB_CUST_CAT"),
        	@FieldResult(name="zoneType", column="S_ZONE_TYPE"),
        	@FieldResult(name="channelZoneType", column="S_CHANNEL_ZONE_TYPE"),
        	@FieldResult(name="channelListZoneType", column="S_CHANNEL_LIST_ZONE_TYPE"),
        }),*/
		@EntityResult(entityClass=Genre.class,
				fields={
			@FieldResult(name="genreCode",column="G_GENRE_CODE"),
			@FieldResult(name="nameEng",column="G_NAME_ENG"),
			@FieldResult(name="nameChi",column="G_NAME_CHI"),
			@FieldResult(name="descEng",column="G_DESC_ENG"),
			@FieldResult(name="descChi",column="G_DESC_CHI"),
			@FieldResult(name="imageFilenameEng",column="G_IMAGE_FILENAME_ENG"),
			@FieldResult(name="imageFilenameChi",column="G_IMAGE_FILENAME_CHI"),
			@FieldResult(name="status",column="G_STATUS"),
			@FieldResult(name="modifiedDate",column="G_MODIFIED_DATE"),
			@FieldResult(name="modifiedBy",column="G_MODIFIED_BY"),
			@FieldResult(name="createdDate",column="G_CREATED_DATE"),
			@FieldResult(name="createdBy",column="G_CREATED_BY"),
			@FieldResult(name="displayOrder",column="G_DISPLAY_ORDER"),
			@FieldResult(name="displayZoneFirst",column="G_DISPLAY_ZONE_FIRST"),
			@FieldResult(name="isRestricted",column="G_IS_RESTRICTED")
		})}
	,columns={@ColumnResult(name="S_SUB_CUST_CAT")})
})
@XmlType(name = "BeanChannel", namespace = "http://www.pccw.com/")
@XmlRootElement(name = "BeanChannel", namespace = "http://www.pccw.com/")
public class Channel implements Serializable, Comparable<Channel> {
	@Id
	@Column(name="CHANNEL_KEY")
	private String channelKey;

	@Column(name="CHANNEL_ID")
	private BigDecimal channelId;

	@Column(name="TYPE")
	private String type;

	@Column(name="STATUS")
	private String status;

	@Column(name="NAME_CHI")
	private String nameChi;

	@Column(name="NAME_ENG")
	private String nameEng;

	@Column(name="DESC_CHI")
	private String descChi;

	@Column(name="DESC_ENG")
	private String descEng;

	@Column(name="MULTI_CAST_ADDRESS")
	private String multiCastAddress;

	@Column(name="PORT_NUMBER")
	private BigDecimal portNumber;

	@Column(name="EFFECTIVE_DATE")
	private Date effectiveDate;

	@Column(name="EXPIRATION_DATE")
	private Date expirationDate;

	@Column(name="MODIFIED_DATE")
	private Date modifiedDate;

	@Column(name="MODIFIED_BY")
	private String modifiedBy;

	@Column(name="CREATED_DATE")
	private Date createdDate;

	@Column(name="CREATED_BY")
	private String createdBy;

	@Column(name="CLASSIFICATION")
	private String classification;

	@Column(name="PROMO_PREVIEW_MC")
	private String promoPreviewMc;

	@Column(name="DISPLAY_CHANNEL_NAME_CHI")
	private String displayChannelNameChi;

	@Column(name="DISPLAY_CHANNEL_NAME_ENG")
	private String displayChannelNameEng;

	@Column(name="BILL_CHANNEL_NAME_CHI")
	private String billChannelNameChi;

	@Column(name="BILL_CHANNEL_NAME_ENG")
	private String billChannelNameEng;

	@Column(name="ZONE_TYPE")
	private String zoneType;

	@Column(name="CUST_CAT")
	private String custCat;

	@Column(name="LANGUAGE")
	private String language;

	@Column(name="WITH_SUB_PREVIEW")
	private String withSubPreview;

	@Column(name="PARENT_CHANNEL_KEY")
	private String parentChannelKey;

	@Column(name="TV_TYPE")
	private String tvType;

	@Column(name="HD_PROMO_PREVIEW_MC")
	private String hdPromoPreviewMc;

	@Column(name="MPEG4SD_PROMO_PREVIEW_MC")
	private String mpeg4sdPromoPreviewMc;

	@Column(name="SENT_RECORDABLE")
	private String sentRecordable;

	@Column(name="HD_MULTICAST_ADDRESS")
	private String hdMulticastAddress;

	@Column(name="HD_PORT")
	private BigDecimal hdPort;

	@Column(name="MPEG4SD_MULTICAST_ADDRESS")
	private String mpeg4sdMulticastAddress;

	@Column(name="MPEG4SD_PORT")
	private BigDecimal mpeg4sdPort;

	@Column(name="ASSET_CLUSTER")
	private String assetCluster;

	@Column(name="RECORD_EFFECTIVE_DAY")
	private BigDecimal recordEffectiveDay;

	@Column(name="RECORD_EXPIRATION_DAY")
	private BigDecimal recordExpirationDay;

	@Column(name="NPVR_BUYTHRU_REQUIRED")
	private String npvrBuythruRequired;

	@Column(name="IAD_TYPE")
	private String iadType;

	private static final long serialVersionUID = 1L;
	
	/*@ManyToOne
	@JoinTable(
	name="VI_PLAN_CHANNEL_T",
	joinColumns= @JoinColumn(name="CHANNEL_KEY"),
	inverseJoinColumns=@JoinColumn(name="PLAN_CODE")
	)
	private Plan plan;*/

	public Channel() {
		super();
	}
	
	public Channel(String channelKey) {
		this.channelKey = channelKey;
	}

	public String getChannelKey() {
		return this.channelKey;
	}

	public void setChannelKey(String channelKey) {
		this.channelKey = channelKey;
	}

	public BigDecimal getChannelId() {
		return this.channelId;
	}

	public void setChannelId(BigDecimal channelId) {
		this.channelId = channelId;
	}

	public String getType() {
		return this.type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getStatus() {
		return this.status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public String getNameChi() {
		return this.nameChi;
	}

	public void setNameChi(String nameChi) {
		this.nameChi = nameChi;
	}

	public String getNameEng() {
		return this.nameEng;
	}

	public void setNameEng(String nameEng) {
		this.nameEng = nameEng;
	}

	public String getDescChi() {
		return this.descChi;
	}

	public void setDescChi(String descChi) {
		this.descChi = descChi;
	}

	public String getDescEng() {
		return this.descEng;
	}

	public void setDescEng(String descEng) {
		this.descEng = descEng;
	}

	public String getMultiCastAddress() {
		return this.multiCastAddress;
	}

	public void setMultiCastAddress(String multiCastAddress) {
		this.multiCastAddress = multiCastAddress;
	}

	public BigDecimal getPortNumber() {
		return this.portNumber;
	}

	public void setPortNumber(BigDecimal portNumber) {
		this.portNumber = portNumber;
	}

	public Date getEffectiveDate() {
		return this.effectiveDate;
	}

	public void setEffectiveDate(Date effectiveDate) {
		this.effectiveDate = effectiveDate;
	}

	public Date getExpirationDate() {
		return this.expirationDate;
	}

	public void setExpirationDate(Date expirationDate) {
		this.expirationDate = expirationDate;
	}

	public Date getModifiedDate() {
		return this.modifiedDate;
	}

	public void setModifiedDate(Date modifiedDate) {
		this.modifiedDate = modifiedDate;
	}

	public String getModifiedBy() {
		return this.modifiedBy;
	}

	public void setModifiedBy(String modifiedBy) {
		this.modifiedBy = modifiedBy;
	}

	public Date getCreatedDate() {
		return this.createdDate;
	}

	public void setCreatedDate(Date createdDate) {
		this.createdDate = createdDate;
	}

	public String getCreatedBy() {
		return this.createdBy;
	}

	public void setCreatedBy(String createdBy) {
		this.createdBy = createdBy;
	}

	public String getClassification() {
		return this.classification;
	}

	public void setClassification(String classification) {
		this.classification = classification;
	}

	public String getPromoPreviewMc() {
		return this.promoPreviewMc;
	}

	public void setPromoPreviewMc(String promoPreviewMc) {
		this.promoPreviewMc = promoPreviewMc;
	}

	public String getDisplayChannelNameChi() {
		return this.displayChannelNameChi;
	}

	public void setDisplayChannelNameChi(String displayChannelNameChi) {
		this.displayChannelNameChi = displayChannelNameChi;
	}

	public String getDisplayChannelNameEng() {
		return this.displayChannelNameEng;
	}

	public void setDisplayChannelNameEng(String displayChannelNameEng) {
		this.displayChannelNameEng = displayChannelNameEng;
	}

	public String getBillChannelNameChi() {
		return this.billChannelNameChi;
	}

	public void setBillChannelNameChi(String billChannelNameChi) {
		this.billChannelNameChi = billChannelNameChi;
	}

	public String getBillChannelNameEng() {
		return this.billChannelNameEng;
	}

	public void setBillChannelNameEng(String billChannelNameEng) {
		this.billChannelNameEng = billChannelNameEng;
	}

	public String getZoneType() {
		return this.zoneType;
	}

	public void setZoneType(String zoneType) {
		this.zoneType = zoneType;
	}

	public String getCustCat() {
		return this.custCat;
	}

	public void setCustCat(String custCat) {
		this.custCat = custCat;
	}

	public String getLanguage() {
		return this.language;
	}

	public void setLanguage(String language) {
		this.language = language;
	}

	public String getWithSubPreview() {
		return this.withSubPreview;
	}

	public void setWithSubPreview(String withSubPreview) {
		this.withSubPreview = withSubPreview;
	}

	public String getParentChannelKey() {
		return this.parentChannelKey;
	}

	public void setParentChannelKey(String parentChannelKey) {
		this.parentChannelKey = parentChannelKey;
	}

	public String getTvType() {
		return this.tvType;
	}

	public void setTvType(String tvType) {
		this.tvType = tvType;
	}

	public String getHdPromoPreviewMc() {
		return this.hdPromoPreviewMc;
	}

	public void setHdPromoPreviewMc(String hdPromoPreviewMc) {
		this.hdPromoPreviewMc = hdPromoPreviewMc;
	}

	public String getMpeg4sdPromoPreviewMc() {
		return this.mpeg4sdPromoPreviewMc;
	}

	public void setMpeg4sdPromoPreviewMc(String mpeg4sdPromoPreviewMc) {
		this.mpeg4sdPromoPreviewMc = mpeg4sdPromoPreviewMc;
	}

	public String getSentRecordable() {
		return this.sentRecordable;
	}

	public void setSentRecordable(String sentRecordable) {
		this.sentRecordable = sentRecordable;
	}

	public String getHdMulticastAddress() {
		return this.hdMulticastAddress;
	}

	public void setHdMulticastAddress(String hdMulticastAddress) {
		this.hdMulticastAddress = hdMulticastAddress;
	}

	public BigDecimal getHdPort() {
		return this.hdPort;
	}

	public void setHdPort(BigDecimal hdPort) {
		this.hdPort = hdPort;
	}

	public String getMpeg4sdMulticastAddress() {
		return this.mpeg4sdMulticastAddress;
	}

	public void setMpeg4sdMulticastAddress(String mpeg4sdMulticastAddress) {
		this.mpeg4sdMulticastAddress = mpeg4sdMulticastAddress;
	}

	public BigDecimal getMpeg4sdPort() {
		return this.mpeg4sdPort;
	}

	public void setMpeg4sdPort(BigDecimal mpeg4sdPort) {
		this.mpeg4sdPort = mpeg4sdPort;
	}

	public String getAssetCluster() {
		return this.assetCluster;
	}

	public void setAssetCluster(String assetCluster) {
		this.assetCluster = assetCluster;
	}

	public BigDecimal getRecordEffectiveDay() {
		return this.recordEffectiveDay;
	}

	public void setRecordEffectiveDay(BigDecimal recordEffectiveDay) {
		this.recordEffectiveDay = recordEffectiveDay;
	}

	public BigDecimal getRecordExpirationDay() {
		return this.recordExpirationDay;
	}

	public void setRecordExpirationDay(BigDecimal recordExpirationDay) {
		this.recordExpirationDay = recordExpirationDay;
	}

	public String getNpvrBuythruRequired() {
		return this.npvrBuythruRequired;
	}

	public void setNpvrBuythruRequired(String npvrBuythruRequired) {
		this.npvrBuythruRequired = npvrBuythruRequired;
	}

	public String getIadType() {
		return this.iadType;
	}

	public void setIadType(String iadType) {
		this.iadType = iadType;
	}
	/*
	public Plan getPlan() {
		return plan;
	}

	public void setPlan(Plan plan) {
		this.plan = plan;
	}*/
	
	public int compareTo(Channel arg0) {
		// TODO Auto-generated method stub
		int channelId1 = this.getChannelId().intValue();
		int channelId2 = ((Channel) arg0).getChannelId().intValue();

		return (channelId1 - channelId2);
	}
}
