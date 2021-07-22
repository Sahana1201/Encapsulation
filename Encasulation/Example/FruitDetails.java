package com.xworz.Encasulation.Example;

public class FruitDetails {

	private String name;
	private int price;
	private String colour;

	public FruitDetails(String name, int price, String colour) {
		super();
		this.name = name;
		this.price = 35;
		this.colour = colour;

	}

	public void setPrice(int price) {
		this.price = price;
	}

	public void setColor(String colour) {
		this.colour = colour;
	}

	// Declaring Getter for all fields
	public String getName() {
		return name;
	}

	public int getPrice() {
		if (price <= 35)
			System.out.println("we will get half kg of fruit");
		else
			System.out.println("we will get 1kg of fruit");
		return price;
	}

	public String getColour() {
		return colour;
	}
	

}