package com.kodewala.practice;

public class ProductDriver {

	public static void main(String[] args) {
		DiscountedProduct product = new DiscountedProduct("Iphone", 100000, 5000);
		
		product.calculate();

	}

}
