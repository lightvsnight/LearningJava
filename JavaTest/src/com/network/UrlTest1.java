package com.network;

import java.net.URL;

public class UrlTest1 {

	public static void main(String[] args) throws Exception {
	
		//封装目标地址
		URL url = new URL("http://baike.baidu.com/link#DOWN");
		
		String protocol = url.getProtocol();
		String host = url.getHost();
		String file = url.getFile();
		int port = url.getPort();
        String ref = url.getRef(); // 
        
        System.out.println(protocol+", "+host+", "+file+", "+port+", "+ref);
	}
}
