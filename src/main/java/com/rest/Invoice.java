package com.rest;

import javax.xml.bind.annotation.XmlElement;

@SuppressWarnings("restriction")
public class Invoice {

	@XmlElement(name="name")
	String name;
	@XmlElement(name="price")
	int price;
	
	public Invoice(){
		
	}
	public Invoice(String aName, int aPrice){
		this.name=aName;
		this.price=aPrice;
	}
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

}