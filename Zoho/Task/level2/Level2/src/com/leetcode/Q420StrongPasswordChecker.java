package com.leetcode;

public class Q420StrongPasswordChecker {

	public static void main(String[] args) {
		String password = "1337C0d3";
		password = "aaa111";
		password = "aaa123";
		password = "xyz";
		System.out.println(strongPasswordChecker(password));
	}

    public static int strongPasswordChecker(String password) {
        int length = password.length(), strength = 3;
        boolean hasLowerCase=false, hasUpperCase=false, hasDigit=false;
        if(length<6){
            return 6-length;
        }
        for(int i=0;i<length;i++){
            char ch = password.charAt(i);
            if(Character.isUpperCase(ch) && !hasUpperCase){
                hasUpperCase = true;
                strength++;
            }if(Character.isLowerCase(ch) && !hasLowerCase){
                hasLowerCase = true;
                strength++;
            }if(Character.isDigit(ch) && !hasDigit){
                hasDigit = true;
                strength++;
            }
            if(i>=1 && i<length-1) {
            	if(!Character.isDigit(ch) && password.charAt(i-1) == ch && password.charAt(i+1)==ch) {
            		strength--;
            	}
            }
        }
        return strength>=6?0:6-strength;
    }
}
