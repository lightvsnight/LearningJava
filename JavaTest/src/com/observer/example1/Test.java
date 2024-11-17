package com.observer.example1;

public class Test {
	
	public static void main(String[] args) {
		Watched girl = new ConcreteWatched(); //被观察者(一个漂亮的女孩)
		
		//三个观察者(三个男孩)(java里，这个较多态)
		Watcher boy1  = new ConcreteWatcher();  
		Watcher boy2  = new ConcreteWatcher();
		Watcher boy3  = new ConcreteWatcher();
		
		
		//被观察者，知道有三个男孩在观察自己
		girl.addWatcher(boy1);
		girl.addWatcher(boy2);
		girl.addWatcher(boy3);
		
		//被观察者，
		girl.notifyWatchers("开心，爽");
		
		girl.removeWatcher(boy1);
		
		girl.notifyWatchers("不爽");
		
	}
}
