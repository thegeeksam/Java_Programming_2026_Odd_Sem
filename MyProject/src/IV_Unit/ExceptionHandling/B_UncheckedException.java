package IV_Unit.ExceptionHandling;

public class B_UncheckedException {
    public static void main(String args[]) {
        // arithmeticException
        // int a = 10, b = 0;
        // int c = a / b;

        // NullPointerException
        // String s = null;
        // System.out.println(s.length());

        // ArrayIndexOutOfBoundsException
        int arr[] = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
        try {
            System.out.println(arr[15]);
        } catch (Exception e) {
            System.out.println(e);
            System.out.println("\nArrayIndexOutOfBounds Exception occurs\n");
        } finally {
            System.out.println("finally block is always executed");
        }
        System.out.println("rest of the code...");

    }
}
