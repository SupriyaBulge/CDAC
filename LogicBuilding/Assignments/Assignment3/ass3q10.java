/*10.	Write a program to print all even numbers between 1 and 50. */

class number
{
    public static void main(String args[])
    {
         System.out.println("All even numbers between 1 and 50 are: ");
        for(int i=1;i<=50;i++)
        {
            if(i%2==0)
             System.out.println(i);
        }
       
    }
}
/*output:
All even numbers between 1 and 50 are: 
2
4
6
8
10
12
14
16
18
20
22
24
26
28
30
32
34
36
38
40
42
44
46
48
50
 */