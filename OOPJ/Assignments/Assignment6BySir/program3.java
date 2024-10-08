/*3.	Write a program to find the maximum and minimum values in a single-dimensional array of integers*/
import java.util.*;
class NumberDemo {
    public static void main(String[] args) {
        int[] numbers = {10, 20, 30, 40, 50};

        int max = numbers[0];
        int min = numbers[0];
        for (int i = 1; i < numbers.length; i++) {
            if (numbers[i] > max) {
                max = numbers[i];
            }
            if (numbers[i] < min) {
                min = numbers[i];
            }
        }
        System.out.println("Maximum value: " + max);
        System.out.println("Minimum value: " + min);
    }
}
/*output:
java NumberDemo    
Maximum value: 50
Minimum value: 10*/
