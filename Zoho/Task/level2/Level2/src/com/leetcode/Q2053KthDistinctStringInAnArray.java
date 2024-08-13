package com.leetcode;

import java.util.LinkedHashMap;
import java.util.Map;

public class Q2053KthDistinctStringInAnArray {

	public static void main(String[] args) {
		String[] arr = {"d","b","c","b","c","a"};
		System.out.println(kthDistinct(arr, 2));
	}
	
    public static String kthDistinct(String[] arr, int k) {
    	Map<String,Integer> map = new LinkedHashMap<>();
    	for(int i=0;i<arr.length;i++) {
    		if(map.containsKey(arr[i])) {
    			map.put(arr[i], map.get(arr[i])+1);
    		}else {
    			map.put(arr[i], 1);
    		}
    	}
    	int count = 0;
    	for(Map.Entry<String, Integer> entry : map.entrySet() ) {
    		if(entry.getValue()==1) {
        		count++;
    		}
    		if(count==k) {
    			return entry.getKey();
    		}
    	}
    	
    	return "";
    }

}
