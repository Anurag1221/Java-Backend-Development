package com.kodewala.collection.practice50;

import java.util.ArrayList;

public class CloudDeploymentQueueOptimizer {

	public static void main(String[] args) {
		// Create an ArrayList with initial capacity 3
		ArrayList<String> deploymentRequestIds = new ArrayList<>(3);

		// Add 10 deployment request IDs
		deploymentRequestIds.add("DEP101");
		deploymentRequestIds.add("DEP102");
		deploymentRequestIds.add("DEP103");
		deploymentRequestIds.add("DEP104");
		deploymentRequestIds.add("DEP105");
		deploymentRequestIds.add("DEP106");
		deploymentRequestIds.add("DEP107");
		deploymentRequestIds.add("DEP108");
		deploymentRequestIds.add("DEP109");
		deploymentRequestIds.add("DEP110");
		
		deploymentRequestIds.add(4, "DEP105.5");
		deploymentRequestIds.add(8, "DEP109.5");
		
		deploymentRequestIds.remove(2);
		deploymentRequestIds.add(3, "DEP104.5");
		
		deploymentRequestIds.add("DEP105");
		deploymentRequestIds.add("DEP108");
		deploymentRequestIds.add("DEP110");
		
		System.out.println(deploymentRequestIds);
		
		

	}

}
