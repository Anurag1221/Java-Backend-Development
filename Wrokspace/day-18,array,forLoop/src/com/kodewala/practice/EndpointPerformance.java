package com.kodewala.practice;

public class EndpointPerformance {
	
	String endpoints;
	int responseTimes;
	
	public EndpointPerformance(String endpoints, int responseTimes) {
		super();
		this.endpoints = endpoints;
		this.responseTimes = responseTimes;
	}
	
	
}

//5. API Endpoint Performance Analyzer
//
//Create a class EndpointPerformance.
//
//Create two arrays:
//
//String[] endpoints = {
//    "/api/users",
//    "/api/orders",
//    "/api/payments",
//    "/api/products"
//};
//
//int[] responseTimes = {
//    120,
//    850,
//    340,
//    620
//};
//
//The index represents the relationship:
//
//endpoints[0] → responseTimes[0]
//endpoints[1] → responseTimes[1]
//
//Using a for loop:
//
//Print endpoint + response time.
//If response time > 500, print "Slow".
//Find the endpoint with the highest response time.
//Count how many endpoints are slow.
//
//Focus: parallel arrays + loop + conditions.
