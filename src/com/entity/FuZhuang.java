package com.entity;

public class FuZhuang {
	private int id;
	private String bodyc;
	private String girlc;
	private String style;
	private int size;
	private String colour;
	private double price;
	private String img;
	
	
	public FuZhuang(){
	
	}
	
	
	
	
	
	public FuZhuang(int id, String bodyc, String girlc, String style, int size,
			String colour, double price) {
		super();
		this.id = id;
		this.bodyc = bodyc;
		this.girlc = girlc;
		this.style = style;
		this.size = size;
		this.colour = colour;
		this.price = price;
	}
	
	
	
	
	
	public String getImg() {
		return img;
	}





	public void setImg(String img) {
		this.img = img;
	}





	public FuZhuang(int id, String bodyc, String girlc, String style, int size,
			String colour, double price, String img) {
		super();
		this.id = id;
		this.bodyc = bodyc;
		this.girlc = girlc;
		this.style = style;
		this.size = size;
		this.colour = colour;
		this.price = price;
		this.img = img;
	}





	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getBodyc() {
		return bodyc;
	}
	public void setBodyc(String bodyc) {
		this.bodyc = bodyc;
	}
	public String getGirlc() {
		return girlc;
	}
	public void setGirlc(String girlc) {
		this.girlc = girlc;
	}
	public String getStyle() {
		return style;
	}
	public void setStyle(String style) {
		this.style = style;
	}
	public int getSize() {
		return size;
	}
	public void setSize(int size) {
		this.size = size;
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
	@Override
	public String toString() {
		return "FuZhuang [id=" + id + ", bodyc=" + bodyc + ", girlc=" + girlc
				+ ", style=" + style + ", size=" + size + ", colour=" + colour
				+ ", price=" + price + "]";
	}
	
	
}
