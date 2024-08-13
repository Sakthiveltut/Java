package com.leetcode.hard;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Q273IntegerToEnglishWords {

	public static void main(String[] args) {
		System.out.println(numberToWords(1231230000));
	}
	
	/*public static String numberToWords(int num) {
        Map<Integer, String> map = new HashMap<>();
        
        map.put(0, "Zero");
        map.put(1, "One");
        map.put(2, "Two");
        map.put(3, "Three");
        map.put(4, "Four");
        map.put(5, "Five");
        map.put(6, "Six");
        map.put(7, "Seven");
        map.put(8, "Eight");
        map.put(9, "Nine");
        map.put(10, "Ten");
        map.put(11, "Eleven");
        map.put(12, "Twelve");
        map.put(13, "Thirteen");
        map.put(14, "Fourteen");
        map.put(15, "Fifteen");
        map.put(16, "Sixteen");
        map.put(17, "Seventeen");
        map.put(18, "Eighteen");
        map.put(19, "Nineteen");
        map.put(20, "Twenty");
        map.put(30, "Thirty");
        map.put(40, "Forty");
        map.put(50, "Fifty");
        map.put(60, "Sixty");
        map.put(70, "Seventy");
        map.put(80, "Eighty");
        map.put(90, "Ninety");
        map.put(100, "Hundred");
        map.put(1000, "Thousand");
        map.put(1000000, "Million");
        map.put(1000000000, "Billion");
        
        StringBuilder result = new StringBuilder();
        String number = String.valueOf(num);
        int length = number.length();
        
        List<Integer> list = getNumber(num);
        System.out.println(list);
        if(length==1 || length==2) {
        	return map.get(num);
        }
    	if(length==3) {
    		result.append(map.get(list.get(2)))
    		.append(" ")
    		.append(map.get(100))
    		.append(" ");
    		
    		if(map.get(list.get(1)*10+list.get(0))==null) {
    			
    		}
        }
		
		return result.toString();
    }
	
	private static List<Integer> getNumber(int num){
		List<Integer> list = new ArrayList<>();
		int remainder=0, result=0;
		while(num>0) {
			remainder = num%10;
			list.add(remainder);
			num=num/10;
		}
		return list;
	}*/
	
	
    private static final String[] belowTen = new String[] {"", "One", "Two", "Three", "Four", "Five", "Six", "Seven", "Eight", "Nine"};
    private static final String[] belowTwenty = new String[] {"Ten", "Eleven", "Twelve", "Thirteen", "Fourteen", "Fifteen", "Sixteen", "Seventeen", "Eighteen", "Nineteen"};
    private static final String[] belowHundred = new String[] {"", "Ten", "Twenty", "Thirty", "Forty", "Fifty", "Sixty", "Seventy", "Eighty", "Ninety"};
    
    public static String numberToWords(int num) {
        if (num == 0) return "Zero";
        return helper(num); 
    }
    
    private static String helper(int num) {
        String result = new String();
        if (num < 10) result = belowTen[num];
        else if (num < 20) result = belowTwenty[num -10];
        else if (num < 100) result = belowHundred[num/10] + " " + helper(num % 10);
        else if (num < 1000) result = helper(num/100) + " Hundred " +  helper(num % 100);
        else if (num < 1000000) result = helper(num/1000) + " Thousand " +  helper(num % 1000);
        else if (num < 1000000000) result = helper(num/1000000) + " Million " +  helper(num % 1000000);
        else result = helper(num/1000000000) + " Billion " + helper(num % 1000000000);
        return result;
    }

}
