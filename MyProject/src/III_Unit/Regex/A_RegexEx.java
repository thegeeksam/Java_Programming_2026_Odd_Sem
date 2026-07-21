/**
 * * This file is part of the Java Programming Lecture project.
 * *
 * * This Java snippet illustrates:
 * * - Pattern → Compiles the regular expression.
 * * - Matcher → Applies the pattern to the input.
 * * 
 * @package III_Unit.Regex
 * @author Dr. S. Sampath Kumar
 * @since 21-07-2026
 * @version 1.0
 */
package III_Unit.Regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class A_RegexEx {
    public static void main(String[] args) {
        Pattern objPattern = Pattern.compile("Java");
        Matcher objMatcher = objPattern.matcher("Java");

        System.out.println(objMatcher.matches());

        // shortcut
        System.out.println(Pattern.matches("Java", "Java"));
    }
}
