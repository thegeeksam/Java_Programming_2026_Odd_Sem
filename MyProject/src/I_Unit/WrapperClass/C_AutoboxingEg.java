/**
 * * This file is part of the Java Programming Lecture project.
 * *
 * * It demonstrates the concept of autoboxing in Java.
 * * Autoboxing is the automatic conversion that the Java compiler makes
 * * between the primitive types and their corresponding object wrapper classes.
 * * 
 * * In this example, an `int` is converted to an `Integer` object.
 * *
 * @package I_Unit
 * @author Dr. S. Sampath Kumar
 * @since 03-08-2025
 * @version 1.0
 */

package I_Unit.WrapperClass;
//Autoboxing example of int to Integer and char to Char

public class C_AutoboxingEg {

    public static void main(String args[]) {
        int iA = 50;
        double dB = 5.65;
        // char a = 'a';
        // Deprecated method of boxing
        // Integer IObj1 = new Integer(iA);

        // Converting int into Integer explicitly
        Integer iObj2 = Integer.valueOf(iA);

        // Implicit Conversion
        // Autoboxing
        Integer iObj3 = iA;
        System.out.println(iObj2 == iObj3);
        // Displaying the class names of the objects
        // System.out.println(IObj1.getClass().getName());
        System.out.println(iObj2.getClass());
        System.out.println(iObj3.getClass().getSimpleName());

        // Explicit Conversion of Primitive to Wrapper Class
        Double bObj1 = Double.valueOf(dB);
        // Implicit Conversion
        // Autoboxing
        Double bObj2 = dB;

        // System.out.println(IObj1);
        System.out.println(iObj2);
        System.out.println(iObj3);
    } // Refer PrimitiveToWrapper.java also
}
