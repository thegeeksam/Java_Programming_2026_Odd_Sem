/**
 * * This file is part of the Java Programming Lecture project.
 * *
 * * Most Important Regex Symbols
 * *  - "." - Matches any character except a newline.
 * *  - "*" - Matches zero or more occurrences of the preceding element.
 * *  - "+" - Matches one or more occurrences of the preceding element.
 * *  - "?" - Matches zero or one occurrence of the preceding element.
 * *  - "^" - Matches the beginning of a line.
 * *  - "$" - Matches the end of a line.
 * *  - "[]" - Matches any one of the characters inside the brackets.
 * *  - "[^]" - Matches any one character not inside the brackets.
 * *  - "()" - Groups multiple tokens together and remembers the matched text.
 * *  - "|" - Acts as a logical OR between expressions.
 * *  - "\\" - Escapes a special character.
 * *  - "\\d" - Matches any digit (equivalent to [0-9]).
 * *  - "\\w" - Matches any word character (equivalent to [a-zA-Z0-9_]).
 * *  - "\\s" - Matches any whitespace character.
 * *
 * @package III_Unit.Regex
 * @author Dr. S. Sampath Kumar
 * @since 21-07-2026
 * @version 1.0
 */
package III_Unit.Regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegexDemo1 {
    public static void main(String[] args) {
        // Create a Pattern object
        // Pattern objPattern = Pattern.compile("Java");
        // // create matcher object
        // Matcher objMatcher = objPattern.matcher("Java");
        // 1. check for Exact String
        // System.out.println(objMatcher.matches());
        System.out.println(Pattern.matches("Java", "Java"));

        // 2. Check Only Digits
        System.out.println(Pattern.matches("\\d+", "12345"));
        System.out.println(Pattern.matches("\\d+", "12A45"));

        // 3. Check Only Alphabets
        System.out.println(Pattern.matches("[a-zA-Z]+", "Java"));
        System.out.println(Pattern.matches("[a-zA-Z]+", "Java123"));

        // 4. Validate Mobile Number
        String sMobile = "9876543210";
        System.out.println(Pattern.matches("[6-9]\\d{9}", sMobile));

        // 5. Validate Email Address
        String sEmail = "user@example.com";
        System.out.println(Pattern.matches("[a-zA-Z0-9._]+@[a-zA-Z]+\\.com", sEmail));

        // 6. Validate PIN Code
        String sPinCode = "641202";
        System.out.println(Pattern.matches("\\d{6}", sPinCode));

        // 7. Validate Date in DD/MM/YYYY format
        String sDate = "21/07/2026";
        System.out.println(Pattern.matches("\\d{2}/\\d{2}/\\d{4}", sDate));

        // 8. Validate Time in HH:MM format
        String sTime = "14:30";
        System.out.println(Pattern.matches("\\d{2}:\\d{2}", sTime));

        // 9. Find Word Inside Sentence
        Pattern objPattern1 = Pattern.compile("Java");
        Matcher objMatcher1 = objPattern1.matcher("I Love Java Programming");
        System.out.println(objMatcher1.find());

        // 10. Check Name Starts with A
        String sName = "Alice";
        System.out.println(Pattern.matches("A.*", sName));
        System.out.println(Pattern.matches("A.*", "Arun"));
        System.out.println(Pattern.matches("A.*", "Kumar"));

        // 11. Check Name Ends with n
        System.out.println(Pattern.matches(".*n", "Arun"));
        System.out.println(Pattern.matches(".*n", "Kumar"));

        // 12. Check Name Contains 'a'
        System.out.println(Pattern.matches(".*a.*", "Arun"));
        System.out.println(Pattern.matches(".*a.*", "Kumar"));

        // 13. Check Name Contains 'a' or 'e'
        System.out.println(Pattern.matches(".*[ae].*", "Arun"));
        System.out.println(Pattern.matches(".*[ae].*", "Kumar"));

        // 14. Check Register Number
        String sRegNo = "23CS001";

        System.out.println(Pattern.matches("\\d{2}[A-Z]{2}\\d{3}", sRegNo));

        // 15. Check Vehicle Number
        String sVehicleNo = "TN12AB1234";
        System.out.println(Pattern.matches("[A-Z]{2}\\d{2}[A-Z]{2}\\d{4}", sVehicleNo));

        // 16. Check if a String contains only vowels

    }
}