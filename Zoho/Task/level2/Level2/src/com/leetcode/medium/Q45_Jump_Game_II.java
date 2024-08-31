package com.leetcode.medium;

public class Q45_Jump_Game_II {

	public static void main(String[] args) {
		System.out.println(jump(new int[] {2,3,1,1,4}));
		//System.out.println(jump(new int[] {3,2,1,0,4}));
		//System.out.println(jump(new int[] {1}));
		//System.out.println(jump(new int[] {2, 0}));
		//System.out.println(jump(new int[] {2, 5, 0, 0}));
		//System.out.println(jump(new int[] {0, 1}));
		//System.out.println(jump(new int[] {1, 2}));
		//System.out.println(jump(new int[] {2,0,2}));
	}
	
    public static int jump(int[] nums) {
    	int count=0, max=0, tempMax=0;
    	
    	for(int i=0;i<nums.length;i++) {
    		
    		max = Math.max(max, i+nums[i]);
    		
    		if(max>=nums.length-1) {
    			count++;
    			break;
    		}
    		
    		if(tempMax==i) {
    			count++;
    			tempMax = max;
    		}
    	}
    	
    	return count;
    }

}
