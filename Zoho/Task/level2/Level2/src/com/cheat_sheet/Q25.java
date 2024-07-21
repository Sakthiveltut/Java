package com.cheat_sheet;

public class Q25 {
    public static void main(String[] args) {
        String S = "a!b$c#d@e";
        System.out.println(reverseStringKeepingSpecialChars(S));
    }

    public static String reverseStringKeepingSpecialChars(String S) {
        StringBuilder alphanumericChars = new StringBuilder();
        for (char c : S.toCharArray()) {
            if (Character.isLetterOrDigit(c)) {
                alphanumericChars.append(c);
            }
        }
        
        alphanumericChars.reverse();
        
        StringBuilder result = new StringBuilder();
        int index = 0;
        for (char c : S.toCharArray()) {
            if (Character.isLetterOrDigit(c)) {
                result.append(alphanumericChars.charAt(index++));
            } else {
                result.append(c);
            }
        }
        
        return result.toString();
    }
}

