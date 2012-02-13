package ims.vi.common.service.client;

import java.io.Serializable;
import java.util.Date;

public class ProfileActivation implements Serializable {
	private static final long serialVersionUID = 1L;
	
	private long id;
	private String fsa;
	private String stbId;
	private String stbsId;
	private Date activatedDate;
	private Date firstActivatedDate;
	private int stbNum;
	private String stbSkin;
	private String stbLanguage;
	private String lockChannel;
	private String unlockChannel;
	private String sessionId;
	
	public long getId() {
		return id;
	}
	
	public void setId(long id) {
		this.id = id;
	}
	
	public String getFsa() {
		return fsa;
	}
	
	public void setFsa(String fsa) {
		this.fsa = fsa;
	}
	
	public String getStbId() {
		return stbId;
	}
	
	public void setStbId(String stbId) {
		this.stbId = stbId;
	}
	
	public String getStbsId() {
		return stbsId;
	}
	
	public void setStbsId(String stbsId) {
		this.stbsId = stbsId;
	}
	
	public Date getActivatedDate() {
		return activatedDate;
	}
	
	public void setActivatedDate(Date activatedDate) {
		this.activatedDate = activatedDate;
	}
	
	public Date getFirstActivatedDate() {
		return firstActivatedDate;
	}
	
	public void setFirstActivatedDate(Date firstActivatedDate) {
		this.firstActivatedDate = firstActivatedDate;
	}
	
	public int getStbNum() {
		return stbNum;
	}
	
	public void setStbNum(int stbNum) {
		this.stbNum = stbNum;
	}
	
	public String getStbSkin() {
		return stbSkin;
	}
	
	public void setStbSkin(String stbSkin) {
		this.stbSkin = stbSkin;
	}
	
	public String getStbLanguage() {
		return stbLanguage;
	}
	
	public void setStbLanguage(String stbLanguage) {
		this.stbLanguage = stbLanguage;
	}
	
	public String getLockChannel() {
		return lockChannel;
	}
	
	public void setLockChannel(String lockChannel) {
		this.lockChannel = lockChannel;
	}
	
	public String getUnlockChannel() {
		return unlockChannel;
	}
	
	public void setUnlockChannel(String unlockChannel) {
		this.unlockChannel = unlockChannel;
	}
	
	public String getSessionId() {
		return sessionId;
	}
	
	public void setSessionId(String sessionId) {
		this.sessionId = sessionId;
	}
}