package com.leetcode.medium;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class Q167TwoSumII_InputArrayIsSorted {

	public static void main(String[] args) {
		System.out.println(Arrays.toString(twoSum(new int[] {2,7,11,15}, 9)));
	}
	
    public static int[] twoSum1(int[] numbers, int target) {
        for(int i=0;i<numbers.length-1;i++){
            for(int j=i+1;j<numbers.length;j++){
                if(numbers[i]+numbers[j]==target){
                    return new int[]{i+1, j+1};
                }
            }
        }
        return null;
    }
    
    public static int[] twoSum(int[] nums, int target) {
    	int l = 0, r = nums.length - 1;
    	
    	while (nums[l] + nums[r] != target) {
    		if (nums[l] + nums[r] < target) l++;
    		else r--;
    	}

    	return new int[] {l+1, r+1};
    }
    
    public static int[] twoSum_hash2(int[] numbers, int target) {
        int len = numbers.length;
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < len; i++) {
            if (map.containsKey(target - numbers[i])) {
                return new int[]{map.get(target - numbers[i]), i + 1};
            }

            map.putIfAbsent(numbers[i], i + 1);
        }

        return new int[0];
    }

}
