package com.entity;

import java.util.Date;

public class ZiXun {
	private int id;
	private String h;
	private String content;
	private String name;
	private int tid;
	private Date time;
	
	public Date getTime() {
		return time;
	}
	public void setTime(Date time) {
		this.time = time;
	}
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
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getTid() {
		return tid;
	}
	public void setTid(int tid) {
		this.tid = tid;
	}
	
	public ZiXun(int id, String h, String content, String name, int tid,
			Date time) {
		super();
		this.id = id;
		this.h = h;
		this.content = content;
		this.name = name;
		this.tid = tid;
		this.time = time;
	}
	public ZiXun() {
		
	}
	@Override
	public String toString() {
		return "ZiXun [id=" + id + ", h=" + h + ", content=" + content
				+ ", name=" + name + ", tid=" + tid + ", time=" + time + "]";
	}
	
	
	
	

}
