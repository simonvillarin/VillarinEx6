package org.ssglobal.training.codes.itemD;

import java.util.Calendar;
import java.util.GregorianCalendar;

public class Season {
	public String season(int year, int month, int day) {
		Calendar cal = new GregorianCalendar(year, month - 1, day);
		Calendar winterStart = new GregorianCalendar(year, 11, 16);
		Calendar winterEnd = new GregorianCalendar(year, 2, 15);
		Calendar springStart = new GregorianCalendar(year, 2, 16);
		Calendar springEnd = new GregorianCalendar(year, 5, 15);
		Calendar summerStart = new GregorianCalendar(year, 5, 16);
		Calendar summerEnd = new GregorianCalendar(year, 8, 15);
		Calendar fallStart = new GregorianCalendar(year, 8, 16);
		Calendar fallEnd = new GregorianCalendar(year, 11, 15);
		
		String season = "";
		
		if (cal.after(winterStart) || cal.before(winterEnd)) {
			season = "Winter";
		} else if (cal.after(springStart) && cal.before(springEnd)) {
			season = "Spring";
		} else if (cal.after(summerStart) && cal.before(summerEnd)) {
			season = "Summer";
		} else if (cal.after(fallStart) && cal.before(fallEnd)){
			season = "Fall";
		} else {
			return "Invalid date";
		}
		return season;
	}
}
