package com.test;

import java.text.SimpleDateFormat;

public class TestDateDiff {
	public static String dateDiff(String startTime, String endTime, String format) throws Exception {
		//按照传入的格式生成一个simpledateformate对象
		SimpleDateFormat sd = new SimpleDateFormat(format);
		long nd = 1000*24*60*60;//一天的毫秒数
		long nh = 1000*60*60;//一小时的毫秒数
		long nm = 1000*60;//一分钟的毫秒数
		long ns = 1000;//一秒钟的毫秒数long diff;try {
		//获得两个时间的毫秒时间差异
		long diff = sd.parse(endTime).getTime() - sd.parse(startTime).getTime();
		long day = diff/nd;//计算差多少天
		long hour = diff%nd/nh;//计算差多少小时
		long min = diff%nd%nh/nm;//计算差多少分钟
		long sec = diff%nd%nh%nm/ns;//计算差多少秒//输出结果
		//System.out.println("时间相差："+day+"天"+hour+"小时"+min+"分钟"+sec+"秒。");
		return day+"天"+hour+"小时";
	}

	public static void main(String[] args) throws Exception {
		System.out.println(TestDateDiff.dateDiff("2016-01-27 19:45:48", "2016-01-28 17:45:48",
				"yyyy-MM-dd HH:mm:ss"));
	}
}
