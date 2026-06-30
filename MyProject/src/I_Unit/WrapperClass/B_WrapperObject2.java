/**
 * * This file is part of the Java Programming Lecture project.
 * *
 * @package WrapperClass
 * @author Dr. S. Sampath Kumar
 * @since 03-08-2025
 * @version 1.0
 */
package I_Unit.WrapperClass;

public class B_WrapperObject2 {
    public static void main(String[] args) {
        // Creating the object using the wrapper class
        // without passing the value to the constructor
        // object intValue of type Integer will store
        // the value 10 as int
        Integer iObjValue = 10;
        Double dObjValue = 8.89;
        Character cObjValue = 'S';

        // Printing the values using the created objects
        System.out.println(iObjValue);
        System.out.println(dObjValue);
        System.out.println(cObjValue);
    }
}
