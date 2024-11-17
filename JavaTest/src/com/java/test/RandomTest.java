package com.java.test;

import java.util.Random;



public class RandomTest {

	
	/**
	 * 生成随机数(10-50),方法一
	 * @return
	 */
	public static int[] random()
	{
		int[] array = new int[]{};
		Random random = new Random();
		
		for(int i = 0; i < 50 ;i++)
		{
			/*
			 *random.nextInt(int n)
			 *-n : the bound on the random number to be returned . Must be positive.
			 *    返回随机数的边界值，最大边界值
			 *    
			 * Returns: 
			 *    the next pseudorandom, uniformly distributed int value between 0(inclusive：包含)
			 *    and n(exclusive:不包含) from this random number generator's sequence.
			 *    下一个伪随机，均匀分布的int值在0（包含）和N（不包含）从这个随机数生成器的序列
			 *    
			 *    返回的随机数，是生成 介于0(包含)和n(不包含)之间的 随机数
			 *    
			 */
			System.out.println(random.nextInt(41)+10);
			array[i] = random.nextInt(41)+10;
		}

		return array;
	}
	
	/**
	 *  Math.random 生成随机数  方法二
	 * @return
	 */
	public static int[] mathRandom()
	{
		int[] array = new int[]{};
		
		for(int i = 0; i<50; i++)
		{
			double result  = Math.random();
			result *= 41;
			int result2 = (int)result;
			result2 +=10;
			System.out.println(result2);
			array[i] = result2;
		}
		
		return array;
	}
	
	
	/**
	 * 随机生成50个数字(整数)，每个数字的范围[10,50],统计每个数字出现的次数以及出现次数最多的数字与它的个数，
	 * 最后将每个数字及其出现的次数打印出来，如果某个数字出现次数为0，则不打印它，打印时按照数字升序排序
	 */
	public static void randomNumber()
	{
		int[] count = new int[41];
		
		Random random = new Random();
		
		for(int i = 0; i<50; i++)
		{
			int number = random.nextInt(41)+10;
			
			System.out.println(number);//随机数
			
			count[number-10]++;
		}
		
		for(int i = 0; i<count.length; i++)
		{
			if(0==count[i])//10~50之间未出现的数字不打印
			{
				continue;
			}
			System.out.println(10+i+"出现次数："+count[i]);
		}
		
		
		int max = count[0];
		for(int i = 0; i<count.length; i++)
		{
			if(max < count[i])
			{
				max = count[i];
			}
		}
		
		System.out.println("出现的最大次数为："+ max +"次");
		
		for(int i = 0; i<count.length; i++)
		{
			if(max == count[i])
			{
				System.out.println(i+10);
			}
		}
	}
	
	public static void main(String[] args){
		RandomTest.randomNumber();
	}
}
