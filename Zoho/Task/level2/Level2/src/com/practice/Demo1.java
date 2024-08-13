package com.practice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Demo1 { 
	 
    public static void main(String[] args) { 
        int[][] grid = {
                {0, 0, 1},
                {0, 1, 0},
                {1, 0, 0}
            };
         
        List<int[]> path = new ArrayList<>(); 
        boolean result = exist(grid, path); 
        System.out.println(result); 
        if (result) { 
            for (int[] p : path) { 
                System.out.println(Arrays.toString(p)); 
            } 
        } 
    } 
 
    public static boolean exist(int[][] board, List<int[]> path) { 
        int m = board.length; 
        int n = board[0].length; 
 
        boolean[][] visited = new boolean[m][n]; 
        boolean result = false; 
 
        for (int i = 0; i < m; i++) { 
            for (int j = 0; j < n; j++) {  
                result = backtrack(board, visited, i, j, 0, path); 
                if (result) { 
                    return true; 
                } 
            } 
        } 
 
        return false; 
    } 
 
    private static boolean backtrack(int[][] board, boolean[][] visited, int i, int j, int index, List<int[]> path) { 
        if (i==board.length-1 && j==board[0].length-1) { 
            return true; 
        } 
 
        if (i < 0 || i >= board.length || j < 0 || j >= board[0].length || visited[i][j] || board[i][j] == 1) { 
            return false; 
        } 
 
        visited[i][j] = true; 
        path.add(new int[]{i, j}); 
 
        if(backtrack(board, visited, i, j + 1, index + 1, path) || 
        	backtrack(board, visited, i + 1, j, index + 1, path) || 
            backtrack(board, visited, i - 1, j, index + 1, path) || 
            backtrack(board, visited, i, j - 1, index + 1, path)) { 
            return true; 
        } 
 
        visited[i][j] = false; 
        path.remove(path.size() - 1); 
        return false; 
    } 
}

  





