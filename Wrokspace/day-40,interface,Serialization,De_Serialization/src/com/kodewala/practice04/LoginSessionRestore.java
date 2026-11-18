package com.kodewala.practice04;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public class LoginSessionRestore {
	
	public void readFile() throws IOException, ClassNotFoundException {
		
		FileInputStream fileInputStream = new FileInputStream("authentication.ser"); // //read byte into file
		
		ObjectInputStream inputStream = new ObjectInputStream(fileInputStream); // Reads serialized objects
		
		AuthenticationSession authenticationSession = (AuthenticationSession) inputStream.readObject(); 
		
		System.out.println("sessionID; " + authenticationSession.sessionID);
		System.out.println("username; " + authenticationSession.username);
		System.out.println("authenticationToken; " + authenticationSession.authenticationToken);
		System.out.println("loginDevice; " + authenticationSession.loginDevice);
		
		inputStream.close();

	}
}
