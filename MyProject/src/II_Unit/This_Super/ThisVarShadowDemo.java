/**
 * * This file is part of the Java Programming Lecture project.
 * *
 * * -----> Resolving Variable Shadowing <------
 * * It demonstrates the concept of `this` keyword in Java.
 * *
 * * Variable shadowing occurs when a local variable or parameter 
 * * in a method or constructor has the same name as an instance 
 * * variable (or field) of the class. The local variable "shadows" 
 * * or hides the instance variable within that scope.

 * * The `this` keyword is a reference to the current object.
 * * It can be used to access instance variables and methods 
 * * of the current object.
 * *
 * @package II_Unit.This_Super
 * @author Dr. S. Sampath Kumar
 * @since 03-08-2025
 * @version 1.0
 */
package II_Unit.This_Super;

class Code {
    int value = 10;
    Code(){
    }

    Code(int value) {
        // value = value; // Variable Shadowing
        // this.value refers to instance variable
        // value refers to parameter
        this.value = value;          
    }

    void print() {
        System.out.println("Value of Current instance Variable : " + value);
    }
}

public class ThisVarShadowDemo {
    public static void main(String[] args) {
        // creating an instance of Illustration class
        Code obj = new Code(20);
        obj.print();
        Code obj1 = new Code();
        obj1.print();
    }
}