package IV_Unit.ExceptionHandling.C_Checked_vs_Unchecked_Exceptions;
public class CheckedAndUncheckedExceptions01 {

	public static void main(String[] args) {

		String num_strs[] = {"3", "56", "112", "345", "Hello", "3456"};
		try{		
			for (String str : num_strs) {
			
			int varInt = Integer.parseInt(str);
			
			System.out.println(varInt);
			}
		} catch(NumberFormatException e) {
			e.printStackTrace();
			System.out.println("NumberFormatException Caught: " + e.getMessage());
		}
	}

}