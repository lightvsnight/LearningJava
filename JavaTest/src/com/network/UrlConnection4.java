package com.network;

import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;
import java.io.InputStream;
import java.net.MalformedURLException;
import java.net.URL;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;

/**
 * 
 * @author 输入网址 显示页面源代码
 *
 */
public class UrlConnection4 {

	public static void main(String[] args) {
		Window win = new Window();
		win.setVisible(true);
	}
}

class Window extends JFrame implements ActionListener, Runnable {
	
	private static final long serialVersionUID = -2670460933868965775L;
	
	JButton button;
	URL url;

	JTextField text;

	JTextArea area;

	byte b[] = new byte[118];

	Thread thread;

	public Window() {

		text = new JTextField(20);
		area = new JTextArea(12, 12);
		button = new JButton("确定");

		button.addActionListener(this);

		thread = new Thread(this);

		JPanel p = new JPanel();

		p.add(new JLabel("输入网址:"));
		p.add(text);
		p.add(button);

		Container con = this.getContentPane();

		con.add(new JScrollPane(area), BorderLayout.CENTER);
		con.add(p, BorderLayout.NORTH);

		this.setBounds(60, 60, 400, 300);

		this.setVisible(true);

		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

	public void actionPerformed(ActionEvent e) {
		if (!(thread.isAlive())) {
			thread = new Thread(this);
		}
		try {
			thread.start();
		} catch (Exception e1) {
			JOptionPane.showMessageDialog(this, "我正在读取,请稍后...", "提示信息",
					JOptionPane.ERROR_MESSAGE);
		}

	}
	
	@Override
	public void run() {
		try {
			int n = -1;
			area.setText(null);
			url = new URL(text.getText().trim());
			
			InputStream in = url.openStream();
			
			while(-1 != (n= in.read(b))){
				String s = new String(b,0,n);
				String str = new String(s.getBytes(),"UTF-8"); 
				area.append(str);
			}
			
			in.close();
		} catch (MalformedURLException e) {
			text.setText(""+e);
		} catch (IOException e) {
			text.setText(""+e);
		}
		
	
	}
}