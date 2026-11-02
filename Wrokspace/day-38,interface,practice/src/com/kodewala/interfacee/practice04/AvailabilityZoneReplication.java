package com.kodewala.interfacee.practice04;

public class AvailabilityZoneReplication implements DataReplicationPolicy {

	@Override
	public void replicateData() {
		System.out.println("Replicating data across different geographical regions.");

	}

	@Override
	public void verifyReplication() {
		System.out.println("Verifying data replication across multiple regions.");

	}

}
