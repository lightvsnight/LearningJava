package com.annotation.reflecexample;

import java.util.Date;
import java.util.Map;
import java.util.TreeMap;

@MyAnnotation(value="",hello="beijing",world="shanghai")
public class MyTest {

	
	@Deprecated
	@SuppressWarnings("unchecked")
	@MyAnnotation(value="",hello="Ê¯¼Ò×¯",world="Þ»³Ç")
	public void output() {
		// TODO Auto-generated method stub
		System.out.println("output something");
		
		@SuppressWarnings("rawtypes")
		Map map = new TreeMap(); 
		map.put("hello",new Date());
	}
}
