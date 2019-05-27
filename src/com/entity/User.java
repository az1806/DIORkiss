package com.entity;

public class User {
	private int id;
	private String username;
	private String pwd;
	private String img;
	private String position;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPwd() {
		return pwd;
	}
	public void setPwd(String pwd) {
		this.pwd = pwd;
	}
	public String getImg() {
		return img;
	}
	public void setImg(String img) {
		this.img = img;
	}
	public String getPosition() {
		return position;
	}
	public void setPosition(String position) {
		this.position = position;
	}
	public User(int id, String username, String pwd, String img, String position) {
		super();
		this.id = id;
		this.username = username;
		this.pwd = pwd;
		this.img = img;
		this.position = position;
	}
	public User() {
		
	}
	@Override
	public String toString() {
		return "User [id=" + id + ", username=" + username + ", pwd=" + pwd
				+ ", img=" + img + ", position=" + position + "]";
	}
	
	
	
	

}