package com.entity;

public class Company {
	private int id ;
	private String name;
	private String phone;
	private String address;
	private String email;
	private String culture;
	private String introduction;
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
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getCulture() {
		return culture;
	}
	public void setCulture(String culture) {
		this.culture = culture;
	}
	public String getIntroduction() {
		return introduction;
	}
	public void setIntroduction(String introduction) {
		this.introduction = introduction;
	}
	
	public String getImg() {
		return img;
	}
	public void setImg(String img) {
		this.img = img;
	}
	
	public Company(int id, String name, String phone, String address,
			String email, String culture, String introduction, 
			String img) {
		super();
		this.id = id;
		this.name = name;
		this.phone = phone;
		this.address = address;
		this.email = email;
		this.culture = culture;
		this.introduction = introduction;
		this.img = img;
	}
	public Company() {
		
	}
	@Override
	public String toString() {
		return "Company [id=" + id + ", name=" + name + ", phone=" + phone
				+ ", address=" + address + ", email=" + email + ", culture="
				+ culture + ", introduction=" + introduction + ", img=" + img
				+ "]";
	}

}
