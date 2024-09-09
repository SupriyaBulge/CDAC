/* 1)Write a program that checks if a given year is a leap year
 or not using both if-else and switch-case.*/


import java.util.*;
class leap
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Please enter year:");
        int yearcheck;
        int year=sc.nextInt();
        //int yearcheck2=((year%4==0&&year%100!=0)||year%400==0)?1:2;
        if((year%4==0&&year%100!=0)||year%400==0)
        {
            yearcheck=1;
        }
        else
        {
            yearcheck=2;
        }
        switch(yearcheck)
        {
            case 1: System.out.println("The year is loop year");
                    break;
            case 2: System.out.println("The year is not loop year");
                    break;
        }
    }
}
/* Output: PS C:\Users\Swapnil\Desktop\CDAC\OOPJ\Assignments\ass2> javac leapyear.java
PS C:\Users\Swapnil\Desktop\CDAC\OOPJ\Assignments\ass2> java leap
Please enter year:
2024
The year is loop year
PS C:\Users\Swapnil\Desktop\CDAC\OOPJ\Assignments\ass2> javac leapyear.java
PS C:\Users\Swapnil\Desktop\CDAC\OOPJ\Assignments\ass2> java leap
Please enter year:
2019
The year is not loop year*/