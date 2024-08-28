/*
11.	Write a Java program to demonstrate the use of both pre-increment and post-decrement operators in a single expression
*/

class number
{
    public static void main(String args[])
    {
        int a=10,b=12,c;
        c=a++ + --b + ++a - b-- ;
        System.out.println("c=" +c);
        System.out.println("a=" +a); 
        System.out.println("b=" +b);
    }  
}

/*output:
c=22
a=12
b=10
 */