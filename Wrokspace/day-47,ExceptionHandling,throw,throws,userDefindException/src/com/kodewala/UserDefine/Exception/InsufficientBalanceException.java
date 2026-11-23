package com.kodewala.UserDefine.Exception;

public class InsufficientBalanceException extends RuntimeException{
	
	public InsufficientBalanceException(String msg){
		
		super(msg);
	}
}
