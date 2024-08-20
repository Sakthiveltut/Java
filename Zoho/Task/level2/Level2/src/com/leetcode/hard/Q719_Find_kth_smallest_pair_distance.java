package com.leetcode.hard;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class Q719_Find_kth_smallest_pair_distance {

	public static void main(String[] args) {
		System.out.println(smallestDistancePair(new int[] {1,3,1}, 1));
		//System.out.println(smallestDistancePair(new int[] {1,3,1}, 1));
	}

	public static int smallestDistancePair(int[] nums, int k) {
        Arrays.sort(nums);
        System.out.println(Arrays.toString(nums));
        int arr []= new int[nums[nums.length-1]+1];
        System.out.println("length"+arr.length);
        for(int i=0;i<nums.length;i++){
            for(int j=i+1;j<nums.length;j++){
                arr[nums[j]-nums[i]]++;
                System.out.println(Arrays.toString(arr));
            }
        }
        for(int i=0;i<arr.length;i++){
            if(arr[i]>0)k=k-arr[i];
            if(k<=0)return i;
        }
        return -1;
    }

    public static int smallestDistancePair1(int[] nums, int k) {
        
    	ArrayList<Integer> list = new ArrayList<>();
    	for(int i=0;i<nums.length;i++) {
    		for(int j=i+1;j<nums.length;j++) {
    			list.add(Math.abs(nums[i]-nums[j]));
    		}
    	}
    	Collections.sort(list);
    	System.out.println(list);
    	return list.get(k-1);
    }
	
}
