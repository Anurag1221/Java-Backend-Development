package com.kodewala.practice;

public class LogMessage {

	public static void main(String[] args) {

		String service = "OrderService";
		String status = "FAILED";

		String log1 = service + status;
		String log2 = "OrderServiceFAILED";

		System.out.println(log1 == log2); //false
		System.out.println(log1.equals(log2)); // true

	}

}
