package org.demo3.com;
import java.util.*;
public class BMITrackerUtil {
	public static BMITracker acceptRecord() {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter weight in kilograms: ");
		double weight = sc.nextDouble();
		
		System.out.println("Enter height in meters: ");
		double height = sc.nextDouble();
		
		return new BMITracker(weight, height);
	}
	
	public static void printRecord(BMITracker tracker) {
		System.out.println(tracker.toString());
	}

	public static void menuList(BMITracker tracker) {
		Scanner sc = new Scanner(System.in);
		while (true) {
			System.out.println("Menu:");
			System.out.println("1. View BMI and Classification");
			System.out.println("2. Exit");
			System.out.print("Enter choice: ");
			int choice = sc.nextInt();
			
			switch (choice) {
				case 1:
					printRecord(tracker);
					break;
				case 2:
					return;
				default:
					System.out.println("Invalid choice!");
			}
		}
	}
}
