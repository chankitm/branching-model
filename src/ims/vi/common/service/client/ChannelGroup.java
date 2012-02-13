package ims.vi.common.service.client;

import java.io.Serializable;

import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

@XmlType(name = "ChannelGroup", namespace = "http://www.pccw.com/")
@XmlRootElement(name = "ChannelGroup", namespace = "http://www.pccw.com/")
public class ChannelGroup implements Serializable {
	private static final long serialVersionUID = 1L;
	
	public static String TVB = "TVB";
	public static String ADULT = "ADULT";
	public static String AUDIO = "AUDIO";
	public static String HYBIRD = "HYBIRD";
	
	private String groupStr;
	
	public ChannelGroup() {
		this.groupStr = HYBIRD;
	}
	
	public ChannelGroup(String groupStr) {
		this.groupStr = groupStr;
	}
	
	public void setGroupStr(String groupStr) {
		this.groupStr = groupStr;
	}
	
	public String getGroupStr() {
		return groupStr;
	}
}