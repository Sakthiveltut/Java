package com.basic;

import java.util.ArrayList;
import java.util.List;

public class ListCombination {

    public static void main(String[] args) {
        int[] nums = {10,1,2,7,6,1,5};
        
        List<Integer> currentCombination = new ArrayList<>();
        List<List<Integer>> result = new ArrayList<>();
        generateCombinations(nums, 0, currentCombination);
        System.out.println(result);
        
        System.out.println(getCombinations(nums));
    }

    private static void generateCombinations(int[] nums, int index, List<Integer> currentCombination) {
        System.out.println(currentCombination);
                
        // Iterate through the remaining elements
        for (int i = index; i < nums.length; i++) {
            // Include the current element in the combination
            currentCombination.add(nums[i]);
            // Recurse to generate further combinations including this element
            generateCombinations(nums, i + 1, currentCombination);
            // Backtrack and remove the element from the combination
            currentCombination.remove(currentCombination.size() - 1);
        }
    }
    
    public static List<List<Integer>> getCombinations(int[] nums) {
        List<List<Integer>> combinations = new ArrayList<>();
        combinations.add(new ArrayList<>()); 

        for (int num : nums) {
            int n = combinations.size();
            for (int i = 0; i < n; i++) {
                List<Integer> newCombination = new ArrayList<>(combinations.get(i));
                newCombination.add(num);
                combinations.add(newCombination);
            }
        }
        return combinations;
    }
    
}

