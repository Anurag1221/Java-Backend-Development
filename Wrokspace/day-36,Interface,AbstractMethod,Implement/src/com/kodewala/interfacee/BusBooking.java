package com.kodewala.interfacee;

public class BusBooking implements IDiscount{
	
	@Override
	public int calculateDiscount(int amount, int race){
			
		return IDiscount.MAX_VALUE;
	}

	@Override
	public void calculateDiscountTax(int tax) {
		// TODO Auto-generated method stub
		
	}	
}
