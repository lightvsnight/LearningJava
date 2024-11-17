package com.network.tcp.socket;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * 
 * @author L.hk 
 * 服务端
 */
public class TcpServer {

	public static void main(String[] args) throws IOException {
		
		ServerSocket ss = new ServerSocket(5000);
		
		//如果没有人连接socket服务端,程序会一直停留在 accept()方法上，知道有客户端连接
		Socket socket = ss.accept();
		System.out.println("hello world");
		
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
		
		//客户端输出流
		OutputStream os = socket.getOutputStream();
		os.write("welcome".getBytes());
		
		is.close();
		os.close();
		socket.close();
	}
}
