/**
 * * This file is part of the Java Programming Lecture project.
 * *
 * * This file to do some experiments
 * *
 * * Content of this file is solely for educational purpose and
 * * is not intended for funny jokes, pranks, or any other non-serious activities.
 * *
 * * objNum.getClass() - இந்த object எந்த class-லிருந்து உருவாக்கப்பட்டது?
 * * getName() - அந்த class-ன் பெயர் என்ன?
 * * 
 * @package I_Unit
 * @author Dr. S. Sampath Kumar
 * @since 10-06-2026
 * @version 2.0
 */

package Java_Array;

public class J_HashCode {
    public static void main(String[] args) {
        // creating an array
        int[] iArr1 = { 10, 20, 30 };

        // assigning arr1 to arr2 (reference copy)
        int[] iArr2 = iArr1;

        // print hash codes of both arrays
        System.out.println("Hash code of arr1: " + iArr1.hashCode());
        System.out.println("Hash code of arr2: " + iArr2.hashCode());

        // print array objects
        System.out.println("Array object: " + iArr1.toString());
        System.out.println("Clone array object: " + iArr2);
        // above line is equivalent to below line
        // System.out.println(
        // iArr1.getClass().getName()
        // + "@"
        // + Integer.toHexString(iArr1.hashCode()));

        // checking whether both arrays are the same or not
        System.out.println(iArr1 == iArr2);

        // Convert to hex
        String sHd = Integer.toHexString(iArr1.hashCode());// .toUpperCase();
        System.out.println("Hexadecimal: " + sHd);
        // convert hex to decimal
        System.out.println(Integer.parseInt(sHd, 16));

    }
}
