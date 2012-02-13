package ims.vi.common.service.client;

import javax.jws.WebParam;

public class GetVodUrlRequest extends APIRequest{
	private UniqueKey key;
	private String deviceId;
	private String deviceSid;
	private String deviceIp;
	private String productId;
	private String format;
	private String presentedPrice;
	private String purchaseMethod;
	private String deviceType;
	/*private Boolean isLockVerified;
	private Boolean isPlayOnly;
	private Boolean purchaseOtherFormat;*/
	
	public GetVodUrlRequest(){

	}
	
	public GetVodUrlRequest(String callerID, String callerReferenceNo, String version, UniqueKey key, String deviceId, String deviceSid, String deviceIp, String deviceType, String presentedPrice, String purchaseMethod, String productId, String format){
		super(callerID, callerReferenceNo, version);
		this.key = key;
		this.deviceId = deviceId;
		this.deviceSid = deviceSid;
		this.deviceIp = deviceIp;
		this.deviceType = deviceType;
		this.presentedPrice = presentedPrice;
		this.purchaseMethod = purchaseMethod;
		this.productId = productId;
		this.format = format;
	}
		
	public UniqueKey getKey() {
		return key;
	}

	public void setKey(UniqueKey key) {
		this.key = key;
	}

	public String getDeviceId() {
		return deviceId;
	}

	public void setDeviceId(String deviceId) {
		this.deviceId = deviceId;
	}

	public String getDeviceSid() {
		return deviceSid;
	}

	public void setDeviceSid(String deviceSid) {
		this.deviceSid = deviceSid;
	}

	public String getDeviceIp() {
		return deviceIp;
	}

	public void setDeviceIp(String deviceIp) {
		this.deviceIp = deviceIp;
	}

	public String getProductId() {
		return productId;
	}

	public void setProductId(String productId) {
		this.productId = productId;
	}

	public String getFormat() {
		return format;
	}

	public void setFormat(String format) {
		this.format = format;
	}

	public String getPresentedPrice() {
		return presentedPrice;
	}

	public void setPresentedPrice(String presentedPrice) {
		this.presentedPrice = presentedPrice;
	}

	public String getPurchaseMethod() {
		return purchaseMethod;
	}

	public void setPurchaseMethod(String purchaseMethod) {
		this.purchaseMethod = purchaseMethod;
	}

	public String getDeviceType() {
		return deviceType;
	}

	public void setDeviceType(String deviceType) {
		this.deviceType = deviceType;
	}

	public String toString(){
		return String.format("%s, %s: %s, deviceId: %s, deviceSid: %s, deviceIp: %s, deviceType: %s, productId: %s, format: %s, presentedPrice: %s, purchaseMethod: %s",super.toString(), getKey()!=null?getKey().getClass().getSimpleName():"Key", getKey()!=null?getKey().getValue():null);
	}
	
	public String toString(String serviceName){
		return String.format("%1$s\n" +
							 "[%2$s-in: %3$s] %4$s: %5s\n" +
							 "[%2$s-in: %3$s] deviceId: %6$s\n" +
							 "[%2$s-in: %3$s] deviceSid: %7$s\n" +
							 "[%2$s-in: %3$s] deviceIp: %7$s\n" +
							 "[%2$s-in: %3$s] deviceType: %8$s\n" +
							 "[%2$s-in: %3$s] productId: %9$s\n" +
							 "[%2$s-in: %3$s] format: %10$s\n" +
							 "[%2$s-in: %3$s] presentedPrice: %11$s\n" +
							 "[%2$s-in: %3$s] purchaseMethod: %12$s",super.toString(serviceName), serviceName, getCallerReferenceNo(), getKey()!=null?getKey().getClass().getSimpleName():"Key", getKey()!=null?getKey().getValue():null
									 , deviceId, deviceSid, deviceIp, deviceType, productId, format, presentedPrice, purchaseMethod);
	}
	
	@Override
	public Class getResponseClass() {
		// TODO Auto-generated method stub
		return GetVodUrlResponse.class;
	}

}
