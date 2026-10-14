package com.kodewala.practice;

public class LogMonitoringService {
	
	//sb // 2nd line
	static {
		
		System.out.println("Loading log configuration");
	}
	
	//iib
	{
		System.out.println("Creating monitoring session");
	}

	public LogMonitoringService() {
		super(); //3rd line if super class available
		// iib 4th line
		System.out.println("Monitoring service constructor"); //5 line constructor
	
	}

}
