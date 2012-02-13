package ims.vi.vodcommon.service.client.message;

import ims.vi.vodcommon.service.client.entity.CheckoutInfo;
import ims.vi.vodcommon.service.client.enums.ResponseCode;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;

@XmlType(name="CheckoutMessage")
@XmlRootElement(name="CheckoutMessage")
@XmlSeeAlso(value={CheckoutInfo.class})
public class CheckoutMessage implements Serializable {
	private static final long serialVersionUID = 1L;
	
	private List<CheckoutInfo> entity;
	private List<String> libraryList;
	private ResponseCode responseCode;
	
	public void setEntity(List<CheckoutInfo> entity) {
		this.entity = entity;
	}
	
	public List<CheckoutInfo> getEntity() {
		return this.entity;
	}
	
	public void addNewEntity(CheckoutInfo checkoutInfo) {
		if (entity == null) {
			entity = new ArrayList<CheckoutInfo>();
		}
		
		entity.add(checkoutInfo);
	}
	
	public void setLibraryList(List<String> libraryList) {
		this.libraryList = libraryList;
	}
	
	public List<String> getLibraryList() {
		return this.libraryList;
	}
	
	public void setResponseCode(ResponseCode responseCode) {
		this.responseCode = responseCode;
	}
	
	public ResponseCode getResponseCode() {
		return this.responseCode;
	}
}