package com.leetcode;

public class Q724 {
	
	public static void main(String[] args) {
		int[] arr = {1,7,3,6,5,6};
		System.out.println(pivotIndex(arr));
	}

    public static int pivotIndex(int[] nums) {
        int totalSum = 0;
        int leftsum = 0;
        for (int ele : nums)
            totalSum += ele;
        System.out.println(totalSum);
        for (int i = 0; i < nums.length; leftsum += nums[i++]) {
        	System.out.println(leftsum+" "+(leftsum * 2) +" "+(totalSum - nums[i]));
            if (leftsum * 2 == totalSum - nums[i])
                return i; 
        }
        return -1;    
    }
	
}
