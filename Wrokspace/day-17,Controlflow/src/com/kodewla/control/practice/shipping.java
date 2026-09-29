package com.kodewla.control.practice;

public class shipping {
	
	//this method use for accept order amount value
	void calculateShipping(int orderAmount) {
		
		
		if(orderAmount < 2000) {
			
			System.out.println("Shipping Fee Applicable Below Order :" + orderAmount);
			
		}else if(orderAmount >= 2000 && orderAmount <= 5000) {
			
			System.out.println("between order 2000 to 5000 , getting off 100 rupees on shipping ");
		}else {
			System.out.println("Free shipping");
		}
	}
	
}

//Home Work:
//✓ Write a program to calculate the shipping cost based on the order amount:
//• Orders above ₹5,000: Free shipping.
//• Orders between ₹2,000 and ₹5,000: ₹100 shipping fee.
//• Orders below ₹2,000: ₹200 shipping fee.Kod

