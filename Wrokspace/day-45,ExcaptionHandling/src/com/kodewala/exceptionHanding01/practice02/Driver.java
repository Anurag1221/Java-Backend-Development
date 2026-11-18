package com.kodewala.exceptionHanding01.practice02;

public class Driver {

	public static void main(String[] args) {

		CloudDeploymentConfigLoader loader = new CloudDeploymentConfigLoader();
		loader.processDeployment();
		
		DeploymentAuditLogger logger = new DeploymentAuditLogger();
		logger.logDeploymentStatus();
	}
}
