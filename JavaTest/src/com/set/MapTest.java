package com.set;

import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class MapTest {

	public static void main(String[] args) {
		Map<String, Integer> map = new HashMap<String, Integer>();

		for (int i = 0; i < args.length; i++) {

			if (map.get(args[i]) == null) {
				map.put(args[i], new Integer(1));
			} else {
				Integer in = (Integer) map.get(args[i]);
				in = new Integer(in.intValue() + 1);
				map.put(args[i], in);
			}
		}

		Set<?> set = map.keySet();
		for (Iterator<?> iter = set.iterator(); iter.hasNext();) {
			String key = (String) iter.next();
			Integer value = (Integer) map.get(key);
			System.out.println(key + " : " + value);
		}
		
		Collection<?> c = map.values();
		for (Iterator<?> iter = c.iterator(); iter.hasNext();) {

			String value = (String) iter.next().toString();

			System.out.println(" : " + value);
		}
	}
}
