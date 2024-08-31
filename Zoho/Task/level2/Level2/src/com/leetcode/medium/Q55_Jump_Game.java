package com.leetcode.medium;

public class Q55_Jump_Game {

	public static void main(String[] args) {
		//System.out.println(canJump(new int[] {2,3,1,1,4}));
		//System.out.println(canJump(new int[] {3,2,1,0,4}));
		//System.out.println(canJump(new int[] {1}));
		//System.out.println(canJump(new int[] {2, 0}));
		//System.out.println(canJump(new int[] {2, 5, 0, 0}));
		//System.out.println(canJump(new int[] {0, 1}));
		//System.out.println(canJump(new int[] {1, 2}));
		System.out.println(canJump(new int[] {2,0,2}));
	}
	
    public static boolean canJump1(int[] nums) {
    	
    	int max = nums[0];
    	
    	for(int i=0;i<nums.length;i++) {
    		max--;
    		
    		if(i==nums.length-1) return true;
    		if(max<nums[i]) max = nums[i];
    	}
    	
    	return true;
    }
    
    public static boolean canJump(int[] nums) {
    	
    	int max = 0, i=0;
    	while(i<nums.length) {
    		
    		max = Math.max(max, i+nums[i]);
    		
    		if(max>=nums.length-1) return true;
    		if(i==max) return false;
    		
    		i++;
    	}
    	return false;
    }
    
}
