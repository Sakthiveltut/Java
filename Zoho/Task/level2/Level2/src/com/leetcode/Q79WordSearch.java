package com.leetcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List; 
 
public class Q79WordSearch { 
 
    public static void main(String[] args) { 
        char[][] grid = { 
            {'H', 'E', 'L', 'o', 'O'}, 
            {'E', 'L', 'L', '1', 'H'}, 
            {'L', 'O', 'H', 'E', 'L'}, 
            {'L', 'O', 'E', 'L', 'O'}, 
            {'1', 'E', 'L', 'L', 'O'} 
        }; 
         
        String word = "HELLO"; 
        List<int[]> path = new ArrayList<>(); 
        boolean result = exist(grid, word, path); 
        System.out.println(result); 
        if (result) { 
            for (int[] p : path) { 
                System.out.println(Arrays.toString(p)); 
            } 
        } 
    } 
 
    public static boolean exist(char[][] board, String word, List<int[]> path) { 
        int m = board.length; 
        int n = board[0].length; 
 
        boolean[][] visited = new boolean[m][n]; 
        boolean result = false; 
 
        for (int i = 0; i < m; i++) { 
            for (int j = 0; j < n; j++) { 
                if (board[i][j] == word.charAt(0)) { 
                    result = backtrack(board, word, visited, i, j, 0, path); 
                    if (result) {
                        System.out.println("final "+Arrays.deepToString(visited));
                        return true; 
                    } 
                } 
            } 
        } 
 
        return false; 
    } 
 
    private static boolean backtrack(char[][] board, String word, boolean[][] visited, int i, int j, int index, List<int[]> path) { 
        if (index == word.length()) { 
            return true; 
        } 
 
        if (i < 0 || i >= board.length || j < 0 || j >= board[0].length || visited[i][j] || board[i][j] != word.charAt(index)) { 
            return false; 
        } 
        
        visited[i][j] = true; 
        path.add(new int[]{i, j}); 
        
        System.out.println(Arrays.deepToString(visited));
        System.out.println("-------------------");
        
        if(backtrack(board, word, visited, i, j + 1, index + 1, path) || 
        	backtrack(board, word, visited, i + 1, j, index + 1, path) || 
            backtrack(board, word, visited, i - 1, j, index + 1, path) || 
            backtrack(board, word, visited, i, j - 1, index + 1, path)) { 
            return true; 
        } 
 
        visited[i][j] = false; 
        path.remove(path.size() - 1); 
        return false; 
    } 
}
