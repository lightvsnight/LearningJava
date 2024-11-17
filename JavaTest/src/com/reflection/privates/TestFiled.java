package com.reflection.privates;

import java.lang.reflect.Field;
import java.lang.reflect.Method;

public class TestFiled {

	public static void main(String[] args) throws Exception{
		PrivateClass pc = new PrivateClass();
		
		Class<?> classType = pc.getClass();
		
		//Method setMethod = classType.getDeclaredMethod("setName",new Class[]{String.class});
		//setMethod.invoke(pc,new Object[]{"zhangsan"});
		
		
		/*
		 * 通过反射，修改类中private所修饰的成员变量
		 */
		Field field = classType.getDeclaredField("name");
		field.setAccessible(true);
		field.set(pc,"zhangsan");//如果第二个参数，与所对应类的私有变量所定义的类型不匹配就会出错
		
		//通过对象访问该类的公共的方法
		System.out.println(pc.getName());
		
		//通过反射来获取目标类中的方法
		//getMethod()方法 只能获取目标类中public所修饰的方法。	
		Method getMethod = classType.getMethod("getName",new Class[]{});
		String str = (String) getMethod.invoke(pc,new Object[]{});
		System.out.println(str);
		
	}
}
