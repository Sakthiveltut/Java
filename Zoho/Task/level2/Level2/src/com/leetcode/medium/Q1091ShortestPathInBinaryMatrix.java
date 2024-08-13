package com.leetcode.medium;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class Q1091ShortestPathInBinaryMatrix {

    public static void main(String[] args) {
        int[][] grid = {
            {0, 0, 1, 0},
            {0, 0, 0, 0},
            {1, 0, 1, 1},
            {1, 0, 0, 0}
        };
        List<Pair> path = shortestPathBinaryMatrix(grid);
        
        System.out.println(path);
        
        if (path != null) {
            System.out.println("Shortest Path Length: " + path.size());
            System.out.println("Path: " + path);
        } else {
            System.out.println("No path found.");
        }
    }

    public static List<Pair> shortestPathBinaryMatrix(int[][] grid) {
        return BFS(grid, 0, 0, grid.length - 1, grid[0].length - 1);
    }

    public static List<Pair> BFS(int grid[][], int start_x, int start_y, int target_x, int target_y) {
        // If the starting or ending point is blocked, return null immediately
        if (grid[start_x][start_y] == 1 || grid[target_x][target_y] == 1) {
            return null;
        }

        Queue<Pair> q = new LinkedList<>();
        q.add(new Pair(start_x, start_y, 1, new ArrayList<>()));

        int[] dirX = {-1, -1, -1, 0, 1, 1, 1, 0};
        int[] dirY = {-1, 0, 1, 1, 1, 0, -1, -1};
        
        while (!q.isEmpty()) {
            Pair rem = q.remove();
            int x = rem.x;
            int y = rem.y;

            List<Pair> path = new ArrayList<>(rem.path);
            path.add(new Pair(x, y, rem.count));

            if (x == target_x && y == target_y) {
                return path;
            }

            for (int i = 0; i < 8; i++) {
                int newX = x + dirX[i];
                int newY = y + dirY[i];

                if (newX >= 0 && newY >= 0 && newX < grid.length && newY < grid[0].length && grid[newX][newY] == 0) {
                    q.add(new Pair(newX, newY, rem.count + 1, path));
                    grid[newX][newY] = 1; 
                }
            }
        }

        return null;
    }
}

class Pair {
    int x;
    int y;
    int count;
    List<Pair> path;

    Pair(int x, int y, int count) {
        this.x = x;
        this.y = y;
        this.count = count;
    }

    Pair(int x, int y, int count, List<Pair> path) {
        this.x = x;
        this.y = y;
        this.count = count;
        this.path = path;
    }

    @Override
    public String toString() {
        return "(" + x + "," + y + ")";
    }
}

