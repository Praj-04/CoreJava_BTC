package com.demo.iostreams;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileOutputStreamDemo {

	public static void main(String[] args) {
		FileInputStream fis = null;
		FileOutputStream fos= null;
		
		
		try {
	fis = new FileInputStream("C:\\Users\\prajn\\OneDrive\\Documents\\applejuice.jpg"); 
	fos = new FileOutputStream("C:\\Users\\prajn\\OneDrive\\Documents\\newapplejuice.jpg");
	int data;
	
	if( (data =fis.read())!= -1) {
		fos.write(data);
	}
	
System.out.println("File copied");
	
			
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		finally {
			try {
				fis.close();
				fos.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}

}
