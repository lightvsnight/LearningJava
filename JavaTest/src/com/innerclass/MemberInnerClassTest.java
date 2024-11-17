package com.innerclass;


/**
 * 
 * @author L.hk
 *  成员内部类
 */
class MemberInner{
	
	private int a = 4;
	
	public Inner2 method(){
		Inner2 inner2 = this.new Inner2();
		return inner2;
	}
	
	public class Inner2{
		
		private int a = 5;
		public void sonmething()
		{
			//访问内部类变量
			System.out.println(this.a);
			
			//访问外部类变量
			System.out.println(MemberInner.this.a);
			
			System.out.println("htllo world");
		}
	}
}

public class MemberInnerClassTest {
    
	public static void main(String[] args) {
		
		MemberInner mi = new MemberInner();
		//MemberInner.Inner2 inner2 = mi.new Inner2();
		MemberInner.Inner2 inner2 = new MemberInner().new Inner2();
		inner2.sonmething();
	}
    
}
