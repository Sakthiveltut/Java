package com.leetcode.medium;

import java.util.Arrays;

public class Q189_Rotate_Array {

	public static void main(String[] args) {
		rotate(new int[] {1,2,3,4,5,6,7}, 3);
	}
	
    public static void rotate1(int[] nums, int k) {
        
    	for(int i=0;i<k;i++) {
    		for(int j=nums.length-1;j>0;j--) {
    			nums[j] = nums[j] + nums[j-1];
    			nums[j-1] = nums[j] - nums[j-1];
    			nums[j] = nums[j] - nums[j-1];
    		}
    	}    	
    }
    
    public static void rotate(int[] nums, int k) {
        k %= nums.length;        
        reverse(nums, 0, nums.length-1);
        reverse(nums, 0, k-1);
        reverse(nums, k, nums.length-1);
    }

    public static void reverse(int[] nums, int start, int end){
        while(start < end){
            int temp = nums[start];
            nums[start] = nums[end];
            nums[end] = temp;
            start++;
            end--;            
        }
    }

}
