package com.reflection.exemple;

import java.lang.reflect.Method;

public class DumpMethods {

	public static void main(String[] args) throws Exception{
		
		/*
		 * 获取代操作类的Class对象
		 * 
		 * args[0]{"java.lang.String","java.lang.Object"}
		 * 
		 * args[0]{com.extend.generic.Child}
		 * 
		 * args[0]:可以是枚举，可以是任何一个类,可以是接口
		 * 
		 */
		Class<?> classType = Class.forName("com.strategy.Strategy");
		
		
		/*
		 * getDeclaredMethods() 获取当前Class对象中所声明的所有的方法
		 * 
		 */
	    Method[] methods  = classType.getDeclaredMethods();
		for(Method method : methods){
			System.out.println(method);
		}
	}
}
