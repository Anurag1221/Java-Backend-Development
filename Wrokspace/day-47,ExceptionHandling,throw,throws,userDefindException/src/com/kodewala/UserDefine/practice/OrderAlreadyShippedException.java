package com.kodewala.UserDefine.practice;

public class OrderAlreadyShippedException extends RuntimeException{
	
	public OrderAlreadyShippedException(String msg) {
		
		super(msg);
	}
}
