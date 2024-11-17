package com.network.tcp.socket;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;
import java.net.UnknownHostException;

/**
 * 
 * @author L.hk
 * 客户端
 */
public class TcpClient {

	public static void main(String[] args) throws UnknownHostException, IOException {
		
		Socket socket = new Socket("localhost",5000);
		
		//客户端输出流
		OutputStream os = socket.getOutputStream();
		os.write("hello world".getBytes());
		
		
		//客户端输入流
		InputStream  is = socket.getInputStream(); 
		byte[] b = new byte[200];
		int length = is.read(b);
		System.out.println(new String(b, 0, length));
		
		/*int length = 0;
		while(-1 != (length = is.read(b,0,b.length))){
			String str = new String(b,0,length);
			System.out.println(str);
		}*/
		
		for(int i = 0; i< 10; i++){
		    try {
				Thread.sleep((long)(Math.random()*2000));
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			System.out.println(i);
		}
		
		is.close();
		os.close();
		socket.close();
	}
}
