package com.annotation.reflecexample;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;


/**
 * 
 * @author L.hk
 * 
 * 当RetentionPolicy设定为runtime策略时，
 * JVM才能通过反射的方式读取注解信息
 * 
 * 
 */
@Retention(RetentionPolicy.RUNTIME)
public @interface MyAnnotation {
	
	String value();

	String hello() default "hello";
	
	String world();
}
