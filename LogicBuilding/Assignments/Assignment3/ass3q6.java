/*
6.	Write a program to find and print the first 5 prime numbers.
 */

class number
{
    public static void main(String args[])
    {
        int sum=0;
        for(int i=1;i<=50;i++)
        {
            sum=sum+i;
        }
        System.out.println("The sum of the first 50 natural numbers= "+sum);
    }
}
/*output:
The sum of the first 50 natural numbers= 1275
 */