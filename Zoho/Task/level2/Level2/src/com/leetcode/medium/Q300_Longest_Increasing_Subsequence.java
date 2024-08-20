package com.leetcode.medium;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.TreeSet;

public class Q300_Longest_Increasing_Subsequence {
	
	
	public static void main(String[] args) {
		//System.out.println(lengthOfLIS(new int[] {10,9,2,5,3,7,101,18}));
		System.out.println(lengthOfLIS(new int[] {0,1,0,3,2,3}));
	}
	
    public static int lengthOfLIS1(int[] nums) { //Failed
    	TreeSet<Integer> set = new TreeSet<>();
        for(int i=0;i<nums.length;i++) {
        	int count = 0, max = Integer.MIN_VALUE, previous = Integer.MIN_VALUE, tempCount;
        	for(int j=i;j<nums.length;j++) {
        		if(max<nums[j]) {
        			previous = max;
        			max = nums[j];
        			count++;
        		}
        	}
        	set.add(count);
        }
        return set.getLast();
    }
    
    public static int lengthOfLIS3(int[] nums) { 
        int[] tails = new int[nums.length];
        int size = 0;
        for (int x : nums) {
            int i = 0, j = size;
            while (i != j) {
                int m = (i + j) / 2;
                if (tails[m] < x)
                    i = m + 1;
                else
                    j = m;
            }
            tails[i] = x;
            if (i == size) ++size;
            System.out.println(Arrays.toString(tails));
            System.out.println("size "+size);
        }
        return size;
    }
    
    public static int lengthOfLIS2(int[] nums) {
        int n = nums.length;
        int[] dp = new int[n];
        Arrays.fill(dp, 1);
        for(int i=1;i<n;i++) {
            for(int j=i-1;j>=0;j--){
                if(nums[i]>nums[j])dp[i] = Math.max(dp[i], 1+dp[j]);
            }
        }
        int res= 0;
        for(int i=0;i<n;i++)res = Math.max(res, dp[i]);
        return res;
    }
    
    public static int lengthOfLIS(int[] nums) {
        List<Integer> al = new ArrayList<>();
        int n = nums.length;

        for(int i=0;i<n;i++){
            if(al.size()==0 || al.get(al.size()-1)<nums[i]){
                al.add(nums[i]); continue;
            }
            int idx = Collections.binarySearch(al,nums[i]);
            if(idx<0) idx = -(idx+1);
            al.set(idx,nums[i]);
        }
        System.out.println(al);
        return al.size();
    }

}
