package com.kodewala.execptionHandling.practice02;

public class CloudFileUploadManager {
	
	UploadFailureReporter failureReporter = new UploadFailureReporter();
	
	public void processFile() {
		
		String[] files = {"resume.pdf", "profile.jpg", "report.docx"};
		String selectedFile = null;
		
		try {
			String fileCopy = files[5];
		}
		catch(ArrayIndexOutOfBoundsException e) {
			
			failureReporter.reportUploadFailure("Invalid file index requested");
			e.printStackTrace();
		}
		
		try {
			System.out.println(selectedFile.length());
		}
		catch(NullPointerException e) {
			
			failureReporter.reportUploadFailure( "Selected file information is missing");
			e.printStackTrace();
		}
		
		 System.out.println("Upload service is still running");
	}

}
