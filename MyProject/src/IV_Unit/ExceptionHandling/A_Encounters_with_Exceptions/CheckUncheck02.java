package IV_Unit.ExceptionHandling.A_Encounters_with_Exceptions;
public class CheckUncheck02 {

	public static void main(String[] args) {

		String num_strs[] = {"World", "Java", "Python", null, "Program", "Hello"};
		//NullPointerException
		for (String str : num_strs) {
			
			System.out.println("String: "+ str + " Length: " + str.length());
		}
		
	}

}