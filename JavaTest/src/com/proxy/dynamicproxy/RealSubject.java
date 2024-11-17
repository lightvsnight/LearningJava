package com.proxy.dynamicproxy;

/**
 * 
 * @author L.hk
 * ÕæÊµ½ÇÉ«
 */
public class RealSubject implements Subject{

	public void request() {
		System.out.println("From real subject");
	}
}
