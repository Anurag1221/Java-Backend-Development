package com.kodewala.CustomMarker.practice01;

public class CloudFile implements Encryptable {

	String fileName;
	String fileType;

	public CloudFile(String fileName, String fileType) {
		super();
		this.fileName = fileName;
		this.fileType = fileType;
	}
}
