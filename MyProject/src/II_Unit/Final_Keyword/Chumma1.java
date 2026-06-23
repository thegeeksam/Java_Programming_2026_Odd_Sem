package II_Unit.Final_Keyword;

public class Chumma1 {
    public static void main(String[] args) {
        // Final reference variable
        final StringBuffer strBuffer = new StringBuffer("Hello, II CSE B!!!");

        // Printing the element in strBuffer
        System.out.println(strBuffer);

        // changing internal state of object reference by
        // final reference variable strBuffer
        strBuffer.append("World");

        // Printing the element in strBuffer
        System.out.println(strBuffer);
    }
}
