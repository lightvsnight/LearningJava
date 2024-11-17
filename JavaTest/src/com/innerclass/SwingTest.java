package com.innerclass;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

import javax.swing.JButton;
import javax.swing.JFrame;


/**
 * 
 * @author L.hk
 * 
 * 匿名内部类 应用
 */
public class SwingTest {

	public static void main(String[] args) {
		 JFrame frame = new JFrame("JFrame");
		 
		 JButton button = new JButton("click me");
		 
		 //button.addActionListener(new MyListener());
		 
		 //匿名内部类 使用
		 button.addActionListener(new ActionListener(){
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				System.out.println("welcome");
			}
		 });
		 
		 frame.addWindowListener(new WindowAdapter(){
			@Override
			public void windowClosing(WindowEvent e) {
				System.exit(0);
			}
		 });
		 
		 frame.setBackground(Color.LIGHT_GRAY);
		 frame.setSize(200,200);
		 
		 frame.getContentPane().add(button);
		 frame.pack();
		 
		 frame.setVisible(true);
	}
}
/*class MyListener extends WindowAdapter implements ActionListener{

	@Override
	public void actionPerformed(ActionEvent e) {
		System.out.println("hello world");
	}
	
	@Override
	public void windowClosing(WindowEvent e) {
		// TODO Auto-generated method stub
		super.windowClosing(e);
	}

}*/