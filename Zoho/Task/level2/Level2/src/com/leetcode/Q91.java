package com.leetcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Q91 {

	public static void main(String[] args) {
		
		System.out.println(numDecodings("21121212121"));
	}
	
	public static int numDecodings(String s) {
        return s.length()==0?0:numDecodings(0,s);      
    }
    private static int numDecodings(int p, String s) {
        int n=s.length();
        if(p==n) return 1;
        if(s.charAt(p)=='0') return 0;
        int res=numDecodings(p+1,s);
        if(p<n-1&&(s.charAt(p)=='1' || s.charAt(p)=='2'&&s.charAt(p+1)<'7')) 
			res+=numDecodings(p+2,s);
        return res;
    }
	
    /*public static int numDecodings(String s) {
    	boolean hasZero = false;
        int arr[] = new int[s.length()];
        for(int i=0;i<s.length();i++){
            arr[i] = Character.getNumericValue(s.charAt(i));
            if(arr[i]==0) {
            	hasZero = true;
            }
        }
        if(arr[0]==0) {
        	return 0;
        }
        if(hasZero) {
        	if(arr.length==2) {
        		return  1;
        	}else if(arr.length==3) {
        		return  2;
        	}
        }else if(arr.length==1) {
        	return 1;
        }else if(arr.length==2) {
        	
        	return 2;
        }else if(arr.length==3) {
        	return 3;
        }
        System.out.println(Arrays.toString(arr));
        return 0;
    }*/
}
