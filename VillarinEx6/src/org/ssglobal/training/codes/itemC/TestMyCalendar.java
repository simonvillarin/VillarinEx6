package org.ssglobal.training.codes.itemC;

import java.util.Scanner;

public class TestMyCalendar {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Please enter month [1 - 12]: ");
		int month = sc.nextInt();
		
		System.out.print("Please enter year: ");
		int year = sc.nextInt();
		sc.close();
		 
		MyCalendar mc = new MyCalendar();
		mc.printCalendar(month, year);
	}

}
