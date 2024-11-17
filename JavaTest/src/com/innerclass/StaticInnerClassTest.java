package com.innerclass;


/**
 * 
 * @author L.hk
 * 
 * 静态内部类
 *
 */
class StaticInner{
	private static int a = 4;
	
	public static class Inner{
	    private int a = 5;	
		public void result()
		{
			System.out.println(this.a);
			System.out.println(StaticInner.a);
			System.out.println("内部类result");
		}
	}

}

public class StaticInnerClassTest {
	public static void main(String[] args) {
		//引用外部类的内部类
		StaticInner.Inner  inner = new StaticInner.Inner();
		inner.result();
	}
}
