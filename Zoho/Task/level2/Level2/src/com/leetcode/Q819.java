package com.leetcode;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class Q819 {

	public static void main(String[] args) {
		//String paragraph = "Bob hit a ball, the hit BALL flew far after it was hit.";
		//String[] banned = {"hit"};
		
		String paragraph = "a, a, a, a, b,b,b,c, c";
		String[] banned = {"a"};
		
		System.out.println(mostCommonWord(paragraph, banned));
		
	}
	
    public static String mostCommonWord(String paragraph, String[] banned) {
    	int wordCount = 0;
    	String commonWord = "";
        Map<String,Integer> map = new HashMap<>();
        String sentence = paragraph.toLowerCase();
        System.out.println("sentence "+sentence.replaceAll("[,.!]",""));
    	String[] words = sentence.replaceAll("[,.!?;']"," ").split("\\s+");
    	System.out.println(Arrays.toString(words));
    	for(int i=0;i<words.length;i++) {
    		if(map.containsKey(words[i])) {
    			map.put(words[i], map.get(words[i])+1);
    		}else {
    			map.put(words[i], 1);
    		}
    	}
    	
    	for(int i=0;i<banned.length;i++) {
    		if(map.containsKey(banned[i])) {
    			map.remove(banned[i]);
    		}
    	}
    	
    	for(Map.Entry<String, Integer> entry: map.entrySet()) {
    		if(wordCount<entry.getValue()) {
    			wordCount = entry.getValue();
    			commonWord = entry.getKey();
    		}
    	}
    	
    	System.out.println(commonWord+" "+map.get(commonWord));
    	return commonWord==null?paragraph.replaceAll("[,.!]",""):commonWord;
    }

}
