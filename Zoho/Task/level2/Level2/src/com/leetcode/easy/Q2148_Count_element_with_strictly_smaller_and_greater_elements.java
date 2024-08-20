package com.leetcode.easy;

import java.util.Arrays;

public class Q2148_Count_element_with_strictly_smaller_and_greater_elements {

	public static void main(String[] args) {
		System.out.println(countElements(new int[] {11,7,2,15}));
	}
	
    public static int countElements1(int[] nums) {
        int result = 0;
        for(int i=0;i<nums.length;i++){
        boolean hasSmaller=false, hasGreater=false;
            for(int j=0;j<nums.length;j++){
                if(i!=j){
                    if(nums[i]>nums[j]){
                        hasSmaller = true;
                    }
                    if(nums[i]<nums[j]){
                        hasGreater = true;
                    }
                }
            }
            if(hasSmaller && hasGreater){
                result++;
            }
        }
        return result;
    }
    
    public static int countElements(int[] nums) {

        Arrays.sort(nums);
        int k = 0;
        for(int i=1;i< nums.length-1;i++) {
            if(nums[i] > nums[0] && nums[i] < nums[nums.length-1]) k++;
        }
        return k;
    }

}
