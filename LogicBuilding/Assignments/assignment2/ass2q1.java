/*Write a program to classify student grades based on the following criteria:

•	If the score is greater than or equal to 90, print "A"
•	If the score is between 80 and 89, print "B"
•	If the score is between 70 and 79, print "C"
•	If the score is between 60 and 69, print "D"
•	If the score is less than 60, print "F"
*/
import java.util.*;
class studentGrade
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the score you have:");
        int score=sc.nextInt();
        if(score>=90)
        {
            System.out.println("You ae passed in grade A");
        }
        else if(score>=80&&score<90)
        {
            System.out.println("You ae passed in grade B");
        }
        else if(score>=70&&score<80)
        {
            System.out.println("You ae passed in grade C");
        }
        else if(score>=60&&score<70)
        {
            System.out.println("You ae passed in grade D");
        }
        else
        {
            System.out.println("You ae passed in grade F");
        }

    }
}

/*Output
java studentGrade
Enter the score you have:
90
You ae passed in grade A */