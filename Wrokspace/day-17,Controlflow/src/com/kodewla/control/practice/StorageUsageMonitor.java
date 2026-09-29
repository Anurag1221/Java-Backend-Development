package com.kodewla.control.practice;

public class StorageUsageMonitor {
	
	public double usageStorage(int usedStorage, int totalStorage) {
		
		double usagePercentage = (usedStorage/totalStorage) * 100;
		
		if(usagePercentage >= 50) {
			
			System.out.println("Moderate Usage");
			
		}else if(usagePercentage >= 75) {
			
			System.out.println("Warning: Storage Usage High");
			
		}else if (usedStorage >= 90){
			
			System.out.println("Critical: Storage Almost Full");
			
		}else {
			System.out.println("Storage Usage Normal");
		}
		
		return 0;
	}
}
