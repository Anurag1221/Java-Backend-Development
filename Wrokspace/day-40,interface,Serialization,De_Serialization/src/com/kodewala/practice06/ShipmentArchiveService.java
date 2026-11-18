package com.kodewala.practice06;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class ShipmentArchiveService {
	
	public void createFile(ShipmentRecord record) throws IOException {
		
		FileOutputStream  fileOutputStream = new FileOutputStream("record.ser");
		
		ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream);
		
		objectOutputStream.writeObject(record);
		
		objectOutputStream.close();	
	}
}
