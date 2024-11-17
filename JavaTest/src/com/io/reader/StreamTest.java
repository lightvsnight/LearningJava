package com.io.reader;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

/**
 *  程序 StreamTest.java
 *  改程序将n行字符串写入为本当中，
 *  并从文本当中读取并输出到控制台
 */
public class StreamTest {

	public static void main(String[] args) throws Exception {

		/**
		 * 写入
		 */
		FileOutputStream fos = new FileOutputStream("hello.txt"); // g:\\javaTest\\hello.txt

		OutputStreamWriter osw = new OutputStreamWriter(fos);

		osw.append("xiaoxiao\n");

		BufferedWriter bw = new BufferedWriter(osw);

		bw.write("http://www.baidu.com\n");
		bw.write("http://www.google.com\n");

		bw.close(); // 关闭最外面的流，里面的流自然就关闭了，机制是这样的

		/**
		 * 读入
		 */

		FileInputStream fis = new FileInputStream("hello.txt");

		InputStreamReader isr = new InputStreamReader(fis);

		BufferedReader br = new BufferedReader(isr);

		// readLine 每次读一行;如果没有下一行返回null

		String str  = br.readLine();
		
		while (null != str ) {
		   System.out.println(str);
		   str = br.readLine();
		}
		br.close();
		
		/*
		 * char[] a = new char[1000]; int len = 0; while (true) { if (-1 ==
		 * br.read()) { break; } br.read(a,len,a.length); len += a.length; }
		 * 
		 * for (int i = 0; i < a.length; i++) { System.out.print(a[i]); }
		 */
	}
}
