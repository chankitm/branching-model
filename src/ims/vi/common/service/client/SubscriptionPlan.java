package ims.vi.common.service.client;

import ims.vi.common.annotation.ValueEqual;
import ims.vi.common.utils.ObjectUtils;

import java.io.Serializable;
import java.math.BigDecimal;

public abstract class SubscriptionPlan implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	@ValueEqual
	private String planCode;
	@ValueEqual
	private String campaign;
	private String description;
	private BigDecimal price;
	private boolean canSubscribeOnTV;
	
	public String getPlanCode() {
		return planCode;
	}
	public BigDecimal getPrice() {
		return price;
	}
	public void setPrice(BigDecimal price) {
		this.price = price;
	}
	public void setPlanCode(String planCode) {
		this.planCode = planCode;
	}
	public String getCampaign() {
		return campaign;
	}
	public void setCampaign(String campaign) {
		this.campaign = campaign;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public boolean isCanSubscribeOnTV() {
		return canSubscribeOnTV;
	}
	public void setCanSubscribeOnTV(boolean canSubscribeOnTV) {
		this.canSubscribeOnTV = canSubscribeOnTV;
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
