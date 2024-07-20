package com.cheat_sheet;

public class Q18 {

	public static void main(String[] args) {
		String s = "X";
		int i=0, move=0;
		while(i<s.length()) {
			if(s.charAt(i)=='X') {
				i+=3;
				move++;
			}else {
				i++;
			}
		}
		System.out.println(move);
	}
}
