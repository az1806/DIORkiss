package com.entity;

public class ZiXun {
	private int id;
	private String h;
	private String content;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getH() {
		return h;
	}
	public void setH(String h) {
		this.h = h;
	}
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}
	public ZiXun(int id, String h, String content) {
		super();
		this.id = id;
		this.h = h;
		this.content = content;
	}
	public ZiXun() {
		
	}
	@Override
	public String toString() {
		return "ZiXun [id=" + id + ", h=" + h + ", content=" + content + "]";
	}
	

}
