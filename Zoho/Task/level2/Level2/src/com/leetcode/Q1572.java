package com.leetcode;

public class Q1572 {

	public static void main(String[] args) {
		
	}
	
    public int diagonalSum1(int[][] mat) {
        int rowLength=mat.length, colLength=mat[0].length, result=0;
        for(int i=0;i<rowLength;i++){
            for(int j=0;j<colLength;j++){
                if(i==j || colLength-j-1==i){
                    result+=mat[i][j];
                    System.out.println(mat[i][j]);
                }
            }
        }
        return result;
    }
    
    public int diagonalSum(int[][] mat) {
        int res = 0;
        int n = mat.length;
        for (int i=0; i<n; i++) {
            res += mat[i][i]; // Primary diagonals are row = column! 
            res += mat[n-1-i][i]; // Secondary diagonals are row + column = n-1!
        }
        return n % 2 == 0 ? res : res - mat[n/2][n/2]; // if n is a odd number, that mean we have added the center element twice!
    }

}
