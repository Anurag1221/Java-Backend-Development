package com.kodewala.UserDefine.practice01;

public class CloudStorageUploadManager {
	
	public void processStorage(int totalStorage, int usedStorage, int uploadFileSize) {
		
		try {
			storageUpload(totalStorage, usedStorage, uploadFileSize);
			
		} catch (StorageQuotaExceededException e) {
			System.out.println("Exception: " + e.getMessage());
			e.printStackTrace();
		}
		
		System.out.println("Cloud storage operation completed.");
	}
	
	public void storageUpload(int totalStorage, int usedStorage, int uploadFileSize) throws StorageQuotaExceededException{
		
		int remainingStorage = totalStorage - usedStorage;
		
		 System.out.println("Total Storage: " + totalStorage + " GB");
	        System.out.println("Used Storage: " + usedStorage + " GB");
	        System.out.println("Remaining Storage: " + remainingStorage + " GB");
		
		if(uploadFileSize > remainingStorage) {
			
			throw new StorageQuotaExceededException( "Upload failed! File size " + uploadFileSize
	                + " GB exceeds remaining storage of "
	                + remainingStorage + " GB.");
		}
		else {
			System.out.println("File uploaded successfully!");
		}
		
		remainingStorage = remainingStorage - uploadFileSize;
		
		System.out.println("Storage remaining after upload: "
                + remainingStorage + " GB");
	}
}
