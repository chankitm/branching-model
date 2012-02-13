package ims.vi.common.service.client;

import java.io.Serializable;

public class ProfileVodStatistic implements Serializable {
	private static final long serialVersionUID = 1L;
	
	private String fsa;
	private String stbId;
	private String stbsId;
	private String stbIp;
	private String nId;
	private String erxIp;

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

	public String getStbIp() {
		return stbIp;
	}

	public void setStbIp(String stbIp) {
		this.stbIp = stbIp;
	}

	public String getNId() {
		return nId;
	}

	public void setNId(String id) {
		nId = id;
	}

	public String getErxIp() {
		return erxIp;
	}

	public void setErxIp(String erxIp) {
		this.erxIp = erxIp;
	}	
}