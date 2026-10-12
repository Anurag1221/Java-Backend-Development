package com.kodewala.practice;

public class CloudRegionConfiguration {

	public static void main(String[] args) {
		
		String region1 = "ap-south-1";
		String region2 = new String("ap-south-1");

		System.out.println(region1 == region2); //false --> reference are different
		System.out.println(region1.equals(region2)); // true --> content are same
	}

}
