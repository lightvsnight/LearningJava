package com.io.stream;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileTest {
/**
 * 输入，通用的写法
 * @param args
 * @throws IOException
 */
public static void main(String[] args) throws IOException {
	 
	File file = new File("G:\\javaTest\\Chrysanthemum.jpg");
	
	File files = new File("G:\\javaTest\\image\\a.jpg");
	long length = file.length();
	String len = String.valueOf(length);
	int i_len = Integer.valueOf(len);
	byte[] buff = new byte[1000];
	
	BufferedInputStream bis = new BufferedInputStream(
             new FileInputStream(file));
		BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream(files.getPath()));
	
	//byte[] buff = new byte[file.];
	int bytesRead;
	while(( bytesRead = bis.read(buff, 0,  buff.length )) > 0 ) {
	    bos.write(buff, 0, bytesRead);
	}
	
	bis.close();
	bos.close();
}
}
