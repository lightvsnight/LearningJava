package com.io.stream;

import java.io.ByteArrayInputStream;
import java.io.IOException;

/**
 * 
 * @author L.hk
 *
 */
public class ByteArrayInputStreamTest {
	public static void main(String[] args) throws IOException {
		String temp = "abcdefghijklmnopqrstuvwxyz";

		byte[] b = temp.getBytes();

		ByteArrayInputStream in1 = new ByteArrayInputStream(b);

		for (int i = 0; i < temp.length(); i++) {
			int c;
			while (-1 != (c = in1.read())) {
				if (0 == i) {
					System.out.print((char)c);
				}
				else{
					System.out.println(Character.toUpperCase((char)c));
				}
			}
		}
		System.out.println();
		in1.reset(); //重置到上一次流读到的位置，比如有100个字节，上一次读到25，该读26了。那么下载终止，继续从流的开始读到25
        in1.mark(2); //指定读的位置
		
		ByteArrayInputStream input2 = new ByteArrayInputStream(b, 0, 3);

		input2.close();
	}
}
