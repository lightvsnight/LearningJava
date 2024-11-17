package com.java.test;
 
/**
 * 
 * @author L.hk
 *
 * Object类中hashCode()方法的特点
 * 
 */
public class Object_Hashcode_function_Characterisitic {

	 //  a) 在java应用的一次执行过程中，对于同一个对象的hashCode方法的多次调用，
	 //     他们应该返回相同的值(前提是这个对象在执行过程中没有发生变化)。
	
	 //  b) 对于两个对象来说，如果使用equals()方法比较返回true,
	 //     那么这两个对象的hashCode值一定是相同的。（强制的，必须的）
	
	 //  c) 如果两个对象来说，如果使用equals()方法比较返回false,
	 //     那么这两个对象的 hashCode值不要求一定不同（可以相同，可以不同）,
	 //     但是如果不同则可以提高应用的性能
	
	
	 //  d) 对与Object类来说，不同的Object对象的hashCode值是不同(hashCode值代表了Object对象的地址)。 
	 //
	 //
}
