package com.gui.swing;

import javax.swing.JFrame;
import javax.swing.JLabel;

public class FrameDemo {
	public static void main(String[] args) {
		JFrame frame = new JFrame("Frame Swing");
		
		JLabel label = new JLabel("hello world");
		
		frame.addWindowListener(new MyHandler());
		
		frame.getContentPane().add(label);
		
		frame.pack();
		
		frame.setVisible(true);
	}
}
