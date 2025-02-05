package com.leetcode.medium;

import java.util.Collection;

public class Q6_Zigzag_Conversion {

	public static void main(String[] args) {
		
		System.out.println(convert("PAYPALISHIRING", 4));
		
	}

	public static String convert(String s, int numRows) {
        int increment=0;
		for(int i=2;i<=numRows;i++) {
			System.out.println(increment+=2);
		}
		String result="", temp=s;
		
		increment+=2;
		for(int i=0;i<=numRows;i++) {
			increment-=2;
			for(int j=i;j<s.length();j+=increment) {
				result+=s.charAt(j);
//				temp = temp.replaceFirst(s.charAt(j)+"", "");
			}
//			s=temp;
		}
		
		System.out.println("result "+result);
				
		return result;
    }
	
	
}
