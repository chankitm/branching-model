package ims.vi.common.service.client;

import ims.vi.common.service.client.enums.RestServerResponseCode;
import ims.vi.common.service.client.enums.ServerType;

import java.util.List;

public class GetCashPointTopUpPlanResponse extends APIResponse{
	private List<CashPointTopUpPlan> topUpPlans;
	public static final String SERVERTYPE = ServerType.TOPUPPLAN.getType();

	public GetCashPointTopUpPlanResponse(){
		
	}
	
	public GetCashPointTopUpPlanResponse(RestServerResponseCode responseCode, String callerReferenceNo, String serverReferenceNo, long elapsedTime, List<CashPointTopUpPlan> topUpPlans){
		super(responseCode, callerReferenceNo, serverReferenceNo, elapsedTime);
		this.topUpPlans = topUpPlans;
	}
	
	public List<CashPointTopUpPlan> getTopUpPlans() {
		return topUpPlans;
	}

	public void setTopUpPlans(List<CashPointTopUpPlan> topUpPlans) {
		this.topUpPlans = topUpPlans;
	}
	
	@Override
	public String toString(){
		String log = String.format("%s", super.toString());
		for (CashPointTopUpPlan topUpPlan : topUpPlans){
			log += String.format(", OfferCode: %s, CashPoint: %s, Price: %s, ExpiryMonth %s",topUpPlan.getOfferCode(), topUpPlan.getCashPoint(), topUpPlan.getPrice(), topUpPlan.getExpiryMonth());
		}
		return log;
	}
	
	public String toString(String serviceName){
		String log = String.format("%s\n", super.toString());
		for (CashPointTopUpPlan topUpPlan : topUpPlans){
			log += String.format("[%1$s-out: %2$s, %3$s] OfferCode: %4$s\n"+
								 "[%1$s-out: %2$s, %3$s] CashPoint: %5$s\n"+
								 "[%1$s-out: %2$s, %3$s] Price: %6$s\n"+
								 "[%1$s-out: %2$s, %3$s] ExpiryMonth: %7$s\n"
								 ,serviceName, getServerReferenceNo(), getCallerReferenceNo(), topUpPlan.getOfferCode(), topUpPlan.getCashPoint(), topUpPlan.getPrice(), topUpPlan.getExpiryMonth());
		}
		return log;					
	}
}
