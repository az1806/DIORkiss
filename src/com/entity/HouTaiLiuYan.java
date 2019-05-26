package com.entity;

public class HouTaiLiuYan {
private int id;
private String name;
private String phone;
private String email;
private String content;
public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public String getPhone() {
	return phone;
}
public void setPhone(String phone) {
	this.phone = phone;
}
public String getEmail() {
	return email;
}
public void setEmail(String email) {
	this.email = email;
}
public String getContent() {
	return content;
}
public void setContent(String content) {
	this.content = content;
}
public HouTaiLiuYan(int id, String name, String phone, String email,
		String content) {
	super();
	this.id = id;
	this.name = name;
	this.phone = phone;
	this.email = email;
	this.content = content;
}
public HouTaiLiuYan() {
	
}
@Override
public String toString() {
	return "HouTaiLiuYan [id=" + id + ", name=" + name + ", phone=" + phone
			+ ", email=" + email + ", content=" + content + "]";
}

}
