package com.kodewala.functional.practice02;

public interface FileUploadPermission {
	
	//abstract method
	String checkPermission(String userRole, String fileType);
	
	//default method
	default void displayAccessPolicy(){
		
		System.out.println("Checking cloud storage access policy...");
	}
}
