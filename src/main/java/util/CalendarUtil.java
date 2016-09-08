package util;

import java.util.Calendar;

/**
 * 
 * @title CalendarUtil
 *
 * @explain 日历工具类
 * @author yujiansong
 * @date 2016年9月7日
 */
public class CalendarUtil {
	
	public static String  getFirstDayOfWeek(Calendar c) {
		c.set(Calendar.DAY_OF_WEEK, Calendar.MONDAY);//本周周一日期
		return DateUtil.getDate(c.getTime());
	}
	
	public static String getLastDayOfWeek(Calendar c) {
		c.set(Calendar.DAY_OF_WEEK, Calendar.SUNDAY);//上周周日日期（老外将周日当做一周第一天）
		c.add(Calendar.WEEK_OF_YEAR, 1);//增加一个星期后是本周周日的日期
		return DateUtil.getDate(c.getTime());
	}
	
	public static String getFirstDayOfMonth(Calendar c) {
		c.set(Calendar.DATE,  1 );
		return DateUtil.getDate(c.getTime());//本月第一天
	}
	
	public static String getLastDayOfMonth(Calendar c) {
		c.set(Calendar.DATE,  1 );
		c.roll(Calendar.DATE,  - 1 );
		return DateUtil.getDate(c.getTime());//本月最后一天
	}
	
	
	public static void main(String args[]) {
		System.out.println(CalendarUtil.getLastDayOfMonth(Calendar.getInstance()));
	}
	
}
