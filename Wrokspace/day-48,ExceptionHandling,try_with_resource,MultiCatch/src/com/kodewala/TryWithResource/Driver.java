package com.kodewala.TryWithResource;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Driver {

	public static void main(String[] args) throws SQLException {
		
		String fileName = "text.xls";
		
		//auto closable
		try (FileOutputStream fileOutputStream = new FileOutputStream(new File(fileName));
				/**Connection con = DriverManager.getConnection("")**/ ) 
		{ //try with resource
			
			String name = "dsg";
			name.charAt(0); //NPE
		} 
		catch (FileNotFoundException | NullPointerException e) { //Multi catch block(|) - java 7
			e.printStackTrace();
		}
		catch (IOException e) {
			e.printStackTrace();
		}
//		finally {
//			System.out.println("Closing the connection");
//			try {
//				fileOutputStream.close();
//			} catch (IOException e2) {
//				e.printStackTrace();
//			}
//			System.out.println("Connection is closed");
//		}

	}

}
