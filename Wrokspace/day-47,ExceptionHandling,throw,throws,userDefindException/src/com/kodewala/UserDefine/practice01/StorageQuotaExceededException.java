package com.kodewala.UserDefine.practice01;

public class StorageQuotaExceededException extends RuntimeException{

	public StorageQuotaExceededException(String msg) {
		super(msg);
	}
}
