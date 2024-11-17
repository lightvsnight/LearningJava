package com.annotation.target;

import java.lang.reflect.Method;

/*
 *  @MyTarget("hello")  
 *  The annotation @MyTarget is disallowed for this location
 *  这个注解 @MyTarget 是不允许在这个位置
 */
public class MyTargetTest {

	@MyTarget("hello")
	public void doSomething() {
		System.out.println("hello world");
	}
	
	public static void main(String[] args) throws Exception, SecurityException {
		
		Class<?> classType = MyTargetTest.class ;
		Method method =  classType.getMethod("doSomething", new Class[]{});
		
		if(method.isAnnotationPresent(MyTarget.class)){
			method.invoke(classType,new Object[]{});
			
			MyTarget myTarget =  method.getAnnotation(MyTarget.class);
			String value = myTarget.value();
			System.out.println(value);
		}
	}
}
