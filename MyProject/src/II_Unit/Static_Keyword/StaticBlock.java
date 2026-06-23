/**
 * * This file is part of the Java Programming Lecture project.
 * *
 * * A static block is executed once when the class is loaded 
 * * into memory—before main() or any object is created.
 * * It is ideal for
 * * - Initializing static variables
 * * - Loading configuration files or resources
 * * - Performing setup tasks that should run only once
 * *
 * * This Java snippet illustrates:
 * * - Declares 2 static variables: radius and area.
 * * - These belong to the class, not to any instance.
 * * - As soon as the class is loaded into memory, static block runs.
 * * - It sets radius = 4 and calculates area = 16.
 * * - The message "Invoked java static block!" confirms the block's execution
 * *
 * @package II_Unit.Static_Keyword;
 * @author Dr. S. Sampath Kumar
 * @since 11-08-2025
 * @version 1.0
 */
package II_Unit.Static_Keyword;

public class StaticBlock {
    // static variable declaration
    static int area;
    static int radius;
    // run before main()
    // will run only once. 
    // class‑level initialization 
    static {// static block declaration
        System.out.println("Invoked java static block!");
        // initializing radius and area static variable
        radius = 4;
        area = radius * radius;
    }

    public static void main(String[] args) {
        // System.out.println(radius);
        // System.out.println(++radius);
        System.out.println("In the main() function");
        System.out.println("Area of square with radius " + radius + ": " + area);
    }
}
