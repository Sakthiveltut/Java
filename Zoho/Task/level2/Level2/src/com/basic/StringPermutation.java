package com.basic;

public class StringPermutation {

    public static void main(String[] args) {
        String str = "ABC";
        generatePermutations(str, "");
    }

    private static void generatePermutations(String str, String currentPermutation) {
        // Base case: If the original string is empty, print the current permutation
        if (str.isEmpty()) {
            System.out.println(currentPermutation);
            return;
        }

        // Recursive case: Generate all permutations by fixing each character
        for (int i = 0; i < str.length(); i++) {
            // Choose the current character
            char chosenChar = str.charAt(i);
            // Form the remaining string without the chosen character
            String remainingStr = str.substring(0, i) + str.substring(i + 1);
            // Recurse to generate permutations with the chosen character added
            generatePermutations(remainingStr, currentPermutation + chosenChar);
        }
    }
}

