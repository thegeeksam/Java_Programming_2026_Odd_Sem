import java.io.FileNotFoundException;
import java.io.FileReader;

public class CheckedAndUncheckedExceptions06 {

	public static void main(String[] args) throws FileNotFoundException {
		
		FileReader file = new FileReader("somefile.txt");
	}
	
}