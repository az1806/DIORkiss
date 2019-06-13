package com.entity;

public class ZiXunFenLei {
    private int id;
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
	
	
	public ZiXunFenLei(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}
	public ZiXunFenLei() {
		
	}
	@Override
	public String toString() {
		return "ZiXunFenLei [id=" + id + ", name=" + name + "]";
	}
	
	

}
