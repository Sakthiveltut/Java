package com.leetcode;

public class Q504Base7 {

	public static void main(String[] args) {
		System.out.println(convertToBase7(-7));
	}

    public static String convertToBase7(int num) {
    	boolean isNegative = false;
    	if(num<0) {
    		isNegative = true;
    		num = num*-1;
    	}
    	System.out.println(num);
    	
        StringBuilder sb = new StringBuilder();
        while(num>=7){
            sb.append(num%7);
            num/=7;
        }
        sb.append(num);
        sb.reverse();
        if(isNegative) {
        	sb.insert(0, "-");
        }
        System.out.println(sb);
        return sb.toString();
    }
}
