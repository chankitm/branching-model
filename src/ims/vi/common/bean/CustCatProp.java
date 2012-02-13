package ims.vi.common.bean;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="VI_CUST_CAT_PROP_T")
public class CustCatProp implements Serializable {
	@Column(name="SUB_CUST_CAT")
	@Id
	private String subCustCat;

	@Column(name="MKT_SCHEME")
	private String mktScheme;

	@Column(name="CHANGE_PLAN")
	private String changePlan;

	@Column(name="CHANGE_PLAN_WITHIN_CAMPAIGN")
	private String changePlanWithinCampaign;

	@Column(name="TV_GUIDE")
	private String tvGuide;

	@Column(name="ON_DEMAND")
	private String onDemand;

	@Column(name="ONE_LINK")
	private String oneLink;

	private String menu;

	@Column(name="MINI_GUIDE")
	private String miniGuide;

	@Column(name="FULL_GUIDE")
	private String fullGuide;

	private String preview;

	@Column(name="CHANNEL_MANAGEMENT")
	private String channelManagement;

	@Column(name="PARENTAL_CONTROL")
	private String parentalControl;

	@Column(name="BILL_INQUIRY")
	private String billInquiry;

	@Column(name="CHANGE_PIN")
	private String changePin;

	@Column(name="INFO_DESK")
	private String infoDesk;

	@Column(name="SET_LANGUAGE")
	private String setLanguage;

	@Column(name="REVIEW_CHANNEL")
	private String reviewChannel;

	@Column(name="SUBSCRIBE_CHANNEL")
	private String subscribeChannel;

	@Column(name="SET_FAVORITES")
	private String setFavorites;

	@Column(name="SET_SKIN")
	private String setSkin;

	@Column(name="VOD_SUB")
	private String vodSub;

	@Column(name="NOW_GAME_SUB")
	private String nowGameSub;

	@Column(name="DTT_TUNE_CHANNEL")
	private String dttTuneChannel;

	@Column(name="STOCK_ANALYTIC_SUB")
	private String stockAnalyticSub;

	private static final long serialVersionUID = 1L;

	public CustCatProp() {
		super();
	}

	public String getSubCustCat() {
		return this.subCustCat;
	}

	public void setSubCustCat(String subCustCat) {
		this.subCustCat = subCustCat;
	}

	public String getMktScheme() {
		return this.mktScheme;
	}

	public void setMktScheme(String mktScheme) {
		this.mktScheme = mktScheme;
	}

	public String getChangePlan() {
		return this.changePlan;
	}

	public void setChangePlan(String changePlan) {
		this.changePlan = changePlan;
	}

	public String getChangePlanWithinCampaign() {
		return this.changePlanWithinCampaign;
	}

	public void setChangePlanWithinCampaign(String changePlanWithinCampaign) {
		this.changePlanWithinCampaign = changePlanWithinCampaign;
	}

	public String getTvGuide() {
		return this.tvGuide;
	}

	public void setTvGuide(String tvGuide) {
		this.tvGuide = tvGuide;
	}

	public String getOnDemand() {
		return this.onDemand;
	}

	public void setOnDemand(String onDemand) {
		this.onDemand = onDemand;
	}

	public String getOneLink() {
		return this.oneLink;
	}

	public void setOneLink(String oneLink) {
		this.oneLink = oneLink;
	}

	public String getMenu() {
		return this.menu;
	}

	public void setMenu(String menu) {
		this.menu = menu;
	}

	public String getMiniGuide() {
		return this.miniGuide;
	}

	public void setMiniGuide(String miniGuide) {
		this.miniGuide = miniGuide;
	}

	public String getFullGuide() {
		return this.fullGuide;
	}

	public void setFullGuide(String fullGuide) {
		this.fullGuide = fullGuide;
	}

	public String getPreview() {
		return this.preview;
	}

	public void setPreview(String preview) {
		this.preview = preview;
	}

	public String getChannelManagement() {
		return this.channelManagement;
	}

	public void setChannelManagement(String channelManagement) {
		this.channelManagement = channelManagement;
	}

	public String getParentalControl() {
		return this.parentalControl;
	}

	public void setParentalControl(String parentalControl) {
		this.parentalControl = parentalControl;
	}

	public String getBillInquiry() {
		return this.billInquiry;
	}

	public void setBillInquiry(String billInquiry) {
		this.billInquiry = billInquiry;
	}

	public String getChangePin() {
		return this.changePin;
	}

	public void setChangePin(String changePin) {
		this.changePin = changePin;
	}

	public String getInfoDesk() {
		return this.infoDesk;
	}

	public void setInfoDesk(String infoDesk) {
		this.infoDesk = infoDesk;
	}

	public String getSetLanguage() {
		return this.setLanguage;
	}

	public void setSetLanguage(String setLanguage) {
		this.setLanguage = setLanguage;
	}

	public String getReviewChannel() {
		return this.reviewChannel;
	}

	public void setReviewChannel(String reviewChannel) {
		this.reviewChannel = reviewChannel;
	}

	public String getSubscribeChannel() {
		return this.subscribeChannel;
	}

	public void setSubscribeChannel(String subscribeChannel) {
		this.subscribeChannel = subscribeChannel;
	}

	public String getSetFavorites() {
		return this.setFavorites;
	}

	public void setSetFavorites(String setFavorites) {
		this.setFavorites = setFavorites;
	}

	public String getSetSkin() {
		return this.setSkin;
	}

	public void setSetSkin(String setSkin) {
		this.setSkin = setSkin;
	}

	public String getVodSub() {
		return this.vodSub;
	}

	public void setVodSub(String vodSub) {
		this.vodSub = vodSub;
	}

	public String getNowGameSub() {
		return this.nowGameSub;
	}

	public void setNowGameSub(String nowGameSub) {
		this.nowGameSub = nowGameSub;
	}

	public String getDttTuneChannel() {
		return this.dttTuneChannel;
	}

	public void setDttTuneChannel(String dttTuneChannel) {
		this.dttTuneChannel = dttTuneChannel;
	}

	public String getStockAnalyticSub() {
		return this.stockAnalyticSub;
	}

	public void setStockAnalyticSub(String stockAnalyticSub) {
		this.stockAnalyticSub = stockAnalyticSub;
	}

}
