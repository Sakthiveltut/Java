package com.basic;

import java.util.ArrayList;
import java.util.List;

public class StringCombination1 {

    public static void main(String[] args) {
        String str = "ABC";
        List<String> result = new ArrayList<>();
        generateCombinations(str, 0, "", result);
        System.out.println(result);
    }

    private static void generateCombinations(String str, int index, String currentCombination, List<String> result) {
        result.add(currentCombination);
        
        for (int i = index; i < str.length(); i++) {
            generateCombinations(str, i + 1, currentCombination + str.charAt(i), result);
        }
    }
}
