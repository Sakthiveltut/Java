package com.leetcode.hard;

import java.util.Arrays;
import java.util.regex.Pattern;

public class Q44_Wildcard_Matching {

	public static void main(String[] args) {
		/*System.out.println(isMatch("aa", "aa"));
		System.out.println(isMatch("aa", "a*"));
		System.out.println(isMatch("cb", "a?"));*/
		System.out.println(isMatch("baaabab", "ba*a?*"));
	}
    
    public static boolean isMatch3(String str, String pattern) {
        int s = 0, p = 0, match = 0, starIdx = -1;            
        while (s < str.length()){
            if (p < pattern.length()  && (pattern.charAt(p) == '?' || str.charAt(s) == pattern.charAt(p))){
                s++;
                p++;
            }
            else if (p < pattern.length() && pattern.charAt(p) == '*'){
                starIdx = p;
                match = s;
                p++;
            }
            else if (starIdx != -1){
                p = starIdx + 1;
                s = ++match;
            }
            else return false;
        }
        
        while (p < pattern.length() && pattern.charAt(p) == '*')
            p++;
        
        return p == pattern.length();
    }
    
    public static boolean isMatch(String s, String p) {
        boolean[][] match=new boolean[s.length()+1][p.length()+1];
        match[s.length()][p.length()]=true;
        for(int i=p.length()-1;i>=0;i--){
            if(p.charAt(i)!='*')
                break;
            else
                match[s.length()][i]=true;
        }
        
        for(int i=0;i<match.length;i++) {
        	for(int j=0;j<match[0].length;j++) {
        		System.out.print(match[i][j]+" ");
        	}
        	System.out.println();
        }
        System.out.println("----------------------");
        for(int i=s.length()-1;i>=0;i--){
            for(int j=p.length()-1;j>=0;j--){
                if(s.charAt(i)==p.charAt(j)||p.charAt(j)=='?')
                        match[i][j]=match[i+1][j+1];
                else if(p.charAt(j)=='*')
                        match[i][j]=match[i+1][j]||match[i][j+1];
                else
                    match[i][j]=false;
            }
        }
        
        for(int i=0;i<match.length;i++) {
        	for(int j=0;j<match[0].length;j++) {
        		System.out.print(match[i][j]+" ");
        	}
        	System.out.println();
        }
        System.out.println("----------------------");
        return match[0][0];
    }
    
    public boolean isMatch5(String s, String p) {
        int n=s.length();
        int m=p.length();
        boolean dp[][]=new boolean[n+1][m+1];
        dp[0][0]=true;
       for(int i=1;i<n+1;i++){
           dp[i][0]=false;
       }
       for(int i=1;i<m+1;i++){
           if(p.charAt(i-1)=='*')
           dp[0][i]=dp[0][i-1];
       }       
       
       for(int i=1;i<n+1;i++){
         for(int j=1;j<m+1;j++){ 
            if(s.charAt(i-1)==p.charAt(j-1)|| p.charAt(j-1)=='?'){
                dp[i][j]=dp[i-1][j-1];
                
            }else if(p.charAt(j-1)=='*'){
                dp[i][j]=dp[i-1][j]||dp[i][j-1];
            }else{
                dp[i][j]=false;
            }
                
         }
       }
       return dp[n][m]; 
    }

}
