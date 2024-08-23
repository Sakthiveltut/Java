package com.leetcode.hard;

import java.util.Arrays;
import java.util.Map;
import java.util.TreeMap;

public class Q664_Strange_Printer {

	public static void main(String[] args) {
		System.out.println(strangePrinter("aaabbb")); //2
		System.out.println(strangePrinter("aba")); //2
		System.out.println(strangePrinter("ababab")); //4
	}
	
    public static int strangePrinter1(String s) {
        TreeMap<Character,Integer> map = new TreeMap<>();
        
    	char maxKey = 0;
        for(int i=0;i<s.length();i++) {
        	map.put(s.charAt(i), map.getOrDefault(s.charAt(i), 0)+1);
        	if(maxKey<map.get(s.charAt(i))) maxKey=s.charAt(i);
        }
        
        System.out.println("maxKey "+maxKey);
        System.out.println(map);
        
        char[] ch = new char[s.length()];
                
        for(int i=0;i<s.length();i++) {
        	ch[i] = maxKey;
        }
        
        int count=1;
        for(int i=0;i<ch.length;i++) {
        	if(s.charAt(i)!=maxKey && ch[i]!=s.charAt(i)) {
        		ch[i] = s.charAt(i);
        		if(i==0) count++;
        		else if(ch[i-1]!=ch[i]) {
        			count++;
        		}
        	}
        }
        System.out.println(Arrays.toString(ch));
    	return count;
    }
    
    public static int strangePrinter(String s) {
	    int n = s.length();
	    int[][] dp = new int[n][n];
	    
	    for (int i = n-1; i >= 0; --i) {
	        dp[i][i] = 1;
	        for (int j = i+1; j < n; ++j) {
	            dp[i][j] = dp[i][j-1] + 1;
	            for (int k = i; k < j; ++k) {
	                if (s.charAt(k) == s.charAt(j)) {
	                    dp[i][j] = Math.min(dp[i][j], dp[i][k] + (k+1<=j-1 ? dp[k+1][j-1] : 0));
	                }
	            }
	        }
	    }
	    return dp[0][n-1];
    }
}
