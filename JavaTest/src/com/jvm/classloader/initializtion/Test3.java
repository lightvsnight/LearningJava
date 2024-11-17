package com.jvm.classloader.initializtion;

import java.util.Random;

class FinalTest1{
	
	/**
	 * 编译的时候不能计算出常量的值，
	 * 只有在调用的时候才能得出结果
	 */
	public static final int x = new Random().nextInt(100); 
	
	static {
		System.out.println("FinalTest1 static block");
	}
}

public class Test3 {
    public static void main(String[] args) {
		System.out.println(FinalTest1.x);
	}
}
