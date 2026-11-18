package com.kodewala.exceptionHanding01.practice02;

public class CloudDeploymentConfigLoader {

	public void processDeployment() {

		String[] configuration = { "8080", "CloudServer", "Asia" };

		try {

			// Access server configuration
			String serverPort = configuration[0];

			String serverName = configuration[1];

			String deploymentRegion = configuration[2];

			// Convert String port into integer
			int port = Integer.parseInt(serverPort);

			System.out.println("Server Port: " + port);
			System.out.println("Server Name: " + serverName);
			System.out.println("Deployment Region: " + deploymentRegion);

			// Access invalid array index
			String accessConfiguration = configuration[4];

			System.out.println("invalidConfiguration: " + accessConfiguration);
		} catch (NumberFormatException e) {

			System.out.println("Invalid server port format");
			e.printStackTrace();

		} catch (ArrayIndexOutOfBoundsException e) {

			System.out.println("Invalid index find");
			e.printStackTrace();
		} catch (Exception e) {

			System.out.println("Unexpected deployment configuration error");
			e.printStackTrace();

		}
		
		 System.out.println("Cloud configuration loading completed");

	}
}

//6. Cloud Infrastructure – Configuration File Loader
//Concept: Exception hierarchy, multiple catch blocks and catch ordering
//
//Scenario: A cloud deployment system loads server configuration from a file. The configuration contains a server port, server name and deployment region.
//
//Classes:
//- CloudDeploymentConfigLoader
//- DeploymentAuditLogger
//- Driver
//Requirements:
//1. Declare String[] configuration = {"8080", "CloudServer", "Asia"}.
//2. Access the configuration array inside try.
//3. Convert the server port into an integer.
//4. Access index 5 from the array to generate an array-related exception.
//5. Handle NumberFormatException.
//6. Handle ArrayIndexOutOfBoundsException.
//7. Handle a broader Exception as the last catch block.
//8. Print a completion message outside the catch blocks.
//New things you will learn:
//- Exception inheritance.
//- Parent and child exceptions.
//- Why catch order matters.
//- Why Exception should generally be the last catch block.
//Important: Never put catch (Exception e) before a more specific exception such as catch (NumberFormatException e) because the specific catch block becomes unreachable.
