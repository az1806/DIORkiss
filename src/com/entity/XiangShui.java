package com.entity;

public class XiangShui {
	
	private int id;
	private String name;
	private String type;
	private double ml;
	private double price;
	private String img;
	
	public XiangShui() {
		
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

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public double getMl() {
		return ml;
	}

	public void setMl(double ml) {
		this.ml = ml;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public String getImg() {
		return img;
	}


	public void setImg(String img) {
		this.img = img;
	}

	public XiangShui(int id, String name, String type, double ml, double price,
			String img) {
		super();
		this.id = id;
		this.name = name;
		this.type = type;
		this.ml = ml;
		this.price = price;
		this.img = img;
	}

	@Override
	public String toString() {
		return "XiangShui [id=" + id + ", name=" + name + ", type=" + type
				+ ", ml=" + ml + ", price=" + price + ", img=" + img + "]";
	}
	
	
	


}
