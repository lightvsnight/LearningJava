package com.jvm.classloader.initializtion;

public class Test1 {
	
	public static void main(String[] args) throws ClassNotFoundException {
		  
		  //这个类是有根类加载器
		  Class<?> clazz = Class.forName("java.lang.Object");
		  System.out.println(clazz.getClassLoader());
		  
		  clazz = Class.forName("java.io.File");
		  System.out.println(clazz.getClassLoader());
		  
		  System.out.println("------------------------------------");
		  
		  //这是由应用类加载器加载 (AppClassLoader)  sun.misc.Launcher$AppClassLoader@2512b853
		  clazz = Class.forName("com.jvm.classloader.initializtion.Test1");
		  System.out.println(clazz.getClassLoader());
	}

}
