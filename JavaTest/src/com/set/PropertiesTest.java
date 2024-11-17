package com.set;

import java.util.Iterator;
import java.util.Properties;
import java.util.Set;

/**
 *  系统环境变量
 * @author L.hk
 *
 */

public class PropertiesTest {
	public static void main(String[] args) {
		Properties p = System.getProperties();
		
		Set<Object> set = p.keySet();
		
		System.out.println("------------系统环境变量------------");
		for(Iterator<Object> iter = set.iterator(); iter.hasNext();){
			String key = (String)iter.next();
			String value = p.getProperty(key);
			
			System.out.println(key + ":" +value);
		}
	}
}
