/*
 Compound Interest Calculator for Investment
	Develop a system to compute the future value of an investment with compound interest. The system should:
		1. Accept the initial investment amount, annual interest rate, number of times the interest is compounded per year, and investment duration (in years) from the user.
		2. Calculate the future value of the investment using the formula:
			◦ Future Value Calculation:
				▪ futureValue = principal * (1 + annualInterestRate / numberOfCompounds)^(numberOfCompounds * years)
			◦ Total Interest Earned: totalInterest = futureValue - principal
		3. Display the future value and the total interest earned, in Indian Rupees (₹).
	Define the class CompoundInterestCalculator with fields, an appropriate constructor, getter and setter methods, a toString method and business logic methods. Define the class CompoundInterestCalculatorUtil with methods acceptRecord, printRecord, and menuList. Define the class Program with a main method to test the functionality of the utility class.

 
 */

package org.demo2.com;

public class CompoundInterestCalc {
	private double principal; // Initial investment amount
	private double annualRate; // Annual interest rate (as a percentage)
	private int compoundsPerYear; // Number of times the interest is compounded per year
	private int years; // Investment duration in years

	public CompoundInterestCalc(double principal, double annualRate, int compoundsPerYear, int years) {
		this.principal = principal;
		this.annualRate = annualRate;
		this.compoundsPerYear = compoundsPerYear;
		this.years = years;
	}

	// Getter and Setter methods
	public double getPrincipal() {
		return principal;
	}

	public void setPrincipal(double principal) {
		this.principal = principal;
	}

	public double getAnnualRate() {
		return annualRate;
	}

	public void setAnnualRate(double annualRate) {
		this.annualRate = annualRate;
	}

	public int getCompoundsPerYear() {
		return compoundsPerYear;
	}

	public void setCompoundsPerYear(int compoundsPerYear) {
		this.compoundsPerYear = compoundsPerYear;
	}

	public int getYears() {
		return years;
	}

	public void setYears(int years) {
		this.years = years;
	}

	// Business logic method to calculate future value
	public double calculateFutureValue() {
		double rate = annualRate / 100;
		return principal * Math.pow(1 + rate / compoundsPerYear, compoundsPerYear * years);
	}

	// Business logic method to calculate total interest earned
	public double calculateTotalInterest() {
		return calculateFutureValue() - principal;
	}

	// toString method to display future value and total interest earned
	@Override
	public String toString() {
		return "Future Value: ₹" + calculateFutureValue() + "\nTotal Interest Earned: ₹" + calculateTotalInterest();
	}
}
