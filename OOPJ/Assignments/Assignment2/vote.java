/*3)Write a program that checks if a person is eligible to vote based on their age.*/
import java.util.Scanner;
class vote
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter your age:");
        int age=sc.nextInt();
        if(age>=18)
        {
            System.out.println("You are Eligible for voting.");
        }
        else
        {
            System.out.println("You are not Eligible for voting.");
        }
    }
}

/* Output:
Enter your age:
16
You are not Eligible for voting.
PS C:\Users\Swapnil\Desktop\CDAC\OOPJ\Assignments\ass2> java vote
Enter your age:
25
You are Eligible for voting.
 */