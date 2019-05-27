package com.entity;

public class KouHong {
	private int id;
	private String name;
	private String coloursize;
	private String colour;
	private String effect;
	private double price;
	private String img;
	private int tid;
	
	
	
	public KouHong() {
	
	}
	
	
	
	
	
	
	public KouHong(int id, String name, String coloursize, String colour,
			String effect, double price,String img,int tid) {
		super();
		this.id = id;
		this.name = name;
		this.coloursize = coloursize;
		this.colour = colour;
		this.effect = effect;
		this.price = price;
		this.img = img;
		this.tid=tid;
	}


	public int getTid() {
		return tid;
	}






	public void setTid(int tid) {
		this.tid = tid;
	}



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






	public String getColoursize() {
		return coloursize;
	}






	public void setColoursize(String coloursize) {
		this.coloursize = coloursize;
	}






	public String getColour() {
		return colour;
	}






	public void setColour(String colour) {
		this.colour = colour;
	}






	public String getEffect() {
		return effect;
	}






	public void setImg(String img) {
		this.img = img;
	}

	public String getImg() {
		return img;
	}






	public void setEffect(String effect) {
		this.effect = effect;
	}




	public double getPrice() {
		return price;
	}






	public void setPrice(double price) {
		this.price = price;
	}






	@Override
	public String toString() {
		return "KouHong [id=" + id + ", name=" + name + ", coloursize="
				+ coloursize + ", colour=" + colour + ", effect=" + effect
				+ ", price=" + price + ", img=" + img + "]";
	}






	
	
	
	
	
	


}
