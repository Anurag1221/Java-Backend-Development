package com.kodewala.practice;

class DeploymentLaunchConsole {

	static {
		System.out.println("static2");
	}

	// iib
	{
		System.out.println("instance2");
	}

	public DeploymentLaunchConsole() {
		super();
		System.out.println("constructor2");
	}

}

public class MicroserviceDeploymentConfig extends DeploymentLaunchConsole {

	static {
		System.out.println("static1");
	}

	// iib
	{
		System.out.println("instance1");
	}

	public MicroserviceDeploymentConfig() {
		super();
		System.out.println("constructor1");
		
	}
	
	void display() {
		
		System.out.println();
		System.out.println();
		System.out.println("1st line --> Start");
		System.out.println("2nd line --> super class --> sb DeploymentLaunchConsole (static2)");
		System.out.println("3rd line --> sb MicroserviceDeploymentConfig (static1)");
		System.out.println("4th line --> super class --> iib DeploymentLaunchConsole (instance2)");
		System.out.println("5th line --> super class --> constructor DeploymentLaunchConsole (constructor2)");
		System.out.println("6th line --> iib of sub class --> MicroserviceDeploymentConfig (instance1)");
		System.out.println("7th line --> constructor of subclass --> MicroserviceDeploymentConfig (constructor1)");
		System.out.println("8th line --> End");
	}
	
}

