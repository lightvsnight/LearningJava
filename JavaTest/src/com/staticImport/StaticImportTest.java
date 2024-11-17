package com.staticImport;


/*
 * 引用com.staticImport.Common包下的成员
 * 
 * 静态导入：只能导入静态的成员变量和成员方法。
 * 
 */
import static com.staticImport.common.Common.AGE;
import static com.staticImport.common.Common.output;
/**
 * 
 * @author L.hk
 *
 */
public class StaticImportTest {
	
	public static void main(String[] args) {
		int a  = AGE;
		
		System.out.println(a);
		
		output();
	}

}
