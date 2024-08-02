package com.leetcode;

public class Q28 {
	/*Find the Index of the First Occurrence in a String
	Example 1:

		Input: haystack = "sadbutsad", needle = "sad"
		Output: 0
		Explanation: "sad" occurs at index 0 and 6.
		The first occurrence is at index 0, so we return 0.
		Example 2:

		Input: haystack = "leetcode", needle = "leeto"
		Output: -1
		Explanation: "leeto" did not occur in "leetcode", so we return -1.*/

	public static void main(String[] args) {
		System.out.println(strStr("mississippi","pi"));
	}
	
    public static int strStr2(String haystack, String needle) {
        if(haystack.length()>=needle.length()){
            char str1Array[] = haystack.toCharArray();
            char str2Array[] = needle.toCharArray();
            int count1=0;
            for(int i=0;i<str1Array.length;i++){
            	int count2 = 0;
            	if(str1Array[i]==str2Array[count2]){
                    count1=i;
                    System.out.println(i);
                    while(count1<str1Array.length && count2<str2Array.length && str1Array[count1]==str2Array[count2]){
                        count1++;
                        count2++;
                    }
                }
                if(str2Array.length == count2){
                    return count1-needle.length();
                }
                	
            }
        }
        return -1;
    }
    
    //method 2
    public int strStr1(String haystack, String needle) {
        int l1 = haystack.length(), l2 = needle.length();
        if (l1 < l2) {
            return -1;
        } else if (l2 == 0) {
            return 0;
        }
        int threshold = l1 - l2;
        for (int i = 0; i <= threshold; ++i) {
            if (haystack.substring(i,i+l2).equals(needle)) {
                return i;
            }
        }
        return -1;
    }
    
    public static int strStr(String haystack, String needle) {
		  for (int i = 0; ; i++) {
		    for (int j = 0; ; j++) {
		      if (j == needle.length()) return i;
		      if (i + j == haystack.length()) return -1;
		      if (needle.charAt(j) != haystack.charAt(i + j)) break;
		    }
		  }
    }
}
