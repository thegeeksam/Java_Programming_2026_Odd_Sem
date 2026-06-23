public class CheckedAndUncheckedExceptions03 {

	public static void main(String[] args) {

		int numerator = 100;
		
		int denominator = 5;
		
		while (denominator >= 0) {
			
			int result = numerator / denominator;
			
			System.out.println(result);
			
			denominator--;
		}
		 
	}

}