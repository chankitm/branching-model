package ims.vi.common.service.client;

import java.util.List;

import ims.vi.common.service.client.enums.*;

public class GetCurrentBindingInfoResponse extends APIResponse{
	private List<BindingInfo> bindingInfo;
	private NowIDBindingInfo nowIdBindingInfo;
	public static final String SERVERTYPE = ServerType.STBC_BINFO.getType();

	public GetCurrentBindingInfoResponse(){
		
	}
	
	public GetCurrentBindingInfoResponse(RestServerResponseCode responseCode, String callerReferenceNo, String serverReferenceNo, long elapsedTime, List<BindingInfo> bindingInfo, NowIDBindingInfo nowIdBindingInfo){
		super(responseCode, callerReferenceNo, serverReferenceNo, elapsedTime);
		this.bindingInfo = bindingInfo;
		this.nowIdBindingInfo = nowIdBindingInfo;
	}

	public List<BindingInfo> getBindingInfo() {
		return bindingInfo;
	}

	public void setBindingInfo(List<BindingInfo> bindingInfo) {
		this.bindingInfo = bindingInfo;
	}
	
	public NowIDBindingInfo getNowIdBindingInfo() {
		return nowIdBindingInfo;
	}
	
	public void setNowIdBindingInfo(NowIDBindingInfo nowIdBindingInfo) {
		this.nowIdBindingInfo = nowIdBindingInfo;
	}
	
	@Override
	public String toString(){
		String log = String.format("%s", super.toString());
		if(bindingInfo != null){
			for (BindingInfo info : bindingInfo){
				if(info!=null){
					log += String.format(", stbid: %s, stbip: %s, deviceID: %s, extInfo: %s, fsa: %s, lastBindDate: %s",
							(info.getStbid() == null)?"":info.getStbid(), 
							(info.getStbip() == null)?"":info.getStbip(), 
							(info.getDeviceID() == null)?"":info.getDeviceID(), 
							(info.getExtInfo() == null)?"":info.getExtInfo(), 
							(info.getFsa() == null)?"":info.getFsa(),
							(info.getLastBindDate() == null)?"":info.getLastBindDate());
				}
			}
		}
		if (nowIdBindingInfo != null) {
			log += String.format("\n nowID binding info, " +
					 "npid: %1$s, bind_date: %2$s, nowid_verified: %3$s, mem_status: %4$s, " +
					 "registration_date: %5$s, nowid: %6$s",
					 nowIdBindingInfo.getNpid(),
					 nowIdBindingInfo.getBind_date(),
					 nowIdBindingInfo.getNowid_verified(),
					 nowIdBindingInfo.getMem_status(),
					 nowIdBindingInfo.getStart_date(),
					 nowIdBindingInfo.getNowid());
		}
		return log;
	}
	
	public String toString(String serviceName){
		String log = String.format("%s\n", super.toString());
		if(bindingInfo != null){
			for (BindingInfo info : bindingInfo){
				if(info!=null){
					log += String.format("[%1$s-out: %2$s, %3$s] stbid: %4$s\n"+
										 "[%1$s-out: %2$s, %3$s] stbip: %5$s\n"+
										 "[%1$s-out: %2$s, %3$s] deviceID: %6$s\n"+
										 "[%1$s-out: %2$s, %3$s] extInfo: %7$s\n" +
										 "[%1$s-out: %2$s, %3$s] fsa: %8$s\n"+
										 "[%1$s-out: %2$s, %3$s] lastBindDate: %9$s\n"
										 ,serviceName, getServerReferenceNo(), getCallerReferenceNo(), 
										(info.getStbid() == null)?"":info.getStbid(), 
										(info.getStbip() == null)?"":info.getStbip(), 
										(info.getDeviceID() == null)?"":info.getDeviceID(), 
										(info.getExtInfo() == null)?"":info.getExtInfo(), 
										(info.getFsa() == null)?"":info.getFsa(),
										(info.getLastBindDate() == null)?"":info.getLastBindDate());
				}
			}
		}
		if (nowIdBindingInfo != null) {
			log += String.format("\n nowID binding info, " +
					 "npid: %1$s, bind_date: %2$s, nowid_verified: %3$s, mem_status: %4$s, " +
					 "registration_date: %5$s, nowid: %6$s",
					 nowIdBindingInfo.getNpid(),
					 nowIdBindingInfo.getBind_date(),
					 nowIdBindingInfo.getNowid_verified(),
					 nowIdBindingInfo.getMem_status(),
					 nowIdBindingInfo.getStart_date(),
					 nowIdBindingInfo.getNowid());
		}
		return log;					
	}

}
