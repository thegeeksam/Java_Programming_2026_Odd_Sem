
// package A_JAVA_FDP.Day3.Stream_API;
import java.util.stream.Stream;
import java.util.List;
import java.util.Arrays;

public class Stream_API {
    public static void main(String[] args) {
        // Create a Stream from a List
        List<Integer> listVal = Arrays.asList(2, 3, 5, 1, 6);
        Stream<Integer> streamVal = listVal.stream();
        // The following code creates a stream from a list of integers, sorts the

        streamVal.forEach(n -> System.out.print(n + " "));
        // this will generate error because streamVal is already consumed
        // and then prints each element of the stream.
        Stream<Integer> sortedVal = streamVal.sorted().map(n -> n * 2);
        // The following code sorts the stream of integers and then multiplies each

        System.out.println(sortedVal);

    }
}
