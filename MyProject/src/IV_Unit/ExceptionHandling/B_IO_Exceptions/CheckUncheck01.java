public class CheckUncheck01 {

	public static void main(String[] args) {

		String num_strs[] = {"3", "56", "112", "345", "Hello", "3456"};

		for (String str : num_strs) {
			
			int varInt = Integer.parseInt(str);
			
			System.out.println(varInt);
		}
		
	}

}