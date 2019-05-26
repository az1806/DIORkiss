package com.entity;

public class Cosmetics {

	private String name;
	private String colour;
	private double price;
	private int id;
	private String img;
	
	public Cosmetics() {
		
		
		
		
	}
	
	
	
	
	
	public Cosmetics(String name, String colour, double price, int id,
			String img) {
		super();
		this.name = name;
		this.colour = colour;
		this.price = price;
		this.id = id;
		this.img = img;
	}


	


	public String getName() {
		return name;
	}





	public void setName(String name) {
		this.name = name;
	}





	public String getColour() {
		return colour;
	}





	public void setColour(String colour) {
		this.colour = colour;
	}





	public double getPrice() {
		return price;
	}





	public void setPrice(double price) {
		this.price = price;
	}





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





	@Override
	public String toString() {
		return "Cosmetics [name=" + name + ", colour=" + colour + ", price="
				+ price + ", id=" + id + ", img=" + img + "]";
	}





	
	
	
	
}
