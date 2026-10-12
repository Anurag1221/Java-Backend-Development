package com.kodewala.practice;

public class CloudDeploymentConfiguration {

	public static void main(String[] args) {
		
		String configuredEnv = "staging";
		String incomingEnv = new String("staging");
		String reportPrefix = "Deploying to ";
		String report = reportPrefix.concat(incomingEnv);
		String expectedReport = "Deploying to staging";
		
		System.out.println(configuredEnv == incomingEnv); //false
		System.out.println(configuredEnv.equals(incomingEnv)); // true
		
		System.out.println(report == expectedReport);// false
		System.out.println(report.equals(expectedReport)); //true
		
		
	}

}
