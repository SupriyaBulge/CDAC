/*
 * 1. Accept the original price of an item and the discount percentage from the user.
		2. Calculate the discount amount and the final price using the following formulas:
			◦ Discount Amount Calculation: discountAmount = originalPrice * (discountRate / 100)
			◦ Final Price Calculation: finalPrice = originalPrice - discountAmount
		3. Display the discount amount and the final price of the item, in Indian Rupees (₹).
	Define the class DiscountCalculator with fields, an appropriate constructor, getter and setter methods, a toString method, and business logic methods. Define the class DiscountCalculatorUtil with methods acceptRecord, printRecord, and menuList. Define the class Program with a main method to test the functionality of the utility class.
 * 
 */

package org.demo4.com;

public class DiscountCalculator {
	private double originalPrice;
	private double discountRate;
	
	public DiscountCalculator(double originalPrice, double discountRate) {
		this.originalPrice = originalPrice;
		this.discountRate = discountRate;
	}
	
	// Getter and Setter methods
	public double getOriginalPrice() {
		return originalPrice;
	}

	public void setOriginalPrice(double originalPrice) {
		this.originalPrice = originalPrice;
	}

	public double getDiscountRate() {
		return discountRate;
	}

	public void setDiscountRate(double discountRate) {
		this.discountRate = discountRate;
	}

	// Business logic method to calculate the discount amount
	public double calculateDiscountAmount() {
		return originalPrice * (discountRate / 100);
	}

	// Business logic method to calculate the final price
	public double calculateFinalPrice() {
		return originalPrice - calculateDiscountAmount();
	}

	// toString method to display the discount and final price
	@Override
	public String toString() {
		return "Original Price: ₹" + originalPrice +
			   "\nDiscount Rate: " + discountRate + "%" +
			   "\nDiscount Amount: ₹" + calculateDiscountAmount() +
			   "\nFinal Price: ₹" + calculateFinalPrice();
	}
}
