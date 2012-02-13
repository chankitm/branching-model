package ims.vi.common.service.response;

import java.io.Serializable;
import java.util.Date;
import java.util.HashMap;

import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

@XmlType(name = "VoteQuestion", namespace = "http://www.pccw.com/")
@XmlRootElement(name = "VoteQuestion", namespace = "http://www.pccw.com/")
public class VoteQuestion implements Serializable {
	private static final long serialVersionUID = 1L;
	
	String locale;
	String qtext;
	HashMap qtextMap;
	
    int qid;
    int channel_id;
    Date q_start_time;
    Date q_end_time;
    
    public VoteQuestion(){}

	public VoteQuestion(String locale, String qtext, HashMap qtextMap, int qid, int channel_id, Date q_start_time, Date q_end_time) {
		super();
		this.locale = locale;
		this.qtext = qtext;
		this.qtextMap = qtextMap;
		this.qid = qid;
		this.channel_id = channel_id;
		this.q_start_time = q_start_time;
		this.q_end_time = q_end_time;
	}

	public String getLocale() {
		return locale;
	}

	public void setLocale(String locale) {
		this.locale = locale;
	}

	public String getQtext() {
		return qtext;
	}

	public void setQtext(String qtext) {
		this.qtext = qtext;
	}

	public HashMap getQtextMap() {
		return qtextMap;
	}

	public void setQtextMap(HashMap qtextMap) {
		this.qtextMap = qtextMap;
	}

	public int getChannel_id() {
		return channel_id;
	}

	public void setChannel_id(int channel_id) {
		this.channel_id = channel_id;
	}

	public Date getQ_end_time() {
		return q_end_time;
	}

	public void setQ_end_time(Date q_end_time) {
		this.q_end_time = q_end_time;
	}

	public Date getQ_start_time() {
		return q_start_time;
	}

	public void setQ_start_time(Date q_start_time) {
		this.q_start_time = q_start_time;
	}

	public int getQid() {
		return qid;
	}

	public void setQid(int qid) {
		this.qid = qid;
	}
    
}
