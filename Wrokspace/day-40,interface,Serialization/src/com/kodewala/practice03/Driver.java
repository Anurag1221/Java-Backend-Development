package com.kodewala.practice03;

import java.io.IOException;

public class Driver {
	
	public static void main(String[] args) throws IOException, ClassNotFoundException {
		
		 // Creating object VentilatorConfiguration
		VentilatorConfiguration configuration = new VentilatorConfiguration();
		
		//serialization
		ConfigurationBackup backup = new ConfigurationBackup();
		backup.processToFile(configuration);
		
		//de-serialization
		ConfigurationRestore configurationRestore = new ConfigurationRestore();
		configurationRestore.readFile();
		
	}
}
