package com.leetcode.easy;

import java.util.ArrayList;
import java.util.List;

public class Q917_Reverse_only_Letters {

	public static void main(String[] args) {
		//System.out.println(reverseOnlyLetters("ab-cd"));
		System.out.println(reverseOnlyLetters("a-bC-dEf-ghIj"));
		//System.out.println(reverseOnlyLetters("Test1ng-Leet=code-Q!"));
	}
	
    public static String reverseOnlyLetters(String s) {
        char[] ch = s.toCharArray();
        List<Integer> positions = new ArrayList<>();
    	for(int i=0;i<ch.length;i++) {
    		if(Character.isAlphabetic(ch[i])) {
    			positions.add(i);
    		}
    	}
    	
    	for(int i=0, j=positions.size()-1;i<positions.size() && j>=0;i++, j--) {
    		if(i>=j) break;
    		char temp = ch[positions.get(i)];
    		ch[positions.get(i)] = ch[positions.get(j)];
    		ch[positions.get(j)] = temp;
    	}
    	
    	return new String(ch);
    }
    
    public String reverseOnlyLetters1(String s) {
        // Convert the string to a character array for easy manipulation
        char[] arr = s.toCharArray();
        
        // Two pointers approach
        int start = 0;
        int end = s.length() - 1;
        
        while (start < end) {
            // Move the start pointer forward until it finds a letter
            while (start < end && !Character.isLetter(arr[start])) {
                start++;
            }
            // Move the end pointer backward until it finds a letter
            while (start < end && !Character.isLetter(arr[end])) {
                end--;
            }
            // Swap the letters at start and end pointers
            if (start < end) {
                char temp = arr[start];
                arr[start] = arr[end];
                arr[end] = temp;
                
                // Move both pointers inward
                start++;
                end--;
            }
        }
        
        // Convert the character array back to a string and return it
        return new String(arr);
    }

    public String reverseOnlyLetters3(String s) {
        int i = 0, j = s.length() - 1;
        StringBuilder sb = new StringBuilder(s);
        while (i <= j) {
            if (!isAlphabet(s.charAt(i))) {
                i++;
                continue;
            } else if (!isAlphabet(s.charAt(j))) {
                j--;
                continue;
            } else {
                sb.setCharAt(i, s.charAt(j));
                sb.setCharAt(j, s.charAt(i));
            }
            i++;
            j--;
        }
        return sb.toString();
    }
    public boolean isAlphabet(char char1) {
        return (char1 >= 'a' && char1 <= 'z') || (char1 >= 'A' && char1 <= 'Z');
    }
    
    public String reverseOnlyLetters4(String s) {

	    StringBuilder ss= new StringBuilder(s.replaceAll("[^a-zA-Z]","")).reverse();
	    for(int i=0;i<=s.length()-1;i++)
	    	if(!Character.isLetter(s.charAt(i)))
	    		ss.insert(i,s.charAt(i));
	    return String.valueOf(ss);
    }
}
