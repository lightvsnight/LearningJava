package com.io.reader;

import java.io.FileWriter;
import java.io.IOException;

/**
 *  项目表文件写入字符串
 *  FileWriter 创建一个可以写文件的Writer类。
 *  FileWriter 继承于 OutputStreamWriter.它最常用的构造方法有：
 *    FileWriter(String filePath);
 *    FileWriter(String filePath, boolean append);
 *    append; 如果为true，则将字节写入文件末尾处，而不是写入文件开始处
 *    
 *    FileWriter(File fileObj);  
 */
public class FileWriterTest {

	public static void main(String[] args) throws IOException {
		//准备要输入进去的字符串
		String str = "what are you doing now";
		
		//准备一个字符串数组
		char[] buffer = new char[str.length()];
		
		//将字符串copy到字符数组
		
		/**
		 * String.getChars(int srcBegin, int srcEnd, char[] dst, int dstBegin)
		 * srcBegin  字符串起始位置
		 * srcEnd    字符串结束位置
		 * dst       目标数组
		 * dstBegin  目标起始位置
		 */
		str.getChars(0, str.length(), buffer, 0);
		
		/**
		 *  输出到目标文件
		 *  
		 *  Writer 是从字符流转化为字节流，在写入文件中
		 */
		FileWriter  fw = new FileWriter("hello.txt");
		
		for(int i = 0; i < buffer.length; i++){
			fw.write(buffer[i]);
		}
		fw.close();
	}
}
