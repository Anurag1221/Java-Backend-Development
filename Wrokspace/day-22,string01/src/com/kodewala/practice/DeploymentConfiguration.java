package com.kodewala.practice;

public class DeploymentConfiguration {

	public static void main(String[] args) {
		
		String environment1 = "PRODUCTION";
		String environment2 = new String("PRODUCTION");
		String environment3 = "PRODUCTION";
		
		System.out.println(environment1 == environment2); // false,  == method compare the address/reference in string
		System.out.println(environment1.equals(environment2)); // true, .equals method compare the content of string
		
		System.out.println(environment1 == environment3);// true, == method compare the address/reference in string
		System.out.println(environment1.equals(environment3)); //true, .equals method compare the content of string
		
		System.out.println(environment2 == environment3); // false , == method compare the address/reference in string
		System.out.println(environment2.equals(environment3)); // true, .equals method compare the content of string
	}

}
