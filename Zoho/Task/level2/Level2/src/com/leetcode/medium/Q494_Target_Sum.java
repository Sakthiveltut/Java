package com.leetcode.medium;

public abstract class Q494_Target_Sum {

	public static void main(String[] args) {
		/*System.out.println(findTargetSumWays(new int[] {1,1,1,1,1}, 3)); //5
		System.out.println(findTargetSumWays(new int[] {1}, 1)); //1
		System.out.println(findTargetSumWays(new int[] {1}, 2)); //0*/
		System.out.println(findTargetSumWays(new int[] {1, 0}, 1)); //2
		System.out.println(findTargetSumWays(new int[] {1000}, -1000)); //1
		System.out.println(findTargetSumWays(new int[] {0,0,0,0,0,0,0,0,1}, 1)); //256
		
	}
	
    public static int findTargetSumWays(int[] nums, int target) {
    	if(nums.length==1) {
    		if(nums[0]==Math.abs(target)) return 1;
    		else return 0;
    	}
    	int count = 0, sum = 0;
        for(int i=0;i<nums.length;i++) {
        	int result = 0;        	
        	for(int j=0;j<nums.length;j++) {
        		int value = nums[j];
        		if(i==j) value = nums[i]-(nums[i]+nums[i]);
        		result+=value;
        	}
        	if(result==target) count++;
        	sum+=nums[i];
        	if(i==nums.length-1 && sum==target) count++;
        }
    	return count;
    }

}
