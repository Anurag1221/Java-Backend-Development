package com.kodewala.practice05;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.nio.channels.FileLockInterruptionException;

public class TransactionBackupEngine {
	
	public void createFile(PaymentTransaction paymentTransaction) throws IOException {
		
		FileOutputStream fileOutputStream = new FileOutputStream("payment.ser"); // create file
		
		ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream); // convert Object to byte Stream
		
		objectOutputStream.writeObject(paymentTransaction);
		
		objectOutputStream.close();
	}
}
