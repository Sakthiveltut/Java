package com.leetcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Q139 {

	public static void main(String[] args) {
		/*
		"aebbbbs"
		["a","aeb","ebbbb","s","eb"]
		
		"aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaab"
["a","aa","aaa","aaaa","aaaaa","aaaaaa","aaaaaaa","aaaaaaaa","aaaaaaaaa","aaaaaaaaaa"]
		*/
		String s = "aebbbbs";
		List<String> wordDict = new ArrayList<>();
		wordDict.addAll(List.of("a","aeb","ebbbb","s","eb"));
		System.out.println(wordBreak(s, wordDict));
	}
	
    /*public static boolean wordBreak1(String s, List<String> wordDict) {
        int n = s.length();

        Set<String> wordSet = new HashSet<>(wordDict);

        boolean[] dp = new boolean[n + 1];

        dp[0] = true;

        for (int i = 1; i <= n; i++) {
            for (int j = 0; j < i; j++) {
                if (dp[j] && wordSet.contains(s.substring(j, i))) {
                	dp[i] = true;
                	System.out.println(s.substring(j, i));
                	System.out.println(Arrays.toString(dp));
                	System.out.println("i "+i+" j "+j);
                    break;
                }
                System.out.println("------------------------");
            }
        }
        return dp[n];
    }*/

    public static boolean wordBreak(String s, List<String> wordDict) {
    	int length = s.length();
    	boolean[] table = new boolean[length];
    	
        for (int i = 0; i < length; i++) {
            for (int j = 0; j <= i; j++) {
            	if(j==0 || table[j-1]) {
            		if(wordDict.contains(s.substring(j, i+1))) {
                		table[i] = true;
                		break;
            		}
            	}
            }
        }
        
        return table[length-1];
    }

}
