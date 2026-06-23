// package A_JAVA_FDP.Day3.Interface;

@FunctionalInterface
// A functional interface is an interface that contains only one abstract
// method.
interface NumberValidator {
    public boolean OddEven(int a);
}
public class InterTask {
    // Using Lambda Expression
    // to implement the show method
    public static void main(String[] args) {
        // The following code defines a functional interface 'First' with a method
        // 'OddEven' that takes an integer parameter and returns a boolean value.
        // It then creates an instance of this interface using a lambda expression
        // that checks if the given integer is even. Finally, it calls the 'show'
        // method with the argument 10 and prints the result.
        NumberValidator first = (x) -> x % 2 == 0; // Even number
        System.out.println(first.OddEven(10));
        //System.out.println(first.OddEven(9));
    }
}

