package ims.vi.common.service.client.message;

import ims.vi.common.service.client.enums.MovieHouseResponseCode;
import ims.vi.common.service.client.enums.ServerType;

import java.io.Serializable;

import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

@XmlType(name="MovieHouseSdxMessage")
@XmlRootElement(name="MovieHouseSdxMessage")
public class MovieHouseSdxMessage extends BaseMessage implements Serializable {
	private static final long serialVersionUID = 1L;
	public static final String SERVERTYPE = ServerType.MOVIEHOUSE.getType();
	
	private boolean success;
	private MovieHouseResponseCode responseCode;
	
	public MovieHouseSdxMessage() {
		this.responseCode = MovieHouseResponseCode.SUCCESS;
	}
	
	public MovieHouseSdxMessage(String refId) {
		super(refId);
		this.responseCode = MovieHouseResponseCode.SUCCESS;
	}
	
	public boolean isSuccess() {
		return success;
	}

	public void setSuccess(boolean success) {
		this.success = success;
	}

	public void setResponseCode(MovieHouseResponseCode responseCode) {
		this.responseCode = responseCode;
	}
	
	public MovieHouseResponseCode getResponseCode() {
		return responseCode;
	}
	
	public String toString() {
		return "[MovieHouseSdxMessage: success " + success + ", responseCode: " +
			responseCode.name() + "]";
	}
}