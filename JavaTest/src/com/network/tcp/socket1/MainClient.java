package com.network.tcp.socket1;

import java.io.IOException;
import java.net.Socket;
import java.net.UnknownHostException;

/**
 * 
 * @author L.hk
 *
 */
public class MainClient {

	public static void main(String[] args) throws UnknownHostException,
			IOException {

		Socket socket = new Socket("localhost", 4000);

		new ClientInputThread(socket).start();
		new ClientOutputThread(socket).start();

	}
}
