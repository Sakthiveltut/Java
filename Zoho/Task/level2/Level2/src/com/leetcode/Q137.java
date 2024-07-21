package com.leetcode;

import java.util.HashMap;
import java.util.Map;

public class Q137 {
	
	/* Single Number II	
	 * Given an integer array nums where every element appears three times except
	 * for one, which appears exactly once. Find the single element and return it.
	 * 
	 * You must implement a solution with a linear runtime complexity and use only
	 * constant extra space.
	 * 
	 * 
	 * 
	 * Example 1:
	 * 
	 * Input: nums = [2,2,3,2] Output: 3 Example 2:
	 * 
	 * Input: nums = [0,1,0,1,0,1,99] Output: 99
	 */
	
	public static void main(String[] args) {
		int nums[] = {0,1,0,1,0,1,99};
		System.out.println(singleNumber(nums));
	}
	
    public static int singleNumber(int[] nums) {
        Map<Integer,Integer> map = new HashMap<>();
        for(int value:nums){
            if(map.containsKey(value)){
                map.put(value,map.get(value)+1);
            }else{
                map.put(value,1);
            }
        }
        for(Map.Entry<Integer,Integer> entry : map.entrySet()){
            if(entry.getValue()==1){
                return entry.getKey();
            }
        }
        return -1;
    }

}
