package com.io.stream;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

/**
 * 
 * @author L.hk
 * 
 * FileStream  访问 文件的 类
 *
 */
public class FileStreamTest1 {
	
	
    /**
     * 输入，通用的写法
     * @param args
     * @throws IOException
     */
	public static void main(String[] args) throws IOException {
		
		File file = new File("o:\\javaTest\\hellos.txt");
		if(!file.isFile()){
			file.createNewFile();
		}
		InputStream is = new FileInputStream(file);
		
		byte[] buffer = new byte[200];
		
		int length = 0;
		
		/*
		 * -1 != (length = is.read(buffer,0,200))
		 * -- 解析： 
		 *   
		 * 1). 为甚判断为什么不等于-1：
		 *     read(buffer,0,200) 返回什么
		 *     @return     the total number of bytes read into the buffer, or
         *                 <code>-1</code> if there is no more data because the end of
         *                 the stream has been reached.
		 *                 这个总的字节 读到buffer数组里，
		 *                 如果是 -1 , 没有更多的数据，因为这个流已被结束了
		 * 
		 */
		while(-1 != (length = is.read(buffer,0,200))){
			
			/*
			 * String 类中提供了 将byte转换为字符串的方法
			 * 为什么写length，不谢Buffer的固定长度？
			 * 因为如果最后一次读取的字符串的长度不到200，你就读不到最后的内容
			 */
			String str= new String(buffer,0,length);
			
			System.out.println(str);
		}
		
		is.close();
	}

}
