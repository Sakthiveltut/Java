package com.practice;

import java.util.Scanner;

public class Demo {

    public static void printZigZag(int[][] matrix) {
        int m = matrix.length;
        int n = matrix[0].length;

        for (int d = 0; d < m + n - 1; d++) {
            if (d % 2 == 0) {
                int r = Math.min(d, m - 1);
                int c = d - r;
                while (r >= 0 && c < n) {
                    System.out.print("(" + r + "," + c + ") ");
                    r--;
                    c++;
                }
            } else {
                int c = Math.min(d, n - 1);
                int r = d - c;
                while (c >= 0 && r < m) {
                    System.out.print("(" + r + "," + c + ") ");
                    r++;
                    c--;
                }
            }
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter number of rows:");
        int rows = scanner.nextInt();
        System.out.println("Enter number of columns:");
        int cols = scanner.nextInt();

        int[][] matrix = new int[rows][cols];
        System.out.println("Enter matrix elements row by row:");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                matrix[i][j] = scanner.nextInt();
            }
        }

        System.out.println("Matrix elements in zig-zag pattern:");
        printZigZag(matrix);

        scanner.close();
    }
}

