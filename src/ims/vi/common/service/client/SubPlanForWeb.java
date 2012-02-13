package ims.vi.common.service.client;

import java.io.Serializable;
import java.util.Date;

import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

@XmlType(name="SubPlanForWeb")
@XmlRootElement(name="SubPlanForWeb")
public class SubPlanForWeb implements Serializable {
	private static final long serialVersionUID = 1L;
	
	private String subPlanId;
	private int remainQuota;
	private Date quotaDate;
	private String fsa;
	private String machineName;
	
	public SubPlanForWeb() {
	}

	public String getSubPlanId() {
		return subPlanId;
	}

	public void setSubPlanId(String subPlanId) {
		this.subPlanId = subPlanId;
	}

	public int getRemainQuota() {
		return remainQuota;
	}

	public void setRemainQuota(int remainQuota) {
		this.remainQuota = remainQuota;
	}

	public Date getQuotaDate() {
		return quotaDate;
	}

	public void setQuotaDate(Date quotaDate) {
		this.quotaDate = quotaDate;
	}

	public String getFsa() {
		return fsa;
	}

	public void setFsa(String fsa) {
		this.fsa = fsa;
	}

	public String getMachineName() {
		return machineName;
	}

	public void setMachineName(String machineName) {
		this.machineName = machineName;
	}
}