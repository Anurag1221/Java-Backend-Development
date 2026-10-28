package com.kodewala.polymorphism;

class Delivery {

	public void doDelivery() {

		System.out.println("Delivery.doDelivery()");
	}
}

class ExpressBee extends Delivery{
	
	@Override
	public void doDelivery() {

		System.out.println("ExpressBee.doDelivery()");
	}
}

class Ekart extends Delivery{
	
	@Override
	public void doDelivery() {

		System.out.println("Ekart.doDelivery()");
	}
}

public class Driver {

	public static void main(String[] args) {
		
//		Delivery delivery = new Delivery(); // int amount = 100;
//		
//		//Compile time --> it will check the method in Delivery class
//		//Runtime --> it will call the method of Delivery class
//		delivery.doDelivery(); // Compile time -->
		
		//Parent class can refer child class object
//		Delivery delivery1 =(Delivery) new ExpressBee(); // Up-Casting
//		//Compile Time --> it will check the method in Delivery class
//		//Runtime --> it will call the method of ExpressBee class
//		delivery1.doDelivery();
		
		//Down-Casting
		Delivery del = new ExpressBee();
		
		ExpressBee expressbee = (ExpressBee) del;
		expressbee.doDelivery();
		
	}

}
