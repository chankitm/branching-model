package ims.vi.common.service.client;

import java.util.Date;


import ims.vi.common.service.client.enums.RestServerResponseCode;
import ims.vi.common.service.client.enums.ServerType;

public class GetProfileByNetpassIDResponse extends APIResponse {
	public static final String SERVERTYPE = ServerType.MOVIEHOUSE.getType();
	private String fsa;
	private String start_date;
	private String nowid_verified;
	private String mem_status;
	private String nowid;
	private String bind_date;

	public GetProfileByNetpassIDResponse(){
		
	}
	
	public GetProfileByNetpassIDResponse(String fsa, String start_date, String nowid_verified, String mem_status, String nowid, String bind_date, RestServerResponseCode responseCode, String callerReferenceNo, String serverReferenceNo, long elaspedTime){
		super(responseCode, callerReferenceNo, serverReferenceNo, elaspedTime);
		this.fsa = fsa;
		this.start_date = start_date;
		this.nowid_verified = nowid_verified;
		this.mem_status = mem_status;
		this.nowid = nowid;
		this.bind_date = bind_date;
	}
		
	public String getFsa() {
		return fsa;
	}

	public void setFsa(String fsa) {
		this.fsa = fsa;
	}
	
	public String getStart_date() {
		return start_date;
	}

	public void setStart_date(String start_date) {
		this.start_date = start_date;
	}
	
	public String getNowid_verified() {
		return nowid_verified;
	}
	
	public void setNowid_verified(String nowid_verified) {
		this.nowid_verified = nowid_verified;
	}

	public String getMem_status() {
		return mem_status;
	}

	public void setMem_status(String mem_status) {
		this.mem_status = mem_status;
	}

	public String getNowid() {
		return nowid;
	}

	public void setNowid(String nowid) {
		this.nowid = nowid;
	}

	public String getBind_date() {
		return bind_date;
	}

	public void setBind_date(String bind_date) {
		this.bind_date = bind_date;
	}

	@Override
	public String toString(){
		return String.format("%1$s, fsa: %2$s, start_date: %3$s, Nowid_verified: %4$s, Mem_status: %5$s, Nowid: %6$s, Bind_date: %7$s", 
				super.toString()
				,getFsa()
				,getStart_date()
				,getNowid_verified()
				,getMem_status()
				,getNowid()
				,getBind_date());
	}
	
	public String toString(String serviceName){
		return String.format("%1$s\n" +
							 "[%2$s-out: %3$s, %4$s] fsa: %5$s\n"+
							 "[%2$s-out: %3$s, %4$s] registration date: %6$s\n"+
							 "[%2$s-out: %3$s, %4$s] Nowid_verified: %7$s\n"+
							 "[%2$s-out: %3$s, %4$s] Mem_status: %8$s\n"+
							 "[%2$s-out: %3$s, %4$s] Nowid: %9$s\n"+
							 "[%2$s-out: %3$s, %4$s] Bind_date: %10$s\n"							 
							 , super.toString(serviceName)
							 , serviceName
							 , getServerReferenceNo()!=null?getServerReferenceNo():""
							 , getCallerReferenceNo()!=null?getCallerReferenceNo():""
							 , getFsa()
							 , getStart_date()
							 , getNowid_verified()
							 , getMem_status()
							 , getNowid()
							 , getBind_date());
	}
	
}
