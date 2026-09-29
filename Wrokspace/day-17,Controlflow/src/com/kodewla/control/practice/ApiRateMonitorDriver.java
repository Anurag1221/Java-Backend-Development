package com.kodewla.control.practice;

public class ApiRateMonitorDriver {

	public static void main(String[] args) {
		
		ApiRateMonitor api = new ApiRateMonitor();
		
		api.apiUsage(50,1);

	}

}

//2. API Rate Limit Checker
//Create a class ApiRateMonitor.
//
//Take:
//
//requestCount
//timeInMinutes
//
//Rules:
//
//More than 100 requests in 1 minute → "Rate Limit Exceeded"
//50–100 → "Warning: High API Usage"
//Below 50 → "Normal Usage"
//
//Focus: if-else-if
