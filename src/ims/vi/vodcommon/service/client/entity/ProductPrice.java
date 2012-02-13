package ims.vi.vodcommon.service.client.entity;

import java.io.Serializable;

import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

@XmlType(name="ProductPrice")
@XmlRootElement(name="ProductPrice")
public class ProductPrice implements Serializable {
	private static final long serialVersionUID = 1L;
	
	private String productId;
	private String scheduleId;
	private double productPrice;
	private double discountPrice;
	private boolean fsaDiscount;
	
	public ProductPrice() {
		this.productId = "";
		this.scheduleId = "";
		this.productPrice = 0;
		this.discountPrice = 0;
		this.fsaDiscount = false;
	}
	
	public ProductPrice(String productId, String scheduleId) {
		this.productId = productId;
		this.scheduleId = scheduleId;
		this.productPrice = 0;
		this.discountPrice = 0;
		this.fsaDiscount = false;
	}
	
	public void setProductId(String productId) {
		this.productId = productId;
	}
	
	public String getProductId() {
		return productId;
	}
	
	public void setScheduleId(String scheduleId) {
		this.scheduleId = scheduleId;
	}
	
	public String getScheduleId() {
		return scheduleId;
	}
	
	public void setProductPrice(double productPrice) {
		this.productPrice = productPrice;
	}
	
	public double getProductPrice() {
		return productPrice;
	}
	
	public void setDiscountPrice(double discountPrice) {
		this.discountPrice = discountPrice;
	}
	
	public double getDiscountPrice() {
		return discountPrice;
	}
	
	public void setFsaDiscount(boolean fsaDiscount) {
		this.fsaDiscount = fsaDiscount;
	}
	
	public boolean isFsaDiscount() {
		return fsaDiscount;
	}
}