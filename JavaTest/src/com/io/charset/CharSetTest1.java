package com.io.charset;

import java.nio.charset.Charset;
import java.util.Iterator;
import java.util.Set;
import java.util.SortedMap;


/**
 * 
 * Charset 字符集
 * 
 * Charset.availableCharsets() 可以获得系统当中，字符集构成的一个map对象	
 *
 */
public class CharSetTest1 {

	public static void main(String[] args) {
		SortedMap<String, Charset>  map = Charset.availableCharsets();
		
		Set<String> set = map.keySet();
		
		for(Iterator<String> iter = set.iterator();iter.hasNext();){
			System.out.println(iter.next());
		}
	}
}
