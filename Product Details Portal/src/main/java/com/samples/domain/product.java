package com.samples.domain;

import java.util.ArrayList;
import java.util.List;

public class product {

	private int id;
	private String name;
	private String color;
	private double price;
	
	public product(int id, String name, String color, double price) {
		super();
		this.id = id;
		this.name = name;
		this.color = color;
		this.price = price;
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

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}
	
	public List<product> getproductdetails() {
		
		List<product> productlist = new ArrayList<>();
		productlist.add(new product(id, name, color, price));
		
		return productlist;
	}
	
	
}
