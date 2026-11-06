package com.kodewala.practice03;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class ConfigurationBackup {

	public void processToFile(VentilatorConfiguration configuration) throws IOException {

		FileOutputStream fileOutputStream = new FileOutputStream("configuration.ser"); // create file

		ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream); // convert object into byte
																							// stream

		objectOutputStream.writeObject(configuration);

		objectOutputStream.close();
	}
}
