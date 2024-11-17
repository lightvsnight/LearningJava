package com.java.test;

/**
 * 直接插入排序
 * 
 * @author zsw
 * 
 */
public class TestInsertSort {
	/**
	 * 带哨所
	 * 
	 * @param sortList
	 */
	public static void insertSort1(Integer[] sortList) {
		int len = sortList.length;
		for (int i = 2; i < len; i++) {
			if (sortList[i] < sortList[i - 1]) {
				int j = i - 1;
				sortList[0] = sortList[i];// 设置哨所
				while (sortList[0] < sortList[j]) {
					sortList[j + 1] = sortList[j];
					j--;
				}
				sortList[j + 1] = sortList[0];
			}
		}
	}

	/**
	 * 不带哨所
	 * 
	 * @param sortList
	 */
	public static void insertSort2(Integer[] sortList) {
		int len = sortList.length;
		for (int i = 1; i < len; i++) {
			if (sortList[i] < sortList[i - 1]) {
				int j = i - 1;
				int temp = sortList[i];
				while (j >= 0 && temp < sortList[j]) {
					sortList[j + 1] = sortList[j];
					j--;
				}
				sortList[j + 1] = temp;
			}
		}
	}
	
	/**
	 * 二分查找,插入排序
	 * @param sortList
	 */
	public static void insertSort3(Integer[] sortList) {
		int len = sortList.length;
		for (int i = 1; i < len; i++) {
			if (sortList[i] < sortList[i - 1]) {
				//二分查找在有序区寻找插入的位置 
				int index = binarySearchIndex(sortList, i-1, sortList[i]);
				if (i != index)
	            {
	                int temp = sortList[i];
	                // 后移元素，腾出arr[index]位置
	                for (int j = i - 1; j >= index; j--)
	                	sortList[j + 1] = sortList[j];
	                // 将 arr[i] 放到正确位置上 
	                sortList[index] = temp;
	            }
			}
		}
	}
	
	/**
	 * 二分查找要插入的位置得index(索引)
	 * @param sortList
	 * @param maxIndex
	 * @param data
	 * @return
	 */
	private static int binarySearchIndex(Integer[] sortList, int maxIndex, int data)
	{
	    int iBegin = 0;
	    int iEnd = maxIndex;
	    int middle = -1;
	    while (iBegin <= iEnd)
	    {
	        middle = (iBegin + iEnd) / 2;
	        if (sortList[middle] > data)
	        {
	            iEnd = middle - 1;
	        }
	        else
	        {
	            iBegin = middle + 1; //如果是相同元素，也是插入在后面的位置
	        }
	    }
	    return iBegin;
	}
	
	public static void main(String[] args) {
		Integer[] sortList = new Integer[8];
		sortList[0] = 0; //带哨所 时 作为哨所使用
		sortList[1] = 27;
		sortList[2] = 32;
		sortList[3] = 93;
		sortList[4] = 65;
		sortList[5] = 87;
		sortList[6] = 45;
		sortList[7] = 58;
		insertSort2(sortList);
		for (int i = 0; i < sortList.length; i++) {
			System.out.println(sortList[i]);
		}

	}
}
