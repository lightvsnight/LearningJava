package com.network.tcp.socket1;

import java.io.IOException;
import java.io.InputStream;
import java.net.Socket;

/**
 * 
 * @author L.hk 输入流线程
 */
public class ServerInputThread extends Thread {

	private Socket socket;

	public ServerInputThread(Socket socket) {
		this.socket = socket;
	}

	@Override
	public void run() {
		InputStream is = null;
		try {
			is = socket.getInputStream();

			while (true) {
				byte[] buffer = new byte[1024];
				int length = is.read(buffer);
				String str = new String(buffer, 0, length);
				System.out.println(str);
				/*
				 * while (-1 != (length = is.read(buffer, 0, buffer.length))) {
				 * String str = new String(buffer, 0, length);
				 * System.out.println(str); }
				 */
			}
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				if (is != null) {
					is.close();
					socket.close();
				}
			} catch (IOException e) {
				e.printStackTrace();
			}
		}

	}

}
