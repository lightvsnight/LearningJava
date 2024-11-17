package com.io.file;

import java.io.File;
import java.io.IOException;

public class FileTest2 {
	public static void main(String[] args) {
		File file = new File("g:/javaTest");
		
		/*
		 * java.io.File.File(File parent, String child)
		 *  parent : 已知file对象
		 *  child : 文件名称
		 */
		File file2 = new File(file,"hello.txt");
		
		/*
		 * java.io.File.File(String parent, String child)
		 *  parent : 路径常量
		 *  child : 文件名称
		 */
		File file3 = new File("g:/javaTest","hello.txt");
		
		try {
			System.out.println(file2.createNewFile());
			System.out.println(file3.createNewFile());
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
