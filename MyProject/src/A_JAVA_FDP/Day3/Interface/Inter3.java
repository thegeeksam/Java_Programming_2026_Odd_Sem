package A_JAVA_FDP.Day3.Interface;
// package A_JAVA_FDP.Day3;

public class Inter3 {
    // Using Lambda Expression
    // to implement the show method
    public static void main(String[] args) {
        First obj = (a) -> {
            System.out.println("Hello from Second class!" + a);
        };
        obj.show(10);
    }
}

@FunctionalInterface
// A functional interface is an interface that contains only one abstract
// method.
interface First {
    public void show(int a);
}