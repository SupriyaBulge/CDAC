package org.demo4.com;
import java.util.*; class DiscountCalculatorUtil {

	public static DiscountCalculator acceptRecord() {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the original price of the item: ");
		double originalPrice = sc.nextDouble();
		
		System.out.println("Enter the discount percentage: ");
		double discountRate = sc.nextDouble();
		
		return new DiscountCalculator(originalPrice, discountRate);
	}
	
	public static void printRecord(DiscountCalculator calculator) {
		System.out.println(calculator.toString());
	}

	public static void menuList(DiscountCalculator calculator) {
		Scanner sc = new Scanner(System.in);
		while (true) {
			System.out.println("Menu:");
			System.out.println("1. View Discount Calculation");
			System.out.println("2. Exit");
			System.out.print("Enter choice: ");
			int choice = sc.nextInt();
			
			switch (choice) {
				case 1:
					printRecord(calculator);
					break;
				case 2:
					return;
				default:
					System.out.println("Invalid choice!");
			}
		}
	}
}
