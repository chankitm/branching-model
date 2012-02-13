package ims.vi.common.service.client;

import ims.vi.common.service.client.enums.RestServerResponseCode;

import java.util.List;

public class GetSubscriptedChannelsResponse extends APIResponse{

	List<ChannelPlanInfo> channelPlanInfo;
	
	public GetSubscriptedChannelsResponse(RestServerResponseCode responseCode,
			String callerReferenceNo, String serverReferenceNo,
			long elapsedTime, List<ChannelPlanInfo> channelPlanInfo) {
		super(responseCode, callerReferenceNo, serverReferenceNo, elapsedTime);
		this.channelPlanInfo = channelPlanInfo;
	}
	
	public GetSubscriptedChannelsResponse() {
		// TODO Auto-generated constructor stub
	}

	public List<ChannelPlanInfo> getChannelPlanInfo() {
		return channelPlanInfo;
	}
	public void setChannelPlanInfo(List<ChannelPlanInfo> channelPlanInfo) {
		this.channelPlanInfo = channelPlanInfo;
	}

	@Override
	public String toString() {
		String log = String.format("%s", super.toString());
		if(channelPlanInfo != null){
			for (ChannelPlanInfo info : channelPlanInfo){
				if(info!=null){
					log += String.format(", %s", info.toString());
				}
			}
		}
		return log;
	}
}
