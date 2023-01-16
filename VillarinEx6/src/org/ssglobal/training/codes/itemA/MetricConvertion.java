package org.ssglobal.training.codes.itemA;

import java.util.Scanner;

public class MetricConvertion {
	public void showMenu() {	
		Scanner sc = new Scanner(System.in);
		
		while (true) {
			System.out.print("Enter a number: ");
			int num = sc.nextInt();

			System.out.println("Convert:");
			System.out.println("1. Inches to Centimenters   5. Centimeters to Inches");
			System.out.println("2. Feet to Centimeters      6. Centimeters to Feet");
			System.out.println("3. Yards to Meters          7. Meters to Yards");
			System.out.println("4. Miles to Kilometers      8. Kilometers to Miles");

			System.out.print("Enter your choice: ");
			int choice = sc.nextInt();
			
			if (choice == 1) {
				double inchesToCentimeters = num * 2.54;
				System.out.println("%d inches equals to %f centimeters.".formatted(num, inchesToCentimeters));
			} else if (choice == 2) {
				double feetToCentimeters = num * 30;
				System.out.println("%d feet equals to %f centimeters.".formatted(num, feetToCentimeters));
			} else if (choice == 3) {
				double yardsToMeters = num / 0.91;
				System.out.println("%d yards equals to %f meters.".formatted(num, yardsToMeters));
			} else if (choice == 4) {
				double milesToKilometers = num * 1.6;
				System.out.println("%d miles equals to %f kilometers.".formatted(num, milesToKilometers));
			} else if (choice == 5) {
				double centimersToInches = num / 2.54;
				System.out.println("%d centimeters equals to %f inches.".formatted(num, centimersToInches));
			} else if (choice == 6) {
				double centimetersToFeet = num / 30;
				System.out.println("%d centimeters equals to %f feet.".formatted(num, centimetersToFeet));
			} else if (choice == 7) {
				double metersToYards = num * 0.91;
				System.out.println("%d meters equals to %f yards.".formatted(num, metersToYards));
			} else if (choice == 8) {
				double kilometersToMiles = num / 1.6;
				System.out.println("%d kilometers equals to %f miles.".formatted(num, kilometersToMiles));
			} else {
				System.out.println("Stopped!");
				break;
			}
			System.out.println("");
		}
		sc.close();
	}
}
