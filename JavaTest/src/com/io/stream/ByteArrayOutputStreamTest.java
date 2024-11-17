package com.io.stream;

import java.io.ByteArrayOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

public class ByteArrayOutputStreamTest {

	public static void main(String[] args) {
		ByteArrayOutputStream 	baos = new ByteArrayOutputStream();
		String str = "hello world welcome";
		
		byte[] b = str.getBytes();
		
		try {
			baos.write(b);
			
			byte[] result = baos.toByteArray();
			
			for(int i = 0; i < result.length; i++){
				System.out.println((char)result[i]);
			}
			
			OutputStream os  = new FileOutputStream("G:\\javaTest\\hello.txt");
			baos.writeTo(os);
			
			baos.close();
			os.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		
	}
}
