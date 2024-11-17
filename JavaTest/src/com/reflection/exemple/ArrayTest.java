package com.reflection.exemple;

import java.lang.reflect.Array;

/**
 * 
 * @author L.hk
 *
 */
public class ArrayTest {
	public static void main(String[] args) throws Exception{
		
		Class<?> classType = Class.forName("java.lang.String");
		
		/**
		 * newInstance(Class<?> componentType, int length) throws NegativeArraySizeException
		 */
		Object array = Array.newInstance(classType,10);
		System.out.println(array);
		
		
		Array.set(array,5,"hello");
		Array.set(array,1,"1");
		
		String str = (String) Array.get(array,5);
		System.out.println(str);
		str = (String) Array.get(array,1);
		System.out.println(str);
	}
}
