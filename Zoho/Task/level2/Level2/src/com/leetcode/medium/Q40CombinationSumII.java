package com.leetcode.medium;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class Q40CombinationSumII {

	public static void main(String[] args) {
		System.out.println(combinationSum2(new int[] {10,1,2,7,6,1,5}, 8));
		//System.out.println(combinationSum2(new int[] {2,5,2,1,2}, 5));
		//System.out.println(combinationSum2(new int[] {1}, 2));
		//System.out.println(combinationSum2(new int[] {1,1}, 1));
		//System.out.println(combinationSum2(new int[] {1,2}, 4));
	}

	
    /*public static List<List<Integer>> combinationSum2(int[] candidates, int target) {
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
    }*/
	
	public static List<List<Integer>> combinationSum2(int[] candidates, int target) {
		   List<List<Integer>> list = new LinkedList<List<Integer>>();
		   Arrays.sort(candidates);
		   backtrack(list, new ArrayList<Integer>(), candidates, target, 0);
		   return list;
	}

	private static void backtrack(List<List<Integer>> list, List<Integer> tempList, int[] cand, int remain, int start) {
	   
	   if(remain < 0) return; 
	   else if(remain == 0) list.add(new ArrayList<>(tempList));
	   else{
	      for (int i = start; i < cand.length; i++) {
	         if(i > start && cand[i] == cand[i-1]) continue;
	         tempList.add(cand[i]);
	         //System.out.println(list);
	         backtrack(list, tempList, cand, remain - cand[i], i+1);
	         tempList.remove(tempList.size() - 1);
	      }
	   }
	}
	
	public static List<List<Integer>> combinationSum21(int[] candidates, int target) {
		Arrays.sort(candidates);
	    List<List<Integer>> list= new ArrayList<>();
	    helper(0,candidates,target,list,new ArrayList<>());
	    return list;
	}
	
	private static void helper(int i,int arr[],int target,List<List<Integer>> list,ArrayList<Integer>li){
	    if(target==0){
	        list.add(new ArrayList(li));
	        return;
	    }
	    if(target<0)return ;
	    for(int j=i;j<arr.length;j++){
	        if(j!=i && arr[j]==arr[j-1])continue;
		    if(arr[j]<=target){
		        li.add(arr[j]);
		        helper(j+1,arr,target-arr[j],list,li);
		        li.remove(li.size()-1);
		    }
	    }
	}
	public int smallestDistancePair(int[] nums, int k) {
	    Arrays.sort(nums);
	    int arr []= new int[nums[nums.length-1]+1];
	    for(int i=0;i<nums.length;i++){
	        for(int j=i+1;j<nums.length;j++){
	            arr[nums[j]-nums[i]]++;
	        }
	    }
	    for(int i=0;i<arr.length;i++){
	        if(arr[i]>0)k=k-arr[i];
	        if(k<=0)return i;
	    }
	    return -1;
	}
}
