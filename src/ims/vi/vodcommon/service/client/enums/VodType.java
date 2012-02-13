package ims.vi.vodcommon.service.client.enums;

public enum VodType {
	HDAVOD("HDAVOD"),
	AVOD("AVOD"),
	VOD("vod"),
	NPVR("npvr");
	
	private String code;
	
	VodType(String code) {
		this.code = code;
	}
	
	public String getMessage(){
		return this.code;
	}
}