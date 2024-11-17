package com.jvm.classloader.one;


class C
{
  static
  {
	 System.out.println("class C"); 
  }	
}
public class Test7 {

	public static void main(String[] args) {
		
			//第一步：获得系统的类加载器
			ClassLoader classLoader =  ClassLoader.getSystemClassLoader();
			
		try {
			
			Class<?> clazz = classLoader.loadClass("com.jvm.classloader.one.C");
			
			System.out.println("---------------------------------------------");
			
			clazz = Class.forName("com.jvm.classloader.one.C");
			
		} catch (ClassNotFoundException e) {
			System.out.println("类没有找到");
		}
	}
}
