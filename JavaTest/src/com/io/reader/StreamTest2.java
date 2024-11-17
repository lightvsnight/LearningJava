package com.io.reader;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/**
 *  程序将来自标准输入的字符串显示在标准输出上
 *  
 *  标准的输入设备：例如键盘
 */
public class StreamTest2 {
	public static void main(String[] args) throws Exception {
		InputStreamReader isr = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(isr);
		
		String str = null;
		
		while(null != (str = br.readLine())){
			System.out.println(str);
		}
		br.close();
	}
}
