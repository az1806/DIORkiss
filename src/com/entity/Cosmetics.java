package com.entity;

public class Cosmetics {

	private String name;
	private String colour;
	private double price;
	private int id;
	private String img;
	private String coloursize;
	private String style;
	private String effect;
	private String girlc;
	private int tid;
	private int size;
	private String bodyc;
	private String type;
	private double ml;
	
	public Cosmetics() {
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

	public String getColoursize() {
		return coloursize;
	}

	public void setColoursize(String coloursize) {
		this.coloursize = coloursize;
	}

	public String getStyle() {
		return style;
	}

	public void setStyle(String style) {
		this.style = style;
	}

	public String getEffect() {
		return effect;
	}

	public void setEffect(String effect) {
		this.effect = effect;
	}

	public String getGirlc() {
		return girlc;
	}

	public void setGirlc(String girlc) {
		this.girlc = girlc;
	}

	public int getTid() {
		return tid;
	}

	public void setTid(int tid) {
		this.tid = tid;
	}

	public int getSize() {
		return size;
	}

	public void setSize(int size) {
		this.size = size;
	}

	public String getBodyc() {
		return bodyc;
	}

	public void setBodyc(String bodyc) {
		this.bodyc = bodyc;
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

	public Cosmetics(String name, String colour, double price, int id,
			String img, String coloursize, String style, String effect,
			String girlc, int tid, int size, String bodyc, String type,
			double ml) {
		super();
		this.name = name;
		this.colour = colour;
		this.price = price;
		this.id = id;
		this.img = img;
		this.coloursize = coloursize;
		this.style = style;
		this.effect = effect;
		this.girlc = girlc;
		this.tid = tid;
		this.size = size;
		this.bodyc = bodyc;
		this.type = type;
		this.ml = ml;
	}

	@Override
	public String toString() {
		return "Cosmetics [name=" + name + ", colour=" + colour + ", price="
				+ price + ", id=" + id + ", img=" + img + ", coloursize="
				+ coloursize + ", style=" + style + ", effect=" + effect
				+ ", girlc=" + girlc + ", tid=" + tid + ", size=" + size
				+ ", bodyc=" + bodyc + ", type=" + type + ", ml=" + ml + "]";
	}
	
}
