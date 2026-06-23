// package A_JAVA_FDP.Day3.Stream_API;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class Stream_API4 {
    public static void main(String[] args) {
        // Create a Stream from a List
        List<Integer> listVal = Arrays.asList(2, 3, 5, 1, 6, 4);
        Stream<Integer> streamVal = listVal.stream();

        // Find Factorial of each element
        // sum all the values
        // Using a lambda expression to define the mapping function
        java.util.function.Function<Integer, Integer> n = (x) -> {
            int factorial = 1;
            for (int i = 1; i <= x; i++) {
                factorial *= i; // Calculate factorial
            }
            return factorial; // Return the factorial
        };

        // int val = listVal.stream()
        // .map(n) // Multiply each even number by 2
        // .reduce((x, y) -> x + y);
        // System.out.println(val + " "); // Print the result
    }
}