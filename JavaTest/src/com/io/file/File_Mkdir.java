package com.io.file;

import java.io.File;

public class File_Mkdir {
	public static void main(String[] args) {
		
		File file = new File("g:/javaTest/com/io/file");
		
		System.out.println(file.mkdir());
		
		System.out.println(file.isDirectory());
		
		System.out.println(file.isFile());
		
		File file1 = new File("g:/javaTest");
		if(file1.isDirectory()){
			for(String str:file1.list()){
				System.out.println("Ŀ¼: "+str);
			}
		}
		
		
		File[] files = file1.listFiles();
		for(File f : files){
		   if(f.isFile()){
			   System.out.println(f.getName());
		   }else{
			   for(String s:f.list()){
				   System.out.println(s);
			   }
		   }
		}
	}
}
