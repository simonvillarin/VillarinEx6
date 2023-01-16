package org.ssglobal.training.codes.itemC;

import java.util.Calendar;
import java.util.GregorianCalendar;

public class MyCalendar {
	public void printCalendar(int month, int year) {
		Calendar cal = new GregorianCalendar();
		cal.set(year, month - 1, 1);
		
		int firstDay = cal.get(Calendar.DAY_OF_WEEK);
		
		String[] months = {"January", "February", "March", "April", "May", "June", "July",
							"August", "September", "October", "November", "Devember"};
		
		int[] daysLength = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
		
		System.out.println("    " + months[month - 1] + " " + year);
		System.out.println("Su Mo Tu We Th Fr Sa");
		
		if (year % 4 == 0) {
			daysLength[1] = 29;
		}
		
		for (int i = 0; i < firstDay - 1; i++) {
			System.out.print("   ");
		}
		
		for (int i = 1; i <= daysLength[month - 1]; i++) {
			if (i < 10) {
				System.out.print(" ");
			}
			System.out.print("%d ".formatted(i));
			if ((i + firstDay - 1) % 7 == 0) {
				System.out.println();
			}
		}
	}
}
