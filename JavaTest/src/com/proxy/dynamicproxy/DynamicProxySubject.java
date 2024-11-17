package com.proxy.dynamicproxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

/**
 * 
 * @author L.hk
 * 动态的代理角色
 * 
 * 该代理类的内部属性是一个Object类型，实际使用的时候通过该类的构造方法传递进来一个对象
 * 此外，该类还实现了invoke方法，该方法中的mehtod.invoke其实就是调用被代理对象的将要执行的方法，
 * 方法参数是sub，表示该方法从属与sub，通过动态代理，我们可以在执行真实对象的方法前后加入自己的一些
 * 额外方法。	
 */
public class DynamicProxySubject implements InvocationHandler {

	private Object sub;

	public DynamicProxySubject(Object obj) {
		this.sub = obj;
	}

	/**
	 * 该方法继承自InvocationHandler类中的invoke
	 * 
	 */
	@Override
	public Object invoke(Object proxy, Method method, Object[] args)
			throws Throwable {

		System.out.println("before calling " + method);
		
		/*
		 * public Object invoke(Object obj,Object... args)
         * Method类中invoke执行方法
         * 方法调用目标对象的方法
         * invoke(目标对象，目标对象的方法参数);
		 */
		method.invoke(sub, args);
		
		System.out.println("after calling" + method);
		return null;
	}

}
