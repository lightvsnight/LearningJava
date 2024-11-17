package com.annotation.reflecexample;

import java.lang.annotation.Annotation;
import java.lang.reflect.Method;


/**
 * 
 * @author L.hk
 *
 */
public class MyReflection {
	
	
	public static void main(String[] args) throws Exception {
		MyTest mt = new MyTest();
		Class<?> classType = mt.getClass();
		
		//获取MyTest类中output方法的注解信息
		Method method = classType.getMethod("output",new Class[]{});
		
		if(method.isAnnotationPresent(MyAnnotation.class)){  //判断目标方法是否存在注解MyAnnotation型态
			
			method.invoke(mt,new Object[]{});//执行目标方法
			
			MyAnnotation myAnnotation = method.getAnnotation(MyAnnotation.class);
			String value = myAnnotation.value();
			String hello = myAnnotation.hello();
			String world = myAnnotation.world();
			System.out.println("value :" + value);
			System.out.println("Hello :"+hello);
			System.out.println("World :"+world);
		}
		
		
		Annotation[] annotations = method.getAnnotations();
		
		for(Annotation annotation :annotations){
			
			//annotation.annotationType() 返回目标注解的类对象
			System.out.println(annotation.annotationType().getName());
		}
		
	}
}
