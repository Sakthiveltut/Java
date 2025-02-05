package com.leetcode.easy;

public class Q35_Search_Insert_Position {

	public static void main(String[] args) {
		System.out.println(searchInsert(new int[]{1,3}, 2));
	}
	
    public static int searchInsert(int[] nums, int target) {
    	int size = nums.length;
        for(int i=0;i<size;i++){
            if(nums[i]==target){
                return i;
            }
        }
        
        if(nums[0]>target) {
        	return 0;
        }else if(nums[size-1]<target) {
        	return size;
        }else {
	        for(int i=0;i<nums.length;i++){
	            if(nums[i]>target){
	                return i;
	            }
	        }
        }
        return 0;
    }
    
    public int searchInsert1(int[] nums, int target) {
        int left = 0;
        int right = nums.length - 1;

        while (left <= right) {
            int mid = left + (right - left) / 2;

            if (nums[mid] == target) {
                return mid;
            } else if (nums[mid] > target) {
                right = mid - 1;
            } else {
                left = mid + 1;
            }
        }

        return left;        
    }
}