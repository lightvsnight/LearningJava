package com.java.test;

import java.util.HashSet;

/**
 * 
 * @author L.hk
 *
 */
public class wordsOrder {

	public static void main(String[] args) {
		String str = "ab";
		
		
		//可以装入 当前字符String的所有排列
		HashSet<Object> hs = new HashSet<Object>(); 
		
		//次循环可以循环出字符串中所有字符 
		for(int i = 0;i<str.length();i++){
			 char s = str.charAt(i);
			  System.out.println(String.valueOf(s));
			  hs.add(s);
		}
	}
}
