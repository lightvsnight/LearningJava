package com.io.stream;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

/**
 * 
 * @author L.hk
 * 
 *         java 中 输入流(InputSream)
 *
 */
public abstract class InputStreamTest extends java.io.InputStream {

	@Override
	public abstract int read() throws IOException;

	@Override
	public int read(byte[] b) throws IOException {
		// TODO Auto-generated method stub
		return super.read(b);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see java.io.InputStream#read(byte[], int, int)
	 * 
	 * @param b the buffer into which the data is read. 哪一个到这个(b[])缓冲区里，这个数据读到。
	 * 
	 * @param off the start offset in array <code>b</code> at which the data is
	 * written.
	 * 
	 * 在数组b位置 这个开始偏移 ，这个数组开始写入。
	 * 
	 * @param len the maximum number of bytes to read. 读取的最大字节数
	 */
	@Override
	public int read(byte[] b, int off, int len) throws IOException {
		// TODO Auto-generated method stub
		return super.read(b, off, len);
	}

	@SuppressWarnings("resource")
	public static void main(String[] args) throws IOException {

		/**
		 * InputStream 是一个抽象类，所以它不能被 new。 但是它有很多的实现类，来供大家使用
		 */
		InputStream input = null;

		input = new FileInputStream("G:\\javaTest\\hellos.txt");
		
		

	}
}
