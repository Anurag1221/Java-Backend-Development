package com.serialization.whatsapp.message;

import java.io.IOException;

public class Driver {
	
	public static void main(String[] args) throws IOException {
		
		MessageSerialization messageSerialization = new MessageSerialization();
		
		Message message = new Message("ABC101", "Kya haal hai", "User1234");
		
		messageSerialization.serializationMsg(message);
	}
}
