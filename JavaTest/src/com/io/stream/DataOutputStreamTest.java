package com.io.stream;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;

/**
 * 
 * @author L.hk  字节流
 * 
 *  过滤流
 */

public class DataOutputStreamTest {

	public static void main(String[] args) throws Exception {

		DataOutputStream dos = new DataOutputStream(new BufferedOutputStream(
				new FileOutputStream("o:\\javaTest\\hello.txt")));
		
		BufferedOutputStream bos = new BufferedOutputStream(new DataOutputStream(
				new FileOutputStream("o:\\javaTest\\hello.txt")));

		byte b = 3;
		int i = 1;
		char n = 'a';
		float f = 1.0f;

		dos.writeByte(b); // 写入的是 二进制编码 类型信息
		dos.writeInt(i);
		dos.writeChar(n);
		dos.writeFloat(f);
		
		bos.write(b);

		dos.flush(); //刷新输出流，强制缓冲区的输出字节被写出
		dos.close();
        bos.close();
        
		DataInputStream dis = new DataInputStream(new BufferedInputStream(
				new FileInputStream("o:\\javaTest\\hello.txt")));

		System.out.println(dis.readByte());
		System.out.println(dis.readInt());
		System.out.println(dis.readChar());
		System.out.println(dis.readFloat());
		
	}
}
