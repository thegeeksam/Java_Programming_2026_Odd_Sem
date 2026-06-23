package IV_Unit.ExceptionHandling.A_Encounters_with_Exceptions;

public class CheckUncheck03 {
	public static void main(String[] args) {
		int numerator = 100;
		int denominator = 5;
		//ArithmeticException
		// --- IGNORE ---
		while (denominator >= 0) {
			int result = numerator / denominator;
			System.out.println(result);		
			denominator--;
		}		 
	}
}