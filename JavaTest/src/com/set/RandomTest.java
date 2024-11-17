package com.set;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Random;
import java.util.Set;
import java.util.TreeMap;

/**
 * 集合
 * 
 * @author L.hk
 *
 */
public class RandomTest {

	public static void main(String[] args) {
		Random random = new Random();

		Map map = new TreeMap(); // 存储数字及其出现的次数(key为数字，value为数字出现的次数)

		for (int i = 0; i < 50; i++) {
			/*
			 * random.nextInt(int n)-n : the bound on the random number to be
			 * returned . Must be positive. 返回随机数的边界值，最大边界值
			 */
			int number = random.nextInt(41) + 10;
			Integer in = new Integer(number);

			if (map.get(in) == null) {
				map.put(in, new Integer(1));
			} else {
				int value = ((Integer) map.get(in)).intValue();
				map.put(in, new Integer(value) + 1);
			}
		}

		Collection cols = map.values();
		Integer maxOccurs = Collections.max(cols);
		Integer minOccurs = Collections.min(cols);

		List<Integer> list = new ArrayList<Integer>(); //存储出现最多的 数字

		Set<?> set = map.entrySet();

		for (Iterator<?> iter = set.iterator(); iter.hasNext();) {
			Map.Entry entry = (Map.Entry) iter.next();

			Integer key = (Integer) entry.getKey();
			Integer value = (Integer) entry.getValue();

			if (maxOccurs == value) {
				list.add(key);
			}
			/**
			 * 
			 * 小步前进，增量式开发，逐步的去迭代
			 * 
			 * 当你写程序的时候，当你写一个小的模块或功能时，不要着急往下写， 千万不要功能很多，我把它全写完，
			 * 在调试，以为自己水平很高，这不是水平很高的表现，这是愚蠢的行为。 
			 * 一定是小步前进，增量式开发，逐步的去迭代，把一个很大的问题切换成小的模块，
			 * 每一个模块完成之后去做测试，做完测试，验证没有问题之后，再去开发下面的功能， 
			 * 千万不要一下子全部开发完，那样的话百分之百会出错误
			 */
			System.out.println(key + ":" + value);
		}

		System.out.println("--------------------------------");

		System.out.println("出现最多次数 ：" + maxOccurs);
		System.out.println("出现最少次数 ：" + minOccurs);

		for (Object o : list.toArray()) {  //遍历出list中数字出现最多的数次
			Integer in = (Integer) o;
			System.out.println("key: " + in);
		}

		for (Iterator<?> iter = list.iterator(); iter.hasNext();) {
			System.out.println(iter.next());
		}
	}
}
