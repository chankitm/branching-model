package ims.vi.common.service.client.enums;

public enum RestServerResponseCode{
	SUCCESS("SUCCESS"),
	ACCOUNT_NOT_FOUND("ACCOUNT_NOT_FOUND"),
	INVALID_VERSION("INVALID_VERSION"),
	INVALID_INPUT("INVALID_INPUT"),
	MISSING_INPUT("MISSING_INPUT"),
	INVALID_LANGUAGE("INVALID_LANGUAGE"),
	INTERNAL_ERROR("INTERNAL_ERROR"),
	
	//Target Message
	MESSAGE_DISABLED_BY_VALIDITY("MESSAGE_DISABLED_BY_VALIDITY"),
	MESSAGE_DISABLED_BY_DISPLAY("MESSAGE_DISABLED_BY_DISPLAY"),
	INVALID_CALLER("INVALID_CALLER"),
	
	//Movie House Error Code from RET
	WALLET_NOT_FOUND("WALLET_NOT_FOUND"),
	OFFERCODE_NOT_FOUND("OFFERCODE_NOT_FOUND"),
	TOPUP_CASH_POINT_STALED("TOPUP_CASH_POINT_STALED"),
	CASH_POINT_BALANCE_STALED("CASH_POINT_BALANCE_STALED"),
	EXPIRY_MONTH_STALED("EXPIRY_MONTH_STALED"),
	PRESENTED_PRICE_STALED("PRESENTED_PRICE_STALED"),

	//Set top box companion
	ALREADY_EXPIRED("ALREADY_EXPIRED"),
	ALREADY_BINDED("ALREADY_BINDED"),
	INVALID_TOKEN("INVALID_TOKEN"),
	TOKEN_EXPIRED("TOKEN_EXPIRED"),
	BINDING_NOT_FOUND("BINDING_NOT_FOUND");
	
	private String code;
	
	RestServerResponseCode() {
		this.code = "SUCCESS";
	}
	
	RestServerResponseCode(String code) {
		this.code = code;
	}
	
	public String getCode(){
		return this.code;
	}
}
