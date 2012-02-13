package ims.vi.common.service.client;

public class GetCashPointTopUpPlanRequest extends APIRequest {
	
	public GetCashPointTopUpPlanRequest() {
		// TODO Auto-generated constructor stub
	}
	
	public GetCashPointTopUpPlanRequest(String callerID, String callerReferenceNo, String version){
		super(callerID, callerReferenceNo, version);
	}
	
	@Override
	public String toString(){
		return super.toString();
	}
	
	public String toString(String serviceName){
		return super.toString(serviceName);
	}
	
	@Override
	public Class getResponseClass() {
		return GetCashPointTopUpPlanResponse.class;
	}
	
}
