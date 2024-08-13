package com.practice;

import java.util.Arrays;

public class Demo {

	public static void main(String[] args) {
		char[][] arr = new char[][]{{'*','*','*'}, {' ','*', ' '}, {' ','*', ' '}};;
		char[][] arr1 = new char[3][3];
		for(int i=0;i<arr.length;i++) {
			for(int j=0;j<arr.length;j++) {
				arr1[i][j] = arr[j][i];
			}
		}
		
		System.out.println(Arrays.deepToString(arr1));
	}

}
