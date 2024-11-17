package com.io.file;

import java.io.File;
import java.io.IOException;

public class File_Delete {
	public static void main(String[] args) throws IOException {
		File file = new File("g:/javaTest/com/io/files");
		
		System.out.println(file.exists()); //判断时候存在
		if(!file.exists())
			file.mkdirs();   //创建目录
		
		file.createNewFile();
		
		System.out.println("判断是否可读 : "+file.canRead()); //判断是否可读
		
		System.out.println("判断是否可写 : "+file.canWrite());  //判断是否可写
		
		System.out.println("判断是否是目录 : "+file.isDirectory());  //判断是否是目录
		
		System.out.println("判断是否是文件 : "+file.isFile());  //判断是否是文件
		
		
		/*
		 * 删除路径当中最后一个目录 例如：g:/javaTest/com/io/files 中最后一个files
		 * 此次删除是真正的从磁盘里清除，不是放入回收站
		 * 
		 * 删除时，目录下必须没有文件才能删除
		 */
		file.delete(); 
		
		file.deleteOnExit();
		System.out.println("已删除");
		
		
	}
}
