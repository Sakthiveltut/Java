package com.leetcode.medium;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Q624_maximum_distance_in_arrays {

	public static void main(String[] args) {
		System.out.println(maxDistance(new ArrayList<>(List.of(
	            Arrays.asList(1, 2, 3),
	            Arrays.asList(4, 5),
	            Arrays.asList(1, 2, 3)
	        ))));
		
		System.out.println(maxDistance(new ArrayList<>(List.of(
	            Arrays.asList(1),
	            Arrays.asList(1)
	        ))));
		
		System.out.println(maxDistance(new ArrayList<>(List.of(
	            Arrays.asList(1, 4),
	            Arrays.asList(0, 5)
	        ))));
	}
	
    public static int maxDistance1(List<List<Integer>> arrays) { //Failed
		 HashMap<Integer, int[]> map = new HashMap<>();
	     for(int i=0;i<arrays.size();i++){
	         map.put(i, new int[] {arrays.get(i).get(0), arrays.get(i).get(arrays.get(i).size()-1)});
	     }
	     
	     int minValue = map.get(0)[0], maxValue = map.get(map.size()-1)[map.get(map.size()-1).length-1];
	     
    	 for(Map.Entry<Integer, int[]> entry: map.entrySet()) {
    		 for(int value: entry.getValue()) {
    			 if(value<minValue) {
    				 minValue = value;
    				 break;
    			 } else if(value>maxValue) {
    				 maxValue = value;
    			 }
    			 System.out.println("minValue "+minValue+" maxValue "+ maxValue);
    		 }
    		 System.out.println(Arrays.toString(entry.getValue()));        	
    	 }
        return Math.abs(maxValue-minValue);
    }
    
    public static int maxDistance(List<List<Integer>> arrays) {
        int smallest = arrays.get(0).get(0);
        int biggest = arrays.get(0).get(arrays.get(0).size() - 1);
        int maxDistance = 0;

        for (int i = 1; i < arrays.size(); i++) {
            maxDistance = Math.max(maxDistance, Math.abs(arrays.get(i).get(arrays.get(i).size() - 1) - smallest));
            maxDistance = Math.max(maxDistance, Math.abs(biggest - arrays.get(i).get(0)));
            smallest = Math.min(smallest, arrays.get(i).get(0));
            biggest = Math.max(biggest, arrays.get(i).get(arrays.get(i).size() - 1));
        }

        return maxDistance;
    }
}
