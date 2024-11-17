package com.io.reader;

import java.io.CharArrayWriter;
import java.io.FileWriter;
import java.io.IOException;

/**
 * 
 * @author L.hk 实现了以数组作为目标的输出流
 * 
 *         CharArrayWriter 有两个构造方法
 * 
 *         CharArrayWriter() 创建了一个默认长度的缓冲区。
 * 
 *         CharArrayWriter(int numChars) 缓冲区长度有numChars指定。缓冲区大小在需要的情况下可以自动增长。
 *         缓冲区保持的字符数包含在CharArrayWriter的count成员中。 buf 和 count 都是受保护(protected)的域
 * 
 */
public class CharArrayWriterTest {

	public static void main(String[] args) throws IOException {
		String str = "what are you doing now";
		char[] ch = new char[str.length()];

		str.getChars(0, str.length(), ch, 0);

		CharArrayWriter output = new CharArrayWriter(str.length());
		
		output.write(ch);
		
		char[] result = output.toCharArray();
		
		
		for(int i = 0; i < result.length; i++){
			System.out.print((char)result[i]);
		}
		
		FileWriter fw = new FileWriter("test.txt");
		output.writeTo(fw);
		
		output.close();
		fw.close();
	}
}
