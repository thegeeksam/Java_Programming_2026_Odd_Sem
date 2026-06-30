/**
 * * This file is part of the Java Programming Lecture project.
 * * This class demonstrates unboxing in Java, where a wrapper 
 * * class object is converted back to its primitive type.
 * * Unboxing is the reverse process of autoboxing.
 * *
 * @package I_Unit
 * @author Dr. S. Sampath Kumar
 * @since 03-08-2025
 * @version 1.0
 */

package I_Unit.WrapperClass;

public class D_UnboxingExample {
    public static void main(String args[]) {

        // creates objects of wrapper class
        Integer IObj = 5;
        // Integer aObj = Integer.valueOf(23);
        Double DObj = Double.valueOf(5.55);

        // Converting Integer to int explicitly
        int iA = IObj.intValue();
        // int iFirst = IObj.intValue();
        // double b = bObj.doubleValue();
        double iB = DObj;

        // Unboxing, now compiler will write IObj.intValue() internally
        int iC = IObj; // Unboxing

        System.out.println(IObj);
        System.out.println(iA);
        System.out.println(iC);
    } // Refer WrapperToPrimitive.java also
}
