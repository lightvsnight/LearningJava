package com.io.file.example;

import java.io.File;
import java.util.ArrayList;

public class ListAllTest {
	
	//用于判断目录或文件所处的 层次(第几层)
	private static int time;

	// 递归的方法
	public static void deepList(File file) {

		if (file.isFile() || 0 == file.listFiles().length){
			time = 0;
			return;
		}
		else{
			File[] files = file.listFiles();
			files = sort(files); //重新排序，目录在前，文件在后
			
			for(File f : files){
				StringBuffer output = new StringBuffer();
				if(f.isFile()){
					output.append(getTabs(time));
					output.append(f.getName());
				}
				else{
					output.append(getTabs(time));
					output.append(f.getName());
					output.append("-");
				}
				if(f.isDirectory()){
					time++;
					deepList(f);
					time--;
				}
				
				System.out.println(output);
			}
		}
		
	}

	// 整理文件数组，使得目录排在文件之前
	public static File[] sort(File[] files) {
		ArrayList<File> sorted = new ArrayList<File>();

		// 寻找到所有的目录
		for (File f : files) {
			if (f.isDirectory()) { // 如果是目录
				sorted.add(f);
			}
		}

		// 寻找到所有的文件
		for (File f : files) {
			if (f.isFile()) {
				sorted.add(f);
			}
		}

		return sorted.toArray(new File[files.length]);
	}
	
	
	/**
	 * 处理缩进的
	 * @param time 第几层
	 * @return
	 */
	@SuppressWarnings("unused")
	private static String getTabs(int time){
		
		StringBuffer buffer = new StringBuffer();
		for(int i = 0 ;i<time ; i++){
			buffer.append("\t");
		}
		return buffer.toString();
	}

	public static void main(String[] args) {
		File file = new File("G:\\javaTest");
		deepList(file);
	}
}
