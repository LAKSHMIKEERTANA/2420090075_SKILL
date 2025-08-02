package myproject;

import java.util.*;

public class calender_class {
	public static void main(String args[]) {
		Calendar c=Calendar.getInstance();
		Date d=c.getTime();
		System.out.println(d);
		c.set(2023,c.SEPTEMBER, 9);
		int year=c.getWeekYear();
		System.out.println(year);
		int h=c.getFirstDayOfWeek();
		System.out.println(h);
		System.out.println("Day of Week : " +c.get(Calendar.DAY_OF_WEEK));
		System.out.println("Day of year : " +c.get(Calendar.DAY_OF_YEAR));
		System.out.println("Week of month : " +c.get(Calendar.WEEK_OF_MONTH));
		System.out.println("Week of Year : " +c.get(Calendar.WEEK_OF_YEAR));
		System.out.println("Day of Week in Month : " +c.get(Calendar.DAY_OF_WEEK_IN_MONTH));
		System.out.println("Hour : " +c.get(Calendar.HOUR));
		System.out.println("Minute : " +c.get(Calendar.MINUTE));
		
		
		
		
	}

}
