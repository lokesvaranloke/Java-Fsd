package com.samples.domain;

public class Flight {

	private int id;
	private String name;
	private String source;
	private String destination;
	private String date;
	private String time;
	private int price;
	
	public Flight() {}

	public Flight(int id, String name, String source, String destination, String date, String time, int price) {
		super();
		this.id = id;
		this.name = name;
		this.source = source;
		this.destination = destination;
		this.date = date;
		this.time = time;
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

	public String getSource() {
		return source;
	}

	public void setSource(String source) {
		this.source = source;
	}

	public String getDestination() {
		return destination;
	}

	public void setDestination(String destination) {
		this.destination = destination;
	}

	public String getDate() {
		return date;
	}

	public void setDate(String date) {
		this.date = date;
	}

	public String getTime() {
		return time;
	}

	public void setTime(String time) {
		this.time = time;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	@Override
	public String toString() {
		return "Flight [id=" + id + ", name=" + name + ", source=" + source + ", destinaion=" + destination + ", date="
				+ date + ", time=" + time + ", price=" + price + "]";
	}
	
	
	
}
