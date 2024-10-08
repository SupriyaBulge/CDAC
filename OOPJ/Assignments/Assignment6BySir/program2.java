/*2.	Declare a single-dimensional array of 5 integers inside the main method. Define a method named acceptRecord to
 get input from the terminal into the array and another method named printRecord to print the
  state of the array to the terminal.*/
import java.util.Scanner;
class ArrayInput {
    public static void main(String[] args) {
        int[] numbers = new int[5];
        acceptRecord(numbers);
        printRecord(numbers);
    }
    public static void acceptRecord(int[] numbers) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter 5 integers:");
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = scanner.nextInt();
        }
    }
    public static void printRecord(int[] numbers) {
        System.out.println("Array elements:");
        for (int i = 0; i < numbers.length; i++) {
            System.out.print(numbers[i] + " ");
        }
    }
}
/* output
java ArrayInput    
Enter 5 integers:
20
58
45
33
12
Array elements:
20 58 45 33 12*/