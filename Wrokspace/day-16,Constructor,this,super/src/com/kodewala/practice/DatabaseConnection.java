package com.kodewala.practice;

public class DatabaseConnection {
	String host;
	String port;
	String databaseName;
	String username;
	
	DatabaseConnection(){
		this("Unknown");
	}
	
	DatabaseConnection(String _host){
		this(_host, "Unknown");
	}
	
	DatabaseConnection(String _host, String _port){
		this(_host, _port, "Unknown");
	}
	
	DatabaseConnection(String _host, String _port, String _databaseName){
		this(_host, _port, _databaseName, "Unknown");
	}
	
	DatabaseConnection(String _host, String _port, String _databaseName, String _username){
		this.host = _host;
		this.port = _port;
		this.databaseName = _databaseName;
		this.username = _username;
	}
	
	void displayDetails() {
		System.out.println("host :" + host);
		System.out.println("port :" + port);
		System.out.println("databaseName :" + databaseName);
		System.out.println("username :" + username);
		System.out.println();
	}	
}
