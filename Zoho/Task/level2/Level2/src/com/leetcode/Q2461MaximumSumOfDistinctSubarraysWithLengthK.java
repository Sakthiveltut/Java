package com.leetcode;

import java.util.HashMap;
import java.util.TreeSet;

public class Q2461MaximumSumOfDistinctSubarraysWithLengthK {

	public static void main(String[] args) {
		System.out.println(maximumSubarraySum(new int[] {1,5,4,2,9,9,9}, 3));
	}
	
    public static long maximumSubarraySum1(int[] nums, int k) {
        
    	if(nums.length<k) return 0;
    	TreeSet<Integer> result = new TreeSet<>();
    	TreeSet<Integer> subset;
        for(int i=0;i<nums.length-(k-1);i++) {
        	subset = new TreeSet<>();
        	for(int j=i;j<i+k;j++) {
        		subset.add(nums[j]);
        	}
        	if(subset.size()==k) {
        		int sum=0;
        		for(int num: subset) {
        			sum+=num;
        		}
        		result.add(sum);        		
        	}
        }
        System.out.println(result);
        return result.isEmpty()?0:result.getLast();
    }
    
    public static long maximumSubarraySum(int[] A, int k) {
        HashMap<Integer, Integer> mp = new HashMap<>();
        long mx = 0, sum = 0;
        for (int i = 0; i < A.length; i++){
            sum +=A[i];
            mp.put(A[i], mp.getOrDefault(A[i],0) + 1);

            if (i >= k - 1){
                if (mp.size() == k) mx = Math.max(mx, sum);
                sum -= A[i - k + 1];
                mp.put(A[i - k + 1], mp.get(A[i - k + 1]) - 1);
                if (mp.get(A[i - k + 1]) == 0) mp.remove(A[i - k + 1]);
            }
        }
        return mx;
    }

}
