package com.leetcode.easy;

import java.util.TreeSet;

public class Q121_Best_Time_To_Buy_And_Sell_Stock {

	public static void main(String[] args) {
		System.out.println(maxProfit(new int[] {7,1,5,3,6,4}));
		//System.out.println(maxProfit(new int[] {3,2,6,5,0,3}));
		//System.out.println(maxProfit(new int[] {2,4,1}));
		//System.out.println(maxProfit(new int[] {1,4,2}));
		//System.out.println(maxProfit(new int[] {1}));
	}
	
    public static int maxProfit1(int[] prices) {
        TreeSet set = new TreeSet<>();
        
    	for(int i=0;i<prices.length-1;i++) {
    		int maxValue = prices[i];
    		for(int j=i+1;j<prices.length;j++) {
    			if(maxValue<prices[j]) {
    				maxValue = prices[j];
    			}
    		}
    		set.add(maxValue-prices[i]);
    	}
    	System.out.println(set);    	
    	return set.isEmpty()?0:(int) set.getLast();
    }
    
    public static int maxProfit(int[] prices) {
        int maxCur = 0, maxSoFar = 0;
        for(int i = 1; i < prices.length; i++) {
            maxCur = Math.max(0, maxCur += prices[i] - prices[i-1]);
            maxSoFar = Math.max(maxCur, maxSoFar);
        }
        return maxSoFar;
    }
    
}
