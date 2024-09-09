/*
5)Write a program that allows the user to select a shape (Circle, Square, Rectangle, Triangle) 
and then calculates the area based on user-provided dimensions using a switch case.
*/
import java.util.Scanner;
class shape
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Select a shape (Circle, Square, Rectangle, Triangle)  : ");
        String shape=sc.next();
        switch(shape)
        {
            case "circle" : System.out.println("Enter the radius of circle:  ");
                            float r=sc.nextFloat();
                            double area=3.14*r*r;
                            System.out.println("The area of circle is: "+area);
                             break;
            case "square" : System.out.println("Enter the side of square:  ");
                            int side=sc.nextInt();
                            area=side*side;
                            System.out.println("The area of square is: "+area);
                             break;
            case "triangle" : System.out.println("Enter the three sides of triangle:  ");
                            int s1=sc.nextInt();
                            int s2=sc.nextInt();
                            int s3=sc.nextInt();
                             area=s1*s2*s3;
                            System.out.println("The area of triangle is: "+area);
                             break;
            case "rectangle" : System.out.println("Enter the length and breadth of rectangle:  ");
                            int length=sc.nextInt();
                            float breadth=sc.nextFloat();
                             area=length*breadth;
                            System.out.println("The area of rectangle is: "+area);
                             break;
            default:System.out.println("Invalid Input");
                    break;
        }
    }
}

/* Output:
java shape      
Select a shape (Circle, Square, Rectangle, Triangle)  : 
square
Enter the side of square:  
5
The area of square is: 25.0*/