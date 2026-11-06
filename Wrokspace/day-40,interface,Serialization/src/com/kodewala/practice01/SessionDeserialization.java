package com.kodewala.practice01;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.Serializable;

public class SessionDeserialization implements Serializable {

	public void readFile() throws IOException, ClassNotFoundException {

		// de-serialization :- covert byte stream to object and print/check the file
		// content
		FileInputStream fileInputStream = new FileInputStream("session.ser"); //File to bytes

		ObjectInputStream inputStream = new ObjectInputStream(fileInputStream); // Serialized bytes to Java object

		CloudSession cloudSession = (CloudSession) inputStream.readObject();

		System.out.println("Session ID: " + cloudSession.sessionID);
		System.out.println("Username: " + cloudSession.username);
		System.out.println("Platform: " + cloudSession.platform);

		inputStream.close();

	}
}
