package ims.vi.common.service.client;

import ims.vi.common.annotation.ValueEqual;
import ims.vi.common.utils.ObjectUtils;

import java.util.List;

import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
@XmlType(name = "SubscriptionComboPlan", namespace = "http://www.pccw.com/")
@XmlRootElement(name = "SubscriptionComboPlan", namespace = "http://www.pccw.com/")
public class SubscriptionComboPlan extends SubscriptionPlan {
	private static final long serialVersionUID = 1L;
	
	@ValueEqual
	private String packageName;
	@ValueEqual
	private List<Channel> channels;

	public List<Channel> getChannels() {
		return channels;
	}

	public void setChannels(List<Channel> channels) {
		this.channels = channels;
	}
	public String getPackageName() {
		return packageName;
	}

	public void setPackageName(String packageName) {
		this.packageName = packageName;
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
