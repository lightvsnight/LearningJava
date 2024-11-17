package com.autoboxing;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/**
 * 
 * @author L.hk
 *
 */
public class Frequency {

	public static void main(String[] args) {
		
		Map<String, Integer> map = new HashMap<String, Integer>();
		for (String word : args) {
			map.put(word, (null == map.get(word)) ? 1 : map.get(word) + 1);
		}
		
		 Set<?> set = map.keySet();
		 for(Iterator<?> iter = set.iterator();iter.hasNext();){
			 String key = (String) iter.next();
			 Integer value = map.get(key);
			 System.out.println(key+" : "+value);
		 }
	}
}
