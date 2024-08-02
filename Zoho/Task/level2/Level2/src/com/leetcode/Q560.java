package com.leetcode;

public class Q560 {

	public static void main(String[] args) {
		int[] nums = {1,-1,0};
		System.out.println(subarraySum(nums, 0));
	}
	
    public static int subarraySum(int[] nums, int k) {
        int result=0, count=0;
        for(int i=0;i<nums.length;i++){
            for(int j=i;j<nums.length;j++){
                result+=nums[j];
                if(result==k){
                    count++;
                }
                if(j==nums.length-1) {
                	result=0;
                }
            }
        }
        return count;
    }

}
