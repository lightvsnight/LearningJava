package com.io.file;

import java.io.File;
import java.io.FilenameFilter;

public class FileNameFilterTest {

	public static void main(String[] args) {
		File file = new File("g:/javatest/com/io/source/");

		String[] names = file.list(new FilenameFilter() {

			/*
			 * FilenameFilter 决定什么样的文件 返回
			 * 
			 * @see java.io.FilenameFilter#accept(java.io.File,
			 * java.lang.String) 测试指定文件是否应该包含在一个文件列表。
			 */
			@Override
			public boolean accept(File dir, String name) {
				if (name.endsWith(".java"))
					return true;
				return false;
			}
		});
		
		for(String str : names){
			System.out.println(str);
		}
	}
}
