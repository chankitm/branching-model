package ims.vi.common.service;

import ims.vi.common.service.client.StandardReturnMessage;
import ims.vi.common.service.client.MspSubmitResultMainWrapper;
import ims.vi.common.service.client.UniqueKey;
import ims.vi.common.service.client.UserInfo;
import ims.vi.common.service.client.SubmitInfo;

public interface MspService {
	public StandardReturnMessage<Boolean> isPCCWMobile(final String msisdn);
	public StandardReturnMessage<UserInfo> getUserInfo(final UniqueKey key, final String language);
	
	//public StandardReturnMessage<Boolean> submit(final UniqueKey key, final SubmitInfo submitInfo);
	public StandardReturnMessage<MspSubmitResultMainWrapper> submit(final UniqueKey key, final SubmitInfo submitInfo, final String language);
}