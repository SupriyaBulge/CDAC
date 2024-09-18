/*4. Discount Calculation for Retail Sales
Design a system to calculate the final price of an item after applying a discount. The system should:
1.	Accept the original price of an item and the discount percentage from the user.
2.	Calculate the discount amount and the final price using the following formulas:
o	Discount Amount Calculation: discountAmount = originalPrice * (discountRate / 100)
o	Final Price Calculation: finalPrice = originalPrice - discountAmount
3.	Display the discount amount and the final price of the item, in Indian Rupees (₹).
Define class DiscountCalculator with methods acceptRecord, calculateDiscount & printRecord and test the functionality in main method.

 */
//package org.com;
import java.util.Scanner;
 class DiscountCalucator {		
	double price;
	double  discountRate;
	double final_rate;
	double DiscountAmount;
	public void acceptREcord() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Price:");
		price = sc.nextDouble();
		System.out.println("Enter the Discount(in %) :");
		discountRate = sc.nextDouble();
	}
	public void calculateDiscount() {
		// float r= discountRate/100;
		 //System.out.println(r);
		DiscountAmount = price * (discountRate / 100);
		System.out.println(DiscountAmount);
		final_rate = price - DiscountAmount;
	}
	public void printRecord(){
		System.out.println("The Discount amount is:  "+ DiscountAmount);
		System.out.println("The final price is : "+ final_rate);
	}
}
class program4{
	public static void main(String[] args) {
		DiscountCalucator DC = new DiscountCalucator();
		DC.acceptREcord();
		DC.calculateDiscount();
		DC.printRecord();
	}  
}
/*Output
Enter the Price:
5000
Enter the Discount(in %) :
10
500.0
The Discount amount is:  500.0
The final price is : 4500.0 */