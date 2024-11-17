package com.reflection.exemple;

import java.lang.reflect.Field;
import java.lang.reflect.Method;

public class ReflectTester {

	//实现对Customer对象的copy
	public Object copy(Object object) throws Exception{
		
		Class<?> classType = object.getClass();
		//1. 用于生成带参数的构造方法的类的实例
		Object obj = classType.getConstructor(new Class[]{}).newInstance(new Object[]{});
		
		//2. 此种方法，用于生成不带参数的构造方法的类的实例
		Object obj1 = classType.newInstance();
		
		
		/*
		 * 获取成员变量
		 */
		Field[] fields = classType.getDeclaredFields();
		for(Field field :fields){
			 String name = field.getName();//对象类的成员变量的名称
			 String firstLetter = name.substring(0,1).toUpperCase();//截取首字母，将属性首字母转换为大写
			 //System.out.println(f);
			 
			 String getMethodName = "get"+firstLetter+name.substring(1);//拼写出getXxx()方法,[substring(1):截取从1开始之后的所有字母]
			 String setMethodName = "set"+firstLetter+name.substring(1);//拼写出setXxx()方法

			Method getMethod = classType.getDeclaredMethod(getMethodName,new Class[]{});
			Method setMethod = classType.getDeclaredMethod(setMethodName,new Class[]{field.getType()});
			
			Object value = getMethod.invoke(object,new Object[]{});
			setMethod.invoke(obj,new Object[]{value});
			
			 System.out.println(getMethodName);
			 System.out.println(setMethodName);
		}
		
		return obj;
	}
	
	public static void main(String[] args) throws Exception {
		Customer cus = new Customer("Tom",20);
		cus.setId(1L);
		
		ReflectTester r  = new ReflectTester();
		Customer customer  = (Customer) r.copy(cus);
		
		System.out.println(customer.getId() +" "+customer.getName()+" "+customer.getAge());
	}
}



class Customer {
	
	private Long id;
	private String name;
	private int age;
	
	public Customer(){
	}

	public Customer(String name,int age){
		this.name = name;
		this.age = age;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

}