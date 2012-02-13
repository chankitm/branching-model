/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package ims.vi.common.service.response;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


@XmlType(name = "VoteInfo", namespace = "http://www.pccw.com/")
@XmlRootElement(name = "VoteInfo", namespace = "http://www.pccw.com/")
public class VoteInfo implements Serializable {
	private static final long serialVersionUID = 1L;
	
    int qid;
    int channel_id;
    Date q_start_time;
    Date q_end_time;
    List<VoteQuestion> voteQuestion;

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

	public List<VoteQuestion> getVoteQuestion() {
		return voteQuestion;
	}

	public void setVoteQuestion(List<VoteQuestion> voteQuestion) {
		this.voteQuestion = voteQuestion;
	}


}
