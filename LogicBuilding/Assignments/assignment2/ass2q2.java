/*Question 2: Days of the Week

Write a program that uses a nested switch statement to print out the day of the week based on an integer input 
(1 for Monday, 2 for Tuesday, etc.). Additionally, within each day, print whether it is a weekday or weekend.
 */
import java.util.*;
class dayOfWeek
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the day of week from 1 to 7:");
        int day=sc.nextInt();
        switch(day)
        {
            case 1: System.out.println("it is Monday");
                    switch(day)
                    {
                        case 1,2,3,4,5:System.out.println("It is a weekday");
                        break;
                        case 6,7:System.out.println("It is a weekend");
                        break;
                    }
                    break;

            case 2:System.out.println("it is Tuesday");
                    switch(day)
                    {
                        case 1,2,3,4,5:System.out.println("It is a weekday");
                        break;
                        case 6,7:System.out.println("It is a weekend");
                        break;
                    }
                    break;
            case 3:System.out.println("it is Wednesday");
                    switch(day)
                    {
                        case 1,2,3,4,5:System.out.println("It is a weekday");
                        break;
                        case 6,7:System.out.println("It is a weekend");
                        break;
                    }
                    break;
            case 4:System.out.println("it is Thursday");
                    switch(day)
                    {
                        case 1,2,3,4,5:System.out.println("It is a weekday");
                        case 6,7:System.out.println("It is a weekend");
                    }
                    break;
            case 5:System.out.println("it is Friday");
                    switch(day)
                    {
                        case 1,2,3,4,5:System.out.println("It is a weekday");
                        break;
                        case 6,7:System.out.println("It is a weekend");
                        break;
                    }
                    break;
            case 6:System.out.println("it is Saturday");
                    switch(day)
                    {
                        case 1,2,3,4,5:System.out.println("It is a weekday");
                        break;
                        case 6,7:System.out.println("It is a weekend");
                        break;
                    }
                    break;
            case 7:System.out.println("it is Sunday");
                    switch(day)
                    {
                        case 1,2,3,4,5:System.out.println("It is a weekday");
                        break;
                        case 6,7:System.out.println("It is a weekend");
                        break;
                    }
                    break;
            default:System.out.println("Invalid input");
            break;
        }
    }
} 
/*Output
java dayOfWeek   
Enter the day of week from 1 to 7:
7
it is Sunday
It is a weekend */