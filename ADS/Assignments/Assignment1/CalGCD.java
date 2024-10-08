
/*5. Find GCD
Problem: Write a Java program to find the Greatest Common Divisor (GCD) of two numbers.

Test Cases:

Input: a = 54, b = 24
Output: 6
Input: a = 17, b = 13
Output: 1
*/
public class CalGCD
{
    public static int euclideanGCD(int a, int b) {
        while (b != 0) {
            int temp = a;
            a = b;				//swapping but b % b
            b = temp % b;
        }
        return a;
    }

    public static void main(String[] args) {
        int num1 = 54;		// input constraints
        int num2 = 24;
		
		int num3 = 13;
		int num4 = 17;
        int gcd = euclideanGCD(num1, num2);
		int gcd2 = euclideanGCD(num3, num4);

        System.out.println("GCD of " + num1 + " and " + num2 + " is: " + gcd);
		System.out.println("GCD of " + num3 + " and " + num4 + " is: " + gcd2);
    }
}

/*output:
java CalGCD      
GCD of 54 and 24 is: 6
GCD of 13 and 17 is: 1 */
// Time Complexity  O(n)
// Space Complexity O(1)