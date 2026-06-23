package A_Boot_Camp.Day3;
class Book {
    String title;

    Book(String title) {
        this.title = title;
    }
}
class Student {
    String name;
    Book book;

    // Constructor
    Student(String name, Book book) {
        this.name = name;
        this.book = book;
    }

    // Shallow Copy Constructor
    Student(Student s) {
        this.name = s.name;
        this.book = s.book;  // Only reference is copied
    }

    void display() {
        System.out.println(name + " owns " + book.title);
    }

    public static void main(String[] args) {
        Book b1 = new Book("Java Basics");
        Student s1 = new Student("Sampath", b1);
        Student s2 = new Student(s1);  // Shallow copy

        s2.book.title = "Python Basics";  // Changing s2's book title

        s1.display();  // Affected!
        s2.display();
    }
}