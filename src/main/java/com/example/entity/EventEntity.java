package com.example.entity;

public class EventEntity {

	private String uid;

	private String guid;

	private String summary;

	private Integer folderId;

	public String getUid() {
		return uid;
	}

	public String getGuid() {
		return guid;
	}

	public void setUid(String uid) {
		this.uid = uid;
	}

	public void setGuid(String guid) {
		this.guid = guid;
	}

	public String getSummary() {
		return summary;
	}

	public Integer getFolderId() {
		return folderId;
	}

	public void setSummary(String summary) {
		this.summary = summary;
	}

	public void setFolderId(Integer folderId) {
		this.folderId = folderId;
	}

}
