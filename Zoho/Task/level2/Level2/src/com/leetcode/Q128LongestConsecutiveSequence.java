package com.leetcode;

import java.util.Arrays;
import java.util.Set;
import java.util.TreeSet;

public class Q128LongestConsecutiveSequence {

	public static void main(String[] args) {
		System.out.println(longestConsecutive(new int[] {9,1,4,7,3,-1,0,5,8,-1,6}));
	}
	
	public static int longestConsecutive(int[] nums) {
        if(nums.length==0) return 0;
		TreeSet<Integer> treeSet = new TreeSet<>();
		
		for(int num: nums) {
			treeSet.add(num);
		}
		System.out.println(treeSet);
		int count=0, maxCount=0, temp=treeSet.getFirst();
		for(int num: treeSet) {
			
			if(num==temp) {
				count++;
				temp++;
			}else {
				count=1;
				temp=++num;
			}
			if(count>maxCount) {
				maxCount=count;
			}
		}
		System.out.println(maxCount);
		return maxCount;
    }

}
