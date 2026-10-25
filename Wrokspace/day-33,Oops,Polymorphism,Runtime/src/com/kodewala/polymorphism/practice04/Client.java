package com.kodewala.polymorphism.practice04;

public class Client {

	public static void main(String[] args) {
		
		TrackingService trackingService = new TrackingService();
		
		ColdChainTracker coldChainTracker = new ColdChainTracker();
		trackingService.service(coldChainTracker, "AR101");

	}

}
