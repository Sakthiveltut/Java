package com.cheat_sheet;

import java.util.HashSet;
import java.util.Set;

public class Q02 {
    public static void main(String[] args) {
        int[] nums = {123, 456, 789, 101}; 
        Set<Integer> distinctDigits = findDistinctDigits(nums);

        System.out.println("Distinct digits: " + distinctDigits);
    }

    public static Set<Integer> findDistinctDigits(int[] nums) {
        Set<Integer> distinctDigits = new HashSet<>();

        for (int num : nums) {
            while (num > 0) {
                int digit = num % 10; 
                distinctDigits.add(digit);
                num /= 10;
            }
        }

        return distinctDigits;
    }
}

