package com.gui.awt.frame;

import java.awt.Color;
import java.awt.Frame;
import java.awt.Panel;

public class FrameWithPanel extends Frame{

	public FrameWithPanel(String str){
		super(str);
	}
	
	public static void main(String[] args) {
		FrameWithPanel fwp = new FrameWithPanel("First With Panel");
		
		Panel panel = new Panel();
		
		fwp.setSize(500,500);
		fwp.setBackground(Color.lightGray);
		fwp.setLayout(null);
		
		panel.setSize(400,400);
		panel.setBackground(Color.white);
		
		fwp.add(panel);
		
		fwp.setVisible(true);
	}
}
