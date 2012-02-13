package ims.vi.vodcommon.service.client.message;

import ims.vi.vodcommon.service.client.entity.ProductPrice;
import ims.vi.vodcommon.service.client.enums.ResponseCode;

import java.io.Serializable;

import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;

@XmlType(name="ProductPriceMessage")
@XmlRootElement(name="ProductPriceMessage")
@XmlSeeAlso(value={ProductPrice.class})
public class ProductPriceMessage implements Serializable {
	private static final long serialVersionUID = 1L;
	
	private ProductPrice entity;
	private ResponseCode responseCode;
	
	public void setEntity(ProductPrice entity) {
		this.entity = entity;
	}
	
	public ProductPrice getEntity() {
		return entity;
	}
		
	public void setResponseCode(ResponseCode responseCode) {
		this.responseCode = responseCode;
	}
	
	public ResponseCode getResponseCode() {
		return responseCode;
	}
}