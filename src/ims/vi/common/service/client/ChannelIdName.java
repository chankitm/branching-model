package ims.vi.common.service.client;

public class ChannelIdName {
    private String chiName;
    private String engName;
    private String id;
	public ChannelIdName(String chiName, String engName, String id) {
		super();
		this.chiName = chiName;
		this.engName = engName;
		this.id = id;
	}
	public String getChiName() {
		return chiName;
	}
	public void setChiName(String chiName) {
		this.chiName = chiName;
	}
	public String getEngName() {
		return engName;
	}
	public void setEngName(String engName) {
		this.engName = engName;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	@Override
	public String toString() {
		return "ChannelIdName [chiName=" + chiName + ", engName=" + engName
				+ ", id=" + id + "]";
	}
    
}
