package com.network.tcp.socket1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.net.Socket;

/**
 * 
 * @author L.hk 输出流线程
 */
public class ServerOutputThread extends Thread {

	private Socket socket;

	public ServerOutputThread(Socket socket) {
		this.socket = socket;
	}

	@Override
	public void run() {
		OutputStream os = null;
		try {
			os = socket.getOutputStream();

			while (true) {
				BufferedReader reader = new BufferedReader(
						new InputStreamReader(System.in));

				String line = reader.readLine();
				os.write(line.getBytes());
			}
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				if (os != null) {
					os.close();
					socket.close();
				}
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}
}
