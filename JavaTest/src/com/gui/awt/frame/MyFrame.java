package com.gui.awt.frame;

import java.awt.Color;
import java.awt.Frame;

public class MyFrame extends Frame{
	
	public MyFrame(String str){
		super(str);
	}

	private static final long serialVersionUID = 1L;

	public static void main(String[] args) {
		MyFrame frame = new MyFrame("First Gui App");
		
		//setSize(int width, int height)
		frame.setSize(500,500);
		frame.setBackground(Color.lightGray);
		
		
		//如果不调用下面这个方法，运行时，我们是看不到窗口的
		frame.setVisible(true);
	}
	
	
}
