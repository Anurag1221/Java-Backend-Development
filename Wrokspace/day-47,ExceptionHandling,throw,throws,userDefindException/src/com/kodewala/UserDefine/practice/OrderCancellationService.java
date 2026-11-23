package com.kodewala.UserDefine.practice;

public class OrderCancellationService {
	
	public void processCancallation(String orderId, String orderStatus){
		
		try {
			orderService(orderId, orderStatus);
			
		} catch (OrderAlreadyShippedException e) {
			e.printStackTrace();
		}
	}
	
	public void orderService(String orderId, String orderStatus) throws OrderAlreadyShippedException{
		
		if(orderStatus.equals("SHIPPED")){
			
			throw new OrderAlreadyShippedException("Order ID " + orderId + " cannot be cancelled because it is already shipped.");
		}
		else {
			 System.out.println("Order cancelled successfully: " + orderId);
		}
		
	}
}
