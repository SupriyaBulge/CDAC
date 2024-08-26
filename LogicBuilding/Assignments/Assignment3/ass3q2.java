/*
2.	Write a program to compute the factorial of the number 10.

 */

class number
{
    public static void main(String args[])
    {
        int num=10,fact=1;
        for(int i=1;i<=10;i++)
        {
            fact=fact*i;
        }
        System.out.println("The factorial of number 10= "+fact);
    }
}
/*output:
The factorial of number 10= 3628800
 */