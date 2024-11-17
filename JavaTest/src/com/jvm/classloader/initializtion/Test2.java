package com.jvm.classloader.initializtion;

/**
 * 
 * @author L.hk
 * 类的初始化
 */
class FinalTest {
	
	/**
	 * 编译的时候能够计算出常量的值
	 */
	public static final int x = 6/3;
	
	static {
		System.out.println("FinalTest static block");
	}
}

public class Test2{
	public static void main(String[] args) {
		
		/**
		 * 测试类的初始化步骤
		 * 在打印：x时，会不会输出静态的代码块的字符串
		 */
		System.out.println(FinalTest.x);
	}
}