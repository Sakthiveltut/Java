package com.leetcode.medium;

import java.util.Arrays;

public class Q64_Minimum_path_sum {

	public static void main(String[] args) {
		System.out.println(minPathSum(new int[][] {{1,3,1},{1,5,1},{4,2,1}}));
	}
	
	public static int minPathSum1(int[][] grid) {
        int m = grid.length;
        int n = grid[0].length;
        System.out.println(Arrays.deepToString(grid));

        for (int i = 1; i < m; i++) {
            grid[i][0] += grid[i-1][0];
        }
        System.out.println(Arrays.deepToString(grid));

        for (int j = 1; j < n; j++) {
            grid[0][j] += grid[0][j-1];
        }
        System.out.println(Arrays.deepToString(grid));

        for (int i = 1; i < m; i++) {
            for (int j = 1; j < n; j++) {
                grid[i][j] += Math.min(grid[i-1][j], grid[i][j-1]);
            }
        }
        System.out.println(Arrays.deepToString(grid));
        return grid[m-1][n-1];
    }
	
	public static int minPathSum(int[][] grid) {
		int rows = grid.length;
		int cols = grid[0].length;
		int[][] dp = new int[rows] [cols];
		for(int i=rows-1; i>=0; i--){
			for(int j=cols-1; j>=0; j--){
				if(i== rows-1 && j != cols-1){
					dp[i][j] = grid [i][j] + dp[i][j+1];
				} else if(j == cols-1 && i != rows-1){
					dp[i][j] = grid [i][j] + dp[i+1][j];
				} else if(i!= rows-1 && j != cols-1){
					dp[i][j] = grid[i][j] + Math.min(dp[i+1][j], dp[i][j+1]);
				} else
					dp[i][j] = grid[i][j];
			}
		}
		return dp[0][0];
	}

}