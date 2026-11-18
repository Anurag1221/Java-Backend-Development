package com.kodewala.CustomMarker.practice02;

public class MedicalArchiveManager {
	
	public void archiveRecord(Object obj) {
		
		if(obj instanceof MedicalReport) { //instanceof checks whether an object is connected to a particular class or interface.
										//true if the object matches; otherwise false.
			
			System.out.println("Medical record moved to secure archive");
		}
		else {
			System.out.println("This record is not approved for archival");
		}
	}
}
