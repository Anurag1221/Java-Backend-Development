package com.kodewala.practice04;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class LoginSessionBackup {
	
	public void processToFile(AuthenticationSession authenticationSession) throws IOException {
		
		FileOutputStream fileOutputStream = new FileOutputStream("authentication.ser"); // convert byte stream to file
		
		ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream); // convert Object to byte Stream
		
		objectOutputStream.writeObject(authenticationSession); //create a file
		
		objectOutputStream.close();
		
	}
}
