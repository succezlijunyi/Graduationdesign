package com.springdemo.domain;

public class AfterDataInstance {

	private String id;
	private String origin;
	private String filename;

	public String getFilename() {
		return filename;
	}

	@Override
	public String toString() {
		return "AfterDataInstance [id=" + id + ", origin=" + origin + ", filename=" + filename + "]";
	}

	public void setFilename(String filename) {
		this.filename = filename;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getOrigin() {
		return origin;
	}

	public void setOrigin(String origin) {
		this.origin = origin;
	}

}
