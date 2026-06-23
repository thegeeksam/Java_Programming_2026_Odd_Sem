/**
 * * This file is part of the Java Programming Lecture project.
 * * This is a testing file ignore this file.
 * *
 * @package I_Unit
 * @author Dr. S. Sampath Kumar
 * @since 03-08-2025
 * @version 1.0
 */
package I_Unit.WrapperClass;

public class Z_Chumma {
    public static void main(String[] args) {

        // create primitive types
        int iA = 5;
        double dB = 5.65;

        // converts into wrapper objects
        // Deprecated
        Integer INum = new Integer(iA);
        // Explicit Conversion of Primitive to Wrapper Class
        Integer aObj = Integer.valueOf(iA);
        // Implicit Conversion
        Integer aObj1 = iA;
        int iC = aObj.intValue();
        // Explicit Conversion of Primitive to Wrapper Class
        Double bObj1 = Double.valueOf(dB);
        // Implicit Conversion
        System.out.println(aObj1.getClass().getSimpleName());
        // System.out.println(typeof(iC));

        Double bObj = dB;
    }
}
