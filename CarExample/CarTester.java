package com.xworkz.Encapsulation.CarExample;

public class CarTester {

	public static void main(String[] args) {
		Car car = new Car();

		car.setEngine("Petrol");
		car.setModel("Ford");
		car.setSpeed(472);

		car.getEngine();
		car.getModel();
		car.getSpeed();
		System.out.println(
				"Engine :- " + car.getEngine() + "Model:- " + car.getModel() + "SPEEDinkMPH:- " + car.getSpeed());

	}

}
