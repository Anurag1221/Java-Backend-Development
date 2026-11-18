package com.kodewala.practice01;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

import com.serialization.whatsapp.message.MessageSerialization;

public class Driver {
		
	public static void main(String[] args) throws IOException, ClassNotFoundException {
		
		//serialization :- convert Object into byte stream and save into file
		SessionSerialization serialization = new SessionSerialization();
		
		CloudSession cloudSession = new CloudSession("101", "anurag1221", "java");
		
		serialization.processSession(cloudSession);
		
		// de-serialization :- covert byte stream to object and print/check the file content
		SessionDeserialization deserialization = new SessionDeserialization();
		deserialization.readFile();
		
	}
	
}
