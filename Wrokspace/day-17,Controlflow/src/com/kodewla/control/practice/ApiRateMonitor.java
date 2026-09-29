package com.kodewla.control.practice;

public class ApiRateMonitor {
	
	public int apiUsage(int requestCount,int timeInMinutes) {
		
		if(requestCount<50 && timeInMinutes==1) {
			
			System.out.println("Normal Usage");
			
		}else if(requestCount>=50 && requestCount<=100 && timeInMinutes==1) {
			
			System.out.println("Warning: High API Usage");
			
		}else if (requestCount>100 && timeInMinutes==1){
			
			System.out.println("Rate Limit Exceeded");
		}
		
		return 0;
	}
}
