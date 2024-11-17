package com.io.stream;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;


public class OutputStreamTest {

	public static void main(String[] args) throws FileNotFoundException {
		OutputStream os = new FileOutputStream("G:\\javaTest\\hello.txt");
		String str = "welcome";
		
		byte[] buffer = str.getBytes();
		
		try {
			os.write(buffer);
			os.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
