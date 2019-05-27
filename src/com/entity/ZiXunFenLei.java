package com.entity;

public class ZiXunFenLei {
	private int id;
	private String chanpinname;
    private String content;
	private int tid;
	private String name;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getChanpinname() {
		return chanpinname;
	}
	public void setChanpinname(String chanpinname) {
		this.chanpinname = chanpinname;
	}
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}
	public int getTid() {
		return tid;
	}
	public void setTid(int tid) {
		this.tid = tid;
	}
	
	public ZiXunFenLei(int id, String chanpinname, String content, int tid,
			String name) {
		super();
		this.id = id;
		this.chanpinname = chanpinname;
		this.content = content;
		this.tid = tid;
		this.name = name;
	}
	public ZiXunFenLei() {
		
	}
	@Override
	public String toString() {
		return "ZiXunFenLei [id=" + id + ", chanpinname=" + chanpinname
				+ ", content=" + content + ", tid=" + tid + ", name=" + name
				+ "]";
	}
	

}
