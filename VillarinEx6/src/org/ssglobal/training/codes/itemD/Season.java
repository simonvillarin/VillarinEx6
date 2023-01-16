package org.ssglobal.training.codes.itemD;

import java.util.Calendar;
import java.util.GregorianCalendar;

public class Season {
	public String season(int year, int month, int day) {
		Calendar cal = new GregorianCalendar();
		cal.set(year, month - 1, day);
		
		String season = "";
		
		if ((month == 12 && day >= 16) || (month == 1 && day <= 31) || (month == 2 && day <= 29) || (month == 3 && day <= 15)) {
			season = "Winter";
		} else if ((month == 3 && day >= 16) || (month == 4 && day <= 30) || (month == 5 && day <= 31) || (month == 6 && day <= 15)) {
			season = "Spring";
		} else if ((month == 6 && day >= 16) || (month == 7 && day <= 31) || (month == 8 && day <= 31) || (month == 9 && day <= 15)) {
			season = "Summer";
		} else if ((month == 9 && day >= 16) || (month == 10 && day <= 31) || (month == 11 && day <= 30) || (month == 12 && day <= 15)){
			season = "Fall";
		}
		return season;
	}
}
