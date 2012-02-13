package ims.vi.common.service.client;

import java.io.Serializable;
import java.util.List;

public class VodCheckLibSubResult implements Serializable {
	private static final long serialVersionUID = 1L;
	
	private boolean isSubscribed;
	private List<String> attachedLibrarySet;
	
	public VodCheckLibSubResult() {}
	
	public boolean isSubscribed() {
		return isSubscribed;
	}
	
	public void setSubscribed(boolean isSubscribed) {
		this.isSubscribed = isSubscribed;
	}
	
	public List<String> getAttachedLibrarySet() {
		return attachedLibrarySet;
	}
	
	public void setAttachedLibrarySet(List<String> attachedLibrarySet) {
		this.attachedLibrarySet = attachedLibrarySet;
	}
}