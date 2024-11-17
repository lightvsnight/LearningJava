package com.network;

import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.URL;

public class UrlConnection2 {

	public static void main(String[] args) throws Exception {
		
		URL url = new URL("http://www.oracle.com/index.html");
		
		//URLConnection conn = url.openConnection();
		//InputStream is = conn.getInputStream();
		InputStream is = url.openStream();//与上面两行等价
		
		
		OutputStream os = new FileOutputStream("G:\\javaTest\\oracle.txt");
		
		
		byte[] buffer = new byte[2048];
		int length = 0 ;
		
		while(-1 != (length = is.read(buffer,0,buffer.length))){
			os.write(buffer,0,length);
		}
		
		is.close();
		os.close();
	}
}
