package com.annotation.retention;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;


/**
 * 
 * @author L.hk
 * Retation  指示编译程序如何对待你的自定义的Annotation型态。
 */
@Retention(RetentionPolicy.CLASS)
public @interface MyAnnotation {

	String hello() default "hello";
	
	String world();
}
