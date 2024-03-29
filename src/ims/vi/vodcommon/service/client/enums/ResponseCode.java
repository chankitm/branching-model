package ims.vi.vodcommon.service.client.enums;

public enum ResponseCode {
	FSA_STALED("FSA_STALED"),
	EXTERNAL_CALL_ERROR("EXTERNAL_CALL_ERROR"),
	INVALID_PROFILE("INVALID_PROFILE"),
	INVALID_SERVICETYPE("INVALID_SERVICETYPE"),
	//
	ASSET_NOT_FOUND("ASSET_NOT_FOUND"),
	ARMADA_FAIL("ARMADA_FAIL"),
	AUTO_SUB_FAIL("AUTO_SUB_FAIL"),
	BUY_PLAN("BUY_PLAN"),
	BUY_THRU_FAIL("BUY_THRU_FAIL"),
	DEPENDENCY_FAIL("DEPENDENCY_FAIL"),
	EMPTY_RTSP_LINK("EMPTY_RTSP_LINK"),
	GENERAL_ERROR("GENERAL_ERROR"),
	INTERNAL_ERROR("INTERNAL_ERROR"),
	LICENSE_FAIL("LICENSE_FAIL"),
	NEED_TO_UNLOCK("NEED_TO_UNLOCK"),
	NULL_CHECK_SUBSCRIBE_TYPE("NULL_CHECK_SUBSCRIBE_TYPE"),
	PRODUCT_NOT_FOUND("PRODUCT_NOT_FOUND"),
	SDX_FAIL("SDX_FAIL"),
	SD_PROFILE_PLAY_HD("SD_PROFILE_PLAY_HD"),
	SUCCESS("SUCCESS"),
	SUSPEND("SUSPEND"),
	TERMINATE("TERMINATE"),
	TOS("TOS");
	
	private String code;
	
	ResponseCode() {
		this.code = "SUCCESS";
	}
	
	ResponseCode(String code) {
		this.code = code;
	}
	
	public String getMessage(){
		return this.code;
	}
}