package III_Unit.StreamAPI;

import java.util.Arrays;
import java.util.List;

public class WoStream {
    public static void main(String[] args) {

        List<Integer> nums = Arrays.asList(4, 5, 7, 3, 2, 6);
        System.out.println(nums);
        int sum = 0;
        for (int n : nums) {
            if (n % 2 == 0) {
                n = n * 2;
                sum = sum + n;
            }
        }
        System.out.println(sum);

        // Printing Values of List: Method 1 - Using For Loop
        // for(int i=0;i<nums.size();i++)
        // {
        //      System.out.println(nums.get(i));
        // }

        // Printing Values of List: Method 2 - Using For Each Loop
        // for(int n: nums)
        // {
        // System.out.println(n);
        // }

        // Printing Values of List: Method 3 - Using Lambda Expression
        // nums.forEach(n -> System.out.println(n));
    }
}
