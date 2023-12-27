package com.io.serialization;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class SerializationDemo {

	public static void main(String[] args) {

		FileOutputStream fos;
		ObjectOutputStream oos;

		try {
			fos = new FileOutputStream("C:\\Users\\prajn\\OneDrive\\Documents\\Emp.ser"); // we are writing object to this file
			oos = new ObjectOutputStream(fos);

			Employee emp = new Employee(1, "Praj", 80000, 12345);
			oos.writeObject(emp);
			System.out.println("Employee object serialized");

		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

}
