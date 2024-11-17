package com.reflection.exemple;

import java.lang.reflect.Method;

/**
 * java 反射机制 代表实例
 * @author L.hk
 * 
 *  经典代码：认识反射
 *  
 *  通过Method类，调用Class的方法。
 *  
 *  只能通过Method类，动态的调用Class的方法。
 */
public class InvokeTester {

	public int add(int param1, int param2) {
		return param1 + param2;
	}

	public String add(int param1, String param2) {
		return param1 + param2;
	}

	public String echo(String message) {
		return "hello ：" + message;
	}

	public static void main(String[] args) throws Exception {

		/*
		 * 通过new的方式来获取对象
		 */
		InvokeTester in = new InvokeTester();
		int add = in.add(1, 1);
		String echo = in.echo("world");
		System.out.println(add);
		System.out.println(echo);
		System.out.println("-------------------------以下为反射示例------------------------------------");

		/*
		 * 第二种方式： InvokeTester.class 这样就会获取这个类所对应的类对象
		 */
		Class<?> classType = InvokeTester.class;
		// newInstance() 创建一个新的实例，当前class对象所表示的类的实例。
		Object invokeTester = classType.newInstance();
		/**
		 * instanceof 判断当前对象是不是所想哪个Class实例
		 */
		System.out.println("invokeTester :"+(invokeTester instanceof InvokeTester));

		
		/*
		 * 
		 * getMetod(String string,Class<?>... parameterTypes) 获取目标方法，
		 * string：方法名称。 
		 * Class<?>... parameterTypes:目标参数类型，和数量 参数所购能的class数组
		 * 
		 */
		Method addMethod = classType.getMethod("add", new Class[] { int.class,
				int.class });

		/*
		 * invoke :调用
		 */
		Object result = addMethod.invoke(invokeTester, new Object[] { 1, 2 });

		System.out.println(result);

		System.out.println("--------------------------------");

		Method echoMethod = classType.getMethod("echo",
				new Class[] { String.class });
		String rsult = (String) echoMethod.invoke(invokeTester,
				new Object[] { "反射机制" });
		System.out.println(rsult);

		System.out.println("--------------------------------");

		Method addMethods = classType.getMethod("add", new Class[] { int.class,
				String.class });
		String addResult = (String) addMethods.invoke(invokeTester,
				new Object[] { 1, ", add 的第二个方法" });

		System.out.println(addResult);
		
		InvokeTester it = new InvokeTester();
		Class<?> classTypes = it.getClass();
		System.out.println(classTypes);
	}
}
