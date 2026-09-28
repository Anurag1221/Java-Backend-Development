package com.kodewala.practice;

public class GatewayConfiguration {
	String gatewayName;
	String apiBaseUrl;
	String environment;
	
	GatewayConfiguration(){
		this("Unknown");
	}
	
	GatewayConfiguration(String _gatewayName){
		this(_gatewayName, "Unknown");
	}
	
	GatewayConfiguration(String _gatewayName, String _apiBaseUrl){
		this(_gatewayName, _apiBaseUrl, "Unknown");
	}
	
	GatewayConfiguration(String _gatewayName, String _apiBaseUrl, String _environment){
		this.gatewayName = _gatewayName;
		this.apiBaseUrl = _apiBaseUrl;
		this.environment = _environment;
	}
	
}
