package com.gui.swing;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;

public class MenuTest {
	public static void main(String[] args) {
		JFrame frame = new JFrame("TopLevelDemo");
		
		JLabel label = new JLabel("hello");
		
		label.setBackground(Color.lightGray);
		label.setPreferredSize(new Dimension(200,100));
		
		//菜单栏
		JMenuBar  menuBar = new JMenuBar();
		
		menuBar.setBackground(Color.lightGray);
		menuBar.setPreferredSize(new Dimension(200,20));
		
		//菜单项
		JMenu File = new JMenu("File");
		JMenu Save = new JMenu("Save");
		JMenu Load = new JMenu("Load");
		JMenu Quite = new JMenu("Quite");
		
		JMenuItem item = new JMenuItem("New");
		JMenuItem hello = new JMenuItem("Hello");
		JMenuItem world = new JMenuItem("world");
		JMenuItem weclome = new JMenuItem("weclome");
		
		File.add(item);
		File.add(hello);
		File.add(world);
		File.add(weclome);
		
		menuBar.add(File);
		menuBar.add(Save);
		menuBar.add(Load);
		menuBar.add(Quite);
		
		frame.setJMenuBar(menuBar);
		
		
		
		frame.getContentPane().add(label,BorderLayout.CENTER);
		
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //是关闭按钮起作用
		
		frame.pack();
		frame.setVisible(true);
		
	}
}
