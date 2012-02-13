package ims.vi.common.service.client;

import java.io.Serializable;

public class VodLibraryServiceType implements Serializable {
	private static final long serialVersionUID = 1L;
	
	private String libraryId;
	private String childLibraryId;
	private String serviceType;
	
	public String getLibraryId() {
		return libraryId;
	}
	
	public void setLibraryId(String libraryId) {
		this.libraryId = libraryId;
	}
	
	public String getChildLibraryId() {
		return childLibraryId;
	}
	
	public void setChildLibraryId(String childLibraryId) {
		this.childLibraryId = childLibraryId;
	}
	
	public String getServiceType() {
		return serviceType;
	}
	
	public void setServiceType(String serviceType) {
		this.serviceType = serviceType;
	}
}