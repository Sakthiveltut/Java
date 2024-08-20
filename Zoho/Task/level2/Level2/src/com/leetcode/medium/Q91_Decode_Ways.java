package com.leetcode.medium;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Q91_Decode_Ways{
	
	//Decode Ways
	public static void main(String[] args) {
		System.out.println(numDecodings("12334"));
	}
	
	public static int numDecodings(String s) {
        return s.length()==0?0:numDecodings(0,s);      
    }
    private static int numDecodings(int p, String s) {
        int n=s.length();
        if(p==n) return 1;
        if(s.charAt(p)=='0') return 0;
        int res=numDecodings(p+1,s);
        if(p<n-1&&(s.charAt(p)=='1' || s.charAt(p)=='2'&&s.charAt(p+1)<'7')) 
			res+=numDecodings(p+2,s);
        return res;
    }
	
    public static int numDecodings1(String s) {
        if(s == null || s.length() == 0) {
          return 0;
        }
        int n = s.length();
        int[] dp = new int[n];
        dp[0] = s.charAt(0) != '0' ? 1 : 0;
        for(int i = 1; i < n; i++) {
          int first = Integer.valueOf(s.substring(i, i+1));
          int second = Integer.valueOf(s.substring(i-1, i+1));
          if(first >= 1 && first <= 9) {
            dp[i] += dp[i-1];
          }
          if(second >= 10 && second <= 26) {
            dp[i] += i >=2 ? dp[i-2] : 1;
          }
          System.out.println(Arrays.toString(dp));
        }
        return dp[n-1];
    }
}
