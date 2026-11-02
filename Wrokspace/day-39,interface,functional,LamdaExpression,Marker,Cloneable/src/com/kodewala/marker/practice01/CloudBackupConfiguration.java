package com.kodewala.marker.practice01;

public class CloudBackupConfiguration implements Cloneable {

	String serverName;
	String backupLocation;
	int retentionDays;

	CloudBackupConfiguration(String serverName, String backupLocation, int retentionDays) {

		super();
		this.serverName = serverName;
		this.backupLocation = backupLocation;
		this.retentionDays = retentionDays;
	}

	public Object clone() throws CloneNotSupportedException {

		return super.clone();

	}

	// Display configuration details
	public void displayConfiguration() {

		System.out.println("Server Name: " + serverName);
		System.out.println("Backup Location: " + backupLocation);
		System.out.println("Retention Days: " + retentionDays);
		System.out.println("-----------------------------");
	}

}
