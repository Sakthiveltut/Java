package com.leetcode;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class Q17 {

	public static void main(String[] args) {
		System.out.println(letterCombinations("23"));
	}
	
    public static List<String> letterCombinations1(String digits) {
        if (digits.isEmpty()) return Collections.emptyList();
        String[] phone_map = {"abc", "def", "ghi", "jkl", "mno", "pqrs", "tuv", "wxyz"};
        List<String> output = new ArrayList<>();
        backtrack("", digits, phone_map, output);
        return output;
    }

    private static void backtrack(String combination, String next_digits, String[] phone_map, List<String> output) {
        if (next_digits.isEmpty()) {
            output.add(combination);
            System.out.println(output);
        } else {
            String letters = phone_map[next_digits.charAt(0) - '2'];
            for (char letter : letters.toCharArray()) {
                backtrack(combination + letter, next_digits.substring(1), phone_map, output);
            }
        }
    }
    
    public static List<String> letterCombinations(String digits) {
        if (digits.isEmpty()) return Collections.emptyList();
        
        String[] phone_map = {"abc", "def", "ghi", "jkl", "mno", "pqrs", "tuv", "wxyz"};
        Queue<String> queue = new LinkedList<>();
        queue.add("");

        for (char digit : digits.toCharArray()) {
            int digitIndex = digit - '2';
            String letters = phone_map[digitIndex];
            
            int size = queue.size();
            for (int i = 0; i < size; i++) {
                String combination = queue.poll();
                for (char letter : letters.toCharArray()) {
                    queue.add(combination + letter);
                    System.out.println(queue);
                }
            }
        }
        return new ArrayList<>(queue);
    }

}
