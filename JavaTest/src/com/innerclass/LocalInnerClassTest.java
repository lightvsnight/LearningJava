package com.innerclass;

/**
 * 
 * @author L.hk
 * 
 *  局部内部类
 *
 */
class LocalInner{
	private int a = 1;
	
	//new Inner3().test(); 局部内部类只能在局部方法中被调用
	
	public void doSomething(){
		
		class Inner3{
			public void test(){
				System.out.println("hello world");
			}
		}
		
		new Inner3().test();
	}
}

public class LocalInnerClassTest {
	public static void main(String[] args) {
		//访问局部内部类
		LocalInner localInner = new LocalInner();
		localInner.doSomething();
	}
}
