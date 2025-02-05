package com.leetcode.medium;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class Q12_Integer_to_Roman {

	public static void main(String[] args) {
		System.out.println(intToRoman(1994));
	}
	
    public static String intToRoman(int num) {
        
    	String numString = num+"", result="";
    	int numSize = numString.length();
    	for(int i=0;i<numSize;i++) {
    		
    		String currentDigit = numString.charAt(i)+"";
    		for(int j=0;j<numSize-1-i;j++) {
    			currentDigit+="0";
    		}
    		
    		result+=findRomanLetter(currentDigit);
    		
    	}
    	
    	return result;
    }

	private static String findRomanLetter(String numString) {
    	Map<Integer, String> map = new LinkedHashMap<>();
    	map.put(1000, "M");
    	map.put(500, "D");
    	map.put(100, "C");
    	map.put(50, "L");
    	map.put(10, "X");
    	map.put(5, "V");
    	map.put(1, "I");
		int num = Integer.parseInt(numString);

		if(map.containsKey(num)) {
			return map.get(num);
		}else {
			int numLength = numString.length();
			if(numString.charAt(0)=='4') {
				if(numLength==1) {
					return map.get(1)+""+map.get(5);
				}else if(numLength==2) {
					return map.get(10)+""+map.get(50);
				}else if(numLength==3) {
					return map.get(100)+""+map.get(500);
				}
				
			}else if(numString.charAt(0)=='9') {
				if(numLength==1) {
					return map.get(1)+""+map.get(10);
				}else if(numLength==2) {
					return map.get(10)+""+map.get(100);
				}else if(numLength==3) {
					return map.get(100)+""+map.get(1000);
				}
			}
		}
		
		int sum = 0;
		String result= "";
		for(Map.Entry<Integer, String> entry : map.entrySet()) {
			if(num>entry.getKey()) {
				while(sum+entry.getKey()<=num) {
					sum+=entry.getKey();
					result+=entry.getValue();
				}
			}
		}
		
		return result;
	}

}
