package com.proxy.dynamicproxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Proxy;

/**
 * 
 * @author L.hk
 * 
 *         测试
 */
public class Client {
	public static void main(String[] args) {

		RealSubject rs = new RealSubject();

		InvocationHandler ih = new DynamicProxySubject(rs);

		Class<?> classType = ih.getClass();
		// 下面的代码一次性生成代理
		/*
		 * public static Object newProxyInstance(ClassLoader loader, Class<?>[]
		 * interfaces, InvocationHandler h)
		 * 
		 * 该方法完成两件事情，他会在运行时动态的生成class对象，然后生成类对象的一个实例
		 */
		Subject subject = (Subject) Proxy.newProxyInstance(
				classType.getClassLoader(), rs.getClass().getInterfaces(), ih);

		System.out.println(subject.getClass());

		subject.request();
	}
}
