package com.kodewala.practice;

public class UPIPaymentGatewayDriver {

	public static void main(String[] args) {
		// Constructor with merchantId only
        UPIPaymentGateway gateway1 = new UPIPaymentGateway("MERCHANT1025");

        // Constructor with all details
        UPIPaymentGateway gateway2 = new UPIPaymentGateway("UPI Production Gateway","https://api.upi.example.com","PRODUCTION","MERCHANT7845","https://shop.example.com/payment/callback");

        gateway1.displayDetails();
        gateway2.displayDetails();

	}

}

//5. PaymentGateway Configuration
//
//Create a parent class:
//
//GatewayConfiguration
//
//Store:
//
//gatewayName
//apiBaseUrl
//environment
//
//Create constructors:
//
//GatewayConfiguration()
//GatewayConfiguration(String gatewayName)
//GatewayConfiguration(String gatewayName, String apiBaseUrl, String environment)
//
//Now create a child class:
//
//UPIPaymentGateway
//
//Store:
//
//merchantId
//callbackUrl
//
//Requirements:
//
//Use this() for constructor chaining inside GatewayConfiguration.
//Use super() from UPIPaymentGateway to initialize parent properties.
//Create multiple constructors in UPIPaymentGateway.
//One constructor should initialize only merchantId.
//Another should initialize all gateway details.
//Create a method that displays the complete gateway configuration.
//Do not duplicate parent initialization logic.
//
//Concept focus: this() + super() + inheritance + constructor chaining.