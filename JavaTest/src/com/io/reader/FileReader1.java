package com.io.reader;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

/**
 * 
 * @author L.hk 读取自己的源文件显示在命令行上
 *
 */
public class FileReader1 {

	public static void main(String[] args) throws IOException {
		//G:\\workspace\\JavaTest\\src\\com\\io\\reader\\FileReader1.java
		FileReader fr = new FileReader(
				"G:\\javaTest\\FileReader1.java");
		BufferedReader br = new BufferedReader(fr);
 
		String str;
		while (null != (str = br.readLine())) {
			System.out.println(str);
		}
		br.close();
	}
}
