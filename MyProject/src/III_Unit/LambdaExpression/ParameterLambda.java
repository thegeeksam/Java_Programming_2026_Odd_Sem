/**
 * * This file is part of the Java Programming Lecture project.
 * *
 * * This Java snippet illustrates:
 * * - Single parameter and multiple parameters in lambda expression
 * * - Return keyword in lambda expression
 * * - Omission of parentheses in single parameter lambda expression
 * * - Omission of curly braces and return keyword in single statement lambda expression
 * * 
 * * >>> parameter in lambda expression <<<
 * * A lambda expression can have zero or more parameters.
 * * A parameter can be of any type including user-defined types.
 * *
 * *
 * @package III_Unit.LambdaExpression;
 * @author Dr. S. Sampath Kumar
 * @since 11-09-2025
 * @version 2.0
 */
package III_Unit.LambdaExpression;

//------> Lambda Example 2: parameter <------
interface Greetings {
    public String say(String name);
}

interface Addition {
    int add(int a, int b);
}

public class ParameterLambda {
    public static void main(String[] args) {

        // ---> single parameter <-----

        // Lambda expression with single parameter
        // with return Statement along with curly braces
        Greetings s1 = (name) -> {
            return "Hello, " + name;
        };

        System.out.println(s1.say("Rahul"));

        // Omit function parentheses
        // with return Statement along with curly braces
        Greetings s2 = name -> {
            return "Hello, " + name;
        };

        System.out.println(s2.say("Sakthivel"));

        // omit the return statement and curly brackets,
        // because it has only one statement in the function body

        Greetings s3 = name -> "Hello, " + name;

        System.out.println(s3.say("Srini"));

        // ---> multiple parameter <-----

        // Lambda expression with multiple parameters
        // with return Statement along with curly braces
        Addition ad1 = (a, b) -> {
            return a + b;
        };

        System.out.println(ad1.add(12, 34));
        // without return Statement and curly braces
        Addition ad2 = (a, b) -> a + b;

        System.out.println(ad2.add(56, 78));
    }
}
