package com.jms.listener;

import javax.jms.Message;
import javax.jms.TextMessage;

public class TestMessageListener implements  javax.jms.MessageListener {

	
	
	//实现 MessageListener结构重写的方法
	@Override
	public void onMessage(Message arg0) {
		// TODO Auto-generated method stub
		
	}
	
	public static void main(String[] args) {
		TestMessageListener tml = new TestMessageListener();
	}

}
