package com.kodewala.practice04;

import java.io.IOException;

public class Driver {
	
	public static void main(String[] args) throws IOException, ClassNotFoundException {
		
		AuthenticationSession authenticationSession = new AuthenticationSession();
		
		//serialization
		LoginSessionBackup backup = new LoginSessionBackup();
		backup.processToFile(authenticationSession);
		
		//de-serialization
		LoginSessionRestore loginSessionRestore = new LoginSessionRestore();
		loginSessionRestore.readFile();
	}
}
