package com.io.stream;

import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.SequenceInputStream;
import java.util.Enumeration;
import java.util.Vector;

/*将三个文本文件的内容copy到一个文件中。 
 * 基本思路：通过续写的方式。 
 *  
 * JAVA之IO技术中提供了一个可串联的字节输入流对象。 
 *  
 * 合并流对象 
 * SequenceInputStream: 
 * SequenceInputStream 表示其他输入流的逻辑串联。 
 * 它从输入流的有序集合开始，并从第一个输入流开始读取， 
 * 直到到达文件末尾，接着从第二个输入流读取，依次类推， 
 * 直到到达包含的最后一个输入流的文件末尾为止。 
 * 有两个构造函数： 
 * SequenceInputStream(InputStream s1, InputStream s2) ：针对于两个字节流对象的操作 
 * SequenceInputStream(Enumeration<? extends InputStream> e) : 
 * 针对于多个字节流对象的操作。 
 */  
public class SequenceInputStreamTest {

	public static void main(String[] args) throws IOException {
		File file1 = new File("o:\\javaTest\\1.txt");
		File file2 = new File("o:\\javaTest\\2.txt");
		File file3 = new File("o:\\javaTest\\3.txt");
		if(file1.isFile()){
			file1.createNewFile();
		}
		if(file2.isFile()){
			file2.createNewFile();
		}
		if(file2.isFile()){
			file3.createNewFile();
		}
		OutputStream os  = null;
		BufferedOutputStream  bos = null;
		os  = new FileOutputStream("o:\\javaTest\\1.txt");
		//向三个文件中写入内容
		bos = new BufferedOutputStream(os);
		bos.write("http://".getBytes());
		bos.close();
		os.close();
		
		os  = new FileOutputStream("o:\\javaTest\\2.txt");
		//向三个文件中写入内容
		bos = new BufferedOutputStream(os);
		bos.write("www.baidu.com".getBytes());
		bos.close();
		os.close();
		
		os  = new FileOutputStream("o:\\javaTest\\3.txt");
		//向三个文件中写入内容
		bos = new BufferedOutputStream(os);
		bos.write("百度".getBytes());
		bos.close();
		os.close();
		// 下面的构造函数需要传一个下面类型的参数，如何做------------------?
		/*
		 * Enumeration<InputStream> enum =new Enumeration<E>() { };
		 */
		Vector<InputStream> vector = new Vector<InputStream>();
		try {
			vector.add(new FileInputStream(new File("o:\\JavaTest\\1.txt")));
			vector.add(new FileInputStream(new File("o:\\JavaTest\\2.txt")));
			vector.add(new FileInputStream(new File("o:\\JavaTest\\3.txt")));
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}

		Enumeration<InputStream> en = vector.elements();
		// 创建一个合并流对象-将源整合到流中
		SequenceInputStream sis = new SequenceInputStream(en);
		// 目的地
		FileOutputStream outputStream = new FileOutputStream(new File(
				"o:\\JavaTest\\4.txt"));
		byte[] buf = new byte[1024];
		int len = 0;
		while ((len = sis.read(buf)) > 0) {
			outputStream.write(buf, 0, len);
		}
		sis.close();
		outputStream.close();
	}
}