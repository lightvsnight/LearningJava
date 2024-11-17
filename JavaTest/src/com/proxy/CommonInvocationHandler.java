package com.proxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

/**
 * 
 * @author L.hk
 * 
 * 代理角色
 */
public class CommonInvocationHandler implements InvocationHandler{

	private Object target;
	
	public CommonInvocationHandler() {
	}
	
	//目标对象
	public void setTarget(Object target) {
		this.target = target;
	}
	
	//向这个  代理对象 传入需要代理的   真实对象
	public CommonInvocationHandler(Object target) {
		this.target = target;
	}
	
	@Override
	public Object invoke(Object proxy, Method method, Object[] args)
			throws Throwable {
		return method.invoke(target,args);
	}
	
	
}
