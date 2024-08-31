package com.leetcode.medium;

public class Q122_Best_Time_to_Buy_and_Sell_Stock_II {
	
	public static void main(String[] args) {
		System.out.println(maxProfit(new int[] {7,1,5,3,6,4}));
		//System.out.println(maxProfit(new int[] {3,2,6,5,0,3}));
		//System.out.println(maxProfit(new int[] {2,4,1}));
		//System.out.println(maxProfit(new int[] {1,4,2}));
		//System.out.println(maxProfit(new int[] {1}));
	}
	
	public static int maxProfit1(int[] prices) {
        int i = 0, buy, sell, profit = 0, N = prices.length - 1;
        while (i < N) {
            while (i < N && prices[i + 1] <= prices[i]) i++;
            buy = prices[i];

            while (i < N && prices[i + 1] > prices[i]) i++;
            sell = prices[i];

            profit += sell - buy;
        }
        return profit;
	}
	
    public static int maxProfit2(int[] prices) {
        int current = prices[0], profit = 0;
        for(int price : prices){
            if(price > current){
                profit += price - current;
                current = price;
            }
            if(price < current){
                current = price;
            }
        }
        return profit;
    }
    
    public static int maxProfit(int[] prices) {
        int min = prices[0];
        int max = 0;
        for (int i = 1; i < prices.length; i++) {
            int diff = prices[i] - prices[i - 1];
            if (diff > 0) max += diff;
        }
        return max;
    }
}
