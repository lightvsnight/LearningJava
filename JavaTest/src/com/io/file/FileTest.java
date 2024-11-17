package com.io.file;

import java.io.File;
import java.io.IOException;

public class FileTest {
	public static void main(String[] args) {
		/**
		 * 一下两种路径书写方式会被windows系统上适用，但是第一种方式，除windows系统之外都不适用
		 * 路径写法一：d:\\com
		 * 路径写法二：d:/com
		 */
		//File file = new File("d:\\com\\text.txt");
	
		File file = new File(File.pathSeparator+"test.txt");
		
		
		
		try {
			/* 
			 * 此方法创建文件时，会抛出异常，所以在使用时也要抛出异常
			 * public boolean createNewFile() throws IOException
			 */
			System.out.println(file.createNewFile());
		} catch (IOException e) {
			System.out.println("找不到文件目录");
			e.printStackTrace();
		}
	}
}
