package A_JAVA_FDP.Day3.Interface;
// package A_JAVA_FDP.Day3;

public class Inter4 {
    // Using Lambda Expression
    // to implement the show method
    public static void main(String[] args) {
        First obj = (a) -> a * a;
        // The above line is a lambda expression that implements the
        // show method of the First interface. It takes an integer
        // parameter 'a' and returns its square.
        System.out.println(obj.show(10));

        // The show method is called with the argument 10.
        // The result of the method call is not stored or printed,
        // so it will not produce any output.
        // If you want to see the result, you can print it:
        First obj1 = (a) -> {
            System.out.println("Hello World");
            return a * a;
        };
        int result = obj1.show(5);
        System.out.println("Result: " + result);
    }
}

@FunctionalInterface
// A functional interface is an interface that contains only one abstract
// method.
interface First {
    public int show(int a);
}