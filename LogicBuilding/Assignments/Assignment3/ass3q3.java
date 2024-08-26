/*
3.	Write a program to print all multiples of 7 between 1 and 100.
 */

class number
{
    public static void main(String args[])
    {
        int sum=0;
        System.out.println("all multiples of 7 between 1 and 100 are ");
        for(int i=1;sum<98;i++)
        {
            sum= i*7;
            System.out.println(+sum);
        }
        
    }
}
/*output:
all multiples of 7 between 1 and 100 are 
7
14
21
28
35
42
49
56
63
70
77
84
91
98
 */