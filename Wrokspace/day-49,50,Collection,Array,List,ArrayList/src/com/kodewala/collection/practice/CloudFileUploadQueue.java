package com.kodewala.collection.practice;

import java.util.ArrayList;
//set method :- use use replace the arraylist data
public class CloudFileUploadQueue {

	public static void main(String[] args) {
		ArrayList<String> fileUpload = new ArrayList();
		fileUpload.add("invoice.pdf");
		fileUpload.add("profile.png");
		fileUpload.add("backup.zip");
		fileUpload.add("report.xlsx");
		
		//replace 1 data
		fileUpload.set(2, "database.sql");
		System.out.println("Replace the data backup.zip into " +fileUpload.get(2));

	}

}
