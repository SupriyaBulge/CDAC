/*
8.	Write a program to count down from 10 to 0, printing each number.
*/

class number
{
    public static void main(String args[])
    {
        int num=10;
        System.out.println("Count down from 10 to 0:");  
        while(num >= 0)   
        {  
            System.out.println(num);  
            num--;
        }  
         }  
}

/*output:
Count down from 10 to 0:
10
9
8
7
6
5
4
3
2
1
0
 */