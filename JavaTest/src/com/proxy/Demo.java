package com.proxy;

import java.lang.reflect.Proxy;

public class Demo {

	public static void main(String[] args) {
		CommonInvocationHandler handler = new CommonInvocationHandler();

		Foo foo = null;
		
		handler.setTarget(new FooImpl());//传入真实对象
		foo = (Foo) Proxy.newProxyInstance(FooImpl.class.getClassLoader(),
				FooImpl.class.getInterfaces(), handler);//自动执行invoke方法
		foo.doAction();//通过抽象对象，调用真实对象的实际功能
		
		
		handler.setTarget(new FooImpl2());
		foo = (Foo) Proxy.newProxyInstance(Foo.class.getClassLoader(),
				new Class[] { Foo.class }, handler);
		foo.doAction();
		
	}
}
