package com.gui.swing;

import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

class MyHandler extends WindowAdapter{
	
	@Override
	public void windowClosing(WindowEvent e) {
		// TODO Auto-generated method stub
		System.exit(0);
	}
}
