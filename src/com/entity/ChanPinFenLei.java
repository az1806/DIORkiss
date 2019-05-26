package com.entity;

public class ChanPinFenLei {
private int id;
private String classt;
private int tid;
private String name;
private String img;
public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public String getClasst() {
	return classt;
}
public void setClasst(String classt) {
	this.classt = classt;
}
public int getTid() {
	return tid;
}
public void setTid(int tid) {
	this.tid = tid;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public String getImg() {
	return img;
}
public void setImg(String img) {
	this.img = img;
}
public ChanPinFenLei(int id, String classt, int tid, String name, String img) {
	super();
	this.id = id;
	this.classt = classt;
	this.tid = tid;
	this.name = name;
	this.img = img;
}
@Override
public String toString() {
	return "ChanPinFenLei [id=" + id + ", classt=" + classt + ", tid=" + tid
			+ ", name=" + name + ", img=" + img + "]";
}
public ChanPinFenLei() {
	
}

}
