package com.leetcode.easy;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

public class Q1636_Sort_Array_By_Increasing_Frequency {

	public static void main(String[] args) {
		//System.out.println(Arrays.toString(frequencySort(new int[] {1,1,2,2,2,3,3,4,4})));
		System.out.println(Arrays.toString(frequencySort(new int[] {1,1,2,2,2,3})));
	}
	
    public static int[] frequencySort1(int[] nums) {
        TreeMap<Integer, Integer> map = new TreeMap<>();
        for(int i=0;i<nums.length;i++) {
        	map.put(nums[i], map.getOrDefault(nums[i], 0)+1);
        }
        System.out.println(map);
        int index = 0;
        while(map.size()>0) {
        	int maxKey=Integer.MAX_VALUE, maxValue = Integer.MAX_VALUE;
	        for(Map.Entry<Integer, Integer> entry : map.entrySet()) {
	        	if(maxValue>=entry.getValue()) {
	        		maxKey = entry.getKey();
	        		maxValue = entry.getValue();
	        	}
	        }
	        for(int i=0;i<maxValue;i++) {
	        	nums[index++] = maxKey;	        	
	        }
	        map.remove(maxKey);
        }
     	return nums;
    }
    
    public static int[] frequencySort(int[] nums) {
    	Map<Integer, Integer> map = new HashMap<>();
    	Arrays.stream(nums).forEach(n -> map.put(n, map.getOrDefault(n, 0) + 1));
    	return Arrays.stream(nums).boxed()
    			.sorted((a,b) -> map.get(a) != map.get(b) ? map.get(a) - map.get(b) : b - a)
    			.mapToInt(n -> n)
    			.toArray();
    }
    
    public static int[] frequencySort3(int[] nums) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int num : nums) {
            map.put(num, map.getOrDefault(num, 0) + 1);
        }
        List<Map.Entry<Integer, Integer>> list = new ArrayList(map.entrySet());
        Collections.sort(list, (a,b) -> a.getValue() == b.getValue() ? b.getKey() - a.getKey() : a.getValue() - b.getValue());
        int index = 0;
        int[] res = new int[nums.length];
        for (Map.Entry<Integer, Integer> entry : list) {
            
            int count = entry.getValue();
            int key = entry.getKey();
            
            for (int i=0; i<count; i++) {
                res[index++] = key;
            }
        }
        return res;
    }
    
}
