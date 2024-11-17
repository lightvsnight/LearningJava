package com.proxy.exemple;

/**
 * 代理角色
 */
public class ProxySubject extends Subject{
	
	private RealSubject realSubject; //代理角色内部引用了真实角色

	@Override
	public void request() {
	
		this.preRequest();//在真实角色操作之前所附加的操作
		
		if(null == realSubject){
			realSubject = new RealSubject();
		}
		realSubject.request();//真实角色所完成的事情
		
		this.postRequest();//在真实角色之后所附加的操作
	}
	
	private void preRequest(){
		System.out.println("Pre Request");
	}
	
	private void postRequest(){
		System.out.println("Post Request");
	} 

	
	
	
	public RealSubject getRealSubject() {
		return realSubject;
	}
	public void setRealSubject(RealSubject realSubject) {
		this.realSubject = realSubject;
	}

}
