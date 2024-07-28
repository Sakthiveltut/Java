package com.leetcode;

public class Q258 {

	public static void main(String[] args) {
		System.out.println(addDigits(38)); 
	}
	
    public static int addDigits(int num) {
        int result = 0;
        while(num>0){
            int remainder = num%10;
            result+=remainder;
            num = num/10;
            if(num==0){
                System.out.println(result);
                num = result;
                if(String.valueOf(result).length() == 1) return result;
                result=0;
            }
        }
        return result;
    }

}
