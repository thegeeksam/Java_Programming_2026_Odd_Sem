/**
 * * This file is part of the Java Programming Lecture project.
 * *
 * * I created this file to do some testing with Java packages.
 * * Ignore this file
 * *
 * @package II_Unit.Polymorphism
 * @author Dr. S. Sampath Kumar
 * @since 24-08-2025
 * @version 1.0
 */

package II_Unit.Packages;
import II_Unit.Packages.MyPack.*;


class Chumma {
  public static void main(String[] args) {
    System.out.println("This is my package!");
    ClassD cse = new ClassD();
    MultiLevel ml = new MultiLevel();
    ml.show();
    cse.displayA();
    cse.displayB();
    cse.displayC();
    cse.displayD();
  }
}