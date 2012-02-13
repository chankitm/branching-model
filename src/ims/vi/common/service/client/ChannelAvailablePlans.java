package ims.vi.common.service.client;

import ims.vi.common.annotation.ValueEqual;
import ims.vi.common.utils.ObjectUtils;

import java.io.Serializable;
import java.util.List;

import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
@XmlType(name = "ChannelAvailablePlans", namespace = "http://www.pccw.com/")
@XmlRootElement(name = "ChannelAvailablePlans", namespace = "http://www.pccw.com/")
public class ChannelAvailablePlans implements Serializable{
	public static final long serialVersionUID = 1L;
	
	@ValueEqual
	private boolean isEnablePreview;
	
	@ValueEqual
	private String message;
	
	@ValueEqual
	private List<SubscriptionIndividualPlan> subscriptionIndividualPlan;
	
	@ValueEqual
	private List<SubscriptionComboPlan> subscriptionComboPlan;
	
	public boolean isEnablePreview() {
		return isEnablePreview;
	}
	public void setEnablePreview(boolean isEnablePreview) {
		this.isEnablePreview = isEnablePreview;
	}
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}
	public List<SubscriptionIndividualPlan> getSubscriptionIndividualPlan() {
		return subscriptionIndividualPlan;
	}
	public void setSubscriptionIndividualPlan(
			List<SubscriptionIndividualPlan> subscriptionIndividualPlan) {
		this.subscriptionIndividualPlan = subscriptionIndividualPlan;
	}
	public List<SubscriptionComboPlan> getSubscriptionComboPlan() {
		return subscriptionComboPlan;
	}
	public void setSubscriptionComboPlan(
			List<SubscriptionComboPlan> subscriptionComboPlan) {
		this.subscriptionComboPlan = subscriptionComboPlan;
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
