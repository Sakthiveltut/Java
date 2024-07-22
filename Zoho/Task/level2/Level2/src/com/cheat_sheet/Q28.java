package com.cheat_sheet;

import java.util.HashSet;

public class Q28 {
    public static boolean hasPairWithSum(int[] arr, int x) {
        HashSet<Integer> seen = new HashSet<>();
        for (int num : arr) {
            int complement = x - num;
            if (seen.contains(complement)) {
                return true;
            }
            seen.add(num);
        }
        return false;
    }

    public static void main(String[] args) {
        int[] arr = {10, 7, 15, 3};
        int x = 17;
        boolean result = hasPairWithSum(arr, x);
        System.out.println(result);
    }
}