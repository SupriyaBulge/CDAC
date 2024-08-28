/*
9.	Write a program to find and print the largest digit in the number 4825.
*/

class number
{
    public static void main(String args[])
    {
        int a,b,c,d;
        int num=4825;
        a=num%10;
        num=num/10;
        b=num%10;
        num=num/10;
        c=num%10;
        num=num/10;
        d=num%10;
        int large=(a>b&&a>c&&a>d)?a:(b>a&&b>c&&b>d)? b:(c>a&&c>b&&c>d)?c:d;
        System.out.println("The Largest digit in 4825 is= "+large);
        
    }  
}

/*output:
The Largest digit in 4825 is= 8
 */