package com.kodewala.interfacee.practice05;

public class ResidentialTaxRelief implements PropertyTaxDiscount{

	@Override
	public void calculateDiscount(int amount, int rate) {
		
		int dis = amount * 10 / 100; 
		System.out.println("Current Amount: " + amount);
		System.out.println("rate: " + rate);
		System.out.println("Discount: " + dis);
		System.out.println("Current Amount: " + (amount - dis));
		
		
	}

	@Override
	public void calculatePropertyDiscount(int propertyAge) {
		
		if(propertyAge > 20) {
			
			System.out.println("You are getting 15% discount");
		}
		else {
			System.out.println("you are getting 10% discount");
		}
		
	}
	
}
