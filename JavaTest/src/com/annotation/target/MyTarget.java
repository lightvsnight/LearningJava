package com.annotation.target;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * 
 * @author L.hk
 * @Target (ElementType.METHOD) 所修饰的 目标接口(MyTarget[注解])
 *   (根据 ElementType.METHOD枚举的定义) 只能修饰方法
 */
@Target(ElementType.METHOD)
@Retention(RetentionPolicy.CLASS)
public @interface MyTarget {

	String value();
}
