package com.leetcode.medium;

import java.util.ArrayList;
import java.util.List;

public class Q40CombinationSumII {

	public static void main(String[] args) {
		//System.out.println(combinationSum2(new int[] {10,1,2,7,6,1,5}, 8));
		//System.out.println(combinationSum2(new int[] {2,5,2,1,2}, 5));
		System.out.println(combinationSum2(new int[] {1}, 2));
		System.out.println(combinationSum2(new int[] {1,1}, 1));
		System.out.println(combinationSum2(new int[] {1,2}, 4));
	}

	
    public static List<List<Integer>> combinationSum2(int[] candidates, int target) {
    	ArrayList<List<Integer>> result = new ArrayList<>();
    	for(int i=0;i<candidates.length;i++) {
        	ArrayList<Integer> list = new ArrayList<>();
        	
    		if(candidates[i]==target) {
    			if(!result.contains(List.of(candidates[i]))) {
    				list.add(candidates[i]);    				
    			}
    		}
    		if(list.size()>0) {
    			result.add(list);
    			list = new ArrayList<>();
    		}
    		int remaining = target-candidates[i];
    		
    		for(int j=0;j<candidates.length;j++) {
    			if(i!=j && candidates[j]==remaining) {
    				if(!(result.contains(List.of(candidates[i], candidates[j])) || 
    						result.contains(List.of(candidates[j], candidates[i])))) {
	    					list.add(candidates[i]);
	        				list.add(candidates[j]);
	        				break;
    				}
    			}
    		}
    		if(list.size()>0) {
    			result.add(list);
    			list = new ArrayList<>();
    		}
    		
    		for(int h=0;h<candidates.length;h++) {
        		for(int k=h;k<candidates.length-1;k++) {
	    			if(i!=k && candidates[k]+candidates[k+1]==remaining) {
	    				
	    				if(!(result.contains(List.of(candidates[i], candidates[k], candidates[k+1])) ||
	    						result.contains(List.of(candidates[i], candidates[k+1], candidates[k])) ||
	    						result.contains(List.of(candidates[k], candidates[i], candidates[k+1])) ||
	    						result.contains(List.of(candidates[k], candidates[k+1], candidates[i])) ||
	    						result.contains(List.of(candidates[k+1], candidates[k], candidates[i])) ||
	    						result.contains(List.of(candidates[k+1], candidates[i], candidates[k])) )) {
		    				list.add(candidates[i]);
		    				list.add(candidates[k]);
		    				list.add(candidates[k+1]);
		    				break;
	    				}
	    			}
        		}
        		if(list.size()>0) {
        			result.add(list);
        			list = new ArrayList<>();
        		}
    		}
    	}
    	return result;
    }
}
