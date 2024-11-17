package com.observer.example2;

import java.util.Observable;

/**
 * 
 * @author L.hk
 * 
 * 具体被观察者
 */
public class SpecificWatchedRole extends Observable{
	
   void counter(int number){
	   for(;number>=0;number--){
		   this.setChanged();//标记此 Observable 对象为已改变的对象 ,如果不调用次方法，update()方法不会执行。
		   
		   this.notifyObservers(number); 
	   }
   }
   
}
