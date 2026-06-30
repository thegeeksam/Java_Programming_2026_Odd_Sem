/**
 * * This file is part of the Java Programming Lecture project.
 * * This program demonstrates the creation and usage of wrapper 
 * * objects in Java.
 * *
 * * Wrapper classes are objects that wrap primitive values.
 * *
 * @package I_Unit
 * @author Dr. S. Sampath Kumar
 * @since 17-06-2026
 * @version 2.0
 */

package I_Unit.WrapperClass;

public class A_WrapperObject {
    public static void main(String xyz[]) {
        Integer iObjNum1 = new Integer(77); // int
        Integer iObjNum2 = 77;
        Integer iObjNum3 = 77;
        Integer iObjNum4 = Integer.valueOf(77);
        String sObjStr = "Hello"; // String
        Double dObjNum = Double.valueOf(77.0); // double argument
        Float fObjNum = Float.valueOf(77.0f); // float argument
        Character cObjChar = Character.valueOf('s'); // character
        Boolean bObjBool = Boolean.valueOf(true); // value stored - true

        System.out.println(iObjNum1 == iObjNum4);
        System.out.println(iObjNum1 == iObjNum2);
        System.out.println(iObjNum2 == iObjNum3);
        System.out.println(iObjNum2 == iObjNum4);
        System.out.println(System.identityHashCode(iObjNum1) +
                " : " + System.identityHashCode(iObjNum4));
        System.out.println(System.identityHashCode(iObjNum2) +
                " : " + System.identityHashCode(iObjNum3));
        // System.out.println(iObjNum1 + "\n" + sObjStr + "\n" + dObjNum
        // + "\n" + fObjNum + "\n" + cObjChar + "\n" + bObjBool);
    }
}