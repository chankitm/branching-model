package ims.vi.common.service.client.message;

import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

@XmlType(name="EchoMessage")
@XmlRootElement(name="EchoMessage")
public class EchoMessage extends BaseMessage {
	private static final long serialVersionUID = 1L;	
	private String echoMessage;
	
	public EchoMessage() {}
	
	public EchoMessage(String refId, String echoMessage) {
		super(refId);
		this.echoMessage = echoMessage;
	}
	
	public String getEchoMessage() {
		return echoMessage;
	}
	
	public void setEchoMessage(String echoMessage) {
		this.echoMessage = echoMessage;
	}
	
	public String toString() {
		return String.format("[echoMessage=%s]",echoMessage);
	}
}