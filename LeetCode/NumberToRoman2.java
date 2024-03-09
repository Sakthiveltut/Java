package LeetCode;

import java.util.HashMap;

public class NumberToRoman2 {

  public static int romanToInt(String s) {
    // Create a HashMap to store the values of Roman numerals
    HashMap<Character, Integer> romanMap = new HashMap<>();
    romanMap.put('I', 1);
    romanMap.put('V', 5);
    romanMap.put('X', 10);
    romanMap.put('L', 50);
    romanMap.put('C', 100);
    romanMap.put('D', 500);
    romanMap.put('M', 1000);

    int result = 0;

    for (int i = 0; i < s.length(); i++) {
      int currentVal = romanMap.get(s.charAt(i));

      // Check if the current value is smaller than the next value
      if (i < s.length() - 1 && currentVal < romanMap.get(s.charAt(i + 1))) {
        result -= currentVal;
      } else {
        result += currentVal;
      }
    }

    return result;
  }

  public static void main(String[] args) {
    String romanNumeral = "IVIVXIX";
    int result = romanToInt(romanNumeral);
    System.out.println("Input: " + romanNumeral);
    System.out.println("Output: " + result);
  }
}
