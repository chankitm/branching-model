package ims.vi.common.service.client;

import java.io.Serializable;

import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
@XmlType(name = "ActionResult", namespace = "http://www.pccw.com/")
@XmlRootElement(name = "ActionResult", namespace = "http://www.pccw.com/")
public class ActionResult implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private boolean actionSucceed;
	private String failReason;
	public boolean isActionSucceed() {
		return actionSucceed;
	}
	public void setActionSucceed(boolean actionSucceed) {
		this.actionSucceed = actionSucceed;
	}
	public String getFailReason() {
		return failReason;
	}
	public void setFailReason(String failReason) {
		this.failReason = failReason;
	}
}
