package ims.vi.common.service.client;

import ims.vi.common.annotation.ValueEqual;
import ims.vi.common.bean.Genre;
import ims.vi.common.utils.ObjectUtils;

import ims.vi.common.service.client.ChannelGroup;

import java.io.Serializable;
import java.util.Collection;
import java.util.HashSet;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlList;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

@XmlType(name = "ClientChannel", namespace = "http://www.pccw.com/")
@XmlRootElement(name = "ClientChannel", namespace = "http://www.pccw.com/")
public class Channel implements Serializable, Comparable<Channel> {
	public static final long serialVersionUID = 1L;
	
	@ValueEqual
	private String channelKey;
	private String channelName;
	private String description;
	private int channelId;
	
	@XmlElementRef(name="Genre", type=Genre.class)
	private Collection<Genre> genreList;
		
	@XmlElement
	@XmlList
	private Collection<String> subCustCatList;
		
	@XmlElementRef(name="ChannelGroup", type=ChannelGroup.class)
	private Collection<ChannelGroup> groupList;
	
	public String getChannelKey() {
		return channelKey;
	}

	public void setChannelKey(String channelKey) {
		this.channelKey = channelKey;
	}

	public Collection<Genre> getGenreList() {
		return genreList;
	}

	public void addGenreList(Genre genre) {
		if (genreList == null) genreList = new HashSet<Genre>();
		this.genreList.add(genre);
	}

	public Collection<String> getSubCustCatList() {
		return subCustCatList;
	}

	public void addSubCustCatList(String subCustCat) {
		if (subCustCatList == null) subCustCatList = new HashSet<String>();
		this.subCustCatList.add(subCustCat);
	}

	public Collection<ChannelGroup> getGroupList() {
		return groupList;
	}

	public void addGroupList(ChannelGroup group) {
		groupList = new HashSet<ChannelGroup>();
		this.groupList.add(group);
	}

	@Override
	public int hashCode() {
		return ObjectUtils.hashCode(this);
	}

	@Override
	public boolean equals(Object obj) {
		return ObjectUtils.isEqual(this, obj);
	}

	public String getChannelName() {
		return channelName;
	}

	public void setChannelName(String channelName) {
		this.channelName = channelName;
	}

	public int getChannelId() {
		return channelId;
	}

	public void setChannelId(int channelId) {
		this.channelId = channelId;
	}
	
	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public int compareTo(Channel arg0) {
		// TODO Auto-generated method stub
		int channelId1 = this.getChannelId();
		int channelId2 = ((Channel) arg0).getChannelId();

		return (channelId1 - channelId2);
	}
}