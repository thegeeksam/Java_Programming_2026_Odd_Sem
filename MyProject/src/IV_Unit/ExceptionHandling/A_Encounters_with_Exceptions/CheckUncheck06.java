package IV_Unit.ExceptionHandling.A_Encounters_with_Exceptions;

import java.io.FileNotFoundException;
import java.io.FileReader;

public class CheckUncheck06 {

	public static void main(String[] args) throws FileNotFoundException {
		
		FileReader file = new FileReader("somefile.txt");
	}
	
}