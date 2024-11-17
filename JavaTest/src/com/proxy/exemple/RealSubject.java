package com.proxy.exemple;

/**
 * 
 * @author L.hk
 *  真实角色
 */
public class RealSubject extends Subject{

	@Override
	public void request() {
		
		//真实角色，所能做的事情
		System.out.println("Form real Subject.");
	}

}
