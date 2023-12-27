package com.demo.iostreams.reader.writer;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class ReaderAndWriterDemo {

	public static void main(String[] args) throws Exception {

		FileReader fr = null;
		FileWriter fw = null;
		
		fr = new FileReader("C:\\Users\\prajn\\OneDrive\\Documents\\Sample.txt"); // cannot detect the sample.txt for some reason!!code is correct
		fw = new FileWriter("C:\\Users\\prajn\\OneDrive\\Documents\\Sample1.txt");
		
		int ch;
		
		while((ch=fr.read())!= -1) {
			fw.write(ch);
		}
		fr.close();
		fw.close();
		
	}

}
