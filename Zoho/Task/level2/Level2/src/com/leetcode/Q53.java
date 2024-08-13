package com.leetcode;

public class Q53 {

	public static void main(String[] args) {
		System.out.println(maxSubArray(new int[]{-2,1,-3,4,-1,2,1,-5,4}));
	}
    
    public static int maxSubArray(int[] nums) {
    	int sum=0, max=Integer.MIN_VALUE;
    	int startIndex = 0, endIndex = 0, tempStartIndex=0;
    	for(int i=0;i<nums.length;i++) {
    		if(sum==0) {
    			tempStartIndex = i;
    		}
    		sum+=nums[i];
    		
    		if(max<sum) {
    			max=sum;
    			startIndex = tempStartIndex;
    			endIndex = i;
    		}
    		if(sum<0) sum=0;
    	}
    	System.out.println("start "+startIndex+" end "+endIndex);
		return max;
    }
}
