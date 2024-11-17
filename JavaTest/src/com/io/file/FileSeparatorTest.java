package com.io.file;

import java.io.File;
import java.io.IOException;

public class FileSeparatorTest {
	public static void main(String[] args) {
		
		
		File file = new File(File.separator); //separator 表示根目录
		
		File file1 = new File(file,"test.txt");//不会指定盘符
		
		try {
			System.out.println(file1.createNewFile());
		
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
