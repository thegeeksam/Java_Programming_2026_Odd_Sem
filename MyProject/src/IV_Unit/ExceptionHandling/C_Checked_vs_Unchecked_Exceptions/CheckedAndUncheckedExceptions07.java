import java.io.IOError;

public class CheckedAndUncheckedExceptions07 {

	public static void main(String[] args) {
		
		NumberFormatException nfe = new NumberFormatException();
		NullPointerException npe = new NullPointerException();
		ArithmeticException ae = new ArithmeticException();
		
		IOError ioe = new IOError(new Exception());
		
		System.out.println("nfe instanceof RuntimeException: " + (
				nfe instanceof RuntimeException));

		System.out.println("npe instanceof RuntimeException: " + 
				(npe instanceof RuntimeException));
		
		System.out.println("ae instanceof RuntimeException: " + 
				(ae instanceof RuntimeException));

		System.out.println("ioe instanceof Error: " + 
				(ioe instanceof Error));
	}

}