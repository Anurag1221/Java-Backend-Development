package com.kodewala.practice;

class DeploymentEnvironmentBase {

	String environmentName;

	public DeploymentEnvironmentBase(String environmentName) {
		super();
		this.environmentName = environmentName;
	}
	
	 public void displayEnvironment() {
	        System.out.println("Environment Name: " + environmentName);
	 }

}

public class ProductionEnvironmentConfig extends DeploymentEnvironmentBase {

	boolean approvalRequired;

	public ProductionEnvironmentConfig(String environmentName, boolean approvalRequired) {
		super(environmentName);
		this.approvalRequired = approvalRequired;
	}

	public void displayApproral() {

		displayEnvironment();
		System.out.println("Approval Required :" + approvalRequired);
	}
}

//Q5 · Basic
//Software Deployment — Environment Settings
//
//Classes: DeploymentEnvironmentBase, ProductionEnvironmentConfig, DeploymentStatusConsole
//A deployment platform has common settings and production-specific security rules.
//Requirements:
//- Parent class stores environmentName.
//- Parent constructor initializes the environment name.
//- Child class adds approvalRequired.
//- Initialize the parent using super().
//- Display both settings.
//New concept: Parent and child constructors working together.
