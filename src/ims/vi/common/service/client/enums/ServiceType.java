package ims.vi.common.service.client.enums;

public enum ServiceType {
	MPEG4HD("MPEG4HD"),
	MPEG2SD("MPEG2SD"),
	MPEG4SD("MPEG4SD"),
	HD("HD"),
	SD("SD");
	
	private String type;
	
	ServiceType() {
		this.type = "MPEG2SD";
	}
	
	ServiceType(String type) {
		this.type = type;
	}
	
	public String getType(){
		return this.type;
	}
}