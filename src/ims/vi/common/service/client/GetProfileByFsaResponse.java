package ims.vi.common.service.client;


import ims.vi.common.service.client.enums.RestServerResponseCode;
import ims.vi.common.service.client.enums.ServerType;

public class GetProfileByFsaResponse extends APIResponse {
	public static final String SERVERTYPE = ServerType.MOVIEHOUSE.getType();
	private String npid;
	private String bind_date;
	private String nowid_verified;
	private String mem_status;
	private String nowid;
	private String start_date;

	public GetProfileByFsaResponse(){
		
	}
	
	public GetProfileByFsaResponse(String npid, String bind_date, String nowid_verified, String mem_status, String start_date, RestServerResponseCode responseCode, String callerReferenceNo, String serverReferenceNo, long elaspedTime){
		super(responseCode, callerReferenceNo, serverReferenceNo, elaspedTime);
		this.npid = npid;
		this.bind_date = bind_date;
		this.nowid_verified = nowid_verified;
		this.mem_status = mem_status;
		this.start_date = start_date;
	}
		



	public String getNpid() {
		return npid;
	}

	public void setNpid(String npid) {
		this.npid = npid;
	}

	public String getBind_date() {
		return bind_date;
	}

	public void setBind_date(String bind_date) {
		this.bind_date = bind_date;
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
	

	public String getStart_date() {
		return start_date;
	}

	public void setStart_date(String start_date) {
		this.start_date = start_date;
	}
	public String getNowid() {
		return nowid;
	}

	public void setNowid(String nowid) {
		this.nowid = nowid;
	}

	@Override
	public String toString(){
		return String.format("%1$s, npid: %2$s, bind_date: %3$s, nowid_verified: %4$s, mem_status: %5$s, registration_date: %6$s, nowid: %7$s", 
				super.toString() 
				,getNpid()
				,getBind_date()
				,getNowid_verified()
				,getMem_status()
				,getStart_date()
				,getNowid());
	}
	
	public String toString(String serviceName){
		return String.format("%1$s\n" +
							 "[%2$s-out: %3$s, %4$s] npid: %5$s\n"+
							 "[%2$s-out: %3$s, %4$s] bind_date: %6$s\n"+
							 "[%2$s-out: %3$s, %4$s] nowid_verified: %7$s\n"+
							 "[%2$s-out: %3$s, %4$s] mem_status: %8$s\n" +
							 "[%2$s-out: %3$s, %4$s] registration_date: %9$s\n"+
							 "[%2$s-out: %3$s, %4$s] nowid: %10$s\n"
							 , super.toString(serviceName)
							 , serviceName
							 , getServerReferenceNo()!=null?getServerReferenceNo():""
							 , getCallerReferenceNo()!=null?getCallerReferenceNo():""
							 , getNpid()
							 , getBind_date()
							 , getNowid_verified()
							 , getMem_status()
							 , getStart_date()
							 , getNowid());
	}
	
}
