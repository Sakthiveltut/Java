package com.leetcode.easy;

public class Q392_Is_Subsequence {

	public static void main(String[] args) {
		System.out.println(isSubsequence("abc", "ahbgdc"));
		System.out.println(isSubsequence("axc", "ahbgdc"));
		System.out.println(isSubsequence("", "ahbgdc"));
		System.out.println(isSubsequence("b", "abc"));
	}
	
    public static boolean isSubsequence(String s, String t) {
    	
    	if(s.isEmpty() ) {
    		if(t.isEmpty()) {
    			return true;
    		}
    		return true;
    	}
        int index = 0;
    	for(int i=0;i<t.length();i++) {
    		if(s.charAt(index)==t.charAt(i)) {
    			index++;
    			if(index==s.length()) return true;
    		}
    	}
    	return index==s.length();
    }
    
    public boolean isSubsequence1(String s, String t) {
        int is = 0;
        int it = 0;

        while (is < s.length() && it < t.length()) {
            if (s.charAt(is) == t.charAt(it)) {
                is++;
            }
            it++;
        }
        return is == s.length();
    }

}
