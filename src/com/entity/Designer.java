package com.entity;

public class Designer {
 private int id;
 private String name;
 private String position;
 private String img;
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
public String getPosition() {
	return position;
}
public void setPosition(String position) {
	this.position = position;
}
public String getImg() {
	return img;
}
public void setImg(String img) {
	this.img = img;
}
public Designer(int id, String name, String position, String img) {
	super();
	this.id = id;
	this.name = name;
	this.position = position;
	this.img = img;
}
public Designer() {
	
}
@Override
public String toString() {
	return "Designer [id=" + id + ", name=" + name + ", position=" + position
			+ ", img=" + img + "]";
}

}
