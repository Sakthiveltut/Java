package com.leetcode.medium;

import java.util.Arrays;

public class Q80_Remove_Duplicates_From_Sorted_Array_II {

	public static void main(String[] args) {
		//System.out.println(removeDuplicates(new int[] {1,1,1,2,2,3}));
		System.out.println(removeDuplicates(new int[] {0,0,1,1,1,1,2,3,3}));
	}
	
	public static int removeDuplicates(int[] nums) {
	    int i = 0;
	    for (int n : nums)
	        if (i < 2 || n > nums[i-2])
	            nums[i++] = n;
		System.out.println(Arrays.toString(nums));
	    return i;
	}
	
    public static int removeDuplicates1(int[] nums) {
        int length = nums.length;
    	for(int i=0;i<length-1;i++) {
    		if(nums[i]==nums[i+1]) {
    			int index = i+2;
    			while(nums[i]==nums[index]) {
					changePosition(index, nums);
					index++;
					length--;
    			}
    			i = index;
    		}else {
    			changePosition(i, nums);
    			i--;
    			length--;
    		}
    		System.out.println(Arrays.toString(nums));
    	}
    	return length;
    }
    
    public static int removeDuplicates2(int[] nums) {
        int length = nums.length;
    	for(int i=0;i<length-1;i++) {
			if(nums[i]==nums[i+1]) {
				i++;
			}else {
				changePosition(i, nums);
				length--;
				int index = i;
				while(nums[i]==nums[index]) {
					changePosition(index, nums);
					length--;	
					index++;
				}
				i=index;
			}
    		System.out.println(Arrays.toString(nums));
    	}
    	return length;
    }
    
    private static void changePosition(int startIndex, int[] nums) {
    	for(int i=startIndex;i<nums.length-1;i++) {
    		nums[i] = nums[i] + nums[i+1];
    		nums[i+1] = nums[i] - nums[i+1];
    		nums[i] = nums[i] - nums[i+1];
    	}
    }
}
