package com.generics;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

/**
 * map的泛型应用 map 的遍历
 * 
 * @author L.hk
 *
 */
public class MapGenericTest {

	public static void main(String[] args) {
		Map<String, String> map = new HashMap<String, String>();
		map.put("a", "aa");
		map.put("b", "bb");
		map.put("c", "cc");
		map.put("d", "dd");
		
		Map<String, String> treeMap = new TreeMap<String, String>();
		treeMap.put("a", "aa");
		treeMap.put("b", "bb");
		treeMap.put("c", "cc");
		treeMap.put("d", "dd");
		Set<String> set = map.keySet();

		// map 的第一种遍历方式
		for (Iterator<String> iter = set.iterator(); iter.hasNext();) {
			String key = iter.next();
			String value = map.get(key);
			System.out.println("KEY:" + key + " ;VALUE:" + value);
		}

		System.out.println("-------------------------------------------");
		// map 的第二种遍历方式
		Set<Map.Entry<String, String>> setEntry = treeMap.entrySet();

		for (Iterator<Map.Entry<String, String>> iter = setEntry.iterator(); iter
				.hasNext();) {
			Map.Entry<String, String> entry = iter.next();
			String key = entry.getKey();
			String value = entry.getValue();
			System.out.println("KEY:" + key + " ;VALUE:" + value);
		}
		
		
		for(Map.Entry<String, String> entry : map.entrySet()){
            
            if(entry.getKey().contains("redis.ip") && entry.getValue() != null)
                 entry.getValue();
             
            if(entry.getKey().contains("redis.port") && entry.getValue() != null)
                entry.getValue();
        }

	}
}