package com.kodewala.oops.practice;

//extend the DeploymentEnvironmentBase class and DeploymentEnvironmentBase class is a parent class
//child class 
public class ProductionEnvironmentConfig extends DeploymentEnvironmentBase{
	
	boolean approvalRequired;

	public ProductionEnvironmentConfig(String environmentName, String deploymentStatus, boolean approvalRequired) {
		super(environmentName, deploymentStatus);
		this.approvalRequired = approvalRequired;
	}
	
	public void displayProduction() {
		
		System.out.println("environmentName" + environmentName); 
		System.out.println("deploymentStatus" + deploymentStatus); 
		System.out.println("approvalRequired :" + approvalRequired); 
	}
}
