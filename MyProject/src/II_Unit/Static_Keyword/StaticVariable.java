/**
 * * This file is part of the Java Programming Lecture project.
 * *
 * * A 'static variable' is a variable that belongs to the class 
 * * rather than instances of the class.
 * * It is shared among all instances of the class.
 * *
 * * This Java snippet illustrates:
 * * - Creates four instances of Counter.
 * * - Each time, the constructor runs and increments the shared count.
 * * - Count is not reset for each object.
 * * - Instead, it accumulates - a hallmark of 'static' behavior.
 * *
 * @package II_Unit.Static_Keyword;
 * @author Dr. S. Sampath Kumar
 * @since 11-08-2025
 * @version 1.0
 */
package II_Unit.Static_Keyword;
class Counter {
    static int count = 0; // static variable shared by all Counter objects
    int iJoshua = 0; // non-static variable, unique to each instance

    Counter() {
        count++;
        iJoshua++;
        System.out.println("Object created. Count: " + count + ", iJoshua: " + iJoshua);
    }
}

public class StaticVariable {
    public static void main(String[] args) {
        // Creates 4 instances of Counter
        new Counter();
        new Counter();
        new Counter();
        new Counter();
    }
}