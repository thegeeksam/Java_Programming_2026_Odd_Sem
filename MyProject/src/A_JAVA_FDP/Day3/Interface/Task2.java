// package A_JAVA_FDP.Day3.Interface;

import java.util.Arrays;
import java.util.List;

public class Task2 {
    public static void main(String[] args) {
        // Using Lambda Expression
        // to implement the show method
        List<Integer> listVal = Arrays.asList(2, 3, 5, 1, 6);
        // get even values = 2,6
        // multiply by 2 = 4,12
        // sum all the values = 16
        // The following code defines a list of integers and calculates the sum of
        // the even integers in the list after multiplying each by 2. It then prints
        // the result.

        // The code uses a for-each loop to iterate through each integer in the list.
        // For each integer, it checks if it is even (i.e., divisible by 2).
        // If it is even, it multiplies the integer by 2 and adds it to the sum.
        // Finally, it prints the total sum of the modified even integers.
        // The output will be the sum of the even integers multiplied by 2.
        // The output will be 16, which is the sum of 4 (2*2) and 12 (6*2).

        int sum = 0;
        for (Integer i : listVal) {
            if (i % 2 == 0) {
                sum += i * 2;
            }

        }
        System.out.println(sum);
    }

}
