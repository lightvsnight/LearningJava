package com.gui.awt.layout;

import java.awt.Button;
import java.awt.FlowLayout;
import java.awt.Frame;

public class ExGui {

	private Frame frame;
	
	private Button button;
	
	private Button button1;
	
	public void go(){
		frame = new Frame("gui example");
		
		frame.setLayout(new FlowLayout());
		
		button = new Button("Press me");
		button1 = new Button("Don't press me");
		
		frame.add(button);
		frame.add(button1);
		
		
		frame.pack(); //使界面刚刚好容下控件的最小的大小
		frame.setVisible(true);
	}
	
	public static void main(String[] args) {
		ExGui exgui = new ExGui();
		exgui.go();
	}
}
