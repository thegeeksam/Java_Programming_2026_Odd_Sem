package III_Unit.JavaString;

public class LiteralNew {
    public static void main(String args[]) {
        // String Literal
        String str1 = "Hello, II CSE B";
        // New String is not created.
        // str2 is pointing to the old string value only.
        String str2 = "Hello, II CSE B";
        // System.out.println(str1.hashCode() + " " + str2.hashCode());
        // both str1 and str2 reference the same object in the pool
        System.out.println(str1 == str2); // true
        System.out.println(str1.equals(str2)); // true

        // using new keyword
        String str3 = new String("Hello, II CSE B");
        String str4 = new String("Hello, II CSE B");
        System.out.println(str3 == str4); // false
        System.out.println(str3.equals(str4)); // true
        // System.out.println(str3.hashCode() + " " + str4.hashCode());
        
        System.out.println(str1 == str4); // false. why?
    }
}






// str1 in string pool and str4 in heap