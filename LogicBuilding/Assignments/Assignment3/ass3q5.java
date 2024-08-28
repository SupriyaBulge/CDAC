/*
5.	Write a program to print the Fibonacci sequence up to the number 21.
*/

class number
{
    public static void main(String args[])
    {
        int n1=0,n2=1;
        {    
            int n3=0,count=9;
            System.out.println("Fibonacci sequence up to the number 21:");    
            System.out.print(n1+" "+n2);
            for(int i=2;i<count;++i)   
            {   
            n3=n1+n2;         
            System.out.print(" "+n3);    
            n1=n2;    
            n2=n3; 
               
            }    
        }
    }  
}

/*output:
Fibonacci sequence up to the number 21:
0 1 1 2 3 5 8 13 21
 */