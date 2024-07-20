package com.cheat_sheet;

import java.util.*;

public class Q04 {
    public static void main(String[] args) {
        int amount = 2456; 
        int[] denominations = {2000, 500, 200, 100, 50, 20, 10, 5, 2, 1};

        Map<Integer, Integer> result = findMinimumNotes(amount, denominations);

        System.out.println("Minimum number of notes required: " + result.size());
        for (Map.Entry<Integer, Integer> entry : result.entrySet()) {
            System.out.println("Denomination: " + entry.getKey() + ", Notes: " + entry.getValue());
        }
    }

    public static Map<Integer, Integer> findMinimumNotes(int amount, int[] denominations) {
        Map<Integer, Integer> notesCount = new LinkedHashMap<>();
        
        for (int denomination : denominations) {
            if (amount == 0) break;
            if (denomination <= amount) {
                int count = amount / denomination; 
                notesCount.put(denomination, count); 
                amount %= denomination;
            }
        }
        
        return notesCount;
    }
}

