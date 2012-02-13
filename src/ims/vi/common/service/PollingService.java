package ims.vi.common.service;

import java.util.List;

import ims.vi.common.service.client.StandardReturnMessage;

public interface PollingService {

	public StandardReturnMessage<List<ims.vi.common.service.response.VoteQuestion>> getVoteInfoByInterval(final int intervalInHour);
	
}