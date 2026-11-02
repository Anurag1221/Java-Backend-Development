package com.kodewala.marker.practice01;

public class BackupManagementCenter {

	public void createBackupCopy(CloudBackupConfiguration original) throws CloneNotSupportedException {
		
		// Creating cloned object
		CloudBackupConfiguration cloned = (CloudBackupConfiguration) original.clone();

		// Changing cloned object's retention days
		cloned.retentionDays = 90;
		cloned.serverName = "S3/Production-Backup";

		System.out.println("Original Configuration:");
		original.displayConfiguration();

		System.out.println("Cloned Configuration:");
		cloned.displayConfiguration();

		// Verifying original object
		System.out.println("Verification:");

		if (original.retentionDays == 30) {
			System.out.println("Original configuration is unchanged.");
		} else {
			System.out.println("Original configuration is modified.");
		}

	}
}
