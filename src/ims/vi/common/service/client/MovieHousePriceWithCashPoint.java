package ims.vi.common.service.client;

import java.io.Serializable;
import java.text.DecimalFormat;

import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

@XmlType(name="MovieHousePriceWithCashPoint")
@XmlRootElement(name="MovieHousePriceWithCashPoint")
public class MovieHousePriceWithCashPoint implements Serializable {
	private static final long serialVersionUID = 1L;
	
	private String serviceType;
	private String price;
	private String payment;
	private String chargeUnit;
	
	public MovieHousePriceWithCashPoint() {}
	
	public MovieHousePriceWithCashPoint(String serviceType, double price) {
		DecimalFormat decialFormatter = new DecimalFormat("0.00");
		this.serviceType = serviceType;
		this.price = decialFormatter.format(price);
	}
	
	public MovieHousePriceWithCashPoint(String serviceType, String price) {
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
	
	public String getPayment() {
		return payment;
	}

	public void setPayment(String payment) {
		this.payment = payment;
	}

	public String getChargeUnit() {
		return chargeUnit;
	}

	public void setChargeUnit(String chargeUnit) {
		this.chargeUnit = chargeUnit;
	}
}