package org.demo.com;
import java.util.*;
public class LoanAmortizationCalcUtil {
	public static LoanAmortizationCalc acceptRecord() {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter loan amount (₹): ");
		double principal = sc.nextDouble();
		
		System.out.println("Enter annual interest rate (as %): ");
		double rate = sc.nextDouble();
		
		System.out.println("Enter loan term (in years): ");
		int years = sc.nextInt();
		
		return new LoanAmortizationCalc(principal, rate, years);
	}
	
	public static void printRecord(LoanAmortizationCalc calc) {
		System.out.println(calc.toString());
	}

	public static void menuList(LoanAmortizationCalc calc) {
		Scanner sc = new Scanner(System.in);
		while (true) {
			System.out.println("Menu:");
			System.out.println("1. View Monthly Payment and Total Payment");
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
