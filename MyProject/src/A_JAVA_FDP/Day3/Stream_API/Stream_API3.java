// package A_JAVA_FDP.Day3.Stream_API;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class Stream_API3 {
    public static void main(String[] args) {
        // Create a Stream from a List
        List<Integer> listVal = Arrays.asList(2, 3, 5, 1, 6, 4);
        Stream<Integer> streamVal = listVal.stream();

        // which is between 2 and 5
        // multiply each element by 2
        // sum all the values
        int val = listVal.stream()
                .filter(n -> n > 2 && n < 5) // Filter even numbers
                .sorted() // Sort the even numbers
                .map(n -> n * 2) // Multiply each even number by 2
                .reduce(2, (x, y) -> x + y); // Sum all the values, starting with 2
        System.out.println(val + " "); // Print the result
    }
}