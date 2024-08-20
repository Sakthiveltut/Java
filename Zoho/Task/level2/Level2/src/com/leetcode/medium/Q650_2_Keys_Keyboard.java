package com.leetcode.medium;

import java.util.ArrayList;
import java.util.List;

public class Q650_2_Keys_Keyboard {

	public static void main(String[] args) {
		
		//System.out.println(minSteps(3));
		//System.out.println(minSteps(1));
		//System.out.println(minSteps(4));//4
		//System.out.println(minSteps(9));//6
		//System.out.println(minSteps(6));
		//System.out.println(minSteps(21));//10
		//System.out.println(minSteps(15)); //8
		System.out.println(minSteps(12)); //7
	}
	
    public static int minSteps1(int n) { //Failed
    	if(n==1) return 0;
    	Integer value = isPrime(n);
    	if(value==null) {
    		return n;
    	}else {
    		int count=0;
    		while(n%value==0) {
    			n/=value;
    			count++;
    			if(isPrime(n)!=null) {
    				value = isPrime(n);    				
    			}else break;
    		}
    		System.out.println(n+" "+count);
    		return n==1?count*2:value+n;
    	}
    }
    
    private static Integer isPrime(int n) {
    	for(int i=n-1;i>=2;i--) {
    		if(n%i==0) {
    			return i;
    		}
    	}
    	return null;
    }
    
    public static int minSteps(int n) {
        int res = 0;
        for(int i=2;i<=n;i++){
            while(n%i == 0){
                res+= i;
                n=n/i;
            }
        }
        return res;
    }

}
