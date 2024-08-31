package com.leetcode.easy;

import java.util.Arrays;

public class Q169_Majority_Element {

	public static void main(String[] args) {
		System.out.println(majorityElement(new int[] {2,2,1,1,1,2,2}));
	}
	
    public static int majorityElement(int[] nums) {
    	Arrays.sort(nums);
        int n = nums.length;
        System.out.println(Arrays.toString(nums));
        return nums[n/2]; 	
    }

}
