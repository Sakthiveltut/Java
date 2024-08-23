package com.leetcode.easy;

public class Q476_Number_Complement {

	public static void main(String[] args) {
		System.out.println(findComplement(8));
		//System.out.println(findComplement(1));
	}
	
    public static int findComplement1(int num) {
        int remainder = 0;
        StringBuilder sb = new StringBuilder();
    	while(num>0) {
    		remainder = num%2;
    		sb.append(remainder);
    		num/=2;
    	}
    	System.out.println(sb);
    	int result = 0;
    	for(int i=0;i<sb.length();i++) {
    		if(sb.charAt(i)=='0')
    			sb.setCharAt(i, '1');
    		else if(sb.charAt(i)=='1')
    			sb.setCharAt(i, '0');
    		result+=(sb.charAt(i)-'0')*Math.pow(2, i);
    	}
    	System.out.println(sb);
    	return result;
    }
    
    public static int findComplement2(int num) 
    {
        int i = 0;
        int j = 0;
        
        while (i < num)
        {
            i += Math.pow(2, j);
            j++;
            System.out.println(i);
        }
        return i - num;
    }
    
    public static int findComplement(int num) {
        if (num == 0) return 1;

        int bitLength = Integer.toBinaryString(num).length();
        
        System.out.println("bitLength "+bitLength);
        
        int mask = (1 << bitLength) - 1;
        
        System.out.println("mask "+mask);
        
        return num ^ mask;
    }
}
