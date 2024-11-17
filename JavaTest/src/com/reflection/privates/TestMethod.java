package com.reflection.privates;

import java.lang.reflect.Method;

public class TestMethod {

	public static void main(String[] args) throws Exception {

		PrivateClass pc = new PrivateClass();

		Class<?> classType = pc.getClass();

		Method method = classType.getDeclaredMethod("sayHello",
				new Class[] { String.class });
        
		/**
		 * setAccessible(boolean flag)
		 * 压制java语言的访问检查
		 */
		method.setAccessible(true);
		//通过invoke方法，访问pc对象中的private方法出现错误，必须在执行时，压制对象的访问级别
		String str = (String) method.invoke(pc,new Object[]{"xiaoxiao"});
		System.out.println(str);
	}
}
