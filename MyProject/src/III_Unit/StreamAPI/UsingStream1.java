/**
 * * This file is part of the Java Programming Lecture project.
 * *
 * * This Java snippet illustrates:
 * * - Stream Pipeline Construction: build a pipeline using filter, map, and reduce.
 * * - Functional Purity: Streams don’t mutate the source collection.
 * *
 * * >>> Stream <<<
 * * - A stream is not a data structure; it doesn’t store elements.
 * * - It conveys elements from a source (like a List, Set, or array) 
 * *   through a pipeline of operations.
 * * - Operations performed on a stream does not modify it's source.
 * * - It supports functional-style operations such as filter, 
 * *   map, reduce, collect, etc.
 * * >>> Characteristics of Stream <<<
 * * - Streams are functional in nature; an operation on a stream
 * *   produces a result, but does not modify its source.
 * * - Streams are lazy; they only compute results when a 
 * *   terminal operation is invoked.
 * * - Streams are 'single-use' once consumed, they cannot be reused.
 * * - Like an Iterator, a new stream must be generated to revisit the 
 * *   same elements of the source.
 * @package III_Unit.StreamAPI
 * @author Dr. S. Sampath Kumar
 * @since 13-09-2025
 * @version 2.0
 */
package III_Unit.StreamAPI;

import java.util.Arrays;
import java.util.List;
import java.util.stream.*;

public class UsingStream1 {

    public static void main(String[] args) {

        List<Integer> nums = Arrays.asList(4, 5, 7, 3, 2, 6);
        // following code is for understanding purpose only
        Stream<Integer> s1 = nums.stream();
        // s1.forEach(n -> System.out.println(n));
        Stream<Integer> s2 = s1.filter(n -> n % 2 == 0);
        // s2 = [4, 2, 6]
        // s2.forEach(n -> System.out.println(n));
        Stream<Integer> s3 = s2.map(n -> n * 2);
        // s3 = [8, 4, 12]
        int result = s3.reduce(0, (c, e) -> c + e);
        /*
         * 0 - Identity value: the starting point of the reduction (initial sum = 0)
         * (c, e) -> c + e - Accumulator function: takes two arguments 
         *     - c (current total)
         *     - e (next element) - and returns their sum
         * our Example:
         * - Start with c = 0
         * - Add e = 8 → c = 0 + 8 = 8
         * - Add e = 4 → c = 8 + 4 = 12
         * - Add e = 12 → c = 12 + 12 = 24
         */
        System.out.println(result);
        // following will generate error since we already used all streams
        // s2.forEach(n -> System.out.println(n));
        // s3.forEach(n -> System.out.println(n));
        // s1.forEach(n -> System.out.println(n));  

        // Method chaining - Used in realtime 
        // Stream Pipeline
        int result1 = nums.stream()
                // Filtering even numbers
                .filter(n -> n % 2 == 0) 
                // Doubling each even number
                .map(n -> n * 2) 
                // Summing all doubled even numbers
                .reduce(0, (c, e) -> c + e);
        System.out.println(result1);
    }
}
