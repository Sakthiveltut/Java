package com.leetcode.medium;

public class Q3152_Special_Array_ii {

	public static void main(String[] args) {
		System.out.println(isArraySpecial(new int[] {3,4,1,2,6}, new int[][] {{0,4}}));
	}
	
    public static boolean[] isArraySpecial(int[] nums, int[][] queries) {
        boolean[] result = new boolean[queries.length];
    	boolean value = nums[0]%2==1;
        for(int i=0;i<queries.length;i++) {
            for(int j=queries[i][0];j<queries[i][1];j++) {
            	
        		value = !value;
            }
        }
		return result;
    }
    
}
