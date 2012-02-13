package ims.vi.common.service.client.enums;

public enum TargetMessageResponseCode {
	SUCCESS("SUCCESS"),
	ACCOUNT_NOT_FOUND("ACCOUNT_NOT_FOUND"),
	INVALID_VERSION("INVALID_VERSION"),
	MISSING_INPUT("MISSING_INPUT"),
	INVALID_LANGUAGE("INVALID_LANGUAGE"),
	INTERNAL_ERROR("INTERNAL_ERROR"),
	MESSAGE_DISABLED_BY_VALIDITY("MESSAGE_DISABLED_BY_VALIDITY"),
	MESSAGE_DISABLED_BY_DISPLAY("MESSAGE_DISABLED_BY_DISPLAY"),
	INVALID_CALLER("INVALID_CALLER");
	
	private String code;
	
	TargetMessageResponseCode() {
		this.code = "SUCCESS";
	}
	
	TargetMessageResponseCode(String code) {
		this.code = code;
	}
	
	public String getCode(){
		return this.code;
	}
}
