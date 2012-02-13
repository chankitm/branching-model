package ims.vi.common.service.client;

public class BindingInfo {
	private String bindingType;
	private String stbid;
	private String stbip;
	private String deviceID;
	private String extInfo;
	private String fsa;
	private String lastBindDate;

	public BindingInfo(){
		this.bindingType = null;
		this.stbid = null;
		this.stbip = null;
		this.deviceID = null;
		this.extInfo = null;
		this.fsa = null;
		this.lastBindDate = null;
	}
	
	public BindingInfo(String bindingType, String stbid, String stbip, String deviceID, String extInfo, String fsa, String lastBindDate){
		this.bindingType = bindingType;
		this.stbid = stbid;
		this.stbip = stbip;
		this.deviceID = deviceID;
		this.extInfo = extInfo;
		this.fsa = fsa;
		this.lastBindDate = lastBindDate;
	}
	
	public String getBindingType() {
		return bindingType;
	}
	public void setBindingType(String bindingType) {
		this.bindingType = bindingType;
	}
	public String getStbid() {
		return stbid;
	}
	public void setStbid(String stbid) {
		this.stbid = stbid;
	}
	public String getStbip() {
		return stbip;
	}
	public void setStbip(String stbip) {
		this.stbip = stbip;
	}
	public String getDeviceID() {
		return deviceID;
	}
	public void setDeviceID(String deviceID) {
		this.deviceID = deviceID;
	}
	public String getExtInfo() {
		return extInfo;
	}
	public void setExtInfo(String extInfo) {
		this.extInfo = extInfo;
	}
	public String getFsa() {
		return fsa;
	}
	public void setFsa(String fsa) {
		this.fsa = fsa;
	}
	public String getLastBindDate() {
		return lastBindDate;
	}
	public void setLastBindDate(String lastBindDate) {
		this.lastBindDate = lastBindDate;
	}
	
	@Override
	public String toString(){
		return String.format("%s,stbid=[%s], stbip=[%s], deviceID=[%s], extInfo=[%s], fsa=[%s], lastBindDate=[%s]", 
				super.toString(), 
				(getStbid()==null)?"":getStbid(), 
				(getStbip()==null)?"":getStbip(), 
				(getDeviceID()==null)?"":getDeviceID(), 
				(getExtInfo()==null)?"":getExtInfo(), 
				(getFsa()==null)?"":getFsa(), 
				(getLastBindDate()==null)?"":getLastBindDate());
	}
}
