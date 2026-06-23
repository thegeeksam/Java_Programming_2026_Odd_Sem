/**
 * * This file is part of the Java Programming Lecture project.
 * * 
 * * Encapsulation - Data (author, title, id) is hidden inside the class and accessed via methods
 * * Accessors - getTitle(), getAuthor() allow controlled access (retrieve private data)
 * * Mutators - setTitle() and setAuthor() allow controlled modification (modify private data)
 * *
 * * This Java snippet illustrates:
 * * - Defines a class Book with three private fields: author, title, and id
 * * - Provides public getter and setter methods for each field
 * * - In the Main class, creates two Book objects, sets their values, 
 * *   and prints them using accessors
 * *
 * @package II_Unit.Encapsulation;
 * @author Dr. S. Sampath Kumar
 * @since 21-08-2025
 * @version 1.0
 */

package II_Unit.Encapsulation;
class Book {
	//private fields
	private String author;
	private String title;
	private int id;
	//public getter and setter  methods for each field
	public String getAuthor() {
		return author;
	}
	public void setAuthor(String a) {
		author = a;
	}
		
	public void setTitle(String t) {
		title = t;
	}
	public String getTitle() {
		return title;
	}
		
	public void setId(int i) {
		id = i;
	}
	public int getId() {
		return id;
	}
}

public class GetterSetter {
	public static void main(String[] args) {
		Book newObj = new Book();
        Book newObj1 = new Book();
		newObj.setAuthor("Daniel Liang L");
		newObj.setTitle("Introduction to Java Programming");
		newObj.setId(001);

		newObj1.setAuthor("Herbert");
		newObj1.setTitle("Core Java: The Complete Reference");
		newObj1.setId(002);
		
		System.out.println("Book Title: " + newObj.getTitle() +
		"\nBook Author: " + newObj.getAuthor() +
		"\nBook Id: " + newObj.getId());
		
		System.out.println("Book Title: " + newObj1.getTitle() +
		"\nBook Author: " + newObj1.getAuthor() +
		"\nBook Id: " + newObj1.getId());
	}
}