package A_JAVA_FDP.Day1;

// Parent class Animal -> Multiple Inheritance with Interfaces
// This class represents a generic Animal with a method to eat.
class Animal {
    void eat() {
        System.out.println("Animal is eating!");
    }
}

// interface 1
interface Run {
    void run();
}

// interface 2
interface Bark {
    void bark();
}

// interface 3
interface Sleep {
    void sleep();
}

class Dog extends Animal implements Run, Bark, Sleep {

    void eat() {
        System.out.println("Dog is eating!");
    }

    @Override
    public void run() {
        System.out.println("Dog is running!");
    }

    @Override
    public void bark() {
        System.out.println("Dog is barking!");
    }

    @Override
    public void sleep() {
        System.out.println("Dog is Sleeping");
    }

    void Details() {
        System.out.println("This is a Dog class that extends Animal and implements Run and Bark interfaces.");
        System.out.println("Dog Details: ");
        System.out.println("Animal Type: Dog");
        System.out.println("Can Run: Yes");
        System.out.println("Can Bark: Yes");
    }
}

public class SingleInheritanceDemo {
    public static void main(String[] args) {
        Dog dog = new Dog();
        dog.eat(); // Calling method from Animal class
        dog.run(); // Calling method from Run interface
        dog.bark(); // Calling method from Bark interface
        dog.sleep(); // Calling method from Sleep interface
        // dog.Details(); // Displaying details of the Dog class
        Animal An = new Animal();
        An.eat(); // Calling method from Animal class
        // Dog d = new Animal(); // will throw error

    }
}