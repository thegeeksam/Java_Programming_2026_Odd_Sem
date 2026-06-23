/**
 * * This file is part of the Java Programming Lecture project.
 * *
 * * Java packages are foundational elements for organizing code
 * * into coherent and manageable structures
 * *
 * * It helps organize your code into logical units,
 * * makes large codebases easier to navigate, 
 * * and prevents naming conflicts by isolating 
 * * class names within distinct hierarchies
 * *
 * @package II_Unit.Polymorphism
 * @author Dr. S. Sampath Kumar
 * @since 24-08-2025
 * @version 1.0
 */

package II_Unit.Packages;
// import II_Unit.Packages.MyPack.ClassD;

public class MultiLevel{
    public static void main(String args[]){
         ClassD cse = new ClassD();
         cse.displayA();
         cse.displayB();
         cse.displayC();
         cse.displayD();
    }
    public void show(){
        System.out.println("Welcome to Java Session!");
    }
}

/*
javac MyPackageClass.java
javac -d . MyPackageClass.java
java mypack.MyPackageClass
*/