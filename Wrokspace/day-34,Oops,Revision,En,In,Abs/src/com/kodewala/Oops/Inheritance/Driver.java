package com.kodewala.Oops.Inheritance;

public class Driver {

	public static void main(String[] args) {
		
		//using parent(DeliveryPartner) class reference calling the child class object 
		DeliveryPartner ekart = new Ekart();
		ekart.doDelivery();

	}

}
