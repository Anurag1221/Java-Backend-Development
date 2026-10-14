package com.kodewala.practice;

public class CloudStorageQuota {

	private int storageLimitGB;
	private int usedStorageGB;

	public CloudStorageQuota(int storageLimitGB, int usedStorageGB) {
		super();
		this.storageLimitGB = storageLimitGB;
		this.usedStorageGB = usedStorageGB;
	}

	// setter
	void uploadFile(int fileSizeGB) {

		if (fileSizeGB <= 0) {

			System.out.println("Invalid file size");
		} else if (fileSizeGB <= getAvailableStorage()) {

			usedStorageGB = usedStorageGB + fileSizeGB;
			System.out.println("File uploaded successfully");
		}
		else {
			System.out.println("Upload rejected: Storage limit exceeded");
		}

	}
	
	//getter
	public int getAvailableStorage() {

		return storageLimitGB - usedStorageGB;
	}

}

//02
//
//Cloud Storage Quota Management
//Classes: CloudStorageQuota, StorageAdminConsole
//A cloud service limits how much storage a user can consume.
//Requirements:
//- Keep storageLimitGB private.
//- Keep usedStorageGB private.
//- Initialize both through a constructor.
//- Create uploadFile(int fileSizeGB).
//- Reject uploads that exceed available storage.
//- Create getAvailableStorage().
//Example: Limit = 100 GB, used = 70 GB, upload = 20 GB. Expected available storage = 10 GB.
//New concept: Protecting data using business rules.
//
//
//
