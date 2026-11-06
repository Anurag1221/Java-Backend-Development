package com.kodewala.marker.Interface;

public class DataCleaner {
	
public void clean(Object obj) {
		
		if(obj instanceof Cleanable) {
			
			System.out.println("Allowed to perform te data cleaning");
			//100 lines....
		}
		else {
		 	System.out.println("Not Allowed to perform data cleaning");
		}
	}
}
