
/*1. Armstrong Number
Problem: Write a Java program to check if a given number is an Armstrong number.

Test Cases:

Input: 153
Output: true
Input: 123
Output: false
*/
import java.util.*;
class Armstrong {	
public static void main (String args[]) {
	Scanner sc = new Scanner (System.in);
	int a,b, d, sum = 0;
	System.out.println("Enter a number");
	b = sc.nextInt();
	a = b;
	while (b > 0)
	{
		d = b % 10;
		sum = sum+(d*d*d);
		b = b / 10;
	}
	if (a  == sum)
		System.out.println(true);
	else
		System.out.println(false);
	}
}

/*output:
java Armstrong        
Enter a number
153
true
PS C:\Users\Swapnil\Desktop\CDAC\ADS\Assignments\assignment1> java Armstrong
Enter a number
123
false*/
// Time Complexity  O(n)
// Space Complexity O(1)