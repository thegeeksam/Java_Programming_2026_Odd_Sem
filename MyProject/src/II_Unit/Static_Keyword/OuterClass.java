/**
 * * This file is part of the Java Programming Lecture project.
 * *
 * * We can't use static keywords with the top-level outer class, 
 * * but we can use static keywords with nested classes. 
 * * So, the nested class declared with a static keyword is 
 * * known as a static nested class.
 * *
 * * Some important points related to static nested class:
 * * - Inner is a static nested class.
 * * - It can be instantiated without an instance of Outer class.
 * * - Static nested classes can't access the outer class's non-static members;
 * *   they can only access the static member variable of the class.
 * *
 * * This Java snippet illustrates:
 * * - How the 'super' keyword accesses parent class constructor
 * *
 * @package II_Unit.Static_Keyword;
 * @author Dr. S. Sampath Kumar
 * @since 11-08-2025
 * @version 1.0
 */
package II_Unit.Static_Keyword;

// Java code to demonstrate the use of static nested classes
public class OuterClass {
    private static String sPgm = "JAVA";
    private int iA = 10; // non-static variable

    // declaring a static nested class
    static class staticNestedClass {
        // can access name variable here as it is static variable
        // non-static method
        int iB = 20; // non-static variable
        public void display() {
            // System.err.println(iA); // This will throw an error since iA is non-static
            System.out.println(iB);
            System.out.println(sPgm);
        }
    }

    public static void main(String args[]) {
        // No need for Outer class object
        OuterClass.staticNestedClass ins1 = new OuterClass.staticNestedClass();
        ins1.display();
    }
}

/*
 * Think of the static nested class as a guest speaker at a temple event.
 * He doesn’t need to be a devotee (object of outer class),
 * but he can still quote the temple’s scriptures (static members).
 */