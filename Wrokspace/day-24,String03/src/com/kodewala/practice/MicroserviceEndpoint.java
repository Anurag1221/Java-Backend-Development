package com.kodewala.practice;

public class MicroserviceEndpoint {

	public static void main(String[] args) {
		
		String service = "order";
		String suffix = ".internal";

		String endpoint1 = service + suffix;
		String endpoint2 = "order.internal";
		String endpoint3 = endpoint1.intern();
 
		System.out.println(endpoint1 == endpoint2); //false
		System.out.println(endpoint3 == endpoint2); // true
		System.out.println(endpoint1 == endpoint3); // false  

	}

}
