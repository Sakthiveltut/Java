package com.leetcode.medium;

import java.util.Arrays;

public class Q1838FrequencyOfTheMostFrequentElement {

	public static void main(String[] args) {
		//System.out.println(maxFrequency(new int[] {1,4,8,13}, 5));
		System.out.println(maxFrequency(new int[] {1,2,4}, 5));
	}
	
    public static int maxFrequency1(int[] nums, int k) {
    	Arrays.sort(nums);
    	int result = 0;
        for(int i=nums.length-1;i>0;i--){
            for(int j=i-1;j>0;j--){
            	result += nums[i]-nums[j-1];
            	System.out.println(result);
                if(result==k) {
                	return nums.length-i+1;
                }
            }
        }
        return 0;
    }
    
    public static int maxFrequency(int[] A, int k) {
        int res = 1, i = 0, j;
        long sum = 0;
        Arrays.sort(A);
        for (j = 0; j < A.length; ++j) {
            sum += A[j];
            while (sum + k < (long)A[j] * (j - i + 1)) {
                sum -= A[i];
                i += 1;
            }
            res = Math.max(res, j - i + 1);
        }
        return res;
    }

}
