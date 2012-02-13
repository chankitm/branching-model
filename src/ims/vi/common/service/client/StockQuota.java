package ims.vi.common.service.client;

import java.io.Serializable;
import java.util.Date;

public class StockQuota implements Serializable {
	private static final long serialVersionUID = 1L;
	
	private String message;
	private Date expireDate;
	private String quota;
	
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}
	public Date getExpireDate() {
		return expireDate;
	}
	public void setExpireDate(Date expiryDate) {
		this.expireDate = expiryDate;
	}
	public String getQuota() {
		return quota;
	}
	public void setQuota(String quota) {
		this.quota = quota;
	}
}
