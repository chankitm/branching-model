package ims.vi.common.service;

import ims.vi.common.service.client.StandardReturnMessage;

public interface UIMessageService {
	public StandardReturnMessage<String> getUIMessage(
			String code, String serverType, String language);
	
	public StandardReturnMessage<String> getUIMessageForChannelVodLibraryById(
			String code, String channelLibraryId, String serverType, String language);
}