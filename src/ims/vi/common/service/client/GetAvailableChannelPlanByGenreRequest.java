package ims.vi.common.service.client;

public class GetAvailableChannelPlanByGenreRequest extends APIRequest {
	private String fsa;
	private String genreCode;
	
	public GetAvailableChannelPlanByGenreRequest() {
		super();
	}

	public GetAvailableChannelPlanByGenreRequest(String callerID,
			String callerReferenceNo, String version, String fsa,
			String genreCode) {
		super(callerID, callerReferenceNo, version);
		this.fsa = fsa;
		this.genreCode = genreCode;
	}

	public String getFsa() {
		return fsa;
	}

	public void setFsa(String fsa) {
		this.fsa = fsa;
	}

	public String getGenreCode() {
		return genreCode;
	}

	public void setGenreCode(String genreCode) {
		this.genreCode = genreCode;
	}
	
	@Override
	public String toString() {
		return "GetAvailableChannelPlanByGenreRequest [fsa=" + fsa
				+ ", genreCode=" + genreCode + "]";
	}
	
	@Override
	public Class getResponseClass() {
		// TODO Auto-generated method stub
		return GetAvailableChannelPlanByGenreResponse.class;
	}

}
