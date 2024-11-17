package com.io.reader;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

/**
 * 
 * @author L.hk
 * 
 *         BufferedReader 通过缓冲输入提高性能。它有两个构造方法 BufferedReader(Reader inputSteam)
 *         创建一个默认缓冲区长度的缓冲字符流。 BufferedReader(Reader)： 缓冲区长度有buffSize传入
 * 
 *         和字节流的情况相同，缓冲一个输入字符流同样提供支持可用缓冲区中流内反向移动的基础。
 *         为支持这点，BufferedReader实现了mark()和reset()方法，
 *         并且BufferedReader.markSupported()返回true
 * 
 */
public class BufferedReaderTest {

	public static void main(String[] args) throws IOException {
		FileReader fr = new FileReader("o:\\javaTest\\hello.txt");
		BufferedReader br = new BufferedReader(fr);
		String str = br.readLine();
		while (null != str) {
			System.out.println(str);
			str = br.readLine();
		}
		br.close();
	}
}
