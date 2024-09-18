/*2. Compound Interest Calculator for Investment
Develop a system to compute the future value of an investment with compound interest. The system should:
1.	Accept the initial investment amount, annual interest rate, number of times the interest is compounded per year, and investment duration (in years) from the user.
2.	Calculate the future value of the investment using the formula:
o	Future Value Calculation:
	futureValue = principal * (1 + annualInterestRate / numberOfCompounds)^(numberOfCompounds * years)
o	Total Interest Earned: totalInterest = futureValue - principal
3.	Display the future value and the total interest earned, in Indian Rupees (₹).
Define class CompoundInterestCalculator with methods acceptRecord , calculateFutureValue, printRecord and test the functionality in main method.
 */
//package Sandeep_Sir;
import java.util.*;
 class CompoundInterestCalculator {
	double P;
	double R;
	double y;
	double N;
	int n;
    double Fv;
    double TIE;
    
    public void acceptRecord() {
    	Scanner sc = new Scanner(System.in);
    	System.out.println("Enter the principle:");
    	P = sc.nextDouble();
    	System.out.println("Enter the Rate:");
    	R = sc.nextDouble();
    	System.out.println("Enter the year:");
    	y = sc.nextDouble();
    	System.out.println("Enter the time:");
    	N = sc.nextDouble();
    	
    }
    
    public void calculateFutureValue() {
    	Fv = P*Math.pow(((1+R)/N),(N*y));
    	TIE = Fv - P;
    	
    }
    public void printRecord() {
    	System.out.printf("Future value: %.2f " ,Fv);
    	System.out.printf("Total interset: %.2f" ,TIE);
    } 
 }
 class program2{
     	
	public static void main(String[] args) {
		
		CompoundInterestCalculator CI = new CompoundInterestCalculator();
		CI.acceptRecord();
		CI.calculateFutureValue();
		CI.printRecord();

	}

}
/*Output:
Enter the principle:
5000
Enter the Rate:
9
Enter the year:
5
Enter the time:
2
Future value: 126647581059.57 Total interset: 126647576059.57 */