package com.kodewala.interfacee.practice04;

public class Driver {
	
	public static void main(String[] args) {
		
		// Multi-region replication
		DataReplicationPolicy dataReplicationPolicy = new MultiRegionReplication();
		dataReplicationPolicy.displayReplicationPolicy();
		dataReplicationPolicy.replicateData();
		dataReplicationPolicy.verifyReplication();
		
		System.out.println();
		
		// Availability-zone replication
		DataReplicationPolicy dataReplicationPolicy01 = new AvailabilityZoneReplication();
		dataReplicationPolicy01.displayReplicationPolicy();
		dataReplicationPolicy01.replicateData();
		dataReplicationPolicy01.verifyReplication();
		
	}
}
