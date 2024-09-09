/*4)Write a program that takes a month (1-12) and prints the corresponding season 
(Winter, Spring, Summer, Autumn) using a switch case*/
import java.util.Scanner;
class season
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter The number of Month: ");
        int month=sc.nextInt();
        switch(month)
        {
            case 12,1,2 : System.out.println("Winter Season");
                         break;
            case 3,4,5 :System.out.println("Spring Season");
                         break;
            case 6,7,8 :System.out.println("Summer Season");
                         break;
            case 9,10,11:System.out.println("Autumn season");
                         break;
            default:System.out.println("Invalid Input");
                    break;
        }
    }
}

/* Output:
java season
Enter The number of Month:
9
Autumn season
PS C:\Users\Swapnil\Desktop\CDAC\OOPJ\Assignments\ass2> java season
Enter The number of Month:
1
Winter Season
PS C:\Users\Swapnil\Desktop\CDAC\OOPJ\Assignments\ass2> java season
Enter The number of Month: 
8
Summer Season
 */