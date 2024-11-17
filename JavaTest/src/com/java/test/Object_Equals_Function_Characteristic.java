package com.java.test;


/**
 * 
 * @author L.hk
 *
 * 关于Object类中equals方法的特点
 * 
 */
public class Object_Equals_Function_Characteristic {

	 // a) 自反： x.equals(x) 应该返回true，前提x不为空。
	
	 // b) 对称性：x.equals(y)为true, 那么 y.equals(x) 也为true。
	
	 // c) 传递性： 任何三个非空(non-null)引用  x, y,and z, 
	 //          如果 x.equals(y)返回true 并且 y.equals(z)返回true，
	 //          则 x.equals(z) 也应该返回true。
	
	
	 // d) 一致性：x.equals(y) 的第一次调用为true，那么 x.equals(y) 
	 //          的第二次，第三次，第n次调用也应该为true。前提条件是在比较之间 
	 //          没有修改过x，也没有修改过y。
	
	 // e) 对于非空引用x, x.equals(null)返回false;
	
	
	 
}
