package com.demo.iostreams;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class FileInputStreamDemo {

	public static void main(String[] args) {
		FileInputStream fis = null;

		try {
//			File myfile = new File("C:\\Users\\prajn\\File\\sample"); 
//		     System.out.println(myfile.exists());
//			System.out.println(new File(".").getAbsolutePath());
			fis = new FileInputStream(new File("C:\\Users\\prajn\\OneDrive\\Documents\\Sample.txt")); //its working now
			
			System.out.println("File opened");
			int i;
			while ((i = fis.read()) != -1) {
				System.out.print((char) i);
			}

		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				fis.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
			System.out.println("\n File closed");
		}

	}

}
