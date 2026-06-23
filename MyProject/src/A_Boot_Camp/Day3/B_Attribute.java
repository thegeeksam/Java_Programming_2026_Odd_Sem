/**
 * This file is part of the Boot Camp project.
 * This class demonstrates the use of Attributes or fields in a class.
 * * @author Dr. S. Sampath Kumar
 * * @since 08-07-2025
 * * @version 1.0
 */
package A_Boot_Camp.Day3;

class Attribute{
    // Instance Attribute
    // Belongs to an instance of the class
    // Each instance of the class has its own copy of the field
    int iValue = 10; 
    // Final Attribute. Constant value, cannot be changed
    // final 
    String sValue = "Hello"; 
    // Final field, cannot be changed
    // Static Attribute. Belongs to the class, not instances
    // All instances of the class share the same static field
    static int iStaticValue = 30;
    Attribute(){
        iStaticValue++;
    }
}
public class B_Attribute {
    public static void main(String[] args) {
        // Create an instance of the Field class
        Attribute field = new Attribute();
        // Access and print the value of iValue
        System.out.println("Value of iValue: " + field.iValue);
        System.out.println("Value of static field iStaticValue: " + field.iStaticValue);    
        field.iValue = 20; // Overriding the field value
        System.out.println("Modified value of iValue: " + field.iValue);
        // Create another instance of the Field class
        Attribute f1 = new Attribute();
        Attribute f2 = new Attribute();
        Attribute field2 = new Attribute();
        // field.sValue = "World"; // This line will cause an error because sValue is final
        // Access and print the value of iValue in the new instance
        System.out.println("Value of iValue in field2: " + field2.iValue);
        System.out.println("Value of static field iStaticValue in field2: " + field2.iStaticValue);
    }
}
