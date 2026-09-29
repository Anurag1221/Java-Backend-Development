package com.kodewla.control.practice;

public class DeliveryEligibility {
	
	public int delivery(int orderAmount,int deliveryDistance) {
		
		if(orderAmount<999 && deliveryDistance<=5) {
			
			System.out.println("Delivery on below order 999,charge will be applicable 40rs,below 5kg range :" + orderAmount);
			
			
		}else if(orderAmount<999 && deliveryDistance>5) {
			
			System.out.println("Delivery on below order 999,delivery charge will be applicable 80rs,above 5kg range :" + orderAmount);
			
		}else {
			
			System.out.println("Free Delivery on above order 999 :" + orderAmount);
		}
		
		return 0;
	}
}
