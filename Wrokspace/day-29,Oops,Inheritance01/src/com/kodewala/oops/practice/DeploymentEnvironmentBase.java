package com.kodewala.oops.practice;

//Hierarchical inheritance -> 1 parent class -> 2 different child class
public class DeploymentEnvironmentBase {
	
	String environmentName;
	String deploymentStatus;
	
	public DeploymentEnvironmentBase(String environmentName, String deploymentStatus) {
		super();
		this.environmentName = environmentName;
		this.deploymentStatus = deploymentStatus;
	}
}

////Q3 · Basic
//
//Hierarchical inheritance
//
//Software Deployment — Environment Management
//Classes: DeploymentEnvironmentBase, TestingEnvironmentConfig, ProductionEnvironmentConfig, EnvironmentStatusConsole
//A deployment platform manages testing and production environments. Both share common settings, but each environment follows different rules.
//Requirements
//1. Create the parent class with environmentName and deploymentStatus.
//2. Create a constructor for the parent fields.
//3. Create TestingEnvironmentConfig as a child.
//4. Add testDataEnabled to the testing configuration.
//5. Create ProductionEnvironmentConfig as another child.
//6. Add approvalRequired to the production configuration.
//7. Create objects of both child classes and display their settings.
//Expected output
//Environment: TESTING
//Deployment Status: READY
//Test Data Enabled: true
//
//Environment: PRODUCTION
//Deployment Status: READY
//Approval Required: true
//
//
//New concept: Two child classes inherit from one parent without inheriting from each other.
