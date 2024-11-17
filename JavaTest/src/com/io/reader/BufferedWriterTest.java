package com.io.reader;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

/**
 *  BufferedWriter有两个构造方法：
 *    BufferedWriter(Writer outputStream)
 *      创建了使用默认大小缓冲区的缓冲流
 *    BufferedWriter(Writer outputStream,int bufSize)
 *      缓冲区大小是由bufSize参数传入的
 *      
 *   BufferedWriter是一个增加了flush()方法的Writer
 *    flush()方法可以用来确保数据缓冲区确实被写到实际的输出流。
 *    用BufferedWriter 可以通过减小数据被实际的写到输出流的次数而提高程序的性能
 */
public class BufferedWriterTest {
	
	public static void main(String[] args) throws IOException {
		
		
		FileWriter fw = new FileWriter("hello.txt");
		BufferedWriter bw = new BufferedWriter(fw);
		
		bw.write("abcdefghijklmnopqrstuvwxyz---");
		
		bw.close();
		
	}

}
