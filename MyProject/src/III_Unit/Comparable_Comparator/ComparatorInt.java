/**
 * * This file is part of the Java Programming Lecture project.
 * *
 * * This Java snippet illustrates:
 * * - How to use Comparator interface to sort a list of integers
 * * - Default sorting using Collections.sort()
 * * - Custom sorting based on the last digit of each integer 
 * * - Custom sorting using Comparator (Functional) interface
 * * - Sort using anonymous class and lambda expression approaches
 * * 
 * * >> Comparator
 * * - Comparator is used to compare two different objects.
 * * - We can define our own logic for sorting using Comparator.
 * * - Comparator is a 'functional interface' that can sort objects.
 * * - It is used for the custom ordering of objects.
 * * - It has a method called compare() which compares 2 objects and
 * *   returns one of following integer values based on the comparison:
 * *    # -1: if 1st argument < 2nd argument
 * *    # 1: if 1st argument > 2nd argument
 * *    # 0: if 1st argument = 2nd argument
 * *
 * @package III_Unit.Comparable_Comparator;
 * @author Dr. S. Sampath Kumar
 * @since 10-09-2025
 * @version 2.0
 */

package III_Unit.Comparable_Comparator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class ComparatorInt {
    public static void main(String[] args) {
        List<Integer> alNum = new ArrayList<>();
        alNum.add(43);
        alNum.add(31);
        alNum.add(72);
        alNum.add(29);
        alNum.add(29);
        System.out.println("Unsorted ArrayList: " + alNum);
        
        // Default Sorting
        Collections.sort(alNum);
        System.out.println("Sorted ArrayList: " + alNum);

        // Creating Comparator using anonymous class
        Comparator<Integer> cc = new Comparator<Integer>() {
            public int compare(Integer i, Integer j) {
                if (i % 10 > j % 10)
                    return 1;
                else
                    return -1;
            }
        };
        // Using lambda expression
        // Interface ------ Object = (parameters) -> expression
        Comparator<Integer> cc1 = (i, j) -> i % 10 > j % 10 ? 1 : -1;
        
        // Custom Sorting - Sorting based on last digit
        Collections.sort(alNum, cc);
        Collections.sort(alNum, cc1);
        System.out.println("Newly Sorted Content: " + alNum);
    }
}