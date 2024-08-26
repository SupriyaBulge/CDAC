/*
Question 4: Discount Calculation
Write a program to calculate the discount based on the total purchase amount. Use the following criteria:

•	If the total purchase is greater than or equal to Rs.1000, apply a 20% discount.
•	If the total purchase is between Rs.500 and Rs.999, apply a 10% discount.
•	If the total purchase is less than Rs.500, apply a 5% discount.	 
Additionally, if the user has a membership card, increase the discount by 5%.
 */
import java.util.*;
class calculateDiscount
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter tolal purchase amount:");
        int amount=sc.nextInt();
        float discount=0.0f;
         System.out.println("Do you have membership card press y or n for(yes or no):");
        char member=sc.next().charAt(0);
         if(member=='y')
        {
            
        if (amount>=1000)
        {
            discount=amount*25/100;
        }
        else if(amount>=500&&amount<1000)
        {
            discount=amount*15/100;
         }
        else if(amount<500)
        {
            discount=amount*10/100;
        }
         
        }
        else if(member=='n')
        {
         if (amount>=1000)
        {
            discount=amount*20/100;
        }
        else if(amount>=500&&amount<1000)
        {
            discount=amount*10/100;
         }
        else if(amount<500)
        {
            discount=amount*5/100;
        }
        }
        else
        {
        System.out.println("Invalid input");
        }
        System.out.println("The discount you get on "+amount+ " is= "+discount);
    }


} 
/*Output
Enter tolal purchase amount:
1000
Do you have membership card press y or n for(yes or no):
y
The discount you get on 1000 is= 250.0
PS C:\Users\Swapnil\Desktop\CDAC\day2> java calculateDiscount
Enter tolal purchase amount:
1000
Do you have membership card press y or n for(yes or no):
n
The discount you get on 1000 is= 200.0
 */