/*
2)Implement a program that calculates the Body Mass Index (BMI) 
based on height and weight input using if-else to classify 
the BMI int categories (underweight, normal weight, overweight,etc).*/


import java.util.*;
class bmi
{
    public static void main(String args[])
    {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter weight in kg:");
        int weight=sc.nextInt();
         System.out.println("Enter height in meters:");
         float height=sc.nextFloat();
         float bmi;
         bmi=weight/(height*height);
         System.out.println("The Body Mass Index is= "+bmi);
         if (bmi>21)
         {
            System.out.println("you are Overweight");

         }
         else if(bmi>18.5 && bmi<21)
         {
            System.out.println("you are normal weight");

         }
         else
         {
            System.out.println("you are underweight");
         }
    }
}

         /* Output:
PS C:\Users\Swapnil\Desktop\CDAC\OOPJ\Assignments\ass2> java bmi
Enter weight in kg:
45
1.5
The Body Mass Index is= 20.0
you are normal weight
PS C:\Users\Swapnil\Desktop\CDAC\OOPJ\Assignments\ass2> java bmi
Enter weight in kg:
60
Enter height in meters:
1.2
The Body Mass Index is= 41.666664
you are Overweight
PS C:\Users\Swapnil\Desktop\CDAC\OOPJ\Assignments\ass2> java bmi
Enter weight in kg:
40
Enter height in meters:
1.75
The Body Mass Index is= 13.061225
you are underweight*/



