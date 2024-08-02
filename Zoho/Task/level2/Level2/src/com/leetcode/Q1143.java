package com.leetcode;

import java.util.Arrays;

public class Q1143 {
	
	//Longest Common Subsequence
	public static void main(String[] args) {
		System.out.println(longestCommonSubsequence("XMJYAUZ","MZJAWXU"));
	}
	
    public static int longestCommonSubsequence1(String text1, String text2) {
        String subSequence = "",temp = "";
        for(int i=0;i<text2.length();i++){
            temp = text2.charAt(i)+"";
            if(text1.contains(temp)){
                subSequence+=temp;
            }
        }
        System.out.println(subSequence);
        text2=subSequence;
        int index=0, length2 = text2.length();
        for(int i=0;i<text1.length() && index<length2;i++){
            if(text1.charAt(i)==text2.charAt(index)){
                index++;
            }
        }
        if(index==length2){
            return length2;
        }else{
            return 0;
        }
    }
    
    public int longestCommonSubsequence2(String s1, String s2) {
        int[][] dp = new int[s1.length() + 1][s2.length() + 1];
        
        for(int i=1;i<dp.length;i++){
            for(int j=1;j<dp[i].length;j++){
                if(s1.charAt(i-1)==s2.charAt(j-1)) dp[i][j]=1+dp[i-1][j-1];
                else dp[i][j] = Math.max(dp[i][j-1], dp[i-1][j]);
            }
        }
        return dp[dp.length-1][dp[0].length-1];
    }
    
    public static int longestCommonSubsequence(String s1, String s2) {
        int[][] dp = new int[s1.length() + 1][s2.length() + 1];
        for (int i = 0; i < s1.length(); ++i)
            for (int j = 0; j < s2.length(); ++j)
                if (s1.charAt(i) == s2.charAt(j)) dp[i + 1][j + 1] = 1 + dp[i][j];
                else dp[i + 1][j + 1] =  Math.max(dp[i][j + 1], dp[i + 1][j]);
        
        System.out.println(Arrays.deepToString(dp));
        return dp[s1.length()][s2.length()];
    }
	
}
