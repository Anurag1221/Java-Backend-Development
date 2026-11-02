package com.kodewala.functional.practice02;

public class StorageGateway {

	public static void main(String[] args) {

		FileUploadPermission fileUploadPermission = (userRole, fileType) -> {

			if (userRole.equals("ADMIN") && fileType.equals("PDF")) {

				return "Upload Permission Granted";

			} else {

				return "Upload Permission Denied";
			}
		};

		CloudUploadService service = new CloudUploadService();

		service.checkPermission(fileUploadPermission, "ADMIN", "PDF");

	}
}
