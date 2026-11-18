package com.kodewala.practice01;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.OutputStream;

public class SessionSerialization {
	
	public void processSession(CloudSession session) throws IOException {
		
		FileOutputStream fileOutputStream = new FileOutputStream("session.ser"); // FileOutputStream = Writes bytes into a file.
		
		ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream); // ObjectOutputStream =	Converts objects into bytes
																						//Because FileOutputStream understands bytes, not Java objects.
		objectOutputStream.writeObject(session);
		
		objectOutputStream.close();
	}
	
	
}
