package com.io.stream.custom;

import java.io.IOException;
import java.io.InputStream;

/**
 * 
 * @author L.hk 描述： 自定义输入流
 * 
 */
public class MyownStream {

	public static void main(String[] args) throws Exception {
		byte[] b = new byte[10];
		for (int i = 0; i < b.length; i++) {
			b[i] = (byte) i;
		}

		MyByteArrayInputStream mbais = new MyByteArrayInputStream(b);
		
		while (true) {
			mbais = new MyByteArrayInputStream(b);
			int c = mbais.read();
			if (c < 0) {
				break;
			}
			System.out.print(c+" ");
		}

		System.out.println();
		
		
	}
}

class MyByteArrayInputStream extends InputStream {

	protected byte[] data;

	protected int ptr = 0;

	public MyByteArrayInputStream(byte[] b) {
		this.data = b;
	}

	/**
	 * read 方法是从父类继承来的,所以需要实现。 怎么实现？ read 是用于读取字节长度，
	 * 
	 * 
	 * 
	 */
	@Override
	public int read() throws IOException {

		return (ptr < data.length) ? data[ptr++] : -1;
	}

}
