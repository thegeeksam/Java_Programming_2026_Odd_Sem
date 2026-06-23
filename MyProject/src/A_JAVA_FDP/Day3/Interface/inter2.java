package A_JAVA_FDP.Day3.Interface;
// package A_JAVA_FDP.Day3;

public class inter2 {
    // Using Lambda Expression
    // to implement the show method
    public static void main(String[] args) {
        First obj = () -> {
            System.out.println("Hello from Second class!");
        };
        obj.show();
    }
}

@FunctionalInterface
// A functional interface is an interface that contains only
// one abstract method.
interface First {
    public void show();
}