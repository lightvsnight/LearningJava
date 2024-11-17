package com.annotation.exemple;

public @interface AnnotationTest {	
	//定义String类型的变量,并未变量设定默认值
	String value1() default "hello";
	
	EnumTest value2();
	
	String[] value3();
}

enum EnumTest{
	Hello,world,welcome;
}