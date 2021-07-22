package com.xworz.Encasulation.Example;

public class SlipperTester {

	public static void main(String[] args) {
		
		Slippers sneekers = new Slippers("Sneekers" ,"Black" ,450 ,"shoes");
		
		System.out.println("Price = " +sneekers.getPrice(4500));
		sneekers.setBrand("BATA");
		
		sneekers.setColour("Black");
		System.out.println("Colour = " +sneekers.getColour("blue"));
		
		

	}

}
