package Interview.zoho.Difficult;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

//for (int i = 0; i < 10 i++) { ; }
//Invalid code 2: false

public class qs5 {

  private static final Pattern FOR_LOOP_PATTERN = Pattern.compile(
    "^\\s*for\\s*\\([^;]*;[^;]*;[^)]*\\)\\s*\\{.*}$",
    Pattern.MULTILINE
  );

  public static void main(String[] args) {
    String validCode = "for (int i = 0; i < 10; i++) { System.out.println(i); }";
    String invalidCode1 = "for (i = 0; i < 10; i++);"; // Missing parentheses around initialization
    String invalidCode2 = "for (int i = 0; i < 10 i++) { ; }"; // Typo in condition
    String invalidCode3 = "for (int i = 0; i < 10; i) { ; }"; // Missing curly brace

    System.out.println("Valid code: " + isValidForLoop(validCode));
    System.out.println("Invalid code 1: " + isValidForLoop(invalidCode1));
    System.out.println("Invalid code 2: " + isValidForLoop(invalidCode2));
    System.out.println("Invalid code 3: " + isValidForLoop(invalidCode3));
  }

  private static boolean isValidForLoop(String code) {
    Matcher matcher = FOR_LOOP_PATTERN.matcher(code);
    return matcher.matches();
  }
}
