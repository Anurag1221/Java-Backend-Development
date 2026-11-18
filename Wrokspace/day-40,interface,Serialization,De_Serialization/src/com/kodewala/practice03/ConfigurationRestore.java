package com.kodewala.practice03;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

//import com.kodewala.practice02.DeliveryOrder;

public class ConfigurationRestore {

	public void readFile() throws IOException, ClassNotFoundException {

		FileInputStream fileInputStream = new FileInputStream("configuration.ser"); // read file

		ObjectInputStream inputStream = new ObjectInputStream(fileInputStream);// convert byte stream to object

		VentilatorConfiguration configuration = (VentilatorConfiguration) inputStream.readObject();

		System.out.println("deviceID; " + configuration.deviceID);
		System.out.println("oxygenLevel; " + configuration.oxygenLevel);
		System.out.println("ventilationRate; " + configuration.ventilationRate);
		System.out.println("hospitalName; " + configuration.hospitalName);
		
		// Modifying object after deserialization
        configuration.oxygenLevel = 50;
        
        System.out.println("\n----- Updated Configuration -----");

        System.out.println("Updated Oxygen Level: " + configuration.oxygenLevel);

		inputStream.close();
	}
}
