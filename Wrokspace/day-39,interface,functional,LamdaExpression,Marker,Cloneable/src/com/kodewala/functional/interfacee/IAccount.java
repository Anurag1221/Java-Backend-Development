package com.kodewala.functional.interfacee;

@FunctionalInterface
public interface IAccount{ 
	
	String openAccount(String name, String address,int balance); // only one abstract method - SAM
	
	default void addBeni() {
		
	}
}
