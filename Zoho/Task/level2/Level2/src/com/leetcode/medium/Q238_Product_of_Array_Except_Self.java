package com.leetcode.medium;

import java.util.Arrays;

public class Q238_Product_of_Array_Except_Self {

	public static void main(String[] args) {
		System.out.println(productExceptSelf(new int[] {1,2,3,4}));
	}
	
    public static int[] productExceptSelf(int[] nums) {
        int length = nums.length;
    	int[] result = new int[length];
    	int mul = 1;
    	result[0] = 1;
    	for(int i=1;i<length;i++) {
    		mul = mul*nums[i-1];
    		result[i] = mul;
    	}
    	mul = 1;
    	for(int i=length-1;i>0;i--) {
    		mul = nums[i]*mul;
    		result[i-1] *= mul;
    	}
    	//System.out.println(Arrays.toString(result));
    	
    	return result;
    }

}
