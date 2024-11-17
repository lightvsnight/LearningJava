package com.observer.example1;

import java.util.ArrayList;
import java.util.List;

/**
 * 
 * @author L.hk
 *  具体主题角色： 在具体主题内部状态改变时，给所有登记过的观察者发出通知。
 *             具体主题角色通常用一个子类实现。
 */
public class ConcreteWatched implements Watched {
	
	//用于承载观察我的观察者
	private List<Watcher> list = new ArrayList<Watcher>();

	@Override
	public void addWatcher(Watcher watcher) {
		list.add(watcher);
	}

	@Override
	public void removeWatcher(Watcher watcher) {
		// TODO Auto-generated method stub
        list.remove(watcher);
	}

	@Override
	public void notifyWatchers(String str) {

		//通知多有的观察者，你们需要update自己
		for(Watcher watcher : list){
			watcher.update(str);
		}
	}

}
