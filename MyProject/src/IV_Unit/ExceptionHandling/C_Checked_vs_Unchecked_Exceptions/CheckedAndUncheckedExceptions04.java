import java.io.IOError;

public class CheckedAndUncheckedExceptions04 {

	public static void main(String[] args) {
		
		methodWhichThrowsAnError();
	}
	
	public static void methodWhichThrowsAnError() {

		throw new IOError(new Exception());
	}

}