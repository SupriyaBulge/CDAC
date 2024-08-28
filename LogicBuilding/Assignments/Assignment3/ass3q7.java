/*
7.	Write a program to calculate the sum of the digits of the number 9876. The output should be 30 (9 + 8 + 7 + 6).
8.	Write a program to count down from 10 to 0, printing each number.
9.	Write a program to find and print the largest digit in the number 4825.

11.	Write a Java program to demonstrate the use of both pre-increment and post-decrement operators in a single expression
*/

class number
{
    public static void main(String args[])
    {
        int num=9876;
        int temp=num;
        int  sum= 0;  
        while(num != 0)   
        {  
            int remainder = num % 10;  
            sum=sum+remainder;  
            num = num/10;  
        }  
        System.out.println("The sum of digits of "+temp+" is= " + sum);  
    }  
}

/*output:
The sum of digits of 9876 is= 30
 */