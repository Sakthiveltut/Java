package com.dynamic_programming;

import java.util.Arrays;

public class GridTraveller {
    public static long gridTraveller(int m, int n) {
        long[][] dp = new long[m + 1][n + 1];
        dp[1][1] = 1;
        
        for (int i = 1; i <= m; i++) {
            for (int j = 1; j <= n; j++) {
            	if (i > 1) dp[i][j] += dp[i-1][j];
                if (j > 1) dp[i][j] += dp[i][j-1];
                
                /*if(i<=m && j<=n) {
                	dp[i][j] = dp[i-1][j] + dp[i][j-1];
                }
                dp[1][1] = 1;*/

            }
        }
        
        System.out.println(Arrays.deepToString(dp));
        
        return dp[m][n];
    }

    public static void main(String[] args) {
        int m = 3;
        int n = 3;
        System.out.println("Number of ways to travel through a " + m + "x" + n + " grid: " + gridTraveller(m, n));
    }
}

