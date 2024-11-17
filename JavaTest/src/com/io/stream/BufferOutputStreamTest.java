package com.io.stream;

import java.io.BufferedOutputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

/**
 * 
 * @author L.hk
 * 缓存输入流  先把内容写到缓存里，当写入流被关闭时，写入到文件中
 */
public class BufferOutputStreamTest {

	public static void main(String[] args) throws FileNotFoundException {
		OutputStream os  = new FileOutputStream("G:\\javaTest\\hello.txt");
		
		BufferedOutputStream  bos = new BufferedOutputStream(os);
		
		try {
			bos.write("http://www.baidu.com".getBytes());
			bos.close();
			os.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}
}
