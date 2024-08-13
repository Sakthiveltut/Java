package com.leetcode;

import java.util.Arrays;
import java.util.Comparator;

public class Q179LargestNumber {

	public static void main(String[] args) {
		System.out.println(largestNumber(new int[]{1,30,34,5,9}));
	}
	
    /*public static String largestNumber(int[] nums) {
        String s[] = new String[nums.length];
        for(int i=0;i<nums.length;i++){
            s[i] = String.valueOf(nums[i]);
        }
        Arrays.sort(s,(a,b) -> (b+a).compareTo(a+b));
        System.out.println(Arrays.toString(s));
        StringBuilder result = new StringBuilder();
        for(int i=0;i<nums.length;i++){
            result.append(s[i]);
        }
        return result.charAt(0)=='0'?"0" : result.toString();
    }*/
	
	     /*public static String largestNumber(int[] num) {
			if(num == null || num.length == 0)
			    return "";
			
			String[] s_num = new String[num.length];
			for(int i = 0; i < num.length; i++)
			    s_num[i] = String.valueOf(num[i]);
				
			Comparator<String> comp = new Comparator<String>(){
			    @Override
			    public int compare(String str1, String str2){
			        String s1 = str1 + str2;
					String s2 = str2 + str1;
					return s2.compareTo(s1); 
			    }
		     };
			System.out.println(comp);
			Arrays.sort(s_num, comp);
			if(s_num[0].charAt(0) == '0')
				return "0";
	            
			StringBuilder sb = new StringBuilder();
			for(String s: s_num)
		        sb.append(s);
			
			return sb.toString();
		}*/
	
	
	    public static String largestNumber(int[] num) {
	        if (num == null || num.length == 0)
	            return "";

	        String[] s_num = new String[num.length];
	        for (int i = 0; i < num.length; i++)
	            s_num[i] = String.valueOf(num[i]);

	        for (int i = 0; i < s_num.length - 1; i++) {
	            for (int j = 0; j < s_num.length - 1 - i; j++) {
	                String s1 = s_num[j] + s_num[j + 1];
	                String s2 = s_num[j + 1] + s_num[j];
	                System.out.println(s2+" "+s1);
	                if (s2.compareTo(s1) > 0) { 
	                    String temp = s_num[j];
	                    s_num[j] = s_num[j + 1];
	                    s_num[j + 1] = temp;
	                }
	                System.out.println(Arrays.toString(s_num));
	            }
	        }

	        if (s_num[0].charAt(0) == '0')
	            return "0";

	        StringBuilder sb = new StringBuilder();
	        for (String s : s_num)
	            sb.append(s);

	        return sb.toString();
	    }
	    
	    /*
	     	Comparing "apple" with "banana": -1
			Comparing "banana" with "apple": 1
			Comparing "apple" with "apple": 0 
			
	     */

}
