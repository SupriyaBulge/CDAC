/*Question 3: Calculator

Write a program that acts as a simple calculator. It should accept two numbers and an operator (+, -, *, /) as input. 
Use a switch statement to perform the appropriate operation. Use nested if- else to check if division by zero is attempted
 and display an error message.
 */
import java.util.*;
class calculator1
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter two numbers:");
        int num1=sc.nextInt();
        int num2=sc.nextInt();
        System.out.println("Enter operator you want to perform:");
        char operator=sc.next().charAt(0);
        switch(operator)
        {
            case '+':System.out.println("The Addition of "+num1+" and "+num2+" = "+(num1+num2));
                    break;

            case '-':System.out.println("The Substraction of "+num1+" and "+num2+" = "+(num1-num2));
                    break;
            case '*':System.out.println("The Multiplication of "+num1+" and "+num2+" = "+(num1*num2));
                    break;
            case '/':if(num2==0)
                    {
                        System.out.println("Error:The division by zero is not possible" );
                        break;

                    }
                    else
                    {
                        System.out.println("The Division of "+num1+" and "+num2+" = "+(num1/num2));
                        break;
                    }

            default:System.out.println("Invalid input");
            break;
        }
    }
} 
/*Output
Enter two numbers:
5
8
Enter operator you want to perform:
+
The Addition of 5 and 8 = 13
PS C:\Users\Swapnil\Desktop\CDAC\day2> java calculator1
Enter two numbers:
9
0
Enter operator you want to perform:
/
Error:The division by zero is not possible */