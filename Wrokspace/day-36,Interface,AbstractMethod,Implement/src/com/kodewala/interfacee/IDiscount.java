package com.kodewala.interfacee;

//java version 1.7 or 7 OR before
public interface IDiscount {
	
	public static final int MAX_VALUE = 100; //public static final --> constant
	
	//public abstract int calculateDiscount
	public abstract int calculateDiscount(int amount, int rate);
	
	public abstract void calculateDiscountTax(int tax);
	
	//public abstract void calculateDiscountBus(int discount);
	
}
