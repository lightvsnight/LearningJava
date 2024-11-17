package com.proxy.dynamicproxy.exemple;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.NavigableSet;
import java.util.TreeSet;
import java.util.Vector;

public class VectorProxy implements InvocationHandler {

	public Object proxyObj;

	public VectorProxy(Object object) {
		this.proxyObj = object;
	}

	public static Object factory(Object obj) {

		Class<?> classType = obj.getClass();

		System.out.println("根据当前传入的对象类对象 " + classType);

		System.out.println(classType.getInterfaces());

		return Proxy.newProxyInstance(classType.getClassLoader(),
				classType.getInterfaces(), new VectorProxy(obj));
	}

	@Override
	public Object invoke(Object proxy, Method method, Object[] args)
			throws Throwable {

		System.out.println("before calling: " + method);

		if (null != args) {
			for (Object o : args) {
				System.out.println("o :" + o);
			}
		}

		Object object = method.invoke(proxyObj, args);

		System.out.println("after calling: " + method);

		return object;
	}

	public static void main(String[] args) {

		/*
		 * public class java.util.Vector extends java.util.AbstractList
		 * implements java.util.List, java.util.RandomAccess,
		 * java.lang.Cloneable, java.io.Serializable factory()
		 * 这个方法之所以可以转换为List是因为 Vector实现了List接口
		 */
		List<String> v = (List<String>) factory(new Vector<String>());

		System.out.println(v.getClass().getName());

		v.add("New");
		v.add("York");
		System.out.println(v);

		v.remove(0);
		System.out.println(v);

		Map<Integer, String> map = (Map<Integer, String>) factory(new HashMap<Integer, String>());
		map.put(1, "xiaoxiao");
		map.put(2, "zhangsan");
		
		NavigableSet<String> navigableSet = (NavigableSet<String>) factory(new TreeSet<String>());
		navigableSet.add("a");
		navigableSet.add("b");
		System.out.println(navigableSet);
		
		
		navigableSet.remove("a");
		System.out.println(navigableSet);
		
		try {
			// 附加知识-- 为什么回报NotPointerException
			int[] i = null;
			System.out.println(i.length);
		} catch (java.lang.NullPointerException e) {
			System.out.println(e);
		}

	}
}
