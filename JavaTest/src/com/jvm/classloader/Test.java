package com.jvm.classloader;

public class Test {

	public static void main(String[] args) throws Exception {
		Class<?> clazz = Class.forName("java.lang.String");
		System.out.println(clazz.getClassLoader());
		
		Class<?> clazz1 = Class.forName("java.nio.Buffer");
		System.out.println(clazz1.getClassLoader());
		
		//Test test = new Test();
		
		//Class<?> clazz2 = test.getClass();
		Class<?> clazz2 = Class.forName("com.jvm.classloader.Test");
		System.out.println(clazz2.getClassLoader());
		
	}
}

class C{
	
}