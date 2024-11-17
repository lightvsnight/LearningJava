package com.io.file;

import java.io.File;

public class LastIndexOf {

	public static void main(String[] args) {
		File file =  new File("G:/javaTest/com/io/source/");
		
		for(String str :file.list()){
			/*
			 * != -1 表示找到了 true
			 * != 1  表示找不到 false
			 */
			if(str.endsWith(".java")){ //从后往前找
				System.out.println(str);
			}
			
			if(str.lastIndexOf(".java") != -1){
				System.out.println(str);
			}
			
			if(str.indexOf("hello") == -1){ //indexOf 从前往后找
				System.out.println("indexOf: "+str);
			}
		}
	}
}
