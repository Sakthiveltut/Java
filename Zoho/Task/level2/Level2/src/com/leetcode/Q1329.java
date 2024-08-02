package com.leetcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Q1329 {

	//Sort the Matrix Diagonally
	public static void main(String[] args) {
		//int[][] mat = {{3,3,1,1},{2,2,1,2},{1,1,1,2}};
		
        int[][] mat = {
                {11, 25, 66, 1, 69, 7},
                {23, 55, 17, 45, 15, 52},
                {75, 31, 36, 44, 58, 8},
                {22, 27, 33, 25, 68, 4},
                {84, 28, 14, 11, 5, 50}
            };
		
		int rowLength = mat.length, colLength = mat[0].length;
		int i=0, j=0;
		List<Integer> set = new ArrayList<>();
		while(i<rowLength && j<colLength) {			
			for(int row=i, col=j;row<rowLength && col<colLength;row++,col++) {
				set.add(mat[row][col]);
			}
			Collections.sort(set);
			int row=i, col=j;
			for(int value: set) {
				mat[row++][col++] = value;
			}
			set.clear();
			if(i==0) {
				j++;
			}else if(j==0){
				i++;
			}
			if(j==colLength) {
				j=0;
				i++;
			}else if(i==rowLength) {
				j++;
			}
		}
		System.out.println(Arrays.deepToString(mat));
	}
}
