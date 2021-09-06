package com.lti.gcp.restfulwebservices.model;

public class Movie {

	private int id;
	private String name;
	private float rate;
	private double price;
	
	public Movie() {}
	
	public Movie(int id, String name, float rate, double price) {
		super();
		this.id = id;
		this.name = name;
		this.rate = rate;
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
	public float getRate() {
		return rate;
	}
	public void setRate(float rate) {
		this.rate = rate;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}

	@Override
	public String toString() {
		return "Movie [id=" + id + ", name=" + name + ", rate=" + rate + ", price=" + price + "]";
	}
	
	
}
