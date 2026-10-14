package com.kodewala.practice;

public class PaymentGatewayConfig {
	
	String userName;
	
	static {
		System.out.println("Gateway object created");
	}

	public PaymentGatewayConfig(String userName) {
		super();
		System.out.println("PaymentGatewayConfig.PaymentGatewayConfig()");
		this.userName = userName;
	}

}


