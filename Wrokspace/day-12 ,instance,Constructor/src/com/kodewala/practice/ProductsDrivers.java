package com.kodewala.practice;

public class ProductsDrivers{

	public static void main(String[] args) {
			
		ProdusctsDetails Driver1 = new ProdusctsDetails("Ihpone", 100000, "Iphone ABC", 2);
		ProdusctsDetails Driver2 = new ProdusctsDetails("Vivo","Vivo ABC",3);
		ProdusctsDetails Driver3 = new ProdusctsDetails();
		
		Driver1.displayDetails();
		Driver2.displayDetails1();
		Driver3.displayDetails();
	}

}
