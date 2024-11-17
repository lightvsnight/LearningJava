package com.io.recursive;

import java.io.File;

/**
 * 
 * @author L.hk
 * 
 *         采用递归方法删除目标目录下所有文件
 */
public class RecursiveDeleteFile {

	public static void deleteAll(File file) {
		//递归出口
		if (file.isFile() || file.list().length == 0) {
			file.delete();
		} else {
			for (File f : file.listFiles()) {
				deleteAll(f);
				f.delete();
			}
		}
	}

	public void deleteAlls(File file) {
		//递归出口
		if (!file.exists()) {
		} else {
			for (File f : file.listFiles()) {
				if (f.isFile()) {
					f.delete();
				} else {
					deleteAlls(f);
					f.delete();
				}
			}
		}
	}

	public static void main(String[] args) {
		File file = new File("g:/javaTest/com/io/test1/");

		System.out.println(file.list().length);

		RecursiveDeleteFile rdf = new RecursiveDeleteFile();
		rdf.deleteAlls(file);
	}
}
