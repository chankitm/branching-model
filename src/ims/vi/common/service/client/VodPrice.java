package ims.vi.common.service.client;

import java.io.Serializable;

public class VodPrice implements Serializable {
	public static final long serialVersionUID = 1L;
	
	private double basicPrice;
	private double discountPrice;
	private boolean fsaDiscount;

	public VodPrice() {
		basicPrice = 0;
		discountPrice = 0;
		fsaDiscount = false;
	}
	
	public double getBasicPrice() {
		return basicPrice;
	}

	public void setBasicPrice(double basicPrice) {
		this.basicPrice = basicPrice;
	}

	public double getDiscountPrice() {
		return discountPrice;
	}

	public void setDiscountPrice(double discountPrice) {
		this.discountPrice = discountPrice;
	}
		
	public boolean isFsaDiscount() {
		return fsaDiscount;
	}

	public void setFsaDiscount(boolean fsaDiscount) {
		this.fsaDiscount = fsaDiscount;
	}
}