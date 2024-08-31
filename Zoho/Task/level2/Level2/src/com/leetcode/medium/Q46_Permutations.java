package com.leetcode.medium;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Q46_Permutations {

	public static void main(String[] args) {
		List<List<Integer>> result = new ArrayList<List<Integer>>();
		System.out.println(permute(new int[] {1,2,3}, result, new ArrayList<>()));
	}
	
    public static List<List<Integer>> permute(int[] nums, List<List<Integer>> result, List<Integer> list) {
    	if(list.size()==nums.length)
    		result.add(new ArrayList<>(list));
    	else {
	        for(int i=0;i<nums.length;i++) {
	        	list.add(nums[i]);
	        	permute(nums, result, list);
	        	list.remove(list.size()-1);
	        }
    	}
    	return result;
    }
}
