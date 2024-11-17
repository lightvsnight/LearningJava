package com.reflection.exemple;

import java.lang.reflect.Array;

public class ArrayTest2 {

	public static void main(String[] args) {
		//System.out.println(Integer.TYPE);//输出 原生数据类型int
		//System.out.println(Integer.class);//output  类对象
		
		/*一维数组*/
		int[] dims = new int[] { 5, 10, 15 };
		
		System.out.println(dims instanceof int[]);
		/**
		 * newInstance(Class<?> componentType, int... dimensions) 
		 * throws IllegalArgumentException, NegativeArraySizeException
		 * 
		 * 返回的是一个三维的数组对象
		 */
		Object array = Array.newInstance(Integer.TYPE,dims);
		
		System.out.println(array instanceof int[][][]);
		
		Object objarr = Array.get(array,3);
		
		objarr = Array.get(objarr,5);
		Array.setInt(objarr,10,37);
		
		int[][][] arrayCast = (int[][][]) array;
		
		System.out.println(arrayCast[3][5][10]);
	}
}