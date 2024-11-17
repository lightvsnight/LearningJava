package com.annotation;


/**
 * Deprecated 不建议被使用的
 * @author L.hk
 *
 */
public class DeprecatedTest {
	
	/**
	 * 该注解表示 不建议被使用，该方法可能在不久的将来可能会被删除
	 * @return
	 */
	@Deprecated
	public String dosomething(){
		return "do something function";
	}

	public static void main(String[] args) {
		DeprecatedTest deprecated = new DeprecatedTest();
		
		deprecated.dosomething();
		
		/*Date date = new Date();
		System.out.println(date.toLocaleString());*/
	}
}
