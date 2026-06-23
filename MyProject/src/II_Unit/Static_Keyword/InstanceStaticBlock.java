/**
 * * This file is part of the Java Programming Lecture project.
 * *
 * * This program create to solve student doubt on Instance initializer block
 * * If there is instance and static block in a class, 
 * * static block will be executed first and only once
 * * Where as instance block will be executed every time an object is created.
 * @package II_Unit.Static_Keyword;
 * @author Dr. S. Sampath Kumar
 * @since 11-08-2025
 * @version 1.0
 */
package II_Unit.Static_Keyword;

public class InstanceStaticBlock {
    // static variable declaration
    static int area;
    static int radius;
    String region;
    // Instance initializer block
    {
        region = "Pollachi";
        System.out.println("Instance initializer block executed.\nRegion set to: " + region);
    }

    public InstanceStaticBlock() {
        System.out.println("Constructor executed. Region is: " + region);
    }
    
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
        System.out.println("main() function Invoked!!");
        System.out.println("Area of square with radius " + radius + " is: " + area);
        InstanceStaticBlock obj = new InstanceStaticBlock();
        InstanceStaticBlock obj1 = new InstanceStaticBlock();
        InstanceStaticBlock obj2 = new InstanceStaticBlock();
    }
}
