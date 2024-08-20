package com.leetcode.easy;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeSet;

public class Q1624_Largest_Substring_Between_Two_Equal_Characters {

	public static void main(String[] args) {
		System.out.println(maxLengthBetweenEqualCharacters("aa"));
		System.out.println(maxLengthBetweenEqualCharacters("abca"));
		System.out.println(maxLengthBetweenEqualCharacters("cbzxy"));
		System.out.println(maxLengthBetweenEqualCharacters("cabbac"));
		System.out.println(maxLengthBetweenEqualCharacters("mgntdygtxrvxjnwksqhxuxtrv"));
	}
    
    public static int maxLengthBetweenEqualCharacters(String s) {
    	TreeSet<Integer> set = new TreeSet<>();
    	
    	for(int i=0;i<s.length();i++) {
    		for(int j=s.length()-1;j>=0;j--) {
    			if(s.charAt(i)==s.charAt(j)) {
    				set.add(i-j-1);
    			}
    		}
    	}
    	return set.getLast();
    }
    
    public static int maxLengthBetweenEqualCharacters1(String s) {
        int max = Integer.MIN_VALUE;
        Map<Character, Integer> map = new HashMap<>();

        for(int i = 0; i < s.length(); i++) {
            if(!map.containsKey(s.charAt(i))) {
                map.put(s.charAt(i), i);
            } else {
                max = Math.max(max, i - map.get(s.charAt(i)) - 1);
            }
        }
        return max >= 0 ? max : -1;
    }

}
