package com.kodewala.practice;

public class UPIPaymentGateway extends GatewayConfiguration {
	String merchantId;
	String callbackUrl;
	
	UPIPaymentGateway(String _merchantId){
		super("Unknown", "Unknown", "Unknown");
		
		this.merchantId = _merchantId;
		this.callbackUrl = "Unknown";
	}
	
	UPIPaymentGateway(String _gatewayName, String _apiBaseUrl, String _environment,String _merchantId, String _callbackUrl){
		super(_gatewayName, _apiBaseUrl, _environment);
		
		this.merchantId = _merchantId;
		this.callbackUrl = _callbackUrl;
		
	}
	
	void displayDetails() {
		
		System.out.println("Gateway Name : " + gatewayName);
        System.out.println("API Base URL : " + apiBaseUrl);
        System.out.println("Environment  : " + environment);
        System.out.println("Merchant ID  : " + merchantId);
        System.out.println("Callback URL : " + callbackUrl);
		System.out.println();
	}
}
