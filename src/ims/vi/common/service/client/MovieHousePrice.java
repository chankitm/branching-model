package ims.vi.common.service.client;

import java.io.Serializable;
import java.text.DecimalFormat;

import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

@XmlType(name="MovieHousePrice")
@XmlRootElement(name="MovieHousePrice")
public class MovieHousePrice implements Serializable {
	private static final long serialVersionUID = 1L;
	
	private String serviceType;
	private String price;
	
	public MovieHousePrice() {}
	
	public MovieHousePrice(String serviceType, double price) {
		DecimalFormat decialFormatter = new DecimalFormat("0.00");
		this.serviceType = serviceType;
		this.price = decialFormatter.format(price);
	}
	
	public MovieHousePrice(String serviceType, String price) {
		this.serviceType = serviceType;
		this.price = price;
	}
	
	public String getServiceType() {
		return serviceType;
	}
	
	public void setServiceType(String serviceType) {
		this.serviceType = serviceType;
	}
	
	public String getPrice() {
		return price;
	}
	
	public void setPrice(String price) {
		this.price = price;
	}
	
	public void setPrice(double price) {
		DecimalFormat decialFormatter = new DecimalFormat("0.00");
		this.price = decialFormatter.format(price);
	}
}