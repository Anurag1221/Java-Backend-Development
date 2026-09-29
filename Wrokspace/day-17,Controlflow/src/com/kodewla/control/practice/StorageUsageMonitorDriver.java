package com.kodewla.control.practice;

public class StorageUsageMonitorDriver {

	public static void main(String[] args) {
		
		StorageUsageMonitor storage = new StorageUsageMonitor();
		
		storage.usageStorage(70,10);

	}

}

//4. Cloud Storage Usage
//Create a class StorageUsageMonitor.
//
//Take:
//
//usedStorage
//totalStorage
//
//Calculate the usage percentage.
//
//Rules:
//
//= 90% → "Critical: Storage Almost Full"
//
//= 75% → "Warning: Storage Usage High"
//
//= 50% → "Moderate Usage"
//
//Otherwise → "Storage Usage Normal"
//
//Focus: conditions + arithmetic
