package com.annotation.exemple;

@AnnotationTest(value2=EnumTest.Hello,value3="xiaoxiao")
public class AnnotationUsage {
	
	@AnnotationTest(value1 = "world",value2=EnumTest.welcome,value3={"person","one"})
	public void method(){
		System.out.println("this is maker annotation");
	}
	
	public static void main(String[] args) {
		AnnotationUsage au = new AnnotationUsage();
		au.method();
	}

}
