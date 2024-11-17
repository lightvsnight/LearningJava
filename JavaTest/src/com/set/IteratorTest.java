package com.set;

import java.util.HashSet;
import java.util.Iterator;

/**
 * 
 * @author L.hk
 * 
 * µü´úÆ÷Ó¦ÓÃ
 *
 */
public class IteratorTest {

	public static void main(String[] args) {
		HashSet<Object> set = new HashSet<Object>();
		
		set.add("a");
		set.add("b");
		set.add("c");
		set.add("d");
		set.add("e");
		
		Iterator<Object> it = set.iterator();
		
		while(it.hasNext()){
			  String value = (String)it.next();
			  System.out.println(value);
		}
		
		for(Iterator<Object> iter =set.iterator();iter.hasNext();){
			String value = (String)iter.next();
			System.out.println(value);
		}
	}
}
