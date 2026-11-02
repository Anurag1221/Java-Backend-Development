package com.kodewala.interfacee.practice04;

public interface DataReplicationPolicy {
	
	// Abstract method
	void replicateData();
	void verifyReplication();
	
	default void displayReplicationPolicy() {
		
		System.out.println("Data Replication Policy");
        System.out.println("-----------------------");
	}
	
}
