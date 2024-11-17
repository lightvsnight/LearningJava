package com.network.udp.socket;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;

/**
 * 
 * @author L.hk 基于UDP
 */
public class UdpServer2 {

	public static void main(String[] args) throws IOException {
		
		
		DatagramSocket socket = new DatagramSocket(7000);

		byte[] buffer = new byte[1000];

		DatagramPacket packet = new DatagramPacket(buffer, 1000);
		//接收UDP信息
		socket.receive(packet);

		System.out.println(new String(buffer, 0, packet.getLength()));

		String str = "welcome";
		
		DatagramPacket packet2 = new DatagramPacket(str.getBytes(),
				str.length(), packet.getAddress(), packet.getPort());
		//发送UDP信息
		socket.send(packet2);
		socket.close();

	}
}
