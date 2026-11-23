package com.kodewala.UserDefine.practice;

public class Driver {
	
	public static void main(String[] args) {
		 
		OrderCancellationService cancellationService = new OrderCancellationService();
		cancellationService.processCancallation("ORD-501", "HIPPED");
	}
}
