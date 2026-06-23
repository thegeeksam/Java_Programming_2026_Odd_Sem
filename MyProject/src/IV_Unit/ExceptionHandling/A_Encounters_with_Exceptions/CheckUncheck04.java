package IV_Unit.ExceptionHandling.A_Encounters_with_Exceptions;

import java.io.IOError;

public class CheckUncheck04 {

	public static void main(String[] args) {
		
		methodWhichThrowsAnError();
	}
	
	public static void methodWhichThrowsAnError() {

		throw new IOError(new Exception());
	}

}