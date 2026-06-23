package IV_Unit.ExceptionHandling;

//try block is used to enclose the code that might throw an exception. 
//It must be used within the method.
//try block must be followed by either catch or finally block.
public class TryCatchFinally {
    public static void main(String[] args) {
        int a, b[] = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
        String c = null;
        try {
            // Arithmetic Exception
            // a = b[5] / 0;
            // ArrayIndexOutOfBound Exception
            // System.out.println(b[10]);
            // Null Point Exception
            System.out.println(c.length());
        } catch (ArithmeticException e) {
            System.out.println("\nHello Human! It is impossible to divide a number by 0!\n");
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("\nArrayIndexOutOfBounds Exception occurs\n");
        } catch (Exception e) {
            System.out.println("\nException Occurs\n" + e + "\n");
        } finally {
            System.out.println("finally Block is invoked!\n");
        }
        System.out.println("Hello Innovators!\nHope Class is not Boring!");
    }
}
