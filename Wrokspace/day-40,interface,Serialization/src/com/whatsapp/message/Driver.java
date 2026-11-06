package com.whatsapp.message;

import java.io.FileInputStream;
import java.io.ObjectInputStream;

import java.io.IOException;

public class Driver {

    public static void main(String[] args) throws IOException, ClassNotFoundException
             {

        FileInputStream fis = new FileInputStream(
            "C:/25 aug 2026 Java Backend/Wrokspace/day-40,interface,Serialization/message.ser"
        );

        ObjectInputStream ois = new ObjectInputStream(fis);

        Message message = (Message) ois.readObject();

        System.out.println("De Ser: " + message.getMessage() + "and user id " + message.getUserID());

        ois.close();
    }
}