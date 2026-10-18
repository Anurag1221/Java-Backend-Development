package com.kodewala.practice;

public class DeploymentDriver {

	public static void main(String[] args) {

		ProductionDeploymentPolicy deployment =
                new ProductionDeploymentPolicy();

        deployment.validateDeployment();
        deployment.validateDeployment1();

	}

}
