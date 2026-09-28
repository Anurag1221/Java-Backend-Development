package com.kodewala.practice;

public class ApiRequestConfig {

	String baseUrl;
	String endpoint;
	int timeout;

	ApiRequestConfig() {
		this("Unknown");
	}

	ApiRequestConfig(String _baseUrl) {
		this(_baseUrl, "Unknown", 0);
	}

	ApiRequestConfig(String _baseUrl, String _endpoint, int _timeout) {
		
		baseUrl = _baseUrl;
		endpoint = _endpoint;
		timeout = _timeout;
	}
	
	void displayApi() {
		System.out.println("baseUrl :" + baseUrl);
		System.out.println("endpoint :" + endpoint);
		System.out.println("timeout :" + timeout);
	}

}

//1. API Request Configuration
//
//Create a class ApiRequestConfig.
//
//Requirements:
//
//Store:
//baseUrl
//endpoint
//timeout

//Create 3 constructors:
//No-argument constructor
//Constructor accepting baseUrl
//Constructor accepting baseUrl, endpoint, timeout
//Use constructor chaining with this().
//The no-argument constructor should provide sensible default API configuration.
//Create a method to display the configuration.
//
//Concept focus: this() + constructor chaining.
