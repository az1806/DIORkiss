package com.entity;

public class DongTai {
private int id;
private String img;
public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public String getImg() {
	return img;
}
public void setImg(String img) {
	this.img = img;
}
public DongTai(int id, String img) {
	super();
	this.id = id;
	this.img = img;
}
@Override
public String toString() {
	return "DongTai [id=" + id + ", img=" + img + "]";
}
public DongTai() {
	
}

}
