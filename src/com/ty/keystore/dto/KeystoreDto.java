package com.ty.keystore.dto;

public class KeystoreDto {
	private int uid;
	private String comments;
	private String description;
	private String key;
	private String value;
	
	

	@Override
	public String toString() {
		return "Keystore [uid=" + uid + ", comments=" + comments + ", description=" + description + ", key=" + key
				+ ", value=" + value + "]";
	}

	public int getUid() {
		return uid;
	}

	public void setUid(int uid) {
		this.uid = uid;
	}

	public String getComments() {
		return comments;
	}

	public void setComments(String comments) {
		this.comments = comments;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getKey() {
		return key;
	}

	public void setKey(String key) {
		this.key = key;
	}

	public String getValue() {
		return value;
	}

	public void setValue(String value) {
		this.value = value;
	}

}
