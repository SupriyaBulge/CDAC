/*1. Loan Amortization Calculator
Implement a system to calculate and display the monthly payments for a mortgage loan. The system should:
1.	Accept the principal amount (loan amount), annual interest rate, and loan term (in years) from the user.
2.	Calculate the monthly payment using the standard mortgage formula:
o	Monthly Payment Calculation:
	monthlyPayment = principal * (monthlyInterestRate * (1 + monthlyInterestRate)^(numberOfMonths)) / ((1 + monthlyInterestRate)^(numberOfMonths) - 1)
	Where monthlyInterestRate = annualInterestRate / 12 / 100 and numberOfMonths = loanTerm * 12
	Note: Here ^ means power and to find it you can use Math.pow( ) method
3.	Display the monthly payment and the total amount paid over the life of the loan, in Indian Rupees (₹).
Define class LoanAmortizationCalculator with methods acceptRecord, calculateMonthlyPayment & printRecord and test the functionality in main method.
*/

package ass1;
import java.util.Scanner;
import java.math.*;

class LoanAmortizationCalculator{
	private float principal;
	private float interestRate;
	private float loanTerm;
	
	public void acceptRecord() {
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the principal amount (loan amount)  : ");
		principal=sc.nextFloat();
		System.out.println( "Enter annual interest rate :  ");
		interestRate=sc.nextFloat();
		System.out.println(" Enter loan term (in years)");
		loanTerm=sc.nextFloat();
	}
	public double calculateMonthlyPayment() {
		double monthlyPayment;
		float monthlyInterestRate = interestRate / 12 / 100;
		float numberOfMonths = loanTerm * 12;
		monthlyPayment = principal * (monthlyInterestRate*Math.pow(1+monthlyInterestRate, numberOfMonths))/(Math.pow(1+monthlyInterestRate, numberOfMonths)-1);
		return(monthlyPayment);
	}
	public void printRecord() {
		System.out.println("The principal amount (loan amount) is:  "+principal+" \nAnnual interest rate is:  "+interestRate+" \nloan term (in years) is :  "+loanTerm);
		double monthlyPayment=calculateMonthlyPayment();
		double totalAmount=monthlyPayment*loanTerm*12;
		System.out.println("The monthly payment : "+monthlyPayment+"\nThe total amount paid over the life of the loan:  "+totalAmount);
		
	}
}

public class program1 {

	public static void main(String[] args) {
		LoanAmortizationCalculator loan1= new LoanAmortizationCalculator();
		loan1.acceptRecord();
		loan1.printRecord();
	}

}

/* Output
 Enter the principal amount (loan amount)  : 
65000
Enter annual interest rate :  
8.5
 Enter loan term (in years)
5
The principal amount (loan amount) is:  65000.0 
Annual interest rate is:  8.5 
loan term (in years) is :  5.0
The monthly payment : 1333.580000217878
The total amount paid over the life of the loan:  80014.80001307269
 */