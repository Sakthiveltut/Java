package com.cheat_sheet;

import java.util.ArrayList;
import java.util.List;

public class Q139 {

	public static void main(String[] args) {
		String s = "aaaaaaa";
		List<String> wordDict = new ArrayList<>();
		wordDict.addAll(List.of("aaaa","aaa"));
		System.out.println(wordBreak(s, wordDict));
		
	}
	
    public static boolean wordBreak(String s, List<String> wordDict) {
        String value = "", previousValue = "";
        StringBuilder stringBuilder = new StringBuilder();
        for(int i=0;i<s.length();i++){
            value +=s.charAt(i); 
            if(wordDict.contains(value)){
            	System.out.println(value);
                //stringBuilder.append(" ");
                previousValue = value;
                value="";
            }else {
            	previousValue+=value;
            	if(wordDict.contains(previousValue)){
                	System.out.println(value);
                    stringBuilder.append(value);
                    //stringBuilder.append(" ");
                    value = previousValue;
                }
            }
            stringBuilder.append(value);
            value="";
        }
        System.out.println("stringBuilder "+stringBuilder);
        if(s.equals(stringBuilder.toString())){
            return true;
        }else{
            return false;
        }
    }

}
