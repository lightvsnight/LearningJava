package com.test;

class A{
	
	private int a ;
	private String b;
	public int getA() {
		return a;
	}
	public void setA(int a) {
		this.a = a;
	}
	public String getB() {
		return b;
	}
	public void setB(String b) {
		this.b = b;
	}
}
public class TestIFNUll {

	public static void main(String[] args) {
		
		A a = new A();
		a.setA(1);
		a.setB("");
		
		if(null != a && null != a.getB() ){
			System.out.println("会出错吗？");
		}
		System.out.println("-------------------");
		A a1 = null;
		if(0 < a1.getA() && null != a1 ){
			System.out.println("会出错吗？");
		}
		
	}

}