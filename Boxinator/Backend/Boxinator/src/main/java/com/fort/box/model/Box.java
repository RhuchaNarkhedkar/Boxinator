package com.fort.box.model;

public class Box {

	private int id;
	private String name;
	private int weight;
	private String color;
	private String country;

	public Box(String name, int weight, String color, String country) {
		this.name=name;
		this.weight=weight;
		this.color=color;
		this.country=country;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public Box() {
		
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getWeight() {
		return weight;
	}

	public void setWeight(int weight) {
		this.weight = weight;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	
	 @Override
	  public String toString() {
	    return "Box [id=" + id + ", name=" + name + ", weight=" + weight + ", color=" + color
	        + ", country=" + country + "]";
	  }
}