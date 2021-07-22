package com.xworz.Encasulation.Example;

public class Slippers {

	private String brand;
	public String colour;
	public int price;
	private String type;

	public Slippers(String brand, String colour, int price, String type) {
		super();
		this.brand = brand;
		this.colour = colour;
		this.price = price;
		this.type = type;
	}

	void setPrice(int price) {
		this.price = price;
	}

	void setColour(String colour) {
		this.colour = colour;
	}

	public String setBrand(String brand) {
		if (brand == "BATA")
			System.out.println("BATA slippers");
		else if (brand == "Paragon")
			System.out.println("Paragon Slippers");
		else
			System.out.println("enter brand properly");
		return brand;
	}

	public String getColour(String color) {
		return color;
	}

	public int getPrice(int price) {
		return price;
	}

	public String getType() {
		return type;

	}
	public String getbrand(String Brand) {
		return brand ;
	}

}
