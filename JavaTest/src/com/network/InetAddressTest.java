package com.network;

import java.net.InetAddress;
import java.net.UnknownHostException;

public class InetAddressTest {

	public static void main(String[] args) throws UnknownHostException {
		InetAddress address = InetAddress.getLocalHost();
		System.out.println(address);
		
		address  = InetAddress.getByName("www.baidu.com"); // localhost,
		System.out.println(address);
		
		address  = InetAddress.getByName("www.lightvsnight.com"); // localhost,
		System.out.println(address);
	}
}
