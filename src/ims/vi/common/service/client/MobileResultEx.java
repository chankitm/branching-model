package ims.vi.common.service.client;

public class MobileResultEx extends MobileResult {

	/**
	 * 
	 */
	private static final long serialVersionUID = 2614462176098921025L;
	private String result;
	private String error;
	private String fsa;
	
	public String getResult() {
		return result;
	}
	public void setResult(String result) {
		this.result = result;
	}
	public String getError() {
		return error;
	}
	public void setError(String error) {
		this.error = error;
	}
	public String getFsa() {
		return fsa;
	}
	public void setFsa(String fsa) {
		this.fsa = fsa;
	}
	
	
}
