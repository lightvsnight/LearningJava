package com.io.reader;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.PushbackReader;

/**
 * PushbackReader 类允许一个或多个字符被送回输入流。
 *   这使你可以对输入流进行预测。
 *   下面是它的两个构造方法：
 *     PushbackReader(Reader inputStream)
 *       创建了一个允许单个字节被推回的缓冲流
 *     PushbackReader(Reader inputStream, int bufSize)
 *       推回缓冲区的大小由buffSize参数传入
 *     
 *     
 *  --提供了 unread()方法。该方法返回一个或多个字符到调用的输入流。
 * 它有下面的三种形式
 *   void unread(int ch)
 *     -- 推回ch传入的字符。它是被并发调用的read()返回的下一个字符。
 *   void unread(char buffer[])
 *     -- 返回buffer中的字符。
 *   void unread(char buffer[], int offset, int numChars)
 *     -- 推回buffer中从offset开始的numChars个字符。
 *        如果在推回缓冲区为满的条件下试图返回一个字符，一个IOExcepion异常将被引发
 *
 */
public class PushbackReaderTest {
	
	public static void main(String[] args) throws IOException {
		
		FileReader fr = new FileReader("hello.txt");
		
		BufferedReader br = new BufferedReader(fr);
		
		PushbackReader pr = new PushbackReader(br,1);
		
		
		char[]  ch = new char[29];
		int len = 0;
		
		while(-1 != (len = pr.read(ch,0,ch.length))){
			pr.read(ch,0,len);
		}
		pr.unread('a');
		char c = (char) pr.read();		
		
		System.out.println(c);
		
		for(int i = 0; i<ch.length; i++){
			System.out.print(ch[i]);
		}
		
		pr.close();
	}
}
