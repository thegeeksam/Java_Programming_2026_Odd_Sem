/**
 * This file is part of the Boot Camp project.
 * This class serves as a placeholder for type casting examples in Java.
 * Type casting is the process of converting a variable from one type to another.
 * It can be used to convert between primitive types, such as int to double,
 * or between object types, such as casting an object to a specific class.
 * @author Dr. S. Sampath Kumar
 * @since 07-07-2025
 * @version 1.0
 */
package A_Boot_Camp.DAy2;

public class TypeCasting {

    public static void main(String[] args) {
        /**
        * Implicit casting or widening or automatic conversion
        * This occurs when converting a 
        * smaller primitive type to a larger primitive type. 
        */
        int intValue = 10;
        double doubleValue = intValue; // int to double
        System.out.println("Implicit Casting: " + doubleValue);

        /**
         * Explicit casting or narrowing conversion
         * This occurs when converting a larger primitive type to 
         * a smaller primitive type.
         * It requires explicit casting to avoid data loss.
         * For example, converting a double to an int will truncate the decimal part.
         */
        
        double anotherDoubleValue = 9.78;
        int anotherIntValue = (int) anotherDoubleValue; 
        // int anotherIntValue = (int) anotherDoubleValue; // double to int
        System.out.println("Explicit Casting: " + anotherIntValue);

        /**
         * Type casting with objects
         * This is used to convert an object of one type to another type.
         * It is commonly used in inheritance hierarchies.
         * For example, casting a subclass object to a superclass type.
         */
        // Object type casting
        Object obj = "Hello, World!";
        // Downcasting from Object to String
        // This is safe because obj is actually a String
        String str = (String) obj; // Object to String
        System.out.println("Object Type Casting: " + str);
    }

}
