package org.demo2.com;
import java.util.*;
public class CompoundInterestCalcUtil {
	public static CompoundInterestCalc acceptRecord() {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the initial investment amount (₹): ");
		double principal = sc.nextDouble();
		
		System.out.println("Enter the annual interest rate (as %): ");
		double rate = sc.nextDouble();
		
		System.out.println("Enter the number of times interest is compounded per year: ");
		int compounds = sc.nextInt();
		
		System.out.println("Enter the investment duration (in years): ");
		int years = sc.nextInt();
		
		return new CompoundInterestCalc(principal, rate, compounds, years);
	}
	
	public static void printRecord(CompoundInterestCalc calc) {
		System.out.println(calc.toString());
	}

	public static void menuList(CompoundInterestCalc calc) {
		Scanner sc = new Scanner(System.in);
		while (true) {
			System.out.println("Menu:");
			System.out.println("1. View Future Value and Total Interest");
			System.out.println("2. Exit");
			System.out.print("Enter choice: ");
			int choice = sc.nextInt();
			
			switch (choice) {
				case 1:
					printRecord(calc);
					break;
				case 2:
					return;
				default:
					System.out.println("Invalid choice!");
			}
		}
	}
}
