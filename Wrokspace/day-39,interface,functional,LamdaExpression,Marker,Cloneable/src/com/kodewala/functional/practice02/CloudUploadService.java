package com.kodewala.functional.practice02;

public class CloudUploadService {

	public void checkPermission(FileUploadPermission fileUploadPermission, String userRole, String fileType) {

		// calling method displayAccessPolicy
		fileUploadPermission.displayAccessPolicy();

		String result = fileUploadPermission.checkPermission(userRole, fileType);

		System.out.println("User Role: " + userRole);

		System.out.println("File Type: " + fileType);

		System.out.println(result);

	}
}
