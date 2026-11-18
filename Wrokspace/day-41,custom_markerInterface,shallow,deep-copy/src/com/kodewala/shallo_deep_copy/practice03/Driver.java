package com.kodewala.shallo_deep_copy.practice03;

public class Driver {

	public static void main(String[] args) throws CloneNotSupportedException {

		// Creating storage configuration
		StorageConfiguration config = new StorageConfiguration("Bangalore", "shark.txt");

		// Creating original cloud backup profile
		CloudBackupProfile originalProfile = new CloudBackupProfile("CLOUD-BACKUP-101", config);

		// Creating shallow copy
		CloudBackupProfile clonedProfile = (CloudBackupProfile) originalProfile.clone();

		// Modifying original encryption type
		originalProfile.configuration.encryptionType = "AES-256";

		// Printing original profile details
		System.out.println("Original Profile ID: " + originalProfile.profileId);
		System.out.println("Original Storage Region: " + originalProfile.configuration.storageRegion);
		System.out.println("Original Encryption Type: " + originalProfile.configuration.encryptionType);

		System.out.println("--------------------------------");

		// Printing cloned profile details
		System.out.println("Cloned Profile ID: " + clonedProfile.profileId);
		System.out.println("Cloned Storage Region: " + clonedProfile.configuration.storageRegion);
		System.out.println("Cloned Encryption Type: " + clonedProfile.configuration.encryptionType);

	}
}
