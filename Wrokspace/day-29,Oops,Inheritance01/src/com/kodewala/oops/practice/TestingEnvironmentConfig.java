package com.kodewala.oops.practice;

//extend the DeploymentEnvironmentBase class and DeploymentEnvironmentBase class is a parent class
//child class
class TestingEnvironmentConfig extends DeploymentEnvironmentBase {

	boolean testDataEnabled;

	public TestingEnvironmentConfig(String environmentName, String deploymentStatus, boolean testDataEnabled) {
		super(environmentName, deploymentStatus);
		this.testDataEnabled = testDataEnabled;
	}
	
	public void dispalyTesting() {
		
		System.out.println("environmentName" + environmentName); 
		System.out.println("deploymentStatus" + deploymentStatus); 
		System.out.println("testDataEnabled :" + testDataEnabled); 
	}
	
}
