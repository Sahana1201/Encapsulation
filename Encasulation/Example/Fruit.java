package com.xworz.Encasulation.Example;

public class Fruit {

	public static void main(String[] args) {
		 FruitDetails apple = new FruitDetails("Apple",30,"Red"); //Using constructor to inititialize
	        
	        //Using getter to the value
	        System.out.println("Name: "+ apple.getName()+" Price: "+apple.getPrice()+" Colour: "+apple.getColour());
	        
	        //Lets update the price and color using setter
	        apple.setColor("Green");
	        apple.setPrice(45);
	        apple.getPrice();
	        
	        System.out.println("Values of Apple after updation");
	        
	        //Using getter to get the value
	        System.out.println("Name: "+ apple.getName()+" Price: "+apple.getPrice()+" Color: "+apple.getColour());
	    

	}

}
