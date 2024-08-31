package com.leetcode.hard;

import java.util.Arrays;
import java.util.TreeMap;

public class Q1235_Maximum_Profit_In_Job_Scheduling {

	public static void main(String[] args) {
		System.out.println(jobScheduling(new int[] {1,2,3,3}, new int[] {3,4,5,6}, new int[] {50,10,40,70}));
		//System.out.println(jobScheduling(new int[] {1,2,3,4,6}, new int[] {3,5,10,6,9}, new int[] {20,20,100,70,60}));
		//System.out.println(jobScheduling(new int[] {4, 6}, new int[] {9, 7}, new int[] {6, 5}));
	}
	
    public static int jobScheduling1(int[] startTime, int[] endTime, int[] profit) {
        int n = startTime.length;
        int[][] jobs = new int[n][3];
        for (int i = 0; i < n; i++) {
            jobs[i] = new int[] {startTime[i], endTime[i], profit[i]};
        }        
        Arrays.sort(jobs, (a, b)->a[1] - b[1]);
        
        TreeMap<Integer, Integer> dp = new TreeMap<>();
        dp.put(0, 0);
        for (int[] job : jobs) {
            int cur = dp.floorEntry(job[0]).getValue() + job[2];
            if (cur > dp.lastEntry().getValue()) {
                dp.put(job[1], cur);
            }
        }
        return dp.lastEntry().getValue();
    }
    
    
    
    public static int jobScheduling(int[] startTime, int[] endTime, int[] profit) {    	
    	int[][] jobs = new int[startTime.length][3];
    	
    	for(int i=0;i<jobs.length;i++) {
    		jobs[i] = new int[]{startTime[i], endTime[i], profit[i]};
    	}
    	
    	System.out.println(Arrays.deepToString(jobs));
    	Arrays.sort(jobs,(a, b)-> a[1]-b[1]);    	
    	System.out.println(Arrays.deepToString(jobs));
    	
    	TreeMap<Integer, Integer> dp = new TreeMap<>();
    	dp.put(0, 0);
    	
    	for(int[] job: jobs) {
    		int value = dp.get(dp.floorKey(job[0])) + job[2];
    		if(value>dp.get(dp.lastKey())) {
    			dp.put(job[1], value);
    		}
    	}
    	System.out.println(dp);
    	return dp.get(dp.lastKey());
    }
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}
