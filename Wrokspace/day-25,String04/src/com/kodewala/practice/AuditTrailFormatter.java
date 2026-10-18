package com.kodewala.practice;
//StringBuilder mutable
//if i want to modify StringBuilder, that update same object not created new object

public class AuditTrailFormatter {

	public static void main(String[] args) {
		
		StringBuilder service = new StringBuilder(); 
		StringBuilder status = new StringBuilder();
		
		service.append("OrderProcessor");
		status.append("FAILED");
		
		System.out.println("service =" +  service);
		System.out.println("status =" +  status);
		
		
		
	}

}
